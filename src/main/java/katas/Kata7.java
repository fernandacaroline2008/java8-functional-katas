package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	Stream<Movie> moviesStream = movieLists.stream().map(MovieList::getVideos).flatMap(item -> item.stream());
	return moviesStream.map(
		item -> ImmutableMap.of(
			"id", item.getId(), 
			"title", item.getTitle(), 
			"boxart", item.getBoxarts()
				.stream()
				.reduce((BoxArt a, BoxArt b) -> a.getWidth() < b.getWidth() ? a : b).map(BoxArt::getUrl)))
		.collect(Collectors.toList());
    }
}
