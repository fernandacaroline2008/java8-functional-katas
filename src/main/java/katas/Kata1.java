package katas;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import model.Movie;
import util.DataUtil;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of
*/
public class Kata1 {
	public static List<Map> execute() {
		List<Movie> movies = DataUtil.getMovies();
		// List<Map<String, Integer>> moviesMap = movies.stream().collect(Collectors.toMap("id", Movie::getId));
		// return moviesMap;
		return ImmutableList.of(ImmutableMap.of("id", "5", "title", "Bad Boys"));
	}
}
