package com.github.djaganathan.general;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import com.github.djaganathan.unit.test.category.ReleaseTest;

@RunWith(JUnit4ClassRunner.class)
public class GeneralTest {
	
	@Test
	@Category(value={ReleaseTest.class})
	public void doTestForRelease(){}
	
	@Test
	public void doTestForDev(){}
	
}
