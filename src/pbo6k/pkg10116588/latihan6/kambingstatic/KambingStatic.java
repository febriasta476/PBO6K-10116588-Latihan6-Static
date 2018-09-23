/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan6.kambingstatic;

/**
 *
 * @author Indra F
 * Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan
 * Jenis - jenis tipe data  : bilangan bulat
 */
 

    //Variabel jumlahKambing dideklarasikan sebagai static
    
public class KambingStatic {
    
    public static int jumlahKambing;

    //Nama kambing sebagai konstanta
    
    public static final String Nama_Kambing ="MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        KambingStatic.jumlahKambing= 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak" 
                                   +KambingStatic.jumlahKambing);
    }
    
}
