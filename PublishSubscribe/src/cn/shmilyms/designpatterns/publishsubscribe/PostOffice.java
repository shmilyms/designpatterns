package cn.shmilyms.designpatterns.publishsubscribe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.shmilyms.designpatterns.publishsubscribe.address.Address;
import cn.shmilyms.designpatterns.publishsubscribe.newspaper.Newspaper;
import cn.shmilyms.designpatterns.publishsubscribe.newspaper.WashingtonPost;

public class PostOffice {
	private Map<Class<? extends Newspaper>,List<Address>> directory = new HashMap<>();;
	
	public void subscribe(Address addr,Class<? extends Newspaper> clazz) {
		
		if (!directory.containsKey(clazz))
			directory.put(clazz, new ArrayList<>());
		
		directory.get(clazz).add(addr);
	}
	
	@SuppressWarnings("unchecked")
	protected List<Class<? extends Newspaper>> getAllNewspaperClasses(Class<? extends Newspaper> clazz){
		
		List<Class<? extends Newspaper>> objs = new ArrayList<>();
		Class<? extends Newspaper> cursor = clazz;
		objs.add(clazz);
		
		while (cursor!=Newspaper.class)
		{
			cursor = (Class<? extends Newspaper>) cursor.getSuperclass();
			objs.add(cursor);
		}
		
		return objs;
	}
	
	public void unsubscribe(Address addr,Class<? extends Newspaper> clazz) {
		if (directory.containsKey(clazz))
			directory.get(clazz).remove(addr);
	}
	
	public void publish(Newspaper news) {
		List<Class<? extends Newspaper>> clazzList = getAllNewspaperClasses(news.getClass());
		
		for (Class<? extends Newspaper> clazz : clazzList) {
			if (directory.containsKey(clazz)) {
				List<Address> addressList = directory.get(clazz);
				for (Address addr : addressList)
					addr.receive(news);
			}
		}
	}
	public static void main(String[] args) {
		PostOffice office = new PostOffice();
		List<Class<? extends Newspaper>> list = office.getAllNewspaperClasses(WashingtonPost.class);
		for (Class<? extends Newspaper> clazz : list) {
			System.out.println(clazz.getCanonicalName());
		}
		
	}
}
