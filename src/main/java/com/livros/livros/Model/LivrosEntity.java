package com.livros.livros.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LivrosBiblioteca")
public class LivrosEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
}
