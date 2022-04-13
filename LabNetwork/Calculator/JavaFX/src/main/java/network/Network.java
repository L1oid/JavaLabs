package network;

import java.net.*;
import java.io.*;


public class Network {
    MySocket mySocket;
    public Network() {
        mySocket = new MySocket("127.0.0.1",1111);
    }

    public void send(String str) {
        mySocket.sendInfo(str);
    }
    public String get() {
        return mySocket.getInfo();
    }
}

class MySocket {
    Socket s;
    InputStream in;
    OutputStream out;

    public MySocket(String host, int port) {
        try {
            System.out.println("Start");
            Socket s = new Socket(host, port);
            System.out.println("Local port: " +  s.getLocalPort());
            System.out.println("Remote port: " + s.getPort());
            in = s.getInputStream();
            out = s.getOutputStream();
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    void sendInfo(String str) {
        try {
            out.write(str.getBytes());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    String getInfo() {
        try {
            byte[] buf = new byte[2000];
            int count = in.read(buf);
            return new String(buf, 0, count);
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            return " Error sendInfo: " + e;
        }
    }

    public void finalize() throws Throwable {
        in.close();
        out.close();
        s.close();
        System.out.println("Finish");
    }
}