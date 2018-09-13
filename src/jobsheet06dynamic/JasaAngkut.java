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
public class JasaAngkut {
    public static void main(String [] args){
        String identitas = "M.Sultan Sahara / XR5 / 27";
        System.out.println("Identitas : "+ identitas);
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Masukkan Jumlah Berat : ");
        int berat = scanner.nextInt();
    int pecahanberat [] = new int [] {7,5,4,3,2};
    int jumlah;
    int bayaran;
    int total = 0;
    for(int i = 0; i< pecahanberat.length;i++){
    if(berat >= pecahanberat[i]){
        jumlah = berat/pecahanberat[i];
        berat = berat%pecahanberat[i];
    if(pecahanberat[i]==7){
    bayaran = 10000*jumlah;
    }
    else if(pecahanberat[i]==5){
    bayaran = 7000*jumlah;
    }
    else if(pecahanberat[i]==4){
    bayaran = 5000*jumlah;
    }
    else if(pecahanberat[i]==3){
    bayaran = 3000*jumlah;
    }
    else{
    bayaran = 2000*jumlah;
    }
    total += bayaran;
        System.out.println(" JumlahPecahan berat " + pecahanberat[i]+ " KG "+" sebanyak "+ jumlah +" Seharga "+ bayaran);
    }
    }
    System.out.println(" Total Harga = "+total+ " Rp ");
}
    }


