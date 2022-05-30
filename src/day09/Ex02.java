package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 
 Map
 - 키와 값으로 하나의 쌍으로 이루어져 있다
 - 순서는 유지되지 않으며, 키의 중복은 허용하지 않는다 
 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		// 데이터 저장 : map.put(키,값)
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		
		// 중복확인 (키가 중복되지 않는 값만 처리가능) 
		map.put("선풍기", "1000만원");
		System.out.println(map);
		
		// 데이터 출력 : map.get(키) 
		System.out.println( map.get("선풍기") );
		System.out.println( map.get("에어컨") );
		System.out.println( map.get("없는값") );
		
		// 해당하는 키의 존재 유무 (결과 true / false) 
		System.out.println( map.containsKey("자동차"));
		System.out.println( map.containsKey("없는값"));
		
		// 해당하는 목록 삭제 : map.remove(키) 
		map.remove("선풍기");
		System.out.println(map);
		
		// 해당하는 키만 출력 
		System.out.println( map.keySet() );
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		
		// 해당하는 키, 값 출력 
		Iterator it = map.keySet().iterator();
		// it = [bof, 자동차, 에어컨, eof]
		// map = {자동차=10만원, 에어컨=50만원}
		while( it.hasNext() ) {
			String s = (String)it.next();
			System.out.println(s + " : " + map.get(s));
		}
		
		
		// 예제 
		String k = "우리집", v = "종로3가";
		map.put(k, v);
		
		Scanner input = new Scanner(System.in);
		System.out.println("찾을 값 입력");
		
		String search = input.next();
		
		if(map.get(search) == null) {
			System.out.println("존재하지 않는 주소");
		}else {
			System.out.println(search + " : " + map.get(search));
		}
		
		
	}
	
}
