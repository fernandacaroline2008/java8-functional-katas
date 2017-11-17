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
    public static Optional<String> execute() {
	List<MovieList> movieLists = DataUtil.getMovieLists();
	Stream<Movie> moviesStream = movieLists.stream().map(MovieList::getVideos).flatMap(item -> item.stream());
	Stream<BoxArt> boxartsStream = moviesStream.map(Movie::getBoxarts).flatMap(item -> item.stream());
	return boxartsStream.reduce((BoxArt a, BoxArt b) -> a.getWidth() > b.getWidth() ? a : b).map(BoxArt::getUrl);
    }
}
