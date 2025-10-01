package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        //porta in ascolto
        ServerSocket mioServerSocket = new ServerSocket(3000);
        Socket miSocket = mioServerSocket.accept();
        System.out.println("Qualcuno si è collegato");  
        

        
    }
}