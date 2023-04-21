package com.jsp.BookMyShow;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsp.BookMyShow.dto.ApplicationDto;
import com.jsp.BookMyShow.entity.MovieEntity;
import com.jsp.BookMyShow.repository.Repository;

/**
 * Hello world!
 *
 */
class MovieViewModel {
	static int count = 0;
	Scanner sc = new Scanner(System.in);
	ArrayList<ApplicationDto> list = new ArrayList<ApplicationDto>();
	
	public ApplicationDto setValuesToAppDto(String name, String hero, String heroine, int ratings) {
	return new ApplicationDto(name, hero, heroine, ratings);
	}
	
	public void getMovieDetailsFromUser() {
		System.out.println("-----------------------Movie Details-----------------------");
		while(true) {
			System.out.println("Enter movie name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter hero name: ");
			String hero = sc.nextLine();
			
			System.out.println("Enter heroine name: ");
			String heroine = sc.nextLine();
			
			System.out.println("Enter movie ratings: ");
			int ratings = sc.nextInt();
			
			list.add(new ApplicationDto(name, hero, heroine, ratings));
			System.out.println();
			
			System.out.println("You want to enter other movie details?\nEnter: y/Y");
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y') continue;
			break;
		}
	}
	public MovieEntity[] saveMovieDetailsToEntity(){
		MovieEntity[] entity = new MovieEntity[list.size()];
		
		for(int i = 0; i<entity.length; i++) {
			entity[i].setAltKey(++count);
			entity[i].setMovieName(list.get(i).getMovieName());
	    	entity[i].setActorName(list.get(i).getActorName());
	    	entity[i].setActressName(list.get(i).getActressName());
	    	entity[i].setRatings(list.get(i).getRatings());
		}
		return entity;
	}
	
}

public class App 
{
    public static void main( String[] args )
    {
    	Repository repo = new Repository();
    	MovieViewModel viewModel = new MovieViewModel();
    	viewModel.getMovieDetailsFromUser();
    	
//    	for(MovieEntity entity: viewModel.saveMovieDetailsToEntity()) {
//    		repo.saveData(entity);
//    	}
    	
    	for(int i = 0 ; i< viewModel.list.size(); i++) {
    		repo.saveData(new MovieEntity(viewModel.list.get(i).getMovieName(),
    				viewModel.list.get(i).getActorName(), viewModel.list.get(i).getActressName(), viewModel.list.get(i).getRatings()));
    	}
    	

    }
}
