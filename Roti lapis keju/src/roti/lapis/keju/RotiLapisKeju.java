/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roti.lapis.keju;

import java.util.Scanner;


public class RotiLapisKeju {
    static void intro(){System.out.println("Mari membuat roti lapis double\nRoti lapis double membutuhkan 2 keju dan 3 roti.");}
    

    public static void main(String[] args) {        
        System.out.println("Program dimulai..\n");
        Scanner input = new Scanner (System.in);

        boolean A=true;
        String ans;
        //perulangan      
        while ( A ){
        Method summon = new Method();
        int kejumin=2;
        int banyakroti;
        int rotimin=3;
        int banyakkeju;
       Scanner pilih =new Scanner(System.in);
        
       intro();                     
        summon.roticount();
      
    
        banyakroti = input.nextInt();
        
       summon.kejucount();
       banyakkeju = input.nextInt();
       
      if (banyakroti<rotimin || banyakkeju<kejumin )
      {
      
      summon.sorry();
      }
      
      else {int rotivalue; 
            int kejuvalue;
            int sisaroti;
            int sisakeju;
            rotivalue = banyakroti/rotimin;
            kejuvalue = banyakkeju/kejumin;
            
            
           int terkecil;
           if (rotivalue<=kejuvalue){terkecil=rotivalue;}
           else {terkecil = kejuvalue;}
           System.out.println ("Kamu bisa membuat "+ terkecil +" roti lapis double");
                   
           sisaroti = banyakroti - terkecil*rotimin;
           sisakeju = banyakkeju - terkecil*kejumin;
          
           if (sisaroti>0 && sisakeju>0) {System.out.println ("Kamu menyisakan "+sisaroti+" roti, dan "+sisakeju+" keju");}
                      
           else if (sisaroti < 1 && sisakeju>0) {System.out.println ("Kamu hanya menyisakan "+sisakeju+" keju. Tidak ada sisa roti");}
                                 
           else if (sisakeju < 1 && sisaroti>0){System.out.println("Kamu menyisakan "+sisaroti+" roti, kejumu habis.");}
                                 
           else {System.out.println("Kamu tidak menyisakan roti ataupun keju.");
                  
      }
      }
     System.out.println ("Apakah kamu ingin membuat roti lagi?");
      System.out.println ("[ya/tidak]");
     Scanner bleh = new Scanner(System.in);
      ans = bleh.nextLine();  
          if (ans.equalsIgnoreCase("tidak"))
          {A=false;
          System.out.println ("\nTerima kasih telah menggunakan program kami\nDEVELOPED BY:\nHilmi Ahmad/21120119130048\nYohannes Kukuh N/21120119130095\n\nProgram Berakhir..." );
          }
      
        }   
         
      }
    
   
} 

    

