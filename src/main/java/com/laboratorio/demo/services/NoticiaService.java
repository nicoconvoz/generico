package com.laboratorio.demo.services;

import org.springframework.stereotype.Service;

import com.laboratorio.demo.dtos.CommonDTO;
import com.laboratorio.demo.entities.Noticia;
import com.laboratorio.demo.repositories.NoticiaRepository;

@Service()
public class NoticiaService extends BaseService<Noticia, CommonDTO>{
	private NoticiaRepository noticiaRepository;
	
	public NoticiaService(NoticiaRepository noticiaRepository) {
		super(noticiaRepository, CommonDTO.class, Noticia.class);
		this.noticiaRepository = noticiaRepository;
	}
}
