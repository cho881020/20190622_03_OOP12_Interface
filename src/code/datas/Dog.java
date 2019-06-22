package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Owner;
import code.interfaces.Pet;

public class Dog extends Animal implements Pet,HouseKeeper{

	private Owner myOwner = null;
	
	public void crash() {
		
		if (myOwner!=null) {
		myOwner.fixsituation();
		}
		else {
			System.out.println("주인이 없어서 수습이 안됩니다.");
		}
	}
	
	public Owner getMyOwner() {
		return myOwner;
	}

	public void setMyOwner(Owner myOwner) {
		this.myOwner = myOwner;
	}

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
