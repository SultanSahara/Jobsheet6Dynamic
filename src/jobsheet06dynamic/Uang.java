/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet06dynamic;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Uang {
    public static void main(String [] args){
    String identitas = "M.Sultan Sahara / XR5 / 27";
    System.out.println("Identitas : "+ identitas);
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Masukkan Jumlah Uang : ");
    int uang = scanner.nextInt();
    int pecahan [] = new int [] {5000,2000,1000,500};
    int jumlah;
    
    for(int i = 0; i< pecahan.length;i++){
    if(uang >= pecahan[i]){
        jumlah = uang/pecahan[i];
        uang = uang%pecahan[i];
        System.out.println(" Pecahan " + pecahan[i]+" sebanyak " +jumlah+" Keping ");
    }
}
}
}