package controlByAndroid;



import java.awt.Desktop;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JPanel;



public class panel {
	JPanel mainPanel;
	JButton exitButt = new JButton("Exit");
	JButton testMassage = new JButton("testMSG");
	String massage;
	serialPort sPort;
	
	 panel(){
		 sPort = new serialPort("COM5");
		mainPanel = new JPanel();
		mainPanel.setBounds(50, 50, 100, 100);
		setLayout();
		 addListeners();
		
	}
	void setLayout(){
		mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		
		c.gridx = 0;
		c.gridy = 0;
		mainPanel.add(testMassage, c);
		
		c.gridx = 0;
		c.gridy = 1;
		mainPanel.add(exitButt, c);

	}
	void addListeners(){
		testMassage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("massage from panel - " + sPort.getMsg());
			}
		});
		
		exitButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public JPanel getPanel(){
		return mainPanel;
	}

}
