
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhedding
 */
public class ListDemo {
    public static void main(String[] args) {
        List shoppingList = new ArrayList();
        shoppingList.add("Bottled Water");
        shoppingList.add("Tortilla Chips");
        shoppingList.add("Ginger Beer");
        shoppingList.add("Tortilla Chips");
        
        int size = shoppingList.size();
        
        //String item = (String)shoppingList.get(1);
        
        // add is insert operation, set is replacting operation
        shoppingList.add(1, "Steak");
        
        //System.out.println(item);
        
        for (int i = 0; i < shoppingList.size(); i++) {
            String item = (String)shoppingList.get(i);
            System.out.println(item);
        }
        
    }
    
}
