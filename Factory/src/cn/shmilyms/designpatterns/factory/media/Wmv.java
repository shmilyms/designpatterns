package cn.shmilyms.designpatterns.factory.media;

public class Wmv implements IPlayable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Wmv playing.");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Wmv stopped.");
	}

}
