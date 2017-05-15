package runtime;

public class FreeMemory {
	/*
	 * 返回Java虚拟机的空闲内存量
	 * */
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("JVM的空闲内存量" + runtime.freeMemory());
	}
}
