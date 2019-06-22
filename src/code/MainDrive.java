package code;

import code.datas.Dog;
import code.datas.Human;

public class MainDrive {

//	브런치 확인용
	
	public static void main(String[] args) {
		
		Human h1= new Human();
		
		h1.move(100, 200);
		
		h1.defenseCountry();
		
		h1.firegun();
		
		h1.paytax(500);
	
		Dog dog1 = new Dog();
		
		dog1.move(100, 200);
		
		dog1.kickOutThief();
		
		dog1.Patrol();
		
		dog1.playWithOwner();
		
	}
	
}
