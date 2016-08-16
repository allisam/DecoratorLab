/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author samson
 */
public class Filtered extends MailboxDecorator{
    private Mailbox mailbox;
    private String notFrom;
    
    public Filtered(Mailbox mailbox, String notFrom){
        this.mailbox = mailbox;
        this.notFrom = notFrom;
    }
    
    public void add(Message m){
        if(!m.getFrom().equals(notFrom)){
            mailbox.add(m); 
        }
        
    }
    
    public List<Message> retrieve(){
        return mailbox.retrieve();
    }
}
