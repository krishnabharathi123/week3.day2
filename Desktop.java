package week3.day2;

public class Desktop implements Software,HardWare {

	public void desktopModel() {
		System.out.println("Desktop model is Dell");
	}

	public void hardwareResources() {
		System.out.println("Hardware resourse is 2 GB");

	}

	public void softwareResources() {
		System.out.println("Software resourse is mac");
	}

	public static void main(String[] args) {

		Desktop ds=new Desktop();
		ds.desktopModel();
		ds.hardwareResources();
		ds.softwareResources();
	}

}
