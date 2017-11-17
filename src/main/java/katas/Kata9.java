package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
		List<MovieList> movieLists = DataUtil.getMovieLists();
		Stream<Movie> moviesStream = movieLists.stream().map(MovieList::getVideos).flatMap(item -> item.stream());
		return moviesStream.map(
			item -> ImmutableMap.of(
				"id", item.getId(), 
				"title", item.getTitle(),
				"time", item.getInterestingMoments()
					.get(item.getInterestingMoments().size() / 2).getTime(),
				"url", item.getBoxarts()
        				.stream()
        				.reduce((BoxArt a, BoxArt b) -> a.getWidth() < b.getWidth() ? a : b).map(BoxArt::getUrl))
			).collect(Collectors.toList());
    }
}
