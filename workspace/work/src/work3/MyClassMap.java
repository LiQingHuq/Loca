package work3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MyClassMap {

	private Map<String, student> StuMap;
	
	public MyClassMap(){
		StuMap=new HashMap<String,student>();
	}
	
	public Map<String, student> getStuMap() {
		return StuMap;
	}

	public void setStuMap(Map<String, student> stuMap) {
		StuMap = stuMap;
	}

	public boolean add(student stu){
		boolean isSuc=false;
		if(!StuMap.containsKey(stu.getId())){
			StuMap.put(stu.getId(),stu);
			isSuc=true;
		}
		return isSuc;
	}
	
	public boolean update(student stu){
		boolean isSuc=false;
		if(StuMap.containsKey(stu.getId())){
			StuMap.put(stu.getId(), stu);
			isSuc=true;
		}
		return isSuc;
	}
	
	public boolean delete(String id){
		boolean isSuc=false;
		if(StuMap.containsKey(id)){
			StuMap.remove(id);
			isSuc=true;
		}
		return isSuc;
	}
	public Vector<Vector<String>> query(){
		Collection<student> stulist=StuMap.values();//��ȡstumap�����������ڱ���
		Vector<Vector<String>> data=new Vector<Vector<String>>();//���ص���������
		if(stulist!=null){
			for(student stu:stulist){
				Vector<String> row=new Vector<String>();//
				row.add(stu.getId());//��ÿһ��ѧ��������Ϣ����ȡ������ӵ�vector�У����һ�������ļ�¼
				row.add(stu.getName());
				row.add(stu.getPhone());
				data.add(row);//��һ����¼��ӵ�data��
			}
		}
		return data;
		
		
	}
	
}
