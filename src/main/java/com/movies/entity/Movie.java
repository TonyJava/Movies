package com.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "xx_movie")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "seq_movie")
public class Movie extends BaseEntity<Long> {

	private static final long serialVersionUID = -3573071432312377975L;

	/**
	 * 类型
	 */
	public enum Type {

		/** 普通电影 */
		general,

		/** 特别推荐 */
		exchange,

	
	}

	private String sn;
	private String image;
	private String movieName;
	private String description;
	private String years;
	private Integer score;
	private String movieTag;
	private String movieType;	
	private String movieActor;
	private String seoDescription;
	private String seoKeywords;
	private String seoTitle;
	private String keyword;
	
	
	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}
	
	@Column(nullable = false)
	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@Column(nullable = false)
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(nullable = false)
	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	
	@Column(nullable = false)
    public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	
	@Column(nullable = false)
	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	@Column(nullable = false)
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Column(nullable = false)
	public String getMovieTag() {
		return movieTag;
	}

	public void setMovieTag(String movieTag) {
		this.movieTag = movieTag;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(nullable = false)
	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	@Column(nullable = false)
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
