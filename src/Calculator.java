import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

    Calculator(String Input) {
        String userInput = Input;

        //make the manager
        ScriptEngineManager manager = new ScriptEngineManager();

        //make and get the engine
        ScriptEngine Engine;
        Engine = manager.getEngineByName("JavaScript");

        //make the result
        try {
            Object result = Engine.eval(Input);
            System.out.println(result);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }

    }
}
