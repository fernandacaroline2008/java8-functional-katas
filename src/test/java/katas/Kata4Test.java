package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class Kata4Test {

    @Test
    public void testExecute() {
	System.out.println(Kata4.execute());
	Assert.assertThat(Kata4.execute().size(), equalTo(4));
    }
}
