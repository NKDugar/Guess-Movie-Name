package com.company;
import java.util.Scanner;

public class guessLetter {
    protected static void guessLetter(String movieName,String movieNameDuplicate){
        movieNameDuplicate=movieNameDuplicate.trim();
        System.out.println("enter the character : ");
        Scanner tempScanner=new Scanner(System.in);
        char ch=tempScanner.nextLine().charAt(0);
        Game g=new Game();
        g.listOfAllInputs.add(ch);
        System.out.println(ch);
        // creating object of the check class to access its methods .
//        check c=new check();
//       c.check(ch,movieName,movieNameDuplicate);
        check.check(ch,movieName,movieNameDuplicate);


    }
}
