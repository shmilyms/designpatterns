package cn.shmilyms.designpatterns.simplefactory;

import cn.shmilyms.designpatterns.simplefactory.operations.AbstractOperation;
import cn.shmilyms.designpatterns.simplefactory.operations.OperationAdd;
import cn.shmilyms.designpatterns.simplefactory.operations.OperationDiv;
import cn.shmilyms.designpatterns.simplefactory.operations.OperationMul;
import cn.shmilyms.designpatterns.simplefactory.operations.OperationSub;

public class OperationFactory {
	public AbstractOperation createOperation(String operator) {
		switch(operator) {
		case "+":
			return new OperationAdd();
		case "-":
			return new OperationSub();
		case "*":
			return new OperationMul();
		case "/":
			return new OperationDiv();
		default:
			return null;
		}
	}
}
