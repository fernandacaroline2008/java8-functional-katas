package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class Kata1Test {

    @Test
    public void testExecute() {
	System.out.println(Kata1.execute());
	Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
