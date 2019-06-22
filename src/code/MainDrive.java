package code;

import code.datas.Dog;
import code.datas.Human;
import code.interfaces.Owner;

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
		
		dog1.crash();
		
		dog1.setMyOwner(h1);
		
		dog1.crash();
		
		dog1.setMyOwner(new Owner() {
			
			@Override
			public void fixsituation() {
				// TODO Auto-generated method stub
				
				System.out.println("메인드라이브에서 dog1의 사고를 수습");
			}
		});
		dog1.crash();
		
		Dog d2 = new Dog();
		
		d2.crash();
		
		d2.setMyOwner(new Owner() {
			
			@Override
			public void fixsituation() {
				// TODO Auto-generated method stub
				
				System.out.println("d2의 사고를 수습");
			}
		});
		d2.crash();
	}
	
}
