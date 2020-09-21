package org.lanchonete.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class CategoriaController {

	@GetMapping("/categoria")
	public String index() {
		return "categoria/lista-categorias";
	}

}
