package work3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainFrame extends JFrame{

	 JScrollPane jScoll;//��ӹ�����
	 JTable jTable;//���Table�ؼ�
	 JLabel jlabelId,jLabelName,jLabelPhone;//�������ֿؼ�
	 JTextField jTextFileId, jTextFileName, jTextFilePhone;//�����ı���
	 private JButton jButtonAdd,jButtonUpdata,jButtonDelete;//������ť�ؼ�
	 private MyClassMap mc;
	
	public MainFrame(){
		mc=new MyClassMap();
		try {
			read();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setTitle("ѧ������");//���ñ���
		this.setBounds(300,150, 500,400);//���ô�Сλ��
		this.setResizable(false);//�ɵ����ԣ�Ϊtrue���ǿɵ�����,faluse�ǹ̶���
		this.setLayout(null);//���ò���Ϊ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ������ĳ�ַ���
		this.addComponent();//�Լ�д����ӿؼ���һ������
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				try {
					write();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.setVisible(true);//�ɼ���
	}
	//��ȡ�ĵ�����
	public void read() throws Exception{
		File file=new File("E:/2");
		if(file.exists()){
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:/2"));
			mc.setStuMap((Map<String, student>) ois.readObject());
			ois.close();
		}
	   }
//д���ĵ�����
		public void write() throws Exception{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:/2"));
			oos.writeObject(mc.getStuMap());
			oos.flush();
			oos.close();
			
		}
	//������Ϣ�������Ϣ��data��
	public void showdata(){
		Vector<String> col=new Vector<String>();
		col.add("ѧ��");
		col.add("����");
		col.add("�绰");
		
		Vector<Vector<String>> data=mc.query();
		TableModel tm=new DefaultTableModel(data,col);//������Ϣ�ͱ�ͷ
		jTable.setModel(tm);
	}
	//���ı����Ϊ��
	public void textToNull(){
		jTextFileId.setText("");
		jTextFileName.setText("");
		jTextFilePhone.setText("");
	}
	/**
	 * ��ӿؼ�
	 */
	public void addComponent(){
		
		
		
		 jTable=new JTable();
		 this.showdata();
		jTable.addMouseListener(new mouseAdapter(this));
		 //jTable.setModel(tm);//дshowdataʱɾ�������
	   //jTable.setBounds(2, 2, 490, 200);//���ñ����
		 jScoll=new JScrollPane(jTable);
		 jScoll.setBounds(2, 2, 490, 200);
		 this.add(jScoll);//ʲô��˼,���jscoll�ؼ�,���������Jtable�ؼ�
		 
		 jlabelId=new JLabel("ѧ��");
		 jlabelId.setBounds(10, 220, 40, 30);
		 this.add(jlabelId);
		 
		 jTextFileId=new JTextField();
		 jTextFileId.setBounds(40, 220, 100,30);
		 this.add(jTextFileId);
		 
		 jLabelName=new JLabel("����");
		 jLabelName.setBounds(170, 220, 40, 30);
		 this.add(jLabelName);
		 
		 jTextFileName=new JTextField();
		 jTextFileName.setBounds(200, 220, 100,30);
		 this.add(jTextFileName);
		 
		 
		 jLabelPhone=new JLabel("�绰");
		 jLabelPhone.setBounds(330, 220, 40, 30);
		 this.add(jLabelPhone);
		 
		 jTextFilePhone=new JTextField();
		 jTextFilePhone.setBounds(360, 220, 100,30);
		 this.add(jTextFilePhone);
		 
		 jButtonAdd=new JButton("���");
		 jButtonAdd.setBounds(60, 260, 80, 20);
		 jButtonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// д��classmap
				String id=jTextFileId.getText();
				String name=jTextFileName.getText();
				String phone=jTextFilePhone.getText();
				student stu=new student(id, name, phone);
			    boolean isSuc=mc.add(stu);
			    if(isSuc==false){
			    	JOptionPane.showMessageDialog(MainFrame.this, "���ʧ��");
			    }
			    else{
			    	JOptionPane.showMessageDialog(MainFrame.this, "��ӳɹ�");
			    }
			    //��ʾjtable���µ�����
				showdata();
				textToNull();
			}
		});
		 this.add(jButtonAdd);
		 
		 jButtonUpdata=new JButton("�޸�");
		 jButtonUpdata.setBounds(220, 260, 80, 20);
		 jButtonUpdata.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �޸���Ϣ
				String id=jTextFileId.getText();
				String name=jTextFileName.getText();
				String phone=jTextFilePhone.getText();
				student stu=new student(id, name, phone);
                mc.update(stu);
				showdata();
				jTextFileId.setEditable(true);
				textToNull();
			}
		});
		 this.add(jButtonUpdata);
		 
		 jButtonDelete=new JButton("ɾ��");
		 jButtonDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ɾ��ѧ����Ϣ
				String id=jTextFileId.getText().trim();
				mc.delete(id);
				showdata();
				textToNull();
			}
		});
		 jButtonDelete.setBounds(380, 260, 80, 20);
		 this.add(jButtonDelete);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame mf=new MainFrame();
	}

}
