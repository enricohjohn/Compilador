package test;
import java.io.*;
import java.util.*;

 
public class getText {
 
  public static void main(String[] args) throws Exception{
	  InputStream is = null;
	  
	  int i;
	  char c;
     try{
    	  is = new FileInputStream("input.txt");
    	
    	while ((i = is.read())!=-1) {

       	 c = (char)i;
       	 System.out.println(c);
       	 
		}
     }catch (Exception e) {
    	 
    	 e.printStackTrace();
    	 
	}finally{
		if(is !=null);
			
		
	}
	//asdadsasd
	 
  
  }
}