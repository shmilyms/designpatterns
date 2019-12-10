package cn.shmilyms.designpatterns.mediator;

public class Soldier implements IMessage{

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Soldier received message: "+message);
	}

	@Override
	public void sendMessage(String message, Messenger msg) {
		// TODO Auto-generated method stub
		msg.sendMessage(message, this);
	}

}
