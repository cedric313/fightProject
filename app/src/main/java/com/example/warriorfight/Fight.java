package com.example.warriorfight;

public class Fight{

    public static void main(String[] args) {

        Conan conan1 = new Conan(30);
        Cadilhac cadilhac1 = new Cadilhac(30);
        Gimli gimli1 = new Gimli(30);

        cadilhac1.cadilhacFightVsConan();
        conan1.takeHit(cadilhac1.getAttack());
        System.out.println(conan1.getLife());

        cadilhac1.cadilhacFightVsGimli();
        gimli1.takeHit(cadilhac1.getAttack());
        System.out.println(gimli1.getLife());


    }
}
