package cn.shmilyms.designpatterns.publishsubscribe;

import cn.shmilyms.designpatterns.publishsubscribe.address.PrivateAddress;
import cn.shmilyms.designpatterns.publishsubscribe.newspaper.Newspaper;
import cn.shmilyms.designpatterns.publishsubscribe.newspaper.WashingtonPost;
import cn.shmilyms.designpatterns.publishsubscribe.newspaper.WashingtonPostSub;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOffice office = new PostOffice();
		Newspaper wp = new WashingtonPost();
		Newspaper wps = new WashingtonPostSub();
		PrivateAddress addr1 = new PrivateAddress();
		PrivateAddress addr2 = new PrivateAddress();
		
		addr1.setAddress("200 13th Ave.");
		addr1.setName("Mrs. Juliet");
		
		addr2.setAddress("204 15th Ave.");
		addr2.setName("Mr. Billy");
		
		office.publish(wp);
		
		office.subscribe(addr1, wp.getClass());
		
		office.publish(wp);
		
		office.subscribe(addr2, wps.getClass());
		
		office.publish(wps);
		
		office.unsubscribe(addr1, wp.getClass());
		
		office.publish(wps);
		
		office.publish(wp);
	}

}
