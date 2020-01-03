package com.example.hw8;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        INN cppBank = new INN(Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()));
    }
}
