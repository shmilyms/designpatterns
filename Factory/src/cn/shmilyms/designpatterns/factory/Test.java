package cn.shmilyms.designpatterns.factory;

import cn.shmilyms.designpatterns.factory.factories.IFactory;
import cn.shmilyms.designpatterns.factory.factories.Mp3Factory;
import cn.shmilyms.designpatterns.factory.factories.WmvFactory;
import cn.shmilyms.designpatterns.factory.media.IPlayable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory;
		
		factory = new Mp3Factory();
		createAndPlay(factory);
		
		factory = new WmvFactory();
		createAndPlay(factory);
	}
	
	public static void createAndPlay(IFactory factory) {
		IPlayable  media;
		
		media = factory.createMedia();
		media.play();
		media.stop();
	}
}
