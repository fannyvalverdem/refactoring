/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.bad;

/**
 *
 * @author Fanny
 */
public class calculateTotal{
public int calculateTotal(Customer customer, Cart cart) {
	int total = cart.sumItems();
	switch(customer.getType()) {
		case PREMIUM: return total-10;
		case SPECIAL: return total/2;
		default: return total;
	}
}
}