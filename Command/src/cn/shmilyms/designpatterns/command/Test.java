package cn.shmilyms.designpatterns.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<KGBOrder> orders = new ArrayDeque<>();
		
		Traitor t1 = new Traitor("Mr. Starfruit");
		Traitor t2 = new Traitor("Mr. Corn");
		Traitor t3 = new Traitor("Mr. Banana");
		
		KGBExecutioner e1 = new KGBExecutioner("KGB");
		KGBExecutioner e2 = new KGBExecutioner("L Blueberry");
		
		KGBOrder o1 = new KGBOrder(t1,e1);
		KGBOrder o2 = new KGBOrder(t2,e1);
		KGBOrder o3 = new KGBOrder(t3,e2);
		
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		
		orders.pop().execute();
		orders.pop().execute();
		orders.pop().execute();
		
	}
	

}
