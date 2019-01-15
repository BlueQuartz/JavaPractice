package inheritence;

public class ParentClass {

	int open = 100;
	
	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	public void parentFun() {
		System.out.println("-- parentFun()Start --");
		
	}
	private void privatefun() {
		System.out.println("Private fun");
	}
	
	public void makeJJajang() {
		System.out.println("-- make JJajang() --");
	}
}
