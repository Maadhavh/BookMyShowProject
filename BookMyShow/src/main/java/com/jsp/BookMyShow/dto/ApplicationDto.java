package com.jsp.BookMyShow.dto;

public class ApplicationDto {
	
	private long altKey;
	private String movieName;
	private String actorName;
	private String actressName;
	private String releaseDate;
	private int ratings;
	private int budget;
	
	
	
	public ApplicationDto(String movieName, String actorName, String actressName,
			int ratings) {
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
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	

}
