package javaPrograms;

import java.io.*;

public class Depersist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("Serial.txt"));  
			  Student s=(Student)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
			 }  
			}  
