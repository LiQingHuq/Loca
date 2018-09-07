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
		// TODO 自动生成的构造函数存根
		ketdown();
	}
	
	
	private void ketdown() {
		// TODO 自动生成的方法存根
		
		f=new Frame("按下键盘");
		f.setBounds(500,250,600,400);
		f.setLayout(new FlowLayout());
		tf=new  TextField(25);
		f.add(tf);
		f.setVisible(true);
		
		Start();
	}


	private void Start() {
		// TODO 自动生成的方法存根
		f.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
			
		});
		
		tf.addKeyListener(new KeyAdapter(){
     int i=0;
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				i++;
				System.out.println("InputTimes:"+i);
			}
			
		});
	}


	public static void main(String[] args) {
	new KeyBoard();	
	}

}
