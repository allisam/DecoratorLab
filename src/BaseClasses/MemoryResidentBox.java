/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samson
 */
public class MemoryResidentBox extends Mailbox {
    private List<Message> messages;
    
    public MemoryResidentBox(){
        messages = new ArrayList<Message>();      
    }
    
    public void add(Message m){
        messages.add(m);
    }
    
    public List<Message> retrieve(){
        return messages;
    }
}
