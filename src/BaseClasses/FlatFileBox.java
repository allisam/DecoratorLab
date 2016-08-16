/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samson
 */
public class FlatFileBox extends Mailbox{
    File file;
    
    //This sets up an empty file in MessageText
    public FlatFileBox(){
        file = new File("C:\\Users\\alli\\Desktop\\file.txt");
        try{
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
        }
        catch(IOException e){
            System.out.println("Could not start with new file");
        }
    }
    
    //We add a message to MessageText, in sequential order
    public void add(Message m){
        try {
 
			String from = "From:" + m.getFrom();
                        String content = "Content:" + m.getContent();
                        String date = "Date:" + m.getDate().toString();
 
			
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(from);
                        bw.newLine();
                        bw.write(content);
                        bw.newLine();
                        bw.write(date);
                        bw.newLine();
                        bw.newLine();
 			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public List<Message> retrieve(){
        List<Message> messages = new ArrayList<Message>();
        
        BufferedReader br = null;
 
		try {
 
			String text;
 
			br = new BufferedReader(new FileReader("MessageText.txt"));
                        String[] array;
 
			
                        while ((text = br.readLine()) != null) {
                            
                            if ( text.trim().length() == 0 ) {  
                                continue;  // Skip blank lines  
                              }

                                    array =text.split(":");
                                    String from = array[1];
                                    
                                    text = br.readLine();
                                    array =text.split(":");
                                    String content = array[1];
                                     
                                    text = br.readLine();
                                    array =text.split(":");
                                    String date = array[1];
                                    
                                    SimpleDateFormat date1 = new SimpleDateFormat("ddd mmm dd mm:mm:mm mmm yyyy");
                                    Date dateDate = new Date();
                                    try{
                                        dateDate = date1.parse(date);
                                    }
                                    catch(ParseException e){
                                    }
                                    Message m = new Message(from, content, dateDate);
                                    messages.add(m);
                                
                        }
                    
			
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null){
                                    br.close();
                                }
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
        
        return messages;
    }
}