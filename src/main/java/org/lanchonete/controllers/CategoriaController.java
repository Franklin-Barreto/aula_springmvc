package org.lanchonete.controllers;

import java.util.List;

import org.lanchonete.dao.CategoriaDao;
import org.lanchonete.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaDao categorias;

	@GetMapping()
	public List<Categoria> findAll() {
		return categorias.findAll();
	}

}
