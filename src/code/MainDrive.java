package code;

import code.datas.Dog;
import code.datas.Human;

public class MainDrive {

//	김지안 브런치 입니다.
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.move(100, 200);
		
		h1.defenseCountry();
		h1.fireGun();
		h1.payTax(50000);
		
		Dog dog1 = new Dog();
		dog1.kickOutThief();
		dog1.patrol();
		dog1.playWithOwner();
		
	}
	
}
