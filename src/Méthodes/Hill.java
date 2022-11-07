/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Méthodes;


public class Hill { 
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
    

 public String [] Codage (int [][]tab,int j){
     String []codeche = new String [j/2];
        for(int i=0;i<j/2;i++){
          codeche[i]=alphabet[(tab[i][0]-1)]+""+alphabet[(tab[i][1]-1)];
        }
        return codeche;
    }

}