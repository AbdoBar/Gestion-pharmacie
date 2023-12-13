package com.mycompany.belbachir;

import java.io.*;
import java.net.*;

public class ServeurThread {
public static void main(String[] args) {
   int numero = 1;
try {
     ServerSocket service = new ServerSocket(8189);
     while (true) {
        Socket connexion = service.accept();
        new ThreadConnexion(connexion,numero++).start();
        }
    }
catch( IOException e) {System.err.println(e);}
    }
 }

