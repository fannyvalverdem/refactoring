/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClumps.good;

/**
 *
 * @author Fanny
 */
public class withoutDataClumps {
    public static void main(String args[]) {
	    String firstName = args[0];
	    String lastName = args[1];
	    Integer age = new Integer(args[2]);
	    String gender = args[3];
	    String occupation = args[4];
	    String city = args[5];

	    Person joe = new Person(firstName,lastName,age,gender,occupation,city);
	    joe.welcomeNew();
	    joe.work();
	    
	}
}
