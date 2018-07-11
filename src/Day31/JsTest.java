package Day31;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		
		ScriptEngineManager sc=new ScriptEngineManager();
		ScriptEngine en=sc.getEngineByName("nashorn");
		
		en.eval(new FileReader("resources/filepackage/sample.js"));
		System.out.println(en.eval("fTest()"));
		System.out.println(en.eval("sayHello('akshay')"));
	}

}
