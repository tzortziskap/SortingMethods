/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap.strategy;


public class CreditCardPayment implements PaymentStrategy {

    private final String cartType;
    private final String cartNumber;
    private final String cvv;
    private final int expirationYear;

    public CreditCardPayment(String cartType, String cartNumber, String cvv, int expirationYear) {
        this.cartType = cartType;
        this.cartNumber = cartNumber;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }
    
    @Override
    public void pay(double totalAmount) {
         System.out.println("Paid " + totalAmount + " with credit card " + this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardPayment{cartType").append(cartType);
        sb.append(", cartNumber=").append(cartNumber);
        sb.append(", cvv=").append(cvv);
        sb.append(", expirationYear=").append(expirationYear);
        sb.append('}');
        return "CreditCardPayment{" + "cartType=" + cartType + ", cartNumber=" + cartNumber + ", cvv=" + cvv + ", expirationYear=" + expirationYear + '}';
    }
    
    
}
