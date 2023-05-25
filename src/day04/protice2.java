package day04;

public class protice2 {

	public static void main(String[] args) {
		
		String str = new String("tESt sTring 	change		first");
		String[] changestr = str.split("\\s+"); // 공백 삭제
		for(int i =0; i<changestr.length;i++) { // 
			String a = changestr[i].substring(0,1); // changestr[i] 인덱스에  0번을 가져오고
													// 1번부터 잘라내기
			
			String b = changestr[i].substring(1);  // changestr[i] 인덱스에 1번부터 전부를 가져온다
			
			a = a.toUpperCase(); // 가져온 첫글자를 대문자로 변환
			b = b.toLowerCase(); // 가져온 나머지를 소문자로 변환
			String turn = a+b;   // 둘을 합쳐서 변수 값에 저장
			changestr[i] = turn; // 변수 값을 다시 배열에다가 저장
								
		
		}
		for(String x : changestr) {
		System.out.print(x);
		}
	}

}
