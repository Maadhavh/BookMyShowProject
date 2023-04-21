package com.jsp.BookMyShow.entity;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "movie_info")
public class MovieEntity {
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name = "Alt_Key")
	private long altKey;

	@Column(name = "Movie_Name")
	private String movieName;

	@Column(name = "Actor_Name")
	private String actorName;

	@Column(name = "Actress_Name")
	private String actressName;

	@Column(name = "Release_Date")
	private String releaseDate;

	@Column(name = "Ratings")
	private int ratings;

	@Column(name = "Budget")
	private int budget;

	public MovieEntity(String movieName, String actorName, String actressName, int ratings) {
		super();
		this.movieName = movieName;
		this.actorName = actorName;
		this.actressName = actressName;
		this.ratings = ratings;
	}

	public long getAltKey() {
		return altKey;
	}
	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}


}
