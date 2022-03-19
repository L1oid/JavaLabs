package result;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Result {
    String finalAnswer;
    Object result;


    public String calc_result(String str) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            result = engine.eval(str);
            finalAnswer = result.toString();
        }
        catch(ScriptException engine) {
            System.err.println("Error evaluating the script: " + engine.getMessage());
        }
        return finalAnswer;
    }
}