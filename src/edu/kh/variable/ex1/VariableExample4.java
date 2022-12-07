package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main (String [] args) {
	/* 강제 형변환
	 * -기존 자료형을 원하는 자료형으로 강제 변환시키는 것
	 * 
	 * 1) 값의 범위가 큰자료형을 작은자료형으로 변환할 때 사용
	 * 2) 출력되는 데이터이 표기법을 변화시키고 싶을 때
	 * 
	 * *강제 형변환 방법
	 * -자료형을 변한시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
	 *
	 * ex) double temp =3.14;
	 * 		int num = (int)temp;
	 * 
	 * */	
		double temp = 3.14; // temp는 나중에 자료구조할 때 더블삽일을 하는데 빈공간?(범위데이터)만들 때
		int num = (int)temp;
		
		System.out.println("temp:" + temp);
		System.out.println("num:" + num);
		// 실수 -> 정수형 변환시 소수점 버림 처리(데이터 손실 때문에)
		System.out.println("temp:" + temp);//수정수정
		
		
	}
}
