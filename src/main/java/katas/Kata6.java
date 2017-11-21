package katas;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

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
	return movieLists.stream()
		.flatMap(item -> item.getVideos().stream())
		.flatMap(item -> item.getBoxarts().stream())
		.reduce((box1, box2) -> box1.getWidth() > box2.getWidth() ? box1 : box2)
		.map(BoxArt::getUrl);

    }
    

}
