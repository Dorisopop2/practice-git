package testApp;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("2nd Version");
		//�o�O�ƾ����O
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 5));
	}

}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}