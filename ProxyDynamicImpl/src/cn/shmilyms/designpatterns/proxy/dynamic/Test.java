package cn.shmilyms.designpatterns.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Owner owner = new Owner();
		
		// Direct way
		owner.sell("Donald Trump");
		
		// Indirect way
		IHouseSeller agent = (IHouseSeller)Proxy.newProxyInstance(owner.getClass().getClassLoader(), Owner.class.getInterfaces(), new AgentHandler(owner,"47"));
		
		agent.sell("Hillary Clinton");
	}

}
