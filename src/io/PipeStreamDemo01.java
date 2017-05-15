package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{

	private PipedOutputStream pos = null; //管道输出流
	public Send() {
		this.pos = new PipedOutputStream(); //实例化输出流
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String string = "Hello World!";
		try{
			this.pos.write(string.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			this.pos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public PipedOutputStream getPos(){
		return pos;
	}
	
}

class Receive implements Runnable{

	private PipedInputStream pis = null;
	
	public Receive() {
		this.pis = new PipedInputStream();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte b[] = new byte[1024];
		int len = 0;
		try {
			len = this.pis.read(b); // 接收数据
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.pis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("接收的内容为：" + new String(b,0,len));
	}
	public PipedInputStream getPis() {
		return pis;
	}
	
}

public class PipeStreamDemo01 {
	public static void main(String[] args) {
		Send send = new Send();
		Receive receive = new Receive();
		try {
			send.getPos().connect(receive.getPis());
		} catch (IOException e) {
			e.printStackTrace();
		}
		new Thread(send).start();
		new Thread(receive).start();
	}
}
