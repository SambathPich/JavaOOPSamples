public class PolymorphismSample {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Sambath");
		Student s3 = new StudentAge();
	}
}


class Student {
	
	Student() {
		System.out.println("No Name Information");
	}
	
	Student(String name) {
		System.out.println("\tName: " + name);
	}
}

class StudentAge extends Student {
	
	StudentAge() {
		System.out.println("No Age Information");
	}
}