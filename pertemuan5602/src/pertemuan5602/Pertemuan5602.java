/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Gede Marlon Ramasila
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LuasSegitiga Segitiga01 = new LuasSegitiga();
        
        System.out.print("masukkan alas: ");
        Segitiga01.alas = scanner.nextInt();
        
        System.out.print("masukkan tinggi: ");
        Segitiga01.tinggi = scanner.nextInt();
        
        System.out.println("luas segitiga: "+ Segitiga01.hitungLuas());
   }
    
}
