package com.movies.dao.impl;

import org.springframework.stereotype.Repository;

import com.movies.dao.MovieDao;
import com.movies.entity.Movie;

@Repository("movieDaoImpl")
public class MovieDaoImpl extends BaseDaoImpl<Movie,Long> implements MovieDao{

	
	
}
