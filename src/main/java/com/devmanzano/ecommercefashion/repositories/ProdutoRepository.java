package com.devmanzano.ecommercefashion.repositories;

import com.devmanzano.ecommercefashion.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
