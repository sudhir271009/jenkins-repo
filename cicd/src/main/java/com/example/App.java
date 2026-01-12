package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Java app started successfully");

        // Keep app running so Kubernetes pod does not exit
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
