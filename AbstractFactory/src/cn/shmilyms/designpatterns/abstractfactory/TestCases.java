package cn.shmilyms.designpatterns.abstractfactory;

import cn.shmilyms.designpatterns.abstractfactory.factories.BitmapShapeFactory;
import cn.shmilyms.designpatterns.abstractfactory.factories.IShapeFactory;
import cn.shmilyms.designpatterns.abstractfactory.factories.VectorizedShapeFactory;
import cn.shmilyms.designpatterns.abstractfactory.shapes.ICircle;
import cn.shmilyms.designpatterns.abstractfactory.shapes.ISquare;
import junit.framework.TestCase;

public class TestCases extends TestCase{
	public void test() {
		IShapeFactory factory;
		ICircle circle;
		ISquare square;
		
		factory = new BitmapShapeFactory();
		circle = factory.drawCircle();
		square = factory.drawSquare();
		
		assertEquals(circle.getType(),"bitmap");
		assertEquals(square.getType(),"bitmap");
		
		factory = new VectorizedShapeFactory();
		circle = factory.drawCircle();
		square = factory.drawSquare();
		
		assertEquals(circle.getType(),"vector");
		assertEquals(square.getType(),"vector");
		
		
	}
}
