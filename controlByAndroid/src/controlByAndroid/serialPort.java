package controlByAndroid;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class serialPort {
	
	private  SerialPort serialPort;
	 String message;
	 
	serialPort(String port){
		
		serialPort = new SerialPort(port);
		try{
		//��������� ����
        serialPort.openPort();
        //���������� ���������
        serialPort.setParams(SerialPort.BAUDRATE_9600,
                             SerialPort.DATABITS_8,
                             SerialPort.STOPBITS_1,
                             SerialPort.PARITY_NONE);
        //�������� ���������� ���������� �������
        serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | 
                                      SerialPort.FLOWCONTROL_RTSCTS_OUT);
        
        //������������� ����� ������� � �����
        serialPort.addEventListener(new PortReader(), SerialPort.MASK_RXCHAR);
        //���������� ������ ����������  
        //serialPort.writeString("Get data");
    }
    catch (SerialPortException ex) {
        System.out.println(ex);
    }
		
	}
	public String getMsg(){
		return message;
	}
	
	 private class PortReader implements SerialPortEventListener {

	        public void serialEvent(SerialPortEvent event) {
	            if(event.isRXCHAR() && event.getEventValue() > 0){
	                try {
	                    //�������� ����� �� ����������, ������������ ������ � �.�.
	                    String data = serialPort.readString(event.getEventValue());
	                    message=data;
	                    //System.out.println(data);
	                    
	                   // serialPort.writeString("Get data");
	                    if(data!=null){
	                    new hotKeys(data);
	                    }
	                }
	                catch (SerialPortException | AWTException ex) {
	                    System.out.println(ex);
	                }
	            }
	        }
	    }

}
