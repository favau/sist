package kr.s19.lang;

public class StringBufferMain {
	public static void main(String[] args) {
		//Buffer 메모리 공간 사용. 쓰레기 객체가 생기지 않음
		StringBuffer sb = new StringBuffer("여름 덥다!!");
		System.out.println("1 : " + sb);
		
		//문자를 희망하는 인덱스에 추가
		sb.insert(2, '이');
		System.out.println("2 : " + sb);
		//여름이 덥다!!
		
		//기존 문자열 뒤에 새로운 문자열을 추가
		sb.append("가을은 ");
		System.out.println("3 : " + sb);
		//여름이 덥다!!가을은 
		
		sb.append("시원하다");
		System.out.println("4 : " + sb);
		//여름이 덥다!!가을은 시원하다
		
		//기존 문자열의 특정 문자열을 새로운 문자열로 대체
		//범위는 시작 인덱스부터 끝 인덱스 전 까지
		sb.replace(0, 3, "여행가자!!");
		System.out.println("5 : " + sb);
		//여행가자!! 덥다!!가을은 시원하다
		
		//index를 지정해서 해당 index의 문자를 삭제
		sb.deleteCharAt(0);
		System.out.println("6 : " + sb);
		//행가자!! 덥다!!가을은 시원하다
		
		//시작 인덱스와 끝 인덱스를 지정해서 문자열 삭제
		sb.delete(0, 3);
		System.out.println("7 : " + sb);
		//!! 덥다!!가을은 시원하다
		
		//StringBuffer -> String 변환
		String str = sb.toString();
		System.out.println("str : " + str);
	}
}
