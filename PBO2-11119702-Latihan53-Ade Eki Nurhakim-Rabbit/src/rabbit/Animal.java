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
public class Animal extends Rabit{
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        
    }

    Animal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isVegetarian(){
        vegetarian=false;
        return vegetarian;
    }

    public String getEats() {
        eats="grass";
        return eats;
    }

    public int getNoOfLegs() {
        noOfLegs=4;
        return noOfLegs;
    }
    
}
