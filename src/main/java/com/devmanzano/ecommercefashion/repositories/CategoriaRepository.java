package com.devmanzano.ecommercefashion.repositories;

import com.devmanzano.ecommercefashion.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Integer> {

}
