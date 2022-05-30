package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 
 Map
 - Ű�� ������ �ϳ��� ������ �̷���� �ִ�
 - ������ �������� ������, Ű�� �ߺ��� ������� �ʴ´� 
 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		// ������ ���� : map.put(Ű,��)
		map.put("��ǳ��", "100����");
		map.put("������", "50����");
		map.put("�ڵ���", "10����");
		
		// �ߺ�Ȯ�� (Ű�� �ߺ����� �ʴ� ���� ó������) 
		map.put("��ǳ��", "1000����");
		System.out.println(map);
		
		// ������ ��� : map.get(Ű) 
		System.out.println( map.get("��ǳ��") );
		System.out.println( map.get("������") );
		System.out.println( map.get("���°�") );
		
		// �ش��ϴ� Ű�� ���� ���� (��� true / false) 
		System.out.println( map.containsKey("�ڵ���"));
		System.out.println( map.containsKey("���°�"));
		
		// �ش��ϴ� ��� ���� : map.remove(Ű) 
		map.remove("��ǳ��");
		System.out.println(map);
		
		// �ش��ϴ� Ű�� ��� 
		System.out.println( map.keySet() );
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		
		// �ش��ϴ� Ű, �� ��� 
		Iterator it = map.keySet().iterator();
		// it = [bof, �ڵ���, ������, eof]
		// map = {�ڵ���=10����, ������=50����}
		while( it.hasNext() ) {
			String s = (String)it.next();
			System.out.println(s + " : " + map.get(s));
		}
		
		
		// ���� 
		String k = "�츮��", v = "����3��";
		map.put(k, v);
		
		Scanner input = new Scanner(System.in);
		System.out.println("ã�� �� �Է�");
		
		String search = input.next();
		
		if(map.get(search) == null) {
			System.out.println("�������� �ʴ� �ּ�");
		}else {
			System.out.println(search + " : " + map.get(search));
		}
		
		
	}
	
}
