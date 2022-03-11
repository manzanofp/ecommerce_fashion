package com.devmanzano.ecommercefashion.services;

import com.devmanzano.ecommercefashion.model.Categoria;
import com.devmanzano.ecommercefashion.repositories.CategoriaRepository;
import com.devmanzano.ecommercefashion.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
   private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não foi encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}

