package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Pet;

public class Dog extends Animal implements Pet, HouseKeeper {

	@Override
	public void kickOutThief() {
		// TODO Auto-generated method stub
		
		System.out.println("도둑을 쫓아냅니다.");
		
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		
		System.out.println("순찰합니다.");
		
	}

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		
		System.out.println("주인과 놉니다.");
		
	}

	
	
	
}
