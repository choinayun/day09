package day09;

import test.Member;
// import : ����� ������ �� �� ��� 

public class MainClass01 {

	// class : �ϳ��� �ڷ��� , Ʋ 
	// class �� ������ ����� ������ ���� (=��ü) 
		
	public static void main(String[] args) {
	
	// ���������� 
	// public : Ŭ���� ����, �ܺο��� ���� ����
	// private : Ŭ���� ���ο����� ���� ����
	// protected : ��ӹٵ� �ڽ� �Ǵ� ���ο��� ���� ����
	// default : ���� ��Ű�� �ȿ��� ���� ���� 
		
		Member m = new Member();
		
		m.name = "ȫ�浿";
		m.addr = "���¥��";
		m.age = 20;
		
		// �ڷ��� �����̸� = new �ڷ��� 
		TestClass01 t = new TestClass01();
		
		// . = ��� ���� ������
		t.name = "ȫ�浿";
		t.age = 20;
		
		System.out.println(t.name + t.age);
		
				
		
	}
}
