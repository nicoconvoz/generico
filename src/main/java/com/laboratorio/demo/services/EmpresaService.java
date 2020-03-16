package com.laboratorio.demo.services;

import org.springframework.stereotype.Service;

import com.laboratorio.demo.dtos.CommonDTO;
import com.laboratorio.demo.entities.Empresa;
import com.laboratorio.demo.repositories.EmpresaRepository;

@Service()
public class EmpresaService extends BaseService<Empresa, CommonDTO>{
	
	private EmpresaRepository empresaRepository;
	
	public EmpresaService (EmpresaRepository empresaRepository) {
		super(empresaRepository, CommonDTO.class, Empresa.class);
		this.empresaRepository = empresaRepository; 
	}
}
