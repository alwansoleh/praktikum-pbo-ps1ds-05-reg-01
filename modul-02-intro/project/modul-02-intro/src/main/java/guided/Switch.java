/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author HUAWEI
 */
public class Switch {
    public static void main(String[] args) {
           int nilai = 80;
           char indeks;

           switch (nilai / 10) {
               case 10:
               case 9:
               case 8:
                   indeks = 'A';
                   break;
               case 7:
                   indeks = 'B';
                   break;
               case 6:
                   indeks = 'C';
                   break;
               case 5:
                   indeks = 'D';
                   break;
               default:
                   indeks = 'E';
                   break;
           }

           System.out.println("Nilai indeks: " + indeks);
       }
}
