package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //reverseWord ( "wow i feel good, do you feel good too?" );
       // tokenizePhoneNumber ( "(555) 555-5555" );
        //tokenizePhoneNumberAndRemoveBracket (  "(081) 372-45771" );
        //randomSentenceGenerator ();
        limericks ();
    }

    public static void reverseWord(String string){
        String[] tokens = string.split ( "\\s" );
        System.out.println ( Arrays.toString ( tokens ) );

        for (int i = tokens.length-1 ; i >= 0 ; i--) {
            System.out.print (tokens[i] + " ");

        }
    }

    public static void tokenizePhoneNumber(String phoneNumber){
        String[] tokens = phoneNumber.split ( "[-]|[\\s]" );
        String sevenDigit = tokens[1].concat ( tokens[2] );
        for (int i = 0; i < 1; i++) {
            System.out.println (tokens[0]+ " " + sevenDigit );
        }
    }



    public static void tokenizePhoneNumberAndRemoveBracket(String phoneNumber){
        String[] tokens = phoneNumber.split ( "" );
        StringBuilder builder = new StringBuilder (tokens.length);

        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if (c.equals ( ")" )){
                tokens[i] = " ";
            }
            if (c.matches ( "[0-9]|\\s")){
                builder.append ( c );
            }
        }
        System.out.println (builder);
    }

    public static void randomSentenceGenerator(){
        String[] articles = {"The", "A", "One", "Some", "Any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random random = new Random ();
        for (int i = 0; i < 21; i++) {
            System.out.println (articles[random.nextInt ( 5 )] + " " + noun[random.nextInt ( 5 )] +" "+
                    verb[random.nextInt ( 5 )] + " " + prepositions[random.nextInt ( 5 )] + ".");
        }
    }

    public static void limericks(){
        String[] articles = {"The", "A", "One", "Some", "Any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random random = new Random ();
        Random secondRandom = new Random ();
        int firstRandomNumber = random.nextInt ( 3) ;
        int secondRandomNumber = secondRandom.nextInt (3,5);
        System.out.println (firstRandomNumber + " " + secondRandomNumber);
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 1 || i == 4) {
                System.out.println ( articles[firstRandomNumber] + " " + noun[firstRandomNumber] + " " +
                        verb[firstRandomNumber] + " " + prepositions[firstRandomNumber] + "." );
            }
            if (i == 2 || i == 3){
                System.out.println ( articles[secondRandomNumber] + " " + noun[secondRandomNumber] + " " +
                        verb[secondRandomNumber] + " " + prepositions[secondRandomNumber] + "." );
            }
        }

    }
}
