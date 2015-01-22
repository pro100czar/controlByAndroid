package controlByAndroid;

import java.io.*;
import java.net.*;

class ThreadHandler extends Thread {
    Socket s;
    int n;

    ThreadHandler() {
        
    }


    public void run() {
    	
        try {
        	ServerSocket ser = new ServerSocket(8031);
            String line;
            boolean runServer=true;
            while (runServer) {
            	s = ser.accept();
            	 BufferedReader inp = new BufferedReader(new InputStreamReader(
                         s.getInputStream()));
                line = inp.readLine();
                new hotKeys(line);
                //System.out.println("Message '" + line + "' echoed back to client.");
            }
        } catch (Exception e) {
            System.out.println("IO error " + e);
        }

    }
}