package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class Kata11Test {

    @Test
    public void testExecute() {
	System.out.println(Kata11.execute());
	Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }
}
