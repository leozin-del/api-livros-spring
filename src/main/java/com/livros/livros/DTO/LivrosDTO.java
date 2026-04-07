package com.livros.livros.DTO;

public record LivrosDTO(Long id, String titulo, String autor,
                        Integer ano, boolean disponivel) {
}
