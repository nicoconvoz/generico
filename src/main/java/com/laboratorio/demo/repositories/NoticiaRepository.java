package com.laboratorio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.demo.entities.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {

}
