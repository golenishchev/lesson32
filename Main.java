package com.example.lesson32;

public class Main {
    public static void main(String[] args) {
        NameValidityCheck nameValidityCheck = new NameValidityCheck();
        System.out.println("RegExp Validator response is:");
        nameValidityCheck.validateUserNameByUsingRegExp();
        System.out.println("Another Validator response is:");
        nameValidityCheck.validateUserNameWithoutUsingRegExp();
    }
}
