public class EncapsulationSample {
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		s1.showName();
		s1.showAge();
		
		s1.name = "Peter";
		s1.showName();

		
		//Encapsulation
		StudentInfo2 s2 = new StudentInfo2();
		s2.showName();
		s2.showAge();
		
		s2.setName("Sambath");	//Must do that to set name variable because of private keyword
		s2.showName();	
	}
} 

class StudentInfo {
	public String name;
	public int age;
	
	StudentInfo() {
		this.name = "Student 1";
		this.age = 10;
	}
	
	public void showName() {
		System.out.println("Name: " + this.name);
	}
	
	public void showAge() {
		System.out.println("Age: " + this.age);
	}
}

class StudentInfo2 {
	private String name;
	private int age;
	
	StudentInfo2() {
		this.name = "Student 2";
		this.age = 20;
	}
	
	public void showName() {
		System.out.println("Name: " + this.name);
	}
	
	public void showAge() {
		System.out.println("Age: " + this.age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
}