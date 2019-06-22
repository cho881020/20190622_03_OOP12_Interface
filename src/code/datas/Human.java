package code.datas;

import code.interfaces.TaxPayer;
import code.interfaces.Army;

public class Human extends Animal implements TaxPayer{

    @Override
    public void payTax(int money) {
        // TODO Auto-generated method stub
        
        System.out.println(money + "원을 납부합니다.");
        
    }
    
    @Override
    private void fireGun() {
        // TODO Auto-generated method stub

    }
    
    @Override
    private void defensecountry() {
        // TODO Auto-generated method stub

    }
    
    
    

}
