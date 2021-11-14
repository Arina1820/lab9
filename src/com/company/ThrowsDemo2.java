package com.company;
import java.util.Scanner;
import java.lang.Exception;

public class ThrowsDemo2 {

        public void getKey(){
            Scanner myScanner = new Scanner( System.in );
            for(int i = 0; i < 2; i++){
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try{printDetails( key );}
            catch (Exception e){
                System.out.println("Исключение класса Exception");

            }
        }}
        public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println( message ); }
        private String getDetails(String key) throws Exception {
            if(key.equals("")) {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key;
        }
    }