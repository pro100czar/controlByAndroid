package controlByAndroid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class hotKeys{
String command;
	hotKeys(String command) throws AWTException{
		//TODO
		this.command=command;
		if(command.equals("PlayStopTrack"))Playstop();
		if(command.equals("HideShow"))hideShow();
		if(command.equals("PrevTrack"))prevTrack();
		if(command.equals("NextTrack"))nextTrack();
		if(command.equals("ReFrwrd"))ReFrwrd();
		if(command.equals("ReBack"))ReBack();
		if(command.equals("PrevList"))PrevList();
		if(command.equals("NextList"))NextList();
		if(command.indexOf("Search") != -1)SearchSong();
		
	
		
	}
	 private void SearchSong() throws AWTException {
		// TODO Auto-generated method stub
		String nameSong = command.substring(7);
		
				JTextField invisibleField = new JTextField(nameSong);
				invisibleField.selectAll();
				invisibleField.copy();
				Robot robot = new Robot();
		 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
		 		robot.keyPress(KeyEvent.VK_SHIFT);
		 		robot.keyPress(KeyEvent.VK_CONTROL);
		 		robot.keyPress(KeyEvent.VK_S);
		 		robot.keyRelease(KeyEvent.VK_SHIFT);
		 		robot.keyRelease(KeyEvent.VK_CONTROL);
		 		robot.keyRelease(KeyEvent.VK_S);
		 		
		 		robot.keyPress(KeyEvent.VK_CONTROL);
		 		robot.keyPress(KeyEvent.VK_V);
		 		robot.keyRelease(KeyEvent.VK_CONTROL);
		 		robot.keyRelease(KeyEvent.VK_V);
		 		try {
		 		    Thread.sleep(100);                 //1000 milliseconds is one second.
		 		} catch(InterruptedException ex) {
		 		    Thread.currentThread().interrupt();
		 		}
		 		robot.keyPress(KeyEvent.VK_ENTER);
		 		robot.keyRelease(KeyEvent.VK_ENTER);
		 		
		 		
		 		 robot.keyPress(KeyEvent.VK_ALT);
		 		robot.keyPress(KeyEvent.VK_F4);
		 		
		 		robot.keyRelease(KeyEvent.VK_ALT);
		 		robot.keyRelease(KeyEvent.VK_F4);
		 		
		 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
		 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		 		
		 		
				
	}
	private void NextList() throws AWTException {
		 Robot robot = new Robot();
	 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.keyPress(KeyEvent.VK_CONTROL);
	 		robot.keyPress(KeyEvent.VK_N);

	 		robot.keyRelease(KeyEvent.VK_SHIFT);
	 		robot.keyRelease(KeyEvent.VK_CONTROL);
	 		robot.keyRelease(KeyEvent.VK_N);
	 		
	 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
	 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		
	}
	private void PrevList() throws AWTException {
		Robot robot = new Robot();
 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
 		robot.keyPress(KeyEvent.VK_SHIFT);
 		robot.keyPress(KeyEvent.VK_CONTROL);
 		robot.keyPress(KeyEvent.VK_P);

 		robot.keyRelease(KeyEvent.VK_SHIFT);
 		robot.keyRelease(KeyEvent.VK_CONTROL);
 		robot.keyRelease(KeyEvent.VK_P);
 		
 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		
	}
	private void ReBack() throws AWTException {
		 Robot robot = new Robot();
	 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.keyPress(KeyEvent.VK_CONTROL);
	 		robot.keyPress(KeyEvent.VK_LEFT);

	 		robot.keyRelease(KeyEvent.VK_SHIFT);
	 		robot.keyRelease(KeyEvent.VK_CONTROL);
	 		robot.keyRelease(KeyEvent.VK_LEFT);
	 		
	 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
	 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		
	}
	private void ReFrwrd() throws AWTException {
		Robot robot = new Robot();
 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
 		robot.keyPress(KeyEvent.VK_SHIFT);
 		robot.keyPress(KeyEvent.VK_CONTROL);
 		robot.keyPress(KeyEvent.VK_RIGHT);

 		robot.keyRelease(KeyEvent.VK_SHIFT);
 		robot.keyRelease(KeyEvent.VK_CONTROL);
 		robot.keyRelease(KeyEvent.VK_RIGHT);
 		
 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
	}
	void Playstop() throws AWTException{
		 Robot robot = new Robot();
 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
 		robot.keyPress(KeyEvent.VK_SHIFT);
 		robot.keyPress(KeyEvent.VK_RIGHT);

 		robot.keyRelease(KeyEvent.VK_SHIFT);
 		robot.keyRelease(KeyEvent.VK_RIGHT);
 		
 		System.out.println("playstop");
 		
 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
	}
	void hideShow() throws AWTException{
		Robot robot = new Robot();
	 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.keyPress(KeyEvent.VK_CONTROL);
	 		robot.keyPress(KeyEvent.VK_H);

	 		robot.keyRelease(KeyEvent.VK_SHIFT);
	 		robot.keyRelease(KeyEvent.VK_CONTROL);
	 		robot.keyRelease(KeyEvent.VK_H);

	 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
	 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
	}
	void prevTrack() throws AWTException{
		Robot robot = new Robot();
	 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.keyPress(KeyEvent.VK_UP);

	 		robot.keyRelease(KeyEvent.VK_SHIFT);
	 		robot.keyRelease(KeyEvent.VK_UP);
	 		
	 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
	 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
	}
	void nextTrack() throws AWTException{
		Robot robot = new Robot();
	 		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.keyPress(KeyEvent.VK_DOWN);

	 		robot.keyRelease(KeyEvent.VK_SHIFT);
	 		robot.keyRelease(KeyEvent.VK_DOWN);

	 		robot.keyPress(KeyEvent.VK_NUM_LOCK);
	 		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
	}
}
