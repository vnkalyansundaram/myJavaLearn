package mylearnings;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir").toString();
		path=path.replace("\","\\");
		String otherFolder = path + "\\other";
		System.out.println(path);
		System.out.println(otherFolder);
	}

}
