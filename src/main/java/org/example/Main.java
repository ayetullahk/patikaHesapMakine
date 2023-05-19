package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1, s2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        s1 = input.nextInt();
        System.out.print("2. sayıyı giriniz:");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("İşlemi seciniz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                int sonuctoplama = s1 + s2;
                System.out.println("Toplama:" + sonuctoplama);
                break;
            case 2:
                int sonuceksi = s1 - s2;
                System.out.println("Çıkarma:" + sonuceksi);
                break;
            case 3:
                int sonucbölme = s1/s2;
                System.out.println("Bölme:"+sonucbölme);
                break;
            case 4:
                int sonucçarpma=s1*s2;
                System.out.println("Çarpma:"+sonucçarpma);
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız !");
        }


    }
}