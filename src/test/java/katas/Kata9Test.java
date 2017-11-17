package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class Kata9Test {

    @Test
    public void testExecute() {
	System.out.println(Kata9.execute());
	Assert.assertThat(Kata9.execute().size(), equalTo(4));
    }
}
