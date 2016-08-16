/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.Date;

/**
 *
 * @author samson
 */
public class Message {
    private String from;
    private String content;
    private Date date;
    
    public Message(String from, String content, Date date){
        this.from = from;
        this.content = content;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }			
}
