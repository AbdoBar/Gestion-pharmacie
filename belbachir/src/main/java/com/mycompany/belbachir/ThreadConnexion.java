package com.mycompany.belbachir;

import java.io.*;
import java.net.*;

class ThreadConnexion extends Thread {
 private Socket connexion;
 private int numero;

 public ThreadConnexion(Socket connexion, int numero) {
   this.connexion = connexion;
   this.numero = numero;
   }
public void run() {

try {
  BufferedReader entree = new BufferedReader(new InputStreamReader(connexion.getInputStream()));
  PrintWriter sortie = new PrintWriter(connexion.getOutputStream(),true);
  BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
  sortie.println("bonjour , tapez OK pour sortir");
  boolean arreter = false;
  while (!arreter) {
     String ligne = entree.readLine();
     if (ligne == null) arreter = true;
     else {
	 	if (ligne != null) sortie.println("Echo ( "+numero+") :"+ ligne);
        if (ligne.equalsIgnoreCase("ok")) arreter = true;
        }
     }
  connexion.close();
  }
catch (Exception e) { System.err.println(e); }
}
}

