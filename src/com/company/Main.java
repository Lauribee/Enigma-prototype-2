package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* testttt
        char letter = 'A';

        int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/
        //turn to uppercase letters as soon as the user inserts a text
        /*String plaintext = "ABEKAT";
        int[] cipher = textToListOfNumbers(plaintext);
        System.out.println(Arrays.toString(cipher));*/
        int number = 4;
        char letter = numberToLetter( number );
        System.out.printf("Tallet %d bliver til bogstavet %c\n", number, letter);

    }


    public static int[] textToListOfNumbers( String text ) {
        //we have to loop and call the method letter to number and build an array
        //we have to return and catch the returned in main
        int[] list = new int[text.length()];

        //for(int i=0; i < text.length(); i++)
            int[] numbers = new int[text.length()];
            char[] letters = text.toCharArray();

            for(int i=0; i < letters.length; i++){
                numbers[i] = letterToNumber( letters[i] );
            }
            return numbers;

        }
        /*list[0] =1;
        list[1] =2;
        list[2] =5;*/
        //or int[] list = {1,2,5};

        //return list;

    public static int letterToNumber(char letter) {
        String theAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int num = theAlphabet.indexOf( letter +1);
        //if and else if, if letter == something then return x int else if... and so on
        //another method is to make arrays of char alphabet and int numbers, and then make a for
        //char[] alphabet = {'A','B','C','D',...}
        //int[] numbers =   { 1,  2,  3,  4,...}
        // for(int i=0; i < alphabet.length; i++){
        // char letterCheck = alphabet[i];
        // if(letter == letterCheck){
        // number=numbers[i] or since number is just index+1 then just write i+1; or if the space is 0 then just i, and then the numbers variable is no longer needed
        //   }
        // }

        //return number;

        //the following is exactly the same as the previous method. F in the chat


        return num;
    }

    public static String listOfNumbersToText( int[] numbers) {
        String text = "";
        for( int i=0; i < numbers.length; i++) {
            int number = numbers[i];

            char letter = numberToLetter(number);

            text = text + letter;
        }
        return text;
    }

    public static char numberToLetter( int number ) {
        String theAlphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = theAlphabet.charAt(number);

        //char[] allLetters = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        //char letter = allLetters[number];
        return letter;
    }
}
