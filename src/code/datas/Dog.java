package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Owner;
import code.interfaces.Pet;

public class Dog extends Animal implements HouseKeeper, Pet {
	
	private Owner myOwner = null;
	
	public void crash() {
		
		if(myOwner != null) {
			myOwner.fixStuation();
		}
		else {
			System.out.println("주인이 없어서 수습이 안 됩니다.");
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
		System.out.println("주인과 놀아줍니다.");
	}

	@Override
	public void kickOutThief() {
		// TODO Auto-generated method stub
		System.out.println("도둑을 쫓습니다.");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("순찰을 합니다.");
	}

}
