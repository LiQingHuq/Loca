package gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyBoard {

	
	private Frame f;
	private TextField tf;
	
	public KeyBoard() {
		// TODO �Զ����ɵĹ��캯�����
		ketdown();
	}
	
	
	private void ketdown() {
		// TODO �Զ����ɵķ������
		
		f=new Frame("���¼���");
		f.setBounds(500,250,600,400);
		f.setLayout(new FlowLayout());
		tf=new  TextField(25);
		f.add(tf);
		f.setVisible(true);
		
		Start();
	}


	private void Start() {
		// TODO �Զ����ɵķ������
		f.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
			
		});
		
		tf.addKeyListener(new KeyAdapter(){
     int i=0;
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				i++;
				System.out.println("InputTimes:"+i);
			}
			
		});
	}


	public static void main(String[] args) {
	new KeyBoard();	
	}

}
