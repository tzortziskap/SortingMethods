/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap;

import Sort.BubbleSort;
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
        System.out.println("--------------------------------------------------------");
        BubbleSort.printByColorInAsceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        BubbleSort.printByColorInDesceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        BubbleSort.printBySizeInAsceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        BubbleSort.printBySizeInDesceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        BubbleSort.printByFabricInAsceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        BubbleSort.printByFabricInDesceding(cart.getTshirts());
        System.out.println("--------------------------------------------------------");
        cart.payTotal();
    }
}
