package com.company;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");

        try{
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
        System.out.println( 2 / i );}
        catch ( Exception e ) {
                System.out.println("Общее исключение класса Exception");
            }
        finally {
            System.out.println("Работа завершена");
        }
    }
}
