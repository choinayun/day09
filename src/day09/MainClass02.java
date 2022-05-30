package day09;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		TestClass02 t01 = new TestClass02();
		// t01 : 참조형변수(객체) 
		// 		 TestClass02 의 모든 내용을 포함하고 있다 
		
		System.out.println("main 시작");
		t01.test();
		System.out.println("main 종료");
		
		// 디버깅을 할 경우 
		// 순서를 잘 알아두기 
		// F5 : 해당 코드로 이동해서 확인
		// F6 : 한 줄씩 차례로 실행
		
	}
		
}
