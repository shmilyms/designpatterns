package cn.shmilyms.designpatterns.abstractfactory.factories;

import cn.shmilyms.designpatterns.abstractfactory.shapes.ICircle;
import cn.shmilyms.designpatterns.abstractfactory.shapes.ISquare;

public interface IShapeFactory {
	ICircle drawCircle();
	ISquare drawSquare();
}
