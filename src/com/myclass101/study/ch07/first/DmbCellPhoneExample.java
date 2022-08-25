package com.myclass101.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {


		// 부모 객체 생성하고 poweron 메서드 실횅
		
		
		CellPhone cellphone = new CellPhone();
		
		cellphone.powerOn();
		System.out.println("-------------------------");
		
		// 자식 객체 생성
		
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		
		// 자식 객체의 turnOffDmb 실횅
		
		dmbcellphone.turnOffDmb();
		System.out.println("-------------------------");
		
		// 생성자를 이용하여 자식 객체 생성
		
		DmbCellPhone dmbcellphone2 = new DmbCellPhone("iphone12mini", "white", 12);
		
		// dmbcellphone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		
		dmbcellphone2.turnOnDmb();
		dmbcellphone2.changeChannelDmb(7);
		dmbcellphone2.turnOffDmb();
		
	}

}
