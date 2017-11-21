package katas;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {

    public static List<Map<String,Object>> execute() {
	List<MovieList> movieLists = DataUtil.getMovieLists();
	return movieLists.stream()
		.flatMap(movieList -> movieList.getVideos().stream())
		.map(functionMovieToMap())
		.collect(Collectors.toList());
    }
    
    public static Function<Movie, ImmutableMap<String,Object>> functionMovieToMap(){
    	return movie -> ImmutableMap.of(
		"id", movie.getId(), 
		"title", movie.getTitle(),
		"boxart", movie.getBoxarts().stream()
			.filter(boxart -> boxart.getHeight().equals(200) && boxart.getWidth().equals(150))
			.map(BoxArt::getUrl).findFirst());
    }
    
}
