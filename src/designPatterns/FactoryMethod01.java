package designPatterns;

public class FactoryMethod01 {
	
	/*
	 * 普通工厂模式
	 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建
	 * */
	
	// 共同的接口
	public interface Sender{
		public void Send();
	}
	
	// 实现类
	public static class MailSender implements Sender{
		
		@Override
		public void Send() {
			System.out.println("this is mail sender!"); 
		}
		
	}
	
	// 实现类
	public static class SmsSender implements Sender{

		@Override
		public void Send() {
			System.out.println("this is sms sender!");  
		}
		
	}
	
	// 工厂类
	public static class SendFactory{
		
		public Sender produce(String type){
			if(type.equals("mail")){
				return new MailSender();
			}else if(type.equals("sms")){
				return new SmsSender();
			}else{
				System.out.println("请输入正确的类型");
				return null;
			}
		}
		
	}
	
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("mail");
		sender.Send();
	}
}
