package com.livros.livros.Controller;

import com.livros.livros.DTO.AtualizarLivroDTO;
import com.livros.livros.DTO.CriarNovoLivroDTO;
import com.livros.livros.DTO.LivrosDTO;
import com.livros.livros.Service.LivrosService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/Livros")
public class livrosController {

    private final LivrosService livrosService;

    public livrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }

    @PostMapping
    public ResponseEntity<LivrosDTO> criarNovoLivro(@RequestBody @Valid CriarNovoLivroDTO criarNovoLivroDTO) {
        var livroCriado = livrosService.criarNovoLivro(criarNovoLivroDTO);
        URI location = URI.create("/Livros/" + livroCriado.id());
        return ResponseEntity.created(location).body(livroCriado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivrosDTO> buscarPorID(@PathVariable Long id) {
        var livroBuscado = livrosService.buscarporId(id);
        return ResponseEntity.ok(livroBuscado);
    }

    @GetMapping
    public ResponseEntity<List<LivrosDTO>> buscarTodos() {
        var livros = livrosService.listarTodos();
        return ResponseEntity.ok(livros);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarLivros(@PathVariable Long id,
                                             @RequestBody @Valid AtualizarLivroDTO atualizarLivroDTO) {
        livrosService.atualizarLivros(id, atualizarLivroDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livrosService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }
}
