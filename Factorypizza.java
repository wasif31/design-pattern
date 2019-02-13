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
public class Factorypizza {

    /**
     * @param args the command line arguments
     */
  public type_print getpizza(String pizza ){
  if(pizza=="gorib"){
      return new cheese_pizza();
  
  
  }
  else if(pizza=="button"){
      return new margerita_pizza();
  }
  else {
      return null;
        // TODO code application logic here
    }
    
}
}
