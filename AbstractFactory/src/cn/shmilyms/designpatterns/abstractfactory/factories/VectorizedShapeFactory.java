package cn.shmilyms.designpatterns.abstractfactory.factories;

import cn.shmilyms.designpatterns.abstractfactory.shapes.ICircle;
import cn.shmilyms.designpatterns.abstractfactory.shapes.ISquare;

public class VectorizedShapeFactory implements IShapeFactory {

	@Override
	public ICircle drawCircle() {
		// TODO Auto-generated method stub
		VectorizedCircle circle = new VectorizedCircle();
		circle.setRadius(120);
		return circle;
	}

	@Override
	public ISquare drawSquare() {
		// TODO Auto-generated method stub
		VectorizedSquare square = new VectorizedSquare();
		square.setWidth(120);
		return square;
	}
	
	private class VectorizedCircle implements ICircle{
		private String type = "vector";
		private int radius;
		
		@Override
		public String getType() {
			return type;
		}

		@Override
		public int getRadius() {
			// TODO Auto-generated method stub
			return radius;
		}
		
		public void setRadius(int radius) {
			// TODO Auto-generated method stub
			this.radius = radius;
		}
		
	}
	
	private class VectorizedSquare implements ISquare{
		private String type = "vector";
		private int width;
		
		@Override
		public String getType() {
			return type;
		}

		@Override
		public int getWidth() {
			// TODO Auto-generated method stub
			return width;
		}
		
		public void setWidth(int width) {
			// TODO Auto-generated method stub
			this.width = width;
		}
		
	}
}
