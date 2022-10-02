package com.company;

public class pickAmovie {
    protected static void pickAmovie(int index,String str[]){
        String movieName=str[index];
        Game game=new Game();
        
        String movieNameDuplicate = " ";
        System.out.println(movieName);
        int i=0;
        while(i<movieName.length()){
            if(movieName.charAt(i)==' '){
                movieNameDuplicate=movieNameDuplicate+" ";
            }
            else{
                movieNameDuplicate=movieNameDuplicate+"_";
            }
            i++;
        }
        System.out.println(movieNameDuplicate.trim());

//        guessLetter gl=new guessLetter();
//        gl.guessLetter(movieName,movieNameDuplicate);
        guessLetter.guessLetter(movieName,movieNameDuplicate);
    }

}
