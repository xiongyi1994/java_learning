package enumLearning;

enum Color{
	RED,GREEN,BLUE;
}

public class EnumDemo01 {
	public static void main(String[] args) {
		Color color = Color.BLUE;
		System.out.println(color);
		
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}
