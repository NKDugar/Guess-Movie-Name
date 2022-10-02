package com.company;

public class check {
    protected static void check(char ch,String movieName,String movieNameDuplicate) {
//        String ch1=Character.toString(ch);
//        char[] movieNameDuplicateArr = movieNameDuplicate.toCharArray();
        StringBuilder str1 = new StringBuilder(movieNameDuplicate);

        if (movieName.indexOf(ch) == -1) {
            System.out.println("Invalid letter : " + ch);
            Game.count++;
        } else {
            for (int i = 0; i < movieName.length(); i++) {
                if (movieName.charAt(i) == ch) {
                    str1.setCharAt(i, ch);
                }
            }
        }
        movieNameDuplicate = str1.toString();
        System.out.println(movieNameDuplicate);

        System.out.println(Game.listOfAllInputs);

        if (Game.count < 10) {
            if ((movieName.equals(movieNameDuplicate) && Game.count < 10)) {
                System.out.println("game completed : youWin");
            } else {
                guessLetter gl=new guessLetter();
                gl.guessLetter(movieName, movieNameDuplicate);
            }
        }
        else{
            System.out.println("game completed : youLose");
            System.out.println("no more chances");
        }
    }


}
