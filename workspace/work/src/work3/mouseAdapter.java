package work3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseAdapter implements MouseListener {

    MainFrame mf;
    public  mouseAdapter(MainFrame mf) {
		// TODO Auto-generated constructor stub
    	this.mf=mf;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//点击时获取信息
		int row=mf.jTable.getSelectedRow();
	    String id=(String)mf.jTable.getValueAt(row, 0);
	    String name=(String)mf.jTable.getValueAt(row, 1);
	    String phone=(String)mf.jTable.getValueAt(row, 2);
		mf.jTextFileId.setText(id);
		mf.jTextFileName.setText(name);
		mf.jTextFilePhone.setText(phone);
		mf.jTextFileId.setEditable(false);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

