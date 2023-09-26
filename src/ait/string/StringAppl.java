package ait.string;

import java.util.Scanner;

public class StringAppl     {
    public static void main(String[] args) {
        String str ="Hello";
        System.out.println(str);
        str=str+" world";
        System.out.println(str);
        greeting("Peter");
        greeting("John");

//        bank("Mon");
//        bank("Thu");
//        bank("Sat");
        Scanner scanner=    new Scanner(System.in);
        System.out.println("Enter name week days");
        String day=scanner.next();
        bank(day);

        System.out.println("Enter radius ");
        double radius=scanner.nextDouble();
        double lenght= 2*3.14*radius;
        System.out.println("sircle lenght = "+lenght  );


    }
    public static void greeting (String name){
        String str="Welcome "+name+"!";
        System.out.println(str);
    }
    public static void bank(String day) {
        switch (day) {
            case "Mon":
            case "Wed":
            case "Fri":
                System.out.println("8:30 - 13:30");
                break;
            case "Tue":
            case "Thu":
                System.out.println("8:30 - 13:00 and 16:00 - 18:00");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Closed");
                break;
            default:
                System.out.println("Wrong day");
        }
    }
}
