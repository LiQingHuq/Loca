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

	 JScrollPane jScoll;//添加滚动条
	 JTable jTable;//添加Table控件
	 JLabel jlabelId,jLabelName,jLabelPhone;//三个文字控件
	 JTextField jTextFileId, jTextFileName, jTextFilePhone;//三个文本框
	 private JButton jButtonAdd,jButtonUpdata,jButtonDelete;//三个按钮控件
	 private MyClassMap mc;
	
	public MainFrame(){
		mc=new MyClassMap();
		try {
			read();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setTitle("学生管理");//设置标题
		this.setBounds(300,150, 500,400);//设置大小位置
		this.setResizable(false);//可调整性，为true是是可调整的,faluse是固定的
		this.setLayout(null);//设置布局为空
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体时启动的某种服务
		this.addComponent();//自己写的添加控件的一个方法
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
		this.setVisible(true);//可见性
	}
	//读取文档数据
	public void read() throws Exception{
		File file=new File("E:/2");
		if(file.exists()){
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:/2"));
			mc.setStuMap((Map<String, student>) ois.readObject());
			ois.close();
		}
	   }
//写入文档数据
		public void write() throws Exception{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:/2"));
			oos.writeObject(mc.getStuMap());
			oos.flush();
			oos.close();
			
		}
	//更新信息，添加信息到data中
	public void showdata(){
		Vector<String> col=new Vector<String>();
		col.add("学号");
		col.add("姓名");
		col.add("电话");
		
		Vector<Vector<String>> data=mc.query();
		TableModel tm=new DefaultTableModel(data,col);//所有信息和表头
		jTable.setModel(tm);
	}
	//将文本框变为空
	public void textToNull(){
		jTextFileId.setText("");
		jTextFileName.setText("");
		jTextFilePhone.setText("");
	}
	/**
	 * 添加控件
	 */
	public void addComponent(){
		
		
		
		 jTable=new JTable();
		 this.showdata();
		jTable.addMouseListener(new mouseAdapter(this));
		 //jTable.setModel(tm);//写showdata时删除该语句
	   //jTable.setBounds(2, 2, 490, 200);//设置表格宽度
		 jScoll=new JScrollPane(jTable);
		 jScoll.setBounds(2, 2, 490, 200);
		 this.add(jScoll);//什么意思,添加jscoll控件,里面包含了Jtable控件
		 
		 jlabelId=new JLabel("学号");
		 jlabelId.setBounds(10, 220, 40, 30);
		 this.add(jlabelId);
		 
		 jTextFileId=new JTextField();
		 jTextFileId.setBounds(40, 220, 100,30);
		 this.add(jTextFileId);
		 
		 jLabelName=new JLabel("姓名");
		 jLabelName.setBounds(170, 220, 40, 30);
		 this.add(jLabelName);
		 
		 jTextFileName=new JTextField();
		 jTextFileName.setBounds(200, 220, 100,30);
		 this.add(jTextFileName);
		 
		 
		 jLabelPhone=new JLabel("电话");
		 jLabelPhone.setBounds(330, 220, 40, 30);
		 this.add(jLabelPhone);
		 
		 jTextFilePhone=new JTextField();
		 jTextFilePhone.setBounds(360, 220, 100,30);
		 this.add(jTextFilePhone);
		 
		 jButtonAdd=new JButton("添加");
		 jButtonAdd.setBounds(60, 260, 80, 20);
		 jButtonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 写入classmap
				String id=jTextFileId.getText();
				String name=jTextFileName.getText();
				String phone=jTextFilePhone.getText();
				student stu=new student(id, name, phone);
			    boolean isSuc=mc.add(stu);
			    if(isSuc==false){
			    	JOptionPane.showMessageDialog(MainFrame.this, "添加失败");
			    }
			    else{
			    	JOptionPane.showMessageDialog(MainFrame.this, "添加成功");
			    }
			    //显示jtable更新的数据
				showdata();
				textToNull();
			}
		});
		 this.add(jButtonAdd);
		 
		 jButtonUpdata=new JButton("修改");
		 jButtonUpdata.setBounds(220, 260, 80, 20);
		 jButtonUpdata.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 修改信息
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
		 
		 jButtonDelete=new JButton("删除");
		 jButtonDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 删除学生信息
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
