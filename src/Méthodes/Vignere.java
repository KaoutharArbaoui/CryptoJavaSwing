package Méthodes;

public class Vignere {
    
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
    public int [] Codagenumv (char [] tab){
        int[] codenumm = new int[tab.length];
        for(int i =0;i<tab.length;i++){
            if(tab[i]==' ')
                codenumm[i]=' ';// pour les espaces
            else codenumm[i]=(tab[i]-'A')%26;
        }
        return codenumm;
    }
    public char [] Cryptagev (int []tab,int [] cle){
        int[] tab1 = new int[tab.length];
        char[] codechm = new char[tab.length];
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=' ')
            {
                tab1[i]=(tab[i]+cle[i%(cle.length)])%26;
                if(tab1[i]==0) codechm[i]='Z';
                else codechm[i]=alphabet[(tab1[i]-1)%26];  
            }
                else  codechm[i]=' ';
        }
        return codechm;
    }
    public char [] Decryptage (int []tab,int [] cle){
        int[] tab1 = new int[tab.length];
        char[] codechm = new char[tab.length];
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=' ')
            {
                tab1[i]=(tab[i]-cle[i%(cle.length)])%26;
                if(tab1[i]<0){tab1[i]=26+tab1[i]; }
                if(tab1[i]==0) codechm[i]='Z';
                else codechm[i]=alphabet[(tab1[i]-1)%26];  
            }
                else  codechm[i]=' ';
        }
        return codechm;
    }
}
