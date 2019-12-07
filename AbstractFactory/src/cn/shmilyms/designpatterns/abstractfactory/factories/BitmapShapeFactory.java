package cn.shmilyms.designpatterns.abstractfactory.factories;

import cn.shmilyms.designpatterns.abstractfactory.shapes.ICircle;
import cn.shmilyms.designpatterns.abstractfactory.shapes.ISquare;

public class BitmapShapeFactory implements IShapeFactory {

	@Override
	public ICircle drawCircle() {
		// TODO Auto-generated method stub
		BitmapCircle circle = new BitmapCircle();
		circle.setRadius(120);
		return circle;
	}

	@Override
	public ISquare drawSquare() {
		// TODO Auto-generated method stub
		BitmapSquare square = new BitmapSquare();
		square.setWidth(120);
		return square;
	}
	
	private class BitmapCircle implements ICircle{
		private String type = "bitmap";
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
	
	private class BitmapSquare implements ISquare{
		private String type = "bitmap";
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
