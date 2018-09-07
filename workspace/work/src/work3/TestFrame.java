package work3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame extends JFrame {
   private JTextField jText;
   private JButton jBt;
   //监听器
   private ActionListener listenner=new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		String text=jText.getText();
	    System.out.println(text);
	};
};
	public TestFrame() {
		// 设置界面的位置与大小
		this.setBounds(100,100,300,200);
		//设置界面的标题
		this.setTitle("我的界面");
		//设置内部布局
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		//添加控件的方法一定要在显示前面
		this.addComponent();
		//设置可见性
		this.setVisible(true);
	}
	private void addComponent() {
		// 文本框
		jText=new JTextField();
		jText.setBounds(2, 2, 100, 25);
		this.add(jText);
		//按钮
		jBt=new JButton("确定");
		jBt.setBounds(105, 2,80, 25);
		//绑定监听器
		jBt.addActionListener(listenner);
		this.add(jBt);
	}
	public static void main(String[] args) {
	   TestFrame ft=new TestFrame();
	}
	

}
