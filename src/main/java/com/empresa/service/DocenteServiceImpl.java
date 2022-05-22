package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Docente;
import com.empresa.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	@Override
	public List<Docente> listaDocente() {
		return repository.findAll();
	}

	@Override
	public Docente insertaActualizaDocente(Docente obj) {
		return repository.save(obj);
	}

	@Override
	public List<Docente> listaDocenteNombreDniUbigeo(String nombre, String dni, int idUbigeo,int estado) {
		return repository.listaDocenteNombreDniUbigeo(nombre, dni, idUbigeo,estado);
	}

	

}
