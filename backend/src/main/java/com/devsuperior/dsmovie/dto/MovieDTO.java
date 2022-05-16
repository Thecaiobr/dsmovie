package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

//DTO = Objeto de transferencia de dados
//a diferenca do DTO para o Objeto é que ele n é monitorado pela jpa

//objeto simples para trafegar dados entre serviço e controlador 
//no nosso caso ele ira realizar a busca por filmes buscando os seus atributos da tabela de filmes

public class MovieDTO {

	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDTO() {
		
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}
	
	//construtor que facilita a copia da entidade para o movie
	//para copiar os dados do movie para o objeto DTO basta usar os gets do objeto movie
	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
