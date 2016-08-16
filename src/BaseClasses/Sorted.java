/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author samson
 */
public class Sorted extends MailboxDecorator{
    private Mailbox mailbox;
    
    public Sorted(Mailbox mailbox){
        this.mailbox = mailbox;
    }
    
    public void add(Message m){   
        mailbox.add(m);   
    }
    
    public List<Message> retrieve(){
        List<Message> array = mailbox.retrieve();
        Collections.sort(array, new SortByMessageFrom());
        return array;
    }
}
