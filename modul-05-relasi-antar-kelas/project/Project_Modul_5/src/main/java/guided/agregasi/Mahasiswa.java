/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided.agregasi;

public class Mahasiswa {
    private String NIM, Nama;
    
    public Mahasiswa(String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
    }
    
    //Getter
    public String getNIM(){
        return NIM;
    }
    
    public String getNama(){
        return Nama;
    }
    //Setter
    public void setNim(String NIM){
        this.NIM = NIM;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
}
