package cn.shmilyms.designpatterns.factory.factories;

import cn.shmilyms.designpatterns.factory.media.IPlayable;
import cn.shmilyms.designpatterns.factory.media.Mp3;

public class Mp3Factory implements IFactory {

	@Override
	public IPlayable createMedia() {
		// TODO Auto-generated method stub
		return new Mp3();
	}
	
}
