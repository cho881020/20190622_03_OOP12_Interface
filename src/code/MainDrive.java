package code;

import code.datas.Dog;
import code.datas.Human;
import code.interfaces.Owner;

public class MainDrive {

//	조경진의 브런치 입니다.
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		
		h1.move(100, 200);
		
		h1.defenseCountry();
		
		h1.fireGun();
		
		h1.payTax(500);
		
		Dog d1 = new Dog();
		
		d1.move(200, 100);
		
		d1.kickOutThief();
		
		d1.patrol();
		
		d1.playWithOwner();
		
		d1.crash();
		
		d1.setMyOwner(h1);
		
		d1.crash();
		
		d1.setMyOwner(new Owner() {
			
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				System.out.println("메인드라이브에서 d1의 사고 수습");
				
			}
		});
		
		d1.crash();
		
		Dog d2 = new Dog();
		
		d2.setMyOwner(new Owner() {
			
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				
				System.out.println("d2의 사고를 수습.");
			}
		});
		
		d2.crash();
		
		
	}
	
}








