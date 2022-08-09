package com.example.libs;

public class Output {
	private Employee [] array;
	private int count;
	
	public Output(Employee[] array, int count) {
		this.array = array;
		this.count = count;
	}
	void output() {
		this.printLabel();
		for(int i = 0 ; i < count ; i ++) {
			System.out.println(this.array[i]);
		}
	}
	private void printLabel() {
		System.out.println("<<<<<<<<<<<<<<<<<<<부산전산산업진흥원 직원 월급 정보>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("사원번호  사원이름  부서명  기본급  호급수당  가족수당  야근수당  총금액  실수령액");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
	}
}
