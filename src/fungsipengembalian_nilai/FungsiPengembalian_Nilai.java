/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsipengembalian_nilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FungsiPengembalian_Nilai {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Program menjumlahkan 2 nilai");
        System.out.println("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.println("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.println("Masukkan nilai c : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
    }
    //konstruktor
    private static int jumlah(int a, int b){
        int hasil = a+b;
        return hasil;
    }
    }
    

