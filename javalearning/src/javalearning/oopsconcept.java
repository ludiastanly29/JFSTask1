package javalearning;

public class oopsconcept {
	protected int x=10;
	public int sum() {
		return x;
	}
	public static void main(String[] args) {
		oopsconcept a = new oopsconcept();
		System.out.println(a.x);
	}

}