package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame_1 {

	public Frame_1() {
		// TODO 自动生成的构造函数存根
	}
   public static void main(String[] args) {
	Frame f=new Frame("我的第一个gui窗体");
	f.setLayout(new FlowLayout());
	Button b=new Button("确定！");
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
		System.exit(0);
		}
	});
	f.add(b);
	f.setBounds(500, 200, 500, 300);
	f.addWindowListener(new WindowListener(){

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO 自动生成的方法存根
			System.exit(0);;
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
	});
	f.setVisible(true);
	
}
}
