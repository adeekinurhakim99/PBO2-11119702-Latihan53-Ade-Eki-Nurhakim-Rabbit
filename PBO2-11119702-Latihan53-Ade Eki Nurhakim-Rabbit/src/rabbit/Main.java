/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbit;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Rabit r=new Rabit() {};
    System.out.println("Hello, His name is "+r.getNama());
    
    Animal a=new Animal();
    System.out.println("Petter is vegtarian? "+a.isVegetarian());
    System.out.println("Petter eats "+a.getEats());
    System.out.println("Petter has "+a.getNoOfLegs());
    
    System.out.println("Peter color is "+r.getColor());
    }
    
}
