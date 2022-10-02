package com.company;
import java.util.*;
import java.io.*;
public class Game {
    static  int count=0;
    protected static ArrayList<Character> listOfAllInputs = new ArrayList<Character>();
//    static String movieName="yoyo honey";

    public static void main(String[] args) throws Exception {
        String filePath="C:\\Users\\NKdugar\\Desktop\\movies.txt";
        final int  index= 10;
        // creating instance of game class
        Game game=new Game();
// garbage value

//        readingFile rf=new readingFile();
//        rf.readingFile(filePath,index);
        // if we use a static method we can  directly call the method of anothe class by using className.methodName();
        readingFile.readingFile(filePath,index);
    }
}
