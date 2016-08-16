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
public abstract class MailboxDecorator extends Mailbox{
    
    
    public abstract void add(Message m);
    
    public abstract List<Message> retrieve();
    
}
