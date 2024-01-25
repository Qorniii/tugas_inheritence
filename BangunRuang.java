package com.mycompany.BangunRuang;
import java.util.Scanner;
public class BangunRuang {
    
    public static void hitung(){
        double hasil = 11.0/2.0;
        System.out.println("Hasilnya =" +hasil);
    }
    public static double Volume_LimasSegithiga(int l){
        int b = 0;
        double hasil = l*b/2.0;
        return hasil;
    } 
    
    // Volume bola
    public static double Volume_Bola(int r){
        double hasilVolumeBola = 4/3*3.14*(r*3);
        return hasilVolumeBola;
    }
    
    // Volume balok
    public static double Volume_Balok(int p, int l, int t){
        double hasilVolumeBalok = p*l*t;
        return hasilVolumeBalok;
    }
    
    // Volume limas segitiga
    public static double Volume_LimasSegitiga(int luas_alas, int tinggi_limas){
        double VolumeLimasSegitiga = 1/3*luas_alas*tinggi_limas;
        return VolumeLimasSegitiga;
    }
    
    // Volume tabung
    public static double volume_tabung(int r, int t){
        double hasilVolumeTabung = 3.14*(r*r)*t;
        return hasilVolumeTabung;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a= Volume_LimasSegithiga(5);
        System.out.println("Hasilnya adalah " + a);
        
        hitung();
        
        //Volume bola
        double hasilLuasPersegi = Volume_Bola(10);
        System.out.println("Luas persegi =" + hasilLuasPersegi);
        
        //Volume balok
        double hasilVolumeBalok = Volume_Balok();
        System.out.println("Volume Balok =" + hasilVolumeBalok);
        
        //Volume Limas Segitiga
        double hasilVolumeLimasSegitiga = Volume_LimasSegitiga();
        System.out.println("Volume Limas Segitiga =" + hasilVolumeLimasSegitiga);
        
        //Volume tabung
        double hasilVolumeTabung = volume_tabung(5,6);
        System.out.println("Volume Tabung =" + hasilVolumeTabung);

    }

    private static double Volume_LimasSegitiga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double Volume_Balok() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}