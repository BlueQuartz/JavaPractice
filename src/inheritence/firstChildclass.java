package inheritence;

public class firstChildclass extends ParentClass {

	int open = 200;
	
	public firstChildclass() {
		System.out.println("FirstChildClass constructor");
	}
	@Override
	public void makeJJajang() {
		System.out.println("-- FirstChildClass's makeJJajang1() --");
		
		System.out.println("open :" + open);
		this.open = super.open;
		System.out.println("open :" + open);
	}
	
	
}
