package com.demo.beans;

public class CodingChallenge {
    public static void main(String[] args) {
        String str = "SaurabhGaikwad23";
        boolean status =isAlphanumeric(str);
        if(status){
            System.out.println("given string is alphanumeric");
        }else{
            System.out.println("given string is not alphanumeric");
        }
    }

    private static boolean isAlphanumeric(String str) {
        if(str.matches("[A-Za-z0-9]+")){
            return true;
        }
        return false;

    }

}
