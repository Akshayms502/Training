package day23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileReader fr=new FileReader("sample.csv");
				BufferedReader br=new BufferedReader(fr)){
		
		}

	}

}
