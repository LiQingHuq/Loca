package work3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame extends JFrame {
   private JTextField jText;
   private JButton jBt;
   //������
   private ActionListener listenner=new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		String text=jText.getText();
	    System.out.println(text);
	};
};
	public TestFrame() {
		// ���ý����λ�����С
		this.setBounds(100,100,300,200);
		//���ý���ı���
		this.setTitle("�ҵĽ���");
		//�����ڲ�����
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		//��ӿؼ��ķ���һ��Ҫ����ʾǰ��
		this.addComponent();
		//���ÿɼ���
		this.setVisible(true);
	}
	private void addComponent() {
		// �ı���
		jText=new JTextField();
		jText.setBounds(2, 2, 100, 25);
		this.add(jText);
		//��ť
		jBt=new JButton("ȷ��");
		jBt.setBounds(105, 2,80, 25);
		//�󶨼�����
		jBt.addActionListener(listenner);
		this.add(jBt);
	}
	public static void main(String[] args) {
	   TestFrame ft=new TestFrame();
	}
	

}
