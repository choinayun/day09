package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*

set 
- ������ �������� �ʴ´�
- �ߺ��� ���� ������� �ʴ´�
 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// �ߺ���� 
		ArrayList arr = new ArrayList();
		arr.add("ȫ�浿");
		arr.add("ȫ�浿");
		System.out.println("arr : " + arr);
		
		// �ߺ���� X
		HashSet hs = new HashSet();
		hs.add("ȫ�浿");
		hs.add("�谳��");
		hs.add("ȫ�浿");
		System.out.println( hs.remove("ȫ�浿") ); // ������ �Ǹ� true ��� 
		System.out.println("hs : " + hs);
		
		hs.add("ȫ�浿");
		
		// hash set �ݺ��� (set���� �ϳ��� ���)
		// it = [bof, 'ȫ�浿', 'ȫ�浿', eof]
		//		  it (hasNext) 
		//			 	it (next)
		// bof = �������� �˷��ִ� �� 
		// eof = �� �̻� �����Ͱ� ���°� �˷��ִ� ��  
		Iterator it = arr.iterator();
		
		while(it.hasNext() == true) {
			System.out.println( it.next() );
		}
		/*
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		// next : ���� �ִ� ��ġ���� �������� �̵��ؼ� ���
		// hasNext : it �� ������ġ�� ���� �ִ��� �������� Ȯ���ϰ� ��� 
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		*/
		
		
		// �����ϴ� ���� Ÿ���� ����  
		
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			String st = (String)s;
			System.out.println( st );
		}
	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next() ; 
		System.out.println(s1);
		// �����ϴ� ���� Ÿ���� ���� 
		
		
	}
}
