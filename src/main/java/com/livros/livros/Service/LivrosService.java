package com.livros.livros.Service;

import com.livros.livros.DTO.AtualizarLivroDTO;
import com.livros.livros.DTO.CriarNovoLivroDTO;
import com.livros.livros.DTO.LivrosDTO;

import com.livros.livros.Excecao.RecursoNaoEncontradoExcecao;
import com.livros.livros.Model.LivrosEntity;
import com.livros.livros.Repository.livrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {

    private final livrosRepository livrosRepository;



    public LivrosService(livrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public LivrosDTO criarNovoLivro(CriarNovoLivroDTO criarNovoLivroDTO) {

        LivrosEntity livros = new LivrosEntity(null, criarNovoLivroDTO.titulo(),
                criarNovoLivroDTO.autor(),
                criarNovoLivroDTO.ano(),
                true
                );

        var livroCriado = livrosRepository.save(livros);

        return new LivrosDTO(livroCriado.getId(), livroCriado.getTitulo(),
                livroCriado.getAutor(),
                livroCriado.getAno(),
                livroCriado.isDisponivel());
    }

    public LivrosDTO buscarporId(Long id) {
        var livroBuscado = livrosRepository.findById(id).orElseThrow(() ->
                new RecursoNaoEncontradoExcecao("livro nao encontrado"));

        return new LivrosDTO(livroBuscado.getId(), livroBuscado.getTitulo(),
                livroBuscado.getAutor(),
                livroBuscado.getAno(),
                livroBuscado.isDisponivel());

    }

    public List<LivrosDTO> listarTodos() {
        return livrosRepository.findAll().stream().map(livrosEntity ->
                new LivrosDTO(livrosEntity.getId(), livrosEntity.getTitulo(),
                        livrosEntity.getAutor(),
                        livrosEntity.getAno(),
                        livrosEntity.isDisponivel())).toList();

    }

    public void atualizarLivros (Long id, AtualizarLivroDTO atualizarLivroDTO) {
        ///verifico de vai achar ou nao pelo id, caso nao ache para na excecao
        
        var livroBuscado = livrosRepository.findById(id).orElseThrow(() ->
                new RecursoNaoEncontradoExcecao("Livro nao encontrado"));
        
        /// Mudando os dados do livro que estava, para o passado no DTO de atualizacao
        
            if (atualizarLivroDTO.titulo() != null) {
                livroBuscado.setTitulo(atualizarLivroDTO.titulo());
            }
            if (atualizarLivroDTO.autor() != null) {
                livroBuscado.setAutor(atualizarLivroDTO.autor());
            }
            if (atualizarLivroDTO.ano() != null) {
                livroBuscado.setAno(atualizarLivroDTO.ano());
            }
        }
    public void deletarLivro(Long id) {
        livrosRepository.deleteById(id);
    }
}



