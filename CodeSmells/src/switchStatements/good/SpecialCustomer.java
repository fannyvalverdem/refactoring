/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.good;

/**
 *
 * @author Fanny
 */
public class SpecialCustomer extends Customer {
	@Override
	public int applyDiscountToTotal(int total) {
		return total/2;
	}
}