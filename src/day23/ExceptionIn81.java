package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionIn81 {
	public static void main(String[] args)   throws IOException{
		writeToFile();
		readFile();
	}

	private static void readFile() throws FileNotFoundException, IOException {
		try(FileReader fl=new FileReader("sample.txt");
				BufferedReader br=new BufferedReader(fl)){
		br.lines().forEach(System.out::println);	
		}
		
	}

	private static void writeToFile()  throws IOException{
		try(BufferedWriter br=new BufferedWriter(new FileWriter("sample.txt"))){
			br.write("hello java");
		}
		
		System.out.println("data saved successfully");
	}

}
