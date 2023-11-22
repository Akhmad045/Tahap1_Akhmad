/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author Client
 */
public class Siswa {
    static String nisn;
    static String nis;
    static String nama;
    static int id_kelas;
    static String alamat;
    static String no_telp;
    static int id_spp;

    public static String getNisn() {
        return nisn;
    }

    public static void setNisn(String nisn) {
        Siswa.nisn = nisn;
    }

    public static String getNis() {
        return nis;
    }

    public static void setNis(String nis) {
        Siswa.nis = nis;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Siswa.nama = nama;
    }

    public static int getId_kelas() {
        return id_kelas;
    }

    public static void setId_kelas(int id_kelas) {
        Siswa.id_kelas = id_kelas;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Siswa.alamat = alamat;
    }

    public static String getNo_telp() {
        return no_telp;
    }

    public static void setNo_telp(String no_telp) {
        Siswa.no_telp = no_telp;
    }

    public static int getId_spp() {
        return id_spp;
    }

    public static void setId_spp(int id_spp) {
        Siswa.id_spp = id_spp;
    }
}
