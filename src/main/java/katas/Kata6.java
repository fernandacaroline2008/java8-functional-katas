package katas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
	public static String execute() {
		List<MovieList> moviesList = DataUtil.getMovieLists();
		Stream<Movie> moviesStream = moviesList.stream().map(MovieList::getVideos).flatMap(videosList -> videosList.stream());
		Stream<BoxArt> boxartsStream = moviesStream.map(Movie::getBoxarts).flatMap(boxartsList -> boxartsList.stream());
		Optional<BoxArt> boxart = boxartsStream.reduce((BoxArt a, BoxArt b) -> a.getWidth() > b.getWidth() ? a : b);

		return boxart.isPresent() ? boxart.get().getUrl() : null;
	}
}
