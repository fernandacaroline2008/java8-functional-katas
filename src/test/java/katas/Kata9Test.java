package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Kata9Test {

    @Test
    public void testExecuteSize() {
	Assert.assertThat(Kata9.execute().size(), equalTo(4));
    }
    
    @Test
    public void testExecuteStructure() {
	List<Map> data = ImmutableList.of(
		ImmutableMap.of("id", 70111470, "title", "Die Hard", "time", Optional.of(new Date()), "url", Optional.of("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg")),
		ImmutableMap.of("id", 654356453, "title", "Bad Boys", "time", Optional.of(new Date()), "url", Optional.of("http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg")),
		ImmutableMap.of("id", 65432445, "title", "The Chamber", "time", Optional.of(new Date()), "url",Optional.of("http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg")),
		ImmutableMap.of("id", 675465, "title", "Fracture", "time", Optional.of(new Date()), "url", Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture150.jpg")));
	Assert.assertThat(Kata9.execute(), equalTo(data));
	System.out.println(Kata9.execute());
    }
}
