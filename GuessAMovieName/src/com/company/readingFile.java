package com.company;
import java.io.File;
import java.util.Scanner;

public class readingFile {
    protected  static void readingFile(String filepath,int index) throws Exception{
        File file=new File(filepath);
        Scanner sc=new Scanner(file);
        int i=0;
        String str[] =new String[25];
        while(sc.hasNextLine()){
            str[i]=sc.nextLine();
            i++;
        }
        pickAmovie pAm =new pickAmovie();
        pAm.pickAmovie(index,str);
    }

}
