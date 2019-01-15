package inheritence;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {
		//배열형
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
		//클래스의 타입은 자료형으로 분류됨.
		*/

	}
}


//private는 활용 불가
//주석이 제대로 적용됫는지 커밋을 해 보자 이번엔 푸쉬를 안할거에요.