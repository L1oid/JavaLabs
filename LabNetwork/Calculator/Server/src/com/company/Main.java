package com.company;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    static String answer;

    public static void main(String[] args) {
        while(true) {
            try {
                ServerSocket ss = new ServerSocket(1111);
                System.out.println("Waiting connection...");
                Socket s = ss.accept();
                System.out.println("Local port: " +  s.getLocalPort());
                System.out.println("Remote port: " + s.getPort());
                InputStream in = s.getInputStream();
                OutputStream out = s.getOutputStream();
                byte[] buf = new byte[2000];
                int count = in.read(buf);
                String word = new String(buf, 0, count);
                Result result = new Result();
                answer = result.calc_result(word);
                out.write(answer.getBytes());
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e);
            }
        }
    }
}

class Result {
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
