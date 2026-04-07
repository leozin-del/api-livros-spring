package com.livros.livros.Repository;

import com.livros.livros.Model.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface livrosRepository extends JpaRepository<LivrosEntity,Long> {
}
