package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository reposity;
	
	@Transactional
	public Page<MovieDTO> FindAll (Pageable pageble){
		Page<Movie> result = reposity.findAll(pageble);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x))	;
		return page;		
	}
	
	@Transactional
	public MovieDTO FindById (Long id){
		Movie result = reposity.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;		
	}
	
	
}
