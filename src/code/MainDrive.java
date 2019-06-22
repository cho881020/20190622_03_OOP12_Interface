package code;

import code.datas.Dog;
import code.datas.Human;
import code.interfaces.Owner;

public class MainDrive {

//	chohyerin's branch

	public static void main(String[] args) {

		Human h1 = new Human();

		h1.move(100, 200);
		h1.defenseCountry();
		h1.fireGun();
		h1.payTax(500);

		Dog d1 = new Dog();
		d1.move(1, 3);
		d1.kickOutThief();
		d1.patrol();
		d1.playWithOwner();
		
		d1.crash();
		d1.setMyOwner(h1);
		d1.crash();
		
		d1.setMyOwner(new Owner() {
			
			@Override
			public void fixStuation() {
				// TODO Auto-generated method stub
				
				System.out.println("메인드라이브에서 d1이 친 사고를 수습합니다.");
			}
		});
		
		d1.crash();
		
		Dog d2 = new Dog();
		d2.setMyOwner(new Owner() {
			
			@Override
			public void fixStuation() {
				// TODO Auto-generated method stub
				
				System.out.println("d2의 사고를 수습한다.");
				
			}
		});
		d2.crash();
		
	}

}
