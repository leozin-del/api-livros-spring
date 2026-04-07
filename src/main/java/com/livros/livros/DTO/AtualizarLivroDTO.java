package com.livros.livros.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record AtualizarLivroDTO(@NotBlank String titulo, @NotBlank String autor,
                                @Min(1000)
                                @Max(2100)Integer ano) {
}
