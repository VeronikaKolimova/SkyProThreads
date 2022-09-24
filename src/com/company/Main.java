package com.company;

public class Main {

    public static void main(String[] args) {
        new Timer(1);
        new Waiter(5, "message 5 sec left");
        new Waiter(7, "message 7 sec left");
    }
}


