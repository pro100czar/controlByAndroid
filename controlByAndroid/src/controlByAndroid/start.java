package controlByAndroid;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class start {
	public static void main(String[] args) {
		
		
		panel firstPanel = new panel();
		final JFrame startFrame = new JFrame("Main");
		startFrame.setBounds(firstPanel.getPanel().getBounds());
		startFrame.add(firstPanel.getPanel());
		startFrame.setVisible(true);
		startFrame.addWindowListener(new WindowAdapter() { // обработка крестика
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	       
	        System.out.println("End!");
	    }
	}
	
	

