package code;

import code.datas.Dog;
import code.datas.Human;
import code.interfaces.Owner;

public class MainDrive {

//	김은옥의 브런치 입니다.

	public static void main(String[] args) {

		Human h1 = new Human();

		h1.move(100, 200);
		h1.defenseCountry();
		h1.fireGun();
		h1.payTax(500);

		Dog dog1 = new Dog();

		dog1.move(10, 20);
		dog1.kickOutThief();
		dog1.patrol();
		dog1.playWithOwner();

		dog1.crash();

		dog1.setMyOwner(h1);
		dog1.crash();

		dog1.setMyOwner(new Owner() {
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				System.out.println("메인드라이브에서 dog1의 사고 수습");
			}
		});
		dog1.crash();

		Dog dog2 = new Dog();

		dog2.setMyOwner(new Owner() {
			@Override
			public void fixSituation() {
				// TODO Auto-generated method stub
				System.out.println("메인드라이브에서 dog2의 사고 수습");
			}
		});
		dog2.crash();

	}

}
