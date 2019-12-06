package cn.shmilyms.designpatterns.prototype;

import java.util.Arrays;

import junit.framework.TestCase;

public class TestCases extends TestCase{
	public void test() {
		Girlfriend gf = new Girlfriend();
		
		gf.setHeight(175.0f);
		gf.setWeight(50.0f);
		gf.setName("julie");
		gf.setMeasurements(new float[]{90,60,90});
		
		Girlfriend newgf = gf.getClonedGirlfriend();
		
		assertTrue(gf.getHeight() == gf.getHeight());
		assertTrue(gf.getWeight() == newgf.getWeight());
		assertTrue(gf.getName().equals(newgf.getName()));
		assertTrue(Arrays.equals(gf.getMeasurements(),newgf.getMeasurements()));
		
		assertFalse(gf.getMeasurements() == newgf.getMeasurements());
		assertFalse(gf == newgf);
	}
}
