package day09;

import test.Member;
// import : 기능을 가지고 올 때 사용 

public class MainClass01 {

	// class : 하나의 자료형 , 틀 
	// class 로 변수를 만들면 참조형 변수 (=객체) 
		
	public static void main(String[] args) {
	
	// 접근제한자 
	// public : 클래스 내부, 외부에서 접근 가능
	// private : 클래스 내부에서만 접근 가능
	// protected : 상속바든 자식 또는 내부에서 접근 가능
	// default : 같은 패키지 안에서 접근 가능 
		
		Member m = new Member();
		
		m.name = "홍길동";
		m.addr = "산골짜기";
		m.age = 20;
		
		// 자료형 변수이름 = new 자료형 
		TestClass01 t = new TestClass01();
		
		// . = 멤버 접근 연산자
		t.name = "홍길동";
		t.age = 20;
		
		System.out.println(t.name + t.age);
		
				
		
	}
}
