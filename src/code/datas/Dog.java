package code.datas;

import code.interfaces.HouseKeeper;
import code.interfaces.Owner;
import code.interfaces.Pet;

// Dog 클래스가 HouseKeeper, Pet 인터페이스 역할을 부여받음.
public class Dog extends Animal implements HouseKeeper, Pet{
	
//	Owner라는 interface를 객체로 생성/멤버 변수이므로 private
	private Owner myOwner = null;

	public void crash() {
		
		if (myOwner != null) {
			myOwner.fixSituation();
		}
		else {
			System.out.println("주인이 없어서 수습 불가!");
		}
		
	}
		
	
	
	public Owner getMyOwner() {
		return myOwner;
	}


// Owner라는 interface를 파라미터로 요구함
	public void setMyOwner(Owner myOwner) {
		this.myOwner = myOwner;
	}



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
