/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap;


import tzortziskap.model.Cart;
/**
 *
 * @author tzortziskapellas
 */
public class MyStrategyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cart cart = Cart.getCart();
        cart.fillTshirts(40);
        cart.printTshirts();
        
        cart.payTotal();
    }
}
