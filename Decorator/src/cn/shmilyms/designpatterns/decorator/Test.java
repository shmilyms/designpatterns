package cn.shmilyms.designpatterns.decorator;

import cn.shmilyms.designpatterns.decorator.clothes.Cloth;
import cn.shmilyms.designpatterns.decorator.clothes.Pants;
import cn.shmilyms.designpatterns.decorator.clothes.Sneakers;
import cn.shmilyms.designpatterns.decorator.clothes.TShirt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Steve");
		
		Cloth decorator1 = new Pants();
		Cloth decorator2 = new TShirt();
		Cloth decorator3 = new Sneakers();
		
		decorator1.decorate(person);
		decorator2.decorate(decorator1);
		decorator3.decorate(decorator2);
		
		decorator3.show();
		
		// Steve wearing: pants t-shirt sneakers
	}

}
