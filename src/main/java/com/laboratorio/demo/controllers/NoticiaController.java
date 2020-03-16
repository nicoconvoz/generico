package com.laboratorio.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.demo.dtos.CommonDTO;
import com.laboratorio.demo.services.NoticiaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/noticia")
public class NoticiaController extends BaseController<CommonDTO>{
	private NoticiaService noticiaService;
	
	public NoticiaController (NoticiaService noticiaService) {
		super(noticiaService);
		this.noticiaService = noticiaService;
	}
}
