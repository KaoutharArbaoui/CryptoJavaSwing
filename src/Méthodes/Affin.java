/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Méthodes;

public class Affin  {
    
  //
  public static final char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                              'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  
  public int [] Codagenum (String tabc){
        int[] codenumm = new int[tabc.length()]; 
        char [] tab = tabc.toCharArray();
        for(int i =0;i<tab.length;i++){
            if(tab[i]==' ')
                codenumm[i]=' ';//les espaces ' '
            else codenumm[i]=(tab[i]-'A'+1)%26;
        }
        return codenumm;
    }

  //Calculde pgcd 
  public static int pgcd(int key){
        int res;
        int nb1=26;
        do {
            res = nb1%key;
            nb1=key;//décalage pour réaliser euclide
            key = res;//décalage pour réaliser euclide
            } while (key != 0);//tant que le reste est non nul
              return nb1;       
         }
    
  //calcule d'inverse
    public static int inverse1(int a){
         int p=0;
        for(int i=1;i<26;i=i+1){
            if((a*i)%26==1) { p=i; break;}
    }
        return p;
     }
    //cryptage
    public char[] Cryptagea(int[] tab, int cle, int cla) {
        char[] codechm = new char[tab.length];
        int[] tab1 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != ' ') {
                tab1[i] = (tab[i] * cle + cla) % 26;
                if (tab1[i] == 0) {
                    codechm[i] = 'Z'; // en affecte a TAB1 le code 25 par ce que 26%26 == 0 clé de 17
                } else {
                    codechm[i] = alphabet[(tab1[i] - 1) % 26];   // cle 10 pour T OUI O = 15 Y = 25 mais dans alphabet Y = 24
                }
            } else {
                codechm[i] = ' ';
            }
        }

        return codechm;
    }

    // decryptage
    public char[] Decryptagea(int[] tab, int cle, int cla, char[] proz) {
        int[] tab1 = new int[tab.length];
        char[] codechE = new char[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (proz[i] == ' ') {
                codechE[i] = ' ';
            } else {
                tab1[i] = (((tab[i] + (26 - cla % 26)) * inverse1(cle)) % 26);
                if (tab1[i] == 0) {
                    codechE[i] = 'Z';
                } else {
                    codechE[i] = alphabet[(tab1[i] - 1) % 26]; // cle 10 pour T OUI O = 15 Y = 25 mais dans alphabet Y = 24
                }
            }
        }
        return codechE;
    }
}
