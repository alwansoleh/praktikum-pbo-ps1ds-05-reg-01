/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author HUAWEI
 */
public class guided1 {
   public static void main(String[] args) {
        // cara 1
        int[] VarArray1;
        VarArray1 = new int[5];
        VarArray1[0] = 11;
        VarArray1[1] = 22;
        VarArray1[2] = 33;
        VarArray1[3] = 44;
        VarArray1[4] = 55;
        
        // cara 2
        int[] VarArray2 = new int[5];
        
        // cara 3
        int[] VarArray3 = {1,2,3,4,5};
        
        System.out.println(VarArray3[3]);
        
        // Array 2 Dimensi
        int [][] arr2d =  new int [2][2];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;
        System.out.println("Nilai baris kolom 1 dan 2:"+ arr2d[0][1]);
    }
}
