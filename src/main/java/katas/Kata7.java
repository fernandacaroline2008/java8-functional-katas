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
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
	List<MovieList> movieLists = DataUtil.getMovieLists();
	return movieLists.stream()
		.flatMap(movieList -> movieList.getVideos().stream())
		.map(functionMovieToMap())
		.collect(Collectors.toList());
    }
        
    public static Function<Movie, ImmutableMap<String,Object>> functionMovieToMap(){
	return item -> ImmutableMap.of(
		"id", item.getId(),
		"title", item.getTitle(),
		"boxart", item.getBoxarts().stream()
				.reduce((box1, box2) -> box1.getWidth() < box2.getWidth() ? box1 : box2)
				.map(BoxArt::getUrl));
    }
}
