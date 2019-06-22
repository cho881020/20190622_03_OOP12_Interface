package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Owner;
import code.interfaces.Pet;

public class Dog extends Animal implements HouseKeeper,Pet{

	private Owner myOwner =null;
	
	public void crash() { 

		if (myOwner !=null) {
			myOwner.fixSituation();
		}
		else {
			System.out.println("주인이없어서 수습이안됨");
		}
		
	}
	
	
	
	public Owner getMyOwner() {
		return myOwner;
	}



	public void setMyOwner(Owner myOwner) {
		this.myOwner = myOwner;
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
