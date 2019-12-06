package cn.shmilyms.designpatterns.factory.factories;

import cn.shmilyms.designpatterns.factory.media.IPlayable;
import cn.shmilyms.designpatterns.factory.media.Wmv;

public class WmvFactory implements IFactory {

	@Override
	public IPlayable createMedia() {
		// TODO Auto-generated method stub
		return new Wmv();
	}
	
}
