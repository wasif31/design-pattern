/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypizza;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class main {
    public static void main(String[] args) {
        Factorypizza f=new Factorypizza();
         type_print t=f.getpizza("gorib");
        t.type();
        type_print t2=f.getpizza("button");
        t2.type();
        
    }
    
}
