package inheritence;


public class ChildClass extends ParentClass {

	

	public ChildClass() {
		System.out.println("ChildClass constructor ");
	}
	
	public void childFun() {
		System.out.println("-- childFun() Start --");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("-- more make JJajang() --");
	}
}
