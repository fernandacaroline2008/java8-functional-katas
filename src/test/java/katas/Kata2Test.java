package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class Kata2Test {

    @Test
    public void testExecuteSize() {
	Assert.assertThat(Kata2.execute().size(), equalTo(2));
    }

    @Test
    public void testExecuteStructure() {
	Assert.assertThat(Kata2.execute(), equalTo(ImmutableList.of(654356453, 675465)));
	System.out.println(Kata2.execute());
    }
}
