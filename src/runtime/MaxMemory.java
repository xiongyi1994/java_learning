package runtime;

public class MaxMemory {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("JVM的最大内存量" + runtime.maxMemory());
	}
}
