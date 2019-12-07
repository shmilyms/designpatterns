package cn.shmilyms.designpatterns.publishsubscribe.address;

import cn.shmilyms.designpatterns.publishsubscribe.newspaper.Newspaper;

public abstract class Address {
	private String address;
	
	public abstract void receive(Newspaper news);

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
