package com.mycompany.belbachir;

import java.io.*;
import java.net.*;

public class Client{

public static void main(String[] args) {
try{

Socket connexion= new Socket ("lenovo", 8189);

BufferedReader entree= new BufferedReader (new InputStreamReader(connexion.getInputStream()));

PrintWriter sortie = new PrintWriter(connexion.getOutputStream(),true);
BufferedReader clavier = new BufferedReader (new InputStreamReader(System.in));

boolean continu = true;

while (true){

String ligne = entree.readLine();
if ( ligne != null) System.out.println(ligne);

if (continu) break;

ligne= clavier.readLine();

if (ligne.equalsIgnoreCase("ok")) continu = false;
if (ligne != null ) sortie.println(ligne);
}
}

catch (Exception e) { System.err.println(e);}
System.out.println("connexion terminee");
        }}
        