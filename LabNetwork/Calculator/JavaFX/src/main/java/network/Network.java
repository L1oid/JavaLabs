package network;

import java.net.*;
import java.io.*;


public class Network {
    static String str;
    static String newStr;

    public static void send(String str_p) {
        str = str_p;
        newStr = MySocket.socket(str);
    }
    public static String get() {
        return newStr;
    }

}

class MySocket {
    static String socket(String str) {
        try {
            System.out.println("Start");
            Socket s = new Socket("127.0.0.1",1111);
            System.out.println("Local port: " +  s.getLocalPort());
            System.out.println("Remote port: " + s.getPort());
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            out.write(str.getBytes());
            byte[] buf = new byte[2000];
            int count = in.read(buf);
            String word = new String(buf, 0, count);
            in.close();
            out.close();
            s.close();
            System.out.println("Finish");
            return word;
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            return "Error";
        }
    }
}