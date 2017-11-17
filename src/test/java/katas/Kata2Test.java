package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class Kata2Test {

    @Test
    public void testExecute() {
	System.out.println(Kata2.execute());
	Assert.assertThat(Kata2.execute().size(), equalTo(2));
	Assert.assertThat(Kata2.execute(), equalTo(ImmutableList.of(654356453, 675465)));
    }
}
