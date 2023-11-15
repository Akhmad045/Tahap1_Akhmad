/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Client
 */
public class Koneksi {
    static Connection konek;
    static ResultSet rs;
    static Statement st;
     public Koneksi(){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tahap_akhmad","root","");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     }
         public ResultSet ambilData(String sql){
             try {
                 st = konek.createStatement();
                 rs = st.executeQuery(sql);
                         return rs;
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
                 return null;
             }
         }
     public Boolean rubahdata(String sql){
         try {
             st = konek.createStatement();
             st.executeUpdate(sql);
             return true;
         } catch (Exception e) {
             return false;
         }
     }
}
