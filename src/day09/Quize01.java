package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		// 내 풀이 
		
		HashMap map = new HashMap();
		
		map.put("김밥", 1500);
		map.put("라면", 1000);
		map.put("떡볶이", 2000);
		map.put("어묵", 500);
		
		while(true) {
		
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println(">>>>");
			
			int num;
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
		
				switch(num) {
				
					case 1 : 
						
						System.out.println("등록할 메뉴를 입력하세요");
						String menu = input.next();

						if(map.get(menu) != null) {
							System.out.println("존재하는 메뉴입니다.");
						}else {
							System.out.println("새로운 메뉴가 등록되었습니다.");
							System.out.println("가격을 입력하세요.");
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
							
							System.out.println("1. 수정 2. 삭제 3. 나가기");
							int num2 = input.nextInt();
							
							if(num2 == 3) {
								
								break;
								
							}else if(num2 == 1) {
								
								System.out.println("수정할 메뉴를 입력하세요");
								menu = input.next();
								
								if(map.get(menu) == null) {
									System.out.println("없는 메뉴입니다.");
								}else {
									System.out.println("새로 등록할 가격을 입력하세요");
									int price = input.nextInt();
									map.put(menu, price);
								}
								
							}else if(num2 == 2) {
								
								System.out.println("삭제할 메뉴를 입력하세요");
								menu = input.next();
								
								if(map.get(menu) == null) {
									System.out.println("없는 메뉴입니다.");
								}else {
									System.out.println("선택한 메뉴를 삭제합니다.");
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
