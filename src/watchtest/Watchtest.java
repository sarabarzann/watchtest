/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watchtest;

/**
 *
 * @author SherdllStore
 */
public class Watchtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     watch obj =new watch();
     watch obj1 =new watch(12,3);
     watch obj2 =new watch(12,10,3);
     watch obj3=new watch(12);
     obj.display();
      obj1.display();
       obj2.display();
        obj3.display();
    }
    
}
