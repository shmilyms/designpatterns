package cn.shmilyms.designpatterns.factory.media;

public class Mp3 implements IPlayable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 playing.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 stopped.");
	}

}
