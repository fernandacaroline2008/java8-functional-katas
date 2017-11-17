package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		// Map<Integer, String> moviesMap = movies.stream().collect(Collectors.toMap(Movie::getId, Movie::getTitle));
		// Map<Integer, String> moviesMap = movies.stream().collect(Collectors.toMap(s -> (String) String.ge, s -> (String) s.get("value")));

		Map<String, Integer> teste = movies.stream().collect(Collectors.toMap(Movie::getId, Movie::getTitle));

		return ImmutableList.of(ImmutableMap.of("id", "5", "title", "Bad Boys"));
	}
}
