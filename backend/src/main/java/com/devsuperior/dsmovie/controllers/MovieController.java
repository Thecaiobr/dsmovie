package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

//classe para implementar o endpoint( endereço q vc pode acessar do navegador/postman que ele vai responder uma pagina de filmes
//da msm forma q o movie.service depende do movie.repositorie
//o movie.controller depende do movie.service 
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
}
