/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.Date;
import java.util.List;

/**
 *
 * @author samson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Message one = new Message("Zombie Fred", "Hello how are you?", new Date(1, 2, 5));
        Message two = new Message("Zombie Sarah", "Why do we enjoy brains so much?", new Date());
        Message three = new Message("Zombie Leader", "Come follow me and I will show you food", new Date());
                
        
        
        Mailbox flat = new FlatFileBox();
        flat.add(one);
        flat.add(two);
        flat.add(three);
        
        List<Message> list = flat.retrieve();
        for(Message m : list){
            System.out.println(m.getFrom());
            System.out.println(m.getContent());
            System.out.println(m.getDate());
        }
    }
}
