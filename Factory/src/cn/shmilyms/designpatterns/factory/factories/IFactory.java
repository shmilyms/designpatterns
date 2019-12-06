package cn.shmilyms.designpatterns.factory.factories;

import cn.shmilyms.designpatterns.factory.media.IPlayable;

public interface IFactory {
	IPlayable createMedia();
}
