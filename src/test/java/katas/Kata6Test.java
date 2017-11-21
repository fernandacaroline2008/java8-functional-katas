package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class Kata6Test {

    @Test
    public void testExecuteStructure() {
	Assert.assertThat(Kata6.execute(),
		equalTo(Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg")));
	System.out.println(Kata6.execute());
    }

}
