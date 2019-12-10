package cn.shmilyms.designpatterns.mediator;

public class General implements IMessage{

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("General received message :"+message);
	}

	@Override
	public void sendMessage(String message, Messenger msg) {
		// TODO Auto-generated method stub
		msg.sendMessage(message, this);
	}

}
