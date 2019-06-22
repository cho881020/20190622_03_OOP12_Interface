package code;

import code.datas.Dog;
import code.datas.Human;

public class MainDrive {

// 유수정의 브런치 입니다.
    
	public static void main(String[] args) {

	    Human h1 = new Human();
	    
	    h1.move(100,200);
	    h1.defenseCountry();
	    h1.fireGun();
	    h1.payTax(500);
	    
	    Dog d1 = new Dog();
	    
	    d1.move(5, 10);
	    d1.kickOutThief();
	    d1.patrol();
	    d1.playWithOwner();
	    
	}
	
}
