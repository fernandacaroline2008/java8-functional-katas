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
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4
{
    public static List<Map> execute()
    {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        Stream<Movie> moviesStream = movieLists.stream().map(MovieList::getVideos).flatMap(item -> item.stream());
        return moviesStream.map(
        	itemMovie -> ImmutableMap.of(
                        "id", itemMovie.getId(),
                        "title", itemMovie.getTitle(),
                        "boxart", itemMovie.getBoxarts()
                            .stream()
                            .filter(item -> item.getHeight() == 200 && item.getWidth() == 150)
                            .map(BoxArt::getUrl)
                            .findFirst()))
                .collect(Collectors.toList());
    }

}
