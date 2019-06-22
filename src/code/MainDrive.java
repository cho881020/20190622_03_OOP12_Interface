package code;

import code.datas.Dog;
import code.datas.Human;
import code.interfaces.Owner;

public class MainDrive {

//	김지안 브런치 입니다.
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.move(100, 200);
		h1.defenseCountry();
		h1.fireGun();
		h1.payTax(50000);
		
		Dog dog1 = new Dog();
		dog1.move(100, 100);
		dog1.kickOutThief();
		dog1.patrol();
		dog1.playWithOwner();
		
//		개가 사고를 침, 주인이 없어서 수습불가
		dog1.crash();
		
//		dog1에 주인을 h1으로 정해줌, 수습해줌
		dog1.setMyOwner(h1);
		dog1.crash();
		
//		dog1에게 일어난 일을 주인(새로운 Owner 객체를 생성해서) 메인드라이브에서 수습
		dog1.setMyOwner(new Owner() {
			
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				System.out.println("메인드라이브에서 dog1의 사고를 수습함.");
			}
		});
		dog1.crash();
		
		Dog dog2 = new Dog();
		dog2.setMyOwner(new Owner() {
			
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				System.out.println("dog2의 사고를 메인드라이브에서 수습함.");
			}
		});
		dog2.crash();
		
	}
	
}
