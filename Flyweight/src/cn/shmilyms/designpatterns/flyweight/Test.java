package cn.shmilyms.designpatterns.flyweight;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractQuestionaire qn = new HealthQuestionaire();
		
		for (Question q : qn) {
			q.setAnswer("ans from 1st person");
		}
		qn.display();
		qn.reset();
		
		for (Question q : qn) {
			q.setAnswer("ans from 2nd person");
		}
		qn.display();
	}

}
