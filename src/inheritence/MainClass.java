package inheritence;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {
		//�迭��
		ParentClass[] pArr = new ParentClass[2];
		
		
		ParentClass fch = new firstChildclass();
		ParentClass sch = new secondChildclass();
		
		pArr[0] = fch;
		pArr[1] = sch;
		

		
		System.out.println("pArr[0] : "+ pArr[0]);
		System.out.println("pArr[1] : "+ pArr[1]);
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].makeJJajang();
		}
		
		/*ChildClass Child = new ChildClass();
		
		Child.parentFun();
		Child.childFun();
		
		
		Child.makeJJajang();
		//Ŭ������ Ÿ���� �ڷ������� �з���.
		*/

	}
}


//private�� Ȱ�� �Ұ�
//�ּ��� ����� ����̴��� Ŀ���� �� ���� �̹��� Ǫ���� ���Ұſ���.