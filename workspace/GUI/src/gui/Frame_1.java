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
		// TODO �Զ����ɵĹ��캯�����
	}
   public static void main(String[] args) {
	Frame f=new Frame("�ҵĵ�һ��gui����");
	f.setLayout(new FlowLayout());
	Button b=new Button("ȷ����");
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
		System.exit(0);
		}
	});
	f.add(b);
	f.setBounds(500, 200, 500, 300);
	f.addWindowListener(new WindowListener(){

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO �Զ����ɵķ������
			System.exit(0);;
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO �Զ����ɵķ������
			
		}
		
	});
	f.setVisible(true);
	
}
}
