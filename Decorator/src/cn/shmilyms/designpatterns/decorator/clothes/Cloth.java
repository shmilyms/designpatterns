package cn.shmilyms.designpatterns.decorator.clothes;

import cn.shmilyms.designpatterns.decorator.Person;

public class Cloth extends Person {
	
	protected Person person;

	public void decorate(Person person) {
		this.person = person;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if (person!=null)
			person.show();
	}
}
