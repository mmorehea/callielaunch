package wvulaunchpad;


import java.io.File;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonye
 */


abstract public class Part implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6831229235386955326L;
	String name;
        File file; 

 public Part(File filename){
 file = filename;
 name = " ";
}
  public void setName(String str){
	  System.err.println(str);
	  Matcher m = Pattern.compile("\\s*Input\\s(\\d+)\\s*").matcher(str);
	  if(m.matches()){
		  name = "in"+ m.group(1);
	  }
	  else if(str.equalsIgnoreCase("dendrites"))
		  name = "dendrite";
	  else
		  name = str.toLowerCase();
}
 
 public String[] toStringArr(){
        return new String[]{name,file.getAbsolutePath()};
     
 }
 
 @Override
 public String toString(){
	 return " "+name+" "+file.getAbsolutePath();
 }
}
