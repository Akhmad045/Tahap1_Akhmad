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
public class petugas {
    static int id_petugas;
    static String username;
    static String password;
    static String nama_petugas;
    static String level;

    public static int getId_petugas() {
        return id_petugas;
    }

    public static void setId_petugas(int id_petugas) {
        petugas.id_petugas = id_petugas;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        petugas.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        petugas.password = password;
    }

    public static String getNama_petugas() {
        return nama_petugas;
    }

    public static void setNama_petugas(String nama_petugas) {
        petugas.nama_petugas = nama_petugas;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        petugas.level = level;
    }


}
