/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap.model;

import UtilClasses.FormatDouble;
import java.util.ArrayList;
import java.util.List;
import tzortziskap.strategy.BankTransferPayment;
import tzortziskap.strategy.CashPayment;
import tzortziskap.strategy.CreditCardPayment;
import tzortziskap.strategy.PaymentStrategy;

/**
 *
 * @author tzortziskapellas
 */
public class Cart {

    private static Cart cart;
    private List<Tshirt> tshirts;
    private PaymentStrategy paymentStrategy;

    private Cart() {
        tshirts = new ArrayList<Tshirt>();

    }

    public static Cart getCart() {
        if (cart == null) {
            cart = new Cart();
        }
        return cart;
    }

    
    public List<Tshirt> getTshirts() {
        return tshirts;
    }

    public void setTshirts(List<Tshirt> tshirts) {
        this.tshirts = tshirts;
    }
    
    public void addTshirts(Tshirt tshirt){
        tshirts.add(tshirt);
    }
    
     public void removeTshirt(Tshirt tshirt){
        tshirts.remove(tshirt);
    }

    public double calculateTotalPrice() {
        double sum = tshirts.get(0).getPrice();
        for(Tshirt tshirt : tshirts){
            sum = sum + tshirt.getPrice();
        }
        sum = FormatDouble.formatDouble(sum);
        return sum;
    }
    
    public void payTotal(){
        double total = calculateTotalPrice();
        if (total<50){
            paymentStrategy = new CashPayment();
        } else if (total<100){
            paymentStrategy = new CreditCardPayment("VISA", "132", "133", 2018);
        } else {
            paymentStrategy = new BankTransferPayment("PEI", "111");
        }
        paymentStrategy.pay(total);
    }

    public void fillTshirts(int numberofTshirts) {
        for (int i = 0; i < numberofTshirts; i++) {
            Tshirt t = new Tshirt();
            tshirts.add(t);
        }
    }

    public void printTshirts() {
        System.out.println("Your cart contains the following tshirts");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
            
        }
    }
    
}