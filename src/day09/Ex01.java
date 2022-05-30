package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*

set 
- 순서를 유지하지 않는다
- 중복된 값은 허용하지 않는다
 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 중복허용 
		ArrayList arr = new ArrayList();
		arr.add("홍길동");
		arr.add("홍길동");
		System.out.println("arr : " + arr);
		
		// 중복허용 X
		HashSet hs = new HashSet();
		hs.add("홍길동");
		hs.add("김개똥");
		hs.add("홍길동");
		System.out.println( hs.remove("홍길동") ); // 삭제가 되면 true 출력 
		System.out.println("hs : " + hs);
		
		hs.add("홍길동");
		
		// hash set 반복자 (set값을 하나씩 출력)
		// it = [bof, '홍길동', '홍길동', eof]
		//		  it (hasNext) 
		//			 	it (next)
		// bof = 시작점을 알려주는 것 
		// eof = 더 이상 데이터가 없는걸 알려주는 것  
		Iterator it = arr.iterator();
		
		while(it.hasNext() == true) {
			System.out.println( it.next() );
		}
		/*
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		// next : 현재 있는 위치에서 다음으로 이동해서 출력
		// hasNext : it 의 다음위치에 값이 있는지 없는지만 확인하고 출력 
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		*/
		
		
		// 저장하는 값의 타입을 지정  
		
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			String st = (String)s;
			System.out.println( st );
		}
	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next() ; 
		System.out.println(s1);
		// 저장하는 값의 타입을 지정 
		
		
	}
}
