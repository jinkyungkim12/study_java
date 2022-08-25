package com.myclass101.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// 부모클래스 생성, 함수 호출

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.bell();
		cellPhone.sendVoice("안녕");
		cellPhone.receiveVoice("하이");
		cellPhone.hangUp();
		
		System.out.println("---------------------");
		
		// 자식클래스 생성, 함수 호출
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		System.out.println("---------------------");
		
		// 자식클래스 생성, 부모자식 함수 호출
		
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone();
		
		dmbCellPhone2.powerOn();
		dmbCellPhone2.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone2.sendVoice("부모");
		dmbCellPhone2.receiveVoice("자식");
		dmbCellPhone2.hangUp();
		
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(7);
		dmbCellPhone2.turnOffDmb();
		
		
		
	}

}
