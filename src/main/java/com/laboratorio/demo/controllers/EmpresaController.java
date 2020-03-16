package com.laboratorio.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.demo.dtos.CommonDTO;
import com.laboratorio.demo.services.EmpresaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/empresa")
public class EmpresaController extends BaseController<CommonDTO>{
	
	private EmpresaService service;
	
	public EmpresaController(EmpresaService service) {
		super(service);
		this.service = service;
	}
	
	
}
