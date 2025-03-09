package org.basics;

public class Switch_case {

    public static void main(String[] args) {

        int value = 10;
        switch(value){
            case 4:
                System.out.println("Sergio Ramos");
                break;
            case 7:
                System.out.println("Cristiano Ronaldo");
                break;
            case 8: case 10:
                System.out.println("Iniesta or Kroos or Modric or Messi !!");
                System.out.println("Jersey Number is " +value);
            default:
                System.out.println("Great Football Talents !!");
        }

    }
}
