package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Pet;

public class Dog extends Animal implements Pet,HouseKeeper{

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		
		System.out.println("주인과 놀기");
	}

	@Override
	public void kickOutThief() {
		// TODO Auto-generated method stub
		
		System.out.println("도둑 쫒아내기");
	}

	@Override
	public void Patrol() {
		// TODO Auto-generated method stub
		
		System.out.println("순찰하기");
	}

	
	
}
