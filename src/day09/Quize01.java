package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		// �� Ǯ�� 
		
		HashMap map = new HashMap();
		
		map.put("���", 1500);
		map.put("���", 1000);
		map.put("������", 2000);
		map.put("�", 500);
		
		while(true) {
		
			System.out.println("1. �޴����");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.println(">>>>");
			
			int num;
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
		
				switch(num) {
				
					case 1 : 
						
						System.out.println("����� �޴��� �Է��ϼ���");
						String menu = input.next();

						if(map.get(menu) != null) {
							System.out.println("�����ϴ� �޴��Դϴ�.");
						}else {
							System.out.println("���ο� �޴��� ��ϵǾ����ϴ�.");
							System.out.println("������ �Է��ϼ���.");
							int price = input.nextInt();
							map.put(menu, price);
						}
						
						break;
						
						
					case 2 :
						
						Iterator it = map.keySet().iterator();
						
						while( it.hasNext() ) {
							String k = (String)it.next();
							System.out.println(k + " : " + map.get(k));
						}
							
							System.out.println("1. ���� 2. ���� 3. ������");
							int num2 = input.nextInt();
							
							if(num2 == 3) {
								
								break;
								
							}else if(num2 == 1) {
								
								System.out.println("������ �޴��� �Է��ϼ���");
								menu = input.next();
								
								if(map.get(menu) == null) {
									System.out.println("���� �޴��Դϴ�.");
								}else {
									System.out.println("���� ����� ������ �Է��ϼ���");
									int price = input.nextInt();
									map.put(menu, price);
								}
								
							}else if(num2 == 2) {
								
								System.out.println("������ �޴��� �Է��ϼ���");
								menu = input.next();
								
								if(map.get(menu) == null) {
									System.out.println("���� �޴��Դϴ�.");
								}else {
									System.out.println("������ �޴��� �����մϴ�.");
									map.remove(menu);
								}
								
							}
					
						break;
						
						
					case 3 : 
						
						System.exit(1);
				}
			
		
		}
		

		
		
		
		
	}
}
