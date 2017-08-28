package designPatterns;

interface Sender {
	public void Send();
}

class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}

class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}

interface Provider {
	public Sender produce();
}

class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}
	
}

class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}

public class AbstractFactory01 {

	/*
	 * 工厂模式存在的问题：类的创建依赖工厂类，想要拓展程序必须对工厂类进行修改，违背了开闭原则
	 * 抽象工厂模式：创建多个工厂类，一旦需要增加新的功能，直接增加新的工厂类就可以了
	 */

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
