package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		
		//System.out.println() : 한 줄 출력(출력 후 줄바꿈 수행 == 개행)
		//System.out.print() : 단순 출력 (출력 후 줄바꿈x)
		//줄바꿈이라는 차이점이 있지만, 괄호안의 내용이 그대로 출력된다는 것은 똑같음
		
		System.out.println("테스트");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println(); // 단순 개행(줄바꿈)
		System.out.print("테스트4");
		System.out.println();
		
		//System.out.printlnf(); 출력될 문자열 형식을 패턴으로 지정하는 춮력구문
		
		int iNum1 =10;
		int iNum2 = 5;
		
		// 10 + 5 = 15로 출력하고 싶으면 
		System.out.print(iNum1 + "+" + iNum2 + "=" + (iNum1 + iNum2));
		//길고 오타날 가능성이 다분함
		System.out.println();
		
		//System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d+%d=%d\n", iNum1, iNum2, iNum1 + iNum2 );
		// 10,5,15는 정수형, 정수형은 %d
		//printf도 print와 같이 개행이 되지 않기 때문에 
		// 역슬래쉬n과 같은 개행문자(escape)를 사용하여 다음줄로 개행 가능
		
		// 10 + 10 * 5 /2 =35 printf로 만들어보기
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2,
				iNum1 + iNum1 * iNum2 /2 
				); 
		
		int iNum3 = 3;
		System.out.printf("%5d\n", iNum3); // 5칸 공각 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		
		//소수점 자리 제어 (반올림 처리)
		System.out.printf("%f\n", 2.5); // 2.500000까지만 나타내고 싶다
		System.out.printf("%.2f\n", 2.5); // 2.500000을 소수점 둘째자리까지만 나타내고 싶다
		System.out.printf("%.0f\n", 2.5);//소수점 아래 나타내고 싶지 않다
		
		// escape(이스케이프 == 탈출) 문자 : 일반 문자가 아닌 특수 문자 표현
		System.out.println("\\"); //백슬래시(역슬래시) 출력법
		System.out.println("a\tb\tc\td"); //tab으로 a   b   c   d 출력
		
		System.out.println("\'");
		System.out.println("\""); System.out.println('"');
		
		//유니코드 이스케이프
		// 65 => A , 65를 유니코드로 나타내려면 16진수로 나타내야함65나누기16
		System.out.println("\u0041");
									
	}

}
