package Day31;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsInJava {
	
	public static void main(String[] args) throws ScriptException{
		ScriptEngineManager sc=new ScriptEngineManager();
		ScriptEngine en=sc.getEngineByName("nashorn");
		
		String name="akshay";
		Integer reslt=null;
		
		en.eval("print('"+name+"')");
		reslt=(Integer)en.eval("10+20");
		System.out.println("result is"+reslt);
	}

}
