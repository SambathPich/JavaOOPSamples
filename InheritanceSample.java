public class InheritanceSample extends Calculator {
	public static void main(String[] args) {
		InheritanceSample inheritanceExample = new InheritanceSample();
		System.out.println(inheritanceExample.sum(10,20));
	}
}

class Calculator {
	public int sum(int x, int y) {
		return x + y;
	}

}