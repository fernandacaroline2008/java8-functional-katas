package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import model.Movie;
import util.DataUtil;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of
*/
public class Kata1
{
    public static List<Map> execute()
    {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream()
        	.map(item -> ImmutableMap.of(
                		"id", item.getId(),
                		"title", item.getTitle()
        		)
        	).collect(Collectors.toList());
    }
}
