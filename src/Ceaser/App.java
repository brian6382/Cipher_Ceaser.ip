package Ceaser;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Cypher myCypher = new Cypher();

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Enter encrypt or decrypt");
             String userInput = myScanner.nextLine();

        if (userInput.equals("encrypt")){
            System.out.println("***********************");
            System.out.println("enter word to be encrypted");
            String wordToEncrypt = myScanner.nextLine();
            System.out.println("***********************");
            System.out.println("enter number for index to be encrypted on");
            int shiftIndexEncrypt = myScanner.nextInt();
            System.out.println("***********************");
            System.out.println("The Encrypt word is:  "+ myCypher.EncodeText(wordToEncrypt, shiftIndexEncrypt));
        }

        else if(userInput.equals("decrypt")){
            System.out.println("***********************");
            System.out.println("enter word to be decrypt");
            String wordToDecrypt = myScanner.nextLine();
            System.out.println("***********************");
            System.out.println("enter number for index to be decrypted on");
            int shiftIndexDecrypt = myScanner.nextInt();
            System.out.println("***********************");
            System.out.println("The Decrypt Word is:   "+ myCypher.unDoCeaseCipher(wordToDecrypt, shiftIndexDecrypt));
        }
        else{
            System.out.println("***********************");
            System.out.println("Sorry! option not found");

        }
    }
}



