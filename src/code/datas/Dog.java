package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Pet;

// Dog 클래스가 HouseKeeper, Pet 인터페이스 역할을 부여받음.
public class Dog extends Animal implements HouseKeeper, Pet{

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		System.out.println("댕댕이가 주인과 놀아줍니다.");
		
	}

	@Override
	public void kickOutThief() {
		// TODO Auto-generated method stub
		System.out.println("왈왈오라왈와로알!!!! 도둑을 쫓아냅니다.");
		
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("댕댕이가 순찰을 돕니다.");
		
	}

	
}
