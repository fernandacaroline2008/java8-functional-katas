package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Kata11Test {

    @Test
    public void testExecuteSize() {
	Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }

    @Test
    public void testExecuteStructure() {
	List<Map> data = ImmutableList.of(
		ImmutableMap.of("name", "New Releases", "videos",
			ImmutableList.of(
				ImmutableMap.of("id", 65432445, "title", "The Chamber", "time", Optional.of(32432), "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg")),
        			ImmutableMap.of("id", 675465, "title", "Fracture", "time", Optional.of(3534543), "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture120.jpg")))),
		ImmutableMap.of("name", "Thrillers", "videos",
			ImmutableList.of(
        			ImmutableMap.of("id", 70111470, "title", "Die Hard", "time", Optional.of(645243), "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg")),
        			ImmutableMap.of("id", 654356453, "title", "Bad Boys", "time", Optional.of(984934), "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg"))))
		);
	Assert.assertThat(Kata11.execute(), equalTo(data));
	System.out.println(Kata11.execute());



    }
}
