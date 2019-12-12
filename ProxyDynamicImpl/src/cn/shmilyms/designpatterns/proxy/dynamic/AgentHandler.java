package cn.shmilyms.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AgentHandler implements InvocationHandler{
	private Object target;
	private String name;
	public AgentHandler(Object target,String name) {
		this.name = name;
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.printf("Agent %s active!\n",name);
		return method.invoke(target,args);
	}
	

	
}
