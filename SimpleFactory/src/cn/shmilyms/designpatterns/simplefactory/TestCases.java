package cn.shmilyms.designpatterns.simplefactory;

import cn.shmilyms.designpatterns.simplefactory.operations.AbstractOperation;
import junit.framework.TestCase;

public class TestCases extends TestCase{
	
	private static final double delta = 0;
	
	OperationFactory factory;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		factory = new OperationFactory();
	}
	
	public void test(double numberA,double numberB,String operator,double expected) {
		AbstractOperation op = factory.createOperation(operator);
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		assertEquals(expected,op.getResult(), delta);
	}
	
	public void testAdd() {
		// TODO Auto-generated method stub
		double numberA = 10.5d;
		double numberB = 10.5d;
		
		test(numberA,numberB,"+",numberA+numberB);
	}
	
	public void testSub() {
		// TODO Auto-generated method stub
		double numberA = 10.5d;
		double numberB = 10.5d;
		
		test(numberA,numberB,"-",numberA-numberB);
	}
	
	public void testMul() {
		// TODO Auto-generated method stub
		double numberA = 10.5d;
		double numberB = 10.5d;
		
		test(numberA,numberB,"*",numberA*numberB);
	}
	
	public void testDiv() {
		// TODO Auto-generated method stub
		double numberA = 10.5d;
		double numberB = 10.5d;
		
		test(numberA,numberB,"/",numberA/numberB);
	}
	
	public void testDivByZero() {
		// TODO Auto-generated method stub
		double numberA = 10.5d;
		double numberB = 0d;
		AbstractOperation op = factory.createOperation("/");
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		try {
			double result = op.getResult();
			assertEquals(0,result,delta);
			fail();
		}
		catch(IllegalArgumentException e) {
			assertEquals("div by 0",e.getMessage());
		}
	}
}
