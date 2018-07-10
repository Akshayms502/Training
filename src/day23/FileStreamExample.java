package day23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamExample  {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);
		
		List<String> ls=
				Stream.of("one","two","three","four").
				map(String:: toUpperCase)
				.collect(Collectors.toList());
		
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase).forEach(System.out::println);
		
		
		System.out.println("-------------------------------------------------");
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase).filter(name->name.endsWith(".TXT")).limit(5).forEach(name->doAction(name));

		
		
	}
	public static void doAction(String flname){
		System.out.println("action goes here "+ flname);
	}

}
