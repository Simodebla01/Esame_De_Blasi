package org.example;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    Server(){}
    Server(int porta){
        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(porta);
        } catch (IOException e) {
            System.out.println("Errore creazione server \n"+e.toString());
        }
        Socket clientSocket=null;
        System.out.println("Server on");
        while(true){
            try {
                clientSocket=serverSocket.accept();
            } catch (IOException e) {
                System.out.println("Eccezione  accept \n"+e.toString());
                break;
            }

            System.out.println("Connesso al client");
            Elaborazione thread=new Elaborazione(clientSocket,serverSocket);
            thread.start();

        }

        try {
            serverSocket.close(); //chiusura del socket
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del socket");
        }

    }
}