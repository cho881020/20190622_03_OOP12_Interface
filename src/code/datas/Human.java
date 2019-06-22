package code.datas;

import code.interfaces.Army;
import code.interfaces.Owner;
import code.interfaces.TaxPayer;

// interface인 TaxPayer와 Army를 implements (역할을 두개 이상 , 로 구분)
public class Human extends Animal implements TaxPayer, Army, Owner{

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
		System.out.println("나라를 지킵니다.");
		
	}

	@Override
	public void fixSituation() {
		// TODO Auto-generated method stub
		System.out.println("사람이 댕댕이가 친 사고를 수습합니다.");
		
	}

	
}
