package test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileReader;
import java.io.IOException;

public class ScriptExecutor {

    private String scriptLocation;

    public void setScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    public void executeScript() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");

        try (FileReader reader = new FileReader(scriptLocation)) {
            scriptEngine.eval(reader);
        } catch (IOException | ScriptException e) {
            e.printStackTrace();
        }
    }
}
