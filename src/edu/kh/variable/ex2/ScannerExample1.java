package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in); // 스캐너라는 기능이 들어있는 변수sc
		// import를 먼저해야함
		//Scanner를 만들어서 쓰고 싶은데 설계도가 없음
		//import 해오라는 에러 발생! ==> import 해오면 오류 해결
		
		//System.out.print("값을 입력하시오: ");
		
		//값을 저장할 변수가 따로 필요
		//int input1 = sc.nextInt(); //입력 받은 정수를 input1에 대임
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴), 인트 더블 라인 다양함
		
		/*System.out.print(input1);
		
		System.out.print("실수만 입력해: ");
		double input2 = sc.nextDouble();
		System.out.print(input2); */
		
		// 안녕? 반가워! 밥먹을래? 출력하고싶다
		//System.out.print("입력1: ");
		//String input3 = sc.next();
		//next() : 다음 입력된 한 단어를 읽어옴, String쓴경우?
		//System.out.print(input3);
		
		/*System.out.println("입력2: ");
		String input4 = input3 + sc.next();
		System.out.println(input4); */
		
		//입력1에 한건 인풋3에 계속있음 문장을 이어지게 쓰고 싶으면 인풋사 옆 sc넥스트에 인풋3+ 
		
		System.out.print("입력1: ");
		String input5 = sc.nextLine();
		System.out.println(input5);
		
		
	}

}
