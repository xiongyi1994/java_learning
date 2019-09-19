package designPatterns;

public class FactoryMethod02 {
	/*
	 * 多个工厂方法模式
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

		public static class SendFactory{

			public Sender produceMail(){
				return new MailSender();
			}

			public Sender produceSms(){
				return new SmsSender();
			}

		}

		public static void main(String[] args) {

		}

}
