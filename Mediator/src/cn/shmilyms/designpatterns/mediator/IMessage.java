package cn.shmilyms.designpatterns.mediator;

public interface IMessage {
	void receiveMessage(String message);
	void sendMessage(String message,Messenger msg);
}
