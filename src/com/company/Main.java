package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class Main {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		String a[]={"1","2","3","4"};
		String b[]={"Hearts","Spades"};
		int c[]={1,2,3,4};
        Deck d = new Deck(a,b,c);
        d.shuffle();
    }
}

