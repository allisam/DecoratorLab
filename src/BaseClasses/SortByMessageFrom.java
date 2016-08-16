/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.util.Comparator;

/**
 *
 * @author samson
 */
public class SortByMessageFrom implements Comparator{
    
     public int compare(Object o1, Object o2) {
        Message p1 = (Message) o1;
        Message p2 = (Message) o2;
        return p1.getFrom().compareTo(p2.getFrom());
    }
}
