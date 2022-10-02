package com.company;

abstract  class mobile1 {

     void camera(){
         System.out.println("camera");
     }
     // if abstract no need to give body to methods -  else we have to give body to methods in abstract class .

    abstract public void speaker();

}
interface mobileFunctions{
//    String message ="name ";
     void call();
    // normal methods in interface do not have a body , but private methods should have a body !!
    private  void message(String message){
        System.out.println("message is being delivered "+message);
    }
//    public void getMessage(){
//        System.out.println(this.message);
//    }
   void music();
}
abstract class mobilePhones extends mobile1 implements mobileFunctions {
    void camera() {
        System.out.println("camera of mobilePhones");
    }
    // all the methpds declared in parent abstract class needs to be declared here too .
     void calling(){
        System.out.println("calling");
    }
    public void speaker(){
        System.out.println("speaker in protected class");
    }

}
class mobilePhones1 implements mobileFunctions{
    public void call(){
        System.out.println("calling the person");
    }
    public void music(){
        System.out.println("music is playing");
    }
}

class mobile{
    public static void main(String[] args) {
         mobilePhones1 m1=new mobilePhones1();
         m1.call();

//        we cannot create object of abstract class and the class which extends abstract class may or may not be abstract .


    }

}
