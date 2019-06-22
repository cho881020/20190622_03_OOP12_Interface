package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Pet;

public class Dog extends Animal implements HouseKeeper,Pet{

	
	public void name() {
		
	}

	@Override
	public void kickOutThief() {
		// TODO Auto-generated method stub
		System.out.println("도둑을 쫓아냅니다.");
	}

	@Override
	public void patrol() {
	   System.out.println("순찰을 돕니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playWithOwner() {
		System.out.println("주인이랑 놉니다.");
		// TODO Auto-generated method stub
		
	}
}
