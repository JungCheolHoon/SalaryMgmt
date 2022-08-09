package com.example.libs;

public class Calc {
	private Employee[] array;
	private int count;

	public Calc(Employee [] array, int count) {
		this.array = array;
		this.count = count;
	}
	
	public void calc() {
		for(int i = 0 ; i < count ; i++) {
			Employee emp = this.array[i];
			String empno = emp.getEmpno();
			String dname = this.getDname(empno.charAt(0));
			emp.setDname(dname);
//			String code = "" + empno.charAt(1);	// '5' -->"5"
			int code = Integer.parseInt(String.valueOf(empno.charAt(1)));	//'5' ==> 5
			int hopay = this.getHopay(code);		//호급수당
			emp.setHopay(hopay);						//호급수당 셋팅
			int nightpay = this.getNightPay(emp.getNight());		//야근수당
			emp.setNightpay(nightpay);									//야근수당 셋팅
			int base = emp.getBase();
			int basePay = this.getBasepay(base);						//기본급
			emp.setBapay(basePay);										//기본급 셋팅
			int family = emp.getFamily();									//가족수
			int fampay = 7000*family;	
			emp.setFampay(fampay);										//가족수당 셋팅
			
			int total = hopay + basePay + nightpay + fampay;    // 총금액
			emp.setTotal(total);
			
			int tax = (int)(hopay * 0.1);				//세금
			int salary = total - tax;						//실수령액
			emp.setSalary(salary);						//실수령액 셋팅
		}
	}
	
	private int getHopay(int code) {		//호급 수당을 얻기 위한 메소드
		int [] hopays = {900000, 400000, 600000, 800000, 300000, 800000, 800000};
		return hopays[code-1];
	}
	
	private int getBasepay(int base) {		//기본급 수당을 얻기 위한 메소드
		int [] basepay = {15000,25000,35000,45000};
		return basepay[base-1];
	}
	
	private String getDname(char code) {	//부서코드로 부서명을 얻기 위한 메소드
		String [] dnames = {"영업부", "업무부", "홍보부", "인사부", "경리부", "판촉부", "총무부"};
		return dnames[code-65];
	}
	private int getNightPay(int night) {
		return (night == 1) ? 1500 : (night == 2) ? 2500 : (night == 3) ? 3500 : 4500;
	}
}
