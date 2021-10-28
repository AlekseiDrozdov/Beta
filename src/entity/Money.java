/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Money implements Serializable{
    private int Money;
    
    
public Money(){

}

    public int getMoney() {
        return Money;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }

@Override
    public String toString() {
        return "Shop total money: " + Money;
    }

}

