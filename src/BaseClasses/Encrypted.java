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
public class Encrypted extends MailboxDecorator{
    
    private Mailbox mailbox;
    
    public Encrypted(Mailbox mailbox){
        this.mailbox = mailbox;
    }
    
    public void add(Message m){
        StringBuffer s = new StringBuffer(m.getFrom());
        s.reverse();
        StringBuffer r = new StringBuffer(m.getContent());
        r.reverse();
        mailbox.add(new Message(s.toString(), r.toString(), m.getDate()));
       
    }
    
    public List<Message> retrieve(){
        List<Message> newArray = new ArrayList<Message>();
        List<Message> array = mailbox.retrieve();
        for(Message m : array){
            StringBuffer s = new StringBuffer(m.getFrom());
            s.reverse();
            StringBuffer r = new StringBuffer(m.getContent());
            r.reverse();
            newArray.add(new Message(s.toString(), r.toString(), m.getDate()));
        }
        return newArray;
    }
    
}
