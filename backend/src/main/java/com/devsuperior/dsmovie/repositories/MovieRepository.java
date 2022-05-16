package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//objeto responsavel por acessar os filmes no bd, ele ira realizar as operacoes de um CRUD
//essa classe vai herdar da JPARepository parametrizando com o tipo da entidade(movie) com o tipo do id do movie(long) 
public interface MovieRepository extends JpaRepository<Movie, Long>{

	
	
}
