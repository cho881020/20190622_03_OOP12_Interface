package code.datas;

import code.interfaces.Army;
import code.interfaces.Owner;
import code.interfaces.TaxPayer;

public class Human extends Animal implements TaxPayer, Army,Owner {

	@Override
	public void payTax(int money) {
		// TODO Auto-generated method stub
		
		System.out.println(money + "원을 납부합니다.");
		
	}

	@Override
	public void fireGun() {
		// TODO Auto-generated method stub
		System.out.println("총을 발사합니다.");
	}

	@Override
	public void defenseCountry() {
		// TODO Auto-generated method stub
		System.out.println("입대해서 2년간 나라를 지킵니다.");
		
	}

	@Override
	public void fixSituation() {
		// TODO Auto-generated method stub
		System.out.println("사람이 개가 친 사고를 수습합니다.");
	}

}
