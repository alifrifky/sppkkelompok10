/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import static fuzzy.tsukamoto.luaslahan;
import java.util.Scanner;
/**
 *
 * @author Alif Rifky
 */
public class tsukamoto {

    static double luaslahan = 0;
    static double usia = 0;
    static double kondisitanaman = 0;
    public static double dosis;
    String hasil_dosis;

   

    public tsukamoto(double input_luaslahan, double input_usia, double input_kondisitanaman) {
        luaslahan = input_luaslahan;
        usia = input_usia;
        kondisitanaman = input_kondisitanaman;
    }
    double AxZ1, AxZ2, AxZ3, AxZ4, AxZ5, AxZ6, AxZ7, AxZ8,
            AxZ9, AxZ10, AxZ11, AxZ12, AxZ13, AxZ14, AxZ15,
            AxZ16, AxZ17, AxZ18, AxZ19, AxZ20, AxZ21, AxZ22,
            AxZ23, AxZ24, AxZ25, AxZ26, AxZ27;
    double input_luaslahan;
    double input_usia;
    double input_kondisitanaman;

    double nluaslahan_sempit, nluaslahan_sedang, nluaslahan_besar;
    double nusia_muda, nusia_sedang, nusia_tua;
    double nkondisitanaman_tidakparah, nkondisitanaman_sedang, nkondisitanaman_parah;
    double ndosis_sedikit, ndosis_sedang, ndosis_banyak;
    double a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
    double z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27;

 
    
    public String proses() {
        // INISIALISAI VARIBEL LUAS LAHAN
        double luaslahan_kecil_bawah = 0, luaslahan_kecil_atas = 36000;
        double luaslahan_sedang_bawah = 24000, luaslahan_sedang_tengah = 42000, luaslahan_sedang_atas = 60000;
        double luaslahan_tinggi_bawah = 48000, luaslahan_tinggi_atas = 72000;

        // INISIALISAI VARIBEL USIA
        double usia_muda_bawah = 0, usia_muda_atas = 10;
        double usia_sedang_bawah = 8, usia_sedang_tengah = 11, usia_sedang_atas = 14;
        double usia_tua_bawah = 12, usia_tua_atas = 16;

        // INISIALISAI VARIBEL KONDISI TANAMAN
        double kondisitanaman_tidakparah_bawah = 0, kondisitanaman_tidakparah_atas = 3;
        double kondisitanaman_sedang_bawah = 2, kondisitanaman_sedang_tengah = 3.5, kondisitanaman_sedang_atas = 5;
        double kondisitanaman_parah_bawah = 4, kondisitanaman_parah_atas = 6;

        // INISIALISAI VARIBEL DOSIS
        double dosis_sedikit_bawah = 0, dosis_sedikit_atas = 9;
        double dosis_sedang_bawah = 5, dosis_sedang_tengah = 12, dosis_sedang_atas = 19;
        double dosis_banyak_bawah = 15, dosis_banyak_atas = 50;
        //fuzzyfikasi//
        // fungsi keanggotaan luas rendah
        if (luaslahan < luaslahan_kecil_bawah) {
            nluaslahan_sempit = 1;
        } else if (luaslahan_kecil_bawah <= luaslahan && luaslahan <= luaslahan_kecil_atas) {
            nluaslahan_sempit = (luaslahan_kecil_atas - luaslahan) / (luaslahan_kecil_atas - luaslahan_kecil_bawah);
        } else {
            nluaslahan_sempit = 0;
        }

        // fungsi keanggotaan luas sedang
        if (luaslahan_sedang_bawah <= luaslahan && luaslahan <= luaslahan_sedang_tengah) {
            nluaslahan_sedang = (luaslahan - luaslahan_sedang_bawah) / (luaslahan_sedang_tengah - luaslahan_sedang_bawah);
        } else if (luaslahan_sedang_tengah <= luaslahan && luaslahan <= luaslahan_sedang_atas) {
            nluaslahan_sedang = (luaslahan_sedang_atas - luaslahan) / (luaslahan_sedang_atas - luaslahan_sedang_tengah);
        } else {
            nluaslahan_sedang = 0;
        }

        //fungsi keanggotaan luas tinggi
        if (luaslahan < luaslahan_tinggi_bawah) {
            nluaslahan_besar = 0;
        } else if (luaslahan_tinggi_bawah <= luaslahan && luaslahan <= luaslahan_tinggi_atas) {
            nluaslahan_besar = (luaslahan - luaslahan_tinggi_bawah) / (luaslahan_tinggi_atas - luaslahan_tinggi_bawah);
        } else {
            nluaslahan_besar = 1;
        }

        //----------------------------------------------------------------------
        // fungsi keanggotaan suhu rendah
        if (usia < usia_muda_bawah) {
            nusia_muda = 1;
        } else if (usia_muda_bawah <= usia && usia <= usia_muda_atas) {
            nusia_muda = (usia_muda_atas - usia) / (usia_muda_atas - usia_muda_bawah);
        } else {
            nusia_muda = 0;
        }

        // fungsi keanggotaan usia sedang
        if (usia_sedang_bawah <= usia && usia <= usia_sedang_tengah) {
            nusia_sedang = (usia - usia_sedang_bawah) / (usia_sedang_tengah - usia_sedang_bawah);
        } else if (usia_sedang_tengah <= usia && usia <= usia_sedang_atas) {
            nusia_sedang = (usia_sedang_atas - usia) / (usia_sedang_atas - usia_sedang_tengah);
        } else {
            nusia_sedang = 0;
        }

        //fungsi keanggotaan usia tua
        if (usia < usia_tua_bawah) {
            nusia_tua = 0;
        } else if (usia_tua_bawah <= usia && usia <= usia_tua_atas) {
            nusia_tua = (usia - usia_tua_bawah) / (usia_tua_atas - usia_tua_bawah);
        } else {
            nusia_tua = 1;
        }

        //----------------------------------------------------------------------
        // fungsi keanggotaan kondisitanaman tidakparah
        if (kondisitanaman < kondisitanaman_tidakparah_bawah) {
            nkondisitanaman_tidakparah = 1;
        } else if (kondisitanaman_tidakparah_bawah <= kondisitanaman && kondisitanaman <= kondisitanaman_tidakparah_atas) {
            nkondisitanaman_tidakparah = (kondisitanaman_tidakparah_atas - kondisitanaman) / (kondisitanaman_tidakparah_atas - kondisitanaman_tidakparah_bawah);
        } else {
            nkondisitanaman_tidakparah = 0;
        }

        // fungsi keanggotaan kondisitanaman sedang
        if (kondisitanaman_sedang_bawah <= kondisitanaman && kondisitanaman <= kondisitanaman_sedang_tengah) {
            nkondisitanaman_sedang = (kondisitanaman - kondisitanaman_sedang_bawah) / (kondisitanaman_sedang_tengah - kondisitanaman_sedang_bawah);
        } else if (kondisitanaman_sedang_tengah <= kondisitanaman && kondisitanaman <= kondisitanaman_sedang_atas) {
            nkondisitanaman_sedang = (kondisitanaman_sedang_atas - kondisitanaman) / (kondisitanaman_sedang_atas - kondisitanaman_sedang_tengah);
        } else {
            nkondisitanaman_sedang = 0;
        }

        //fungsi keanggotaan kondisitanaman parah
        if (kondisitanaman < kondisitanaman_parah_bawah) {
            nkondisitanaman_parah = 0;
        } else if (kondisitanaman_parah_bawah <= kondisitanaman && kondisitanaman <= kondisitanaman_parah_atas) {
            nkondisitanaman_parah = (kondisitanaman - kondisitanaman_parah_bawah) / (kondisitanaman_parah_atas - kondisitanaman_parah_bawah);
        } else {
            nkondisitanaman_parah = 1;
        }
        //----------------------------------------------------------------------

        //MENGHITUNG NILAI TIAP RULE
        //RULE 1
        // sempit	Muda	tidak parah 	sedikit
        double a1b = Math.min(nluaslahan_sempit, nusia_muda);
        a1 = Math.min(a1b, nkondisitanaman_tidakparah);
        z1 = dosis_sedikit_atas - (a1 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ1 = a1 * z1;

//RULE	2
//        sempit	Muda	sedang	sedikit
        double a2b = Math.min(nluaslahan_sempit, nusia_muda);
        a2 = Math.min(a2b, nkondisitanaman_sedang);
        z2 = dosis_sedikit_atas - (a2 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ2 = a2 * z2;
//RULE	3
//sempit	Muda	parah	sedikit
        double a3b = Math.min(nluaslahan_sempit, nusia_muda);
        a3 = Math.min(a3b, nkondisitanaman_parah);
        z3 = dosis_sedikit_atas - (a3 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ3 = a3 * z3;
//RULE	4
//sempit	Sedang	tidak parah 	sedikit
        double a4b = Math.min(nluaslahan_sempit, nusia_sedang);
        a4 = Math.min(a4b, nkondisitanaman_tidakparah);
        z4 = dosis_sedikit_atas - (a4 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ4 = a4 * z4;

//RULE	5
//sempit	Sedang	sedang	sedikit
        double a5b = Math.min(nluaslahan_sempit, nusia_sedang);
        a5 = Math.min(a5b, nkondisitanaman_sedang);
        z5 = dosis_sedikit_atas - (a5 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ5 = a5 * z5;

//RULE	6
//sempit	Sedang	parah	sedikit
        double a6b = Math.min(nluaslahan_sempit, nusia_sedang);
        a6 = Math.min(a6b, nkondisitanaman_parah);
        z6 = dosis_sedikit_atas - (a6 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ6 = a6 * z6;
//RULE	7
//sempit	Tua	tidak parah 	sedikit
        double a7b = Math.min(nluaslahan_sempit, nusia_tua);
        a7 = Math.min(a7b, nkondisitanaman_tidakparah);
        z7 = dosis_sedikit_atas - (a7 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ7 = a7 * z7;

//RULE	8
//sempit	Tua	sedang	sedikit
        double a8b = Math.min(nluaslahan_sempit, nusia_tua);
        a8 = Math.min(a8b, nkondisitanaman_sedang);
        z8 = dosis_sedikit_atas - (a8 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ8 = a8 * z8;
//RULE	9
//sempit	Tua	parah	sedikit
        double a9b = Math.min(nluaslahan_sempit, nusia_tua);
        a9 = Math.min(a9b, nkondisitanaman_parah);
        z9 = dosis_sedikit_atas - (a9 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ9 = a9 * z9;
//RULE	10
//sedang	Muda	tidak parah 	sedang
        double a10b = Math.min(nluaslahan_sedang, nusia_muda);
        a10 = Math.min(a10b, nkondisitanaman_tidakparah);
        z10 = dosis_sedikit_atas - (a10 * (dosis_sedikit_atas - dosis_sedikit_bawah));
        AxZ10 = a10 * z10;
//RULE	11
//sedang	Muda	sedang	sedang
        double a11b = Math.min(nluaslahan_sedang, nusia_muda);
        a11 = Math.min(a11b, nkondisitanaman_sedang);
        z11 = dosis_sedikit_atas - (a11 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ11 = a11 * z11;
//RULE	12
//sedang	Muda	parah	sedang
        double a12b = Math.min(nluaslahan_sedang, nusia_muda);
        a12 = Math.min(a12b, nkondisitanaman_parah);
        z12 = dosis_sedikit_atas - (a12 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ12 = a12 * z12;
//RULE	13
//sedang	Sedang	tidak parah 	sedang
        double a13b = Math.min(nluaslahan_sedang, nusia_sedang);
        a13 = Math.min(a13b, nkondisitanaman_tidakparah);
        z13 = dosis_sedikit_atas - (a13 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ13 = a13 * z13;
//RULE	14
//sedang	Sedang	sedang	sedang
        double a14b = Math.min(nluaslahan_sedang, nusia_sedang);
        a14 = Math.min(a14b, nkondisitanaman_sedang);
        z14 = dosis_sedikit_atas - (a14 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ14 = a14 * z14;

//RULE	15
//sedang	Sedang	parah	sedang
        double a15b = Math.min(nluaslahan_sedang, nusia_sedang);
        a15 = Math.min(a15b, nkondisitanaman_parah);
        z15 = dosis_sedikit_atas - (a15 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ15 = a15 * z15;
//RULE	16
//sedang	Tua	tidak parah 	sedang
        double a16b = Math.min(nluaslahan_sedang, nusia_tua);
        a16 = Math.min(a16b, nkondisitanaman_tidakparah);
        z16 = dosis_sedikit_atas - (a16 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ16 = a16 * z16;
//RULE	17
//sedang	Tua	sedang	sedang
        double a17b = Math.min(nluaslahan_sedang, nusia_tua);
        a17 = Math.min(a17b, nkondisitanaman_sedang);
        z17 = dosis_sedikit_atas - (a17 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ17 = a17 * z17;
//RULE	18
//sedang	Tua	parah	sedang
        double a18b = Math.min(nluaslahan_sedang, nusia_tua);
        a18 = Math.min(a18b, nkondisitanaman_parah);
        z18 = dosis_sedikit_atas - (a18 * (dosis_sedang_atas - dosis_sedang_bawah));
        AxZ18 = a18 * z18;
//RULE	19
//luas	Muda	tidak parah 	banyak
        double a19b = Math.min(nluaslahan_besar, nusia_muda);
        a19 = Math.min(a19b, nkondisitanaman_tidakparah);
        z19 = dosis_banyak_atas - (a19 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ19 = a19 * z19;
//RULE	20
//luas	Muda	sedang	banyak
        double a20b = Math.min(nluaslahan_besar, nusia_muda);
        a20 = Math.min(a20b, nkondisitanaman_sedang);
        z20 = dosis_banyak_atas - (a20 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ20 = a20 * z20;
//RULE	21
//luas	Muda	parah	banyak
        double a21b = Math.min(nluaslahan_besar, nusia_muda);
        a21 = Math.min(a21b, nkondisitanaman_parah);
        z21 = dosis_banyak_atas - (a21 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ21 = a21 * z21;
//RULE	22
//luas	Sedang	tidak parah 	banyak
        double a22b = Math.min(nluaslahan_besar, nusia_sedang);
        a22 = Math.min(a22b, nkondisitanaman_tidakparah);
        z22 = dosis_banyak_atas - (a22 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ22 = a22 * z22;
//RULE	23
//luas	Sedang	sedang	banyak
        double a23b = Math.min(nluaslahan_besar, nusia_sedang);
        a23 = Math.min(a23b, nkondisitanaman_sedang);
        z23 = dosis_banyak_atas - (a23 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ23 = a23 * z23;
//RULE	24
//luas	Sedang	parah	banyak
        double a24b = Math.min(nluaslahan_besar, nusia_sedang);
        a24 = Math.min(a24b, nkondisitanaman_parah);
        z24 = dosis_banyak_atas - (a24 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ24 = a24 * z24;
//RULE	25
//luas	Tua	tidak parah 	banyak
        double a25b = Math.min(nluaslahan_besar, nusia_tua);
        a25 = Math.min(a25b, nkondisitanaman_tidakparah);
        z25 = dosis_banyak_atas - (a25 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ25 = a25 * z25;
//RULE	26
//luas	Tua	sedang	banyak
        double a26b = Math.min(nluaslahan_besar, nusia_tua);
        a26 = Math.min(a26b, nkondisitanaman_sedang);
        z26 = dosis_banyak_atas - (a26 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ26 = a26 * z26;
//RULE	27
//luas	Tua	parah	banyak
        double a27b = Math.min(nluaslahan_besar, nusia_tua);
        a27 = Math.min(a27b, nkondisitanaman_parah);
        z27 = dosis_banyak_atas - (a27 * (dosis_banyak_atas - dosis_banyak_bawah));
        AxZ27 = a27 * z27;

// PERHITUNGAN FUZYYFIKASI
        double sum_AxZ = AxZ1 + AxZ2 + AxZ3 + AxZ4 + AxZ5 + AxZ6 + AxZ7 + AxZ8
                + AxZ9 + AxZ10 + AxZ11 + AxZ12 + AxZ13 + AxZ14 + AxZ15
                + AxZ16 + AxZ17 + AxZ18 + AxZ19 + AxZ20 + AxZ21 + AxZ22
                + AxZ23 + AxZ24 + AxZ25 + AxZ26 + AxZ27;
        double sum_A = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10
                + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19
                + a20 + a21 + a22 + a23 + a24 + a25 + a26 + a27;
        dosis = sum_AxZ / sum_A;
        System.out.println(dosis);
        // fungsi keanggotaan dosis sedikit
        if (dosis < dosis_sedikit_bawah) {
            ndosis_sedikit = 1;
        } else if (dosis_sedikit_bawah <= dosis && dosis <= dosis_sedikit_atas) {
            ndosis_sedikit = (dosis_sedikit_atas - dosis) / (dosis_sedikit_atas - dosis_sedikit_bawah);
        } else {
            ndosis_sedikit = 0;
        }

        // fungsi keanggotaan dosis sedang
        if (dosis_sedang_bawah <= dosis && dosis <= dosis_sedang_tengah) {
            ndosis_sedang = (dosis - dosis_sedang_bawah) / (dosis_sedang_tengah - dosis_sedang_bawah);
        } else if (dosis_sedang_tengah <= dosis && dosis <= dosis_sedang_atas) {
            ndosis_sedang = (dosis_sedang_atas - dosis) / (dosis_sedang_atas - dosis_sedang_tengah);
        } else {
            ndosis_sedang = 0;
        }

        //fungsi keanggotaan dosis  banyak
        if (dosis < dosis_banyak_bawah) {
            ndosis_banyak = 0;
        } else if (dosis_banyak_bawah <= dosis && dosis <= dosis_banyak_atas) {
            ndosis_banyak = (dosis - dosis_banyak_bawah) / (dosis_banyak_atas - dosis_banyak_bawah);
        } else {
            ndosis_banyak = 1;
        }
        
        
         // membandingkan masing2 fungsi keanggotaan untuk mencari hasil akhir
        if (ndosis_sedikit > ndosis_sedang && ndosis_sedikit > ndosis_sedikit)
              hasil_dosis = "dosis sedikit";
         
        else if (ndosis_sedang > ndosis_sedikit && ndosis_sedang > ndosis_banyak)
       
             hasil_dosis = "dosis sedang";
        else if (ndosis_banyak > ndosis_sedikit && ndosis_banyak > ndosis_sedang)
       
            hasil_dosis = "dosis tiggi";
        else
           
            hasil_dosis = "Dosis sangat Tinggi";
        return hasil_dosis;

    }
    
}
