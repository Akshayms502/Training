package day23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionIn8 {

	public static void main(String[] args) {
		
	}
	
	public static void writeToFile(){
		BufferedWriter bw=null;
		try{
			bw=new BufferedWriter(new FileWriter("/Users/akshay.ms/Desktop/sample.txt"));
			bw.write("hello");
			bw.newLine();
			bw.write("java");
			System.out.println("data saved");
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				bw.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
