/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.List;

/**
 *
 * @author samson
 */
public class Covert extends MailboxDecorator{
    private Mailbox mailbox;
    private String hiddenMsg;
    
    public Covert(Mailbox mailbox, String hiddenMsg){
        this.mailbox = mailbox;
        this.hiddenMsg = hiddenMsg;
    }
    
    public void add(Message m){
        mailbox.add(m);
    }
    
    public List<Message> retrieve(){
        return mailbox.retrieve();
    }

}
