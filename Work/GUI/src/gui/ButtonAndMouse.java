package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonAndMouse {

	private Frame f;
	private Button b1,b2;
	private TextField tf;
	public ButtonAndMouse() {
		// TODO 自动生成的构造函数存根
		Start();
		
	}
		
	private  void Start() {
		// TODO 自动生成的方法存根
		f=new Frame("你好世界！");
		
		b1=new Button("click");
		
		b2=new Button("move");
		
		tf=new TextField(35);
		
		f.setBounds(500,250,600,400);
		f.setLayout(new FlowLayout());
        f.add(tf);
        f.add(b1);
        f.add(b2);
		f.setVisible(true);
		
		dfclick();
	}
	
	private void dfclick() {
		
		
		// TODO 自动生成的方法存根
		b1.addActionListener(new ActionListener() {
			int count=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				count++;
				System.out.println("mouseClickActionTime:"+count);
			}
		});
		
		
		
	   b1.addMouseListener(new MouseAdapter() {
       int count=0;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO 自动生成的方法存根
			count++;
			tf.setText("mouseClickTime:"+count);
			System.out.println("mouseClickTime:"+count);
		 }		 
	   });
	 
	   
	   
	    b2.addMouseListener(new MouseAdapter(){
        int count=0;

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			count++;
			tf.setText("mouseMoveTime:"+count);
			System.out.println("mouseMoveTime:"+count);
		}

	
		 
		  
	    });
	 
		f.addWindowListener(new WindowListener() {
			
		
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
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
	}
	

	public static void main(String[] args) {
		new ButtonAndMouse();
	}
}
