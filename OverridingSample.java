public class OverridingSample extends Students {
	
	public static void main(String[] args) {
		Students os = new OverridingSample();	//Reference Students, OverridingSample object
		os.showName();
		
	
		OverridingSample newOs = new OverridingSample();
		newOs.showAge();	
	}
	
	//Override method in Students
	public void showName() {
		System.out.println("New Name");
	}
	
	public void showAge() {
		System.out.println("10");
	}
}

class Students {
	String defaultName = "Sambath";
	public void showName() {
		System.out.println(this.defaultName);
	}
}