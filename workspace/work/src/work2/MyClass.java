package work2;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
		// ����һ��List����װ����
		 private List<Student> stuList;
		 
	     public MyClass(){
		    stuList=new ArrayList<Student>();//����һ��stu����
	     }
	     	     	    
	     public boolean isHere(Student stu){//��װ�ж�һ�����ķ���
	    	 boolean is=false;
	    	 for(Student s:stuList){//����for each 
	    		 if(stu.getId().equals(s.getId()))//�����ﴫ��Ķ�������=�����Ķ������ݣ�����ڣ����򲻴���
	    			 is=true;
	    	 }
	    	 return is;//�����ж�
	     }
	         
	     public boolean add(Student stu){
	    	 //�����ж��Ƿ����
	        boolean is=this.isHere(stu);
	        if(!is){
	        	stuList.add(stu);
	    	 }
	        return !is;
	        }
	     
	    public boolean upDate(Student stu){
	    	//�����ж��Ƿ����
	    boolean is=false;
	    for(Student s:stuList){
	    if(stu.getId().equals(s.getId())){
	    	stuList.remove(s);
	       stuList.add(stu);
	       is=true;
	       break;
	       }
	   }
	    return is;
	  }
	    
	    public boolean delete(String id){
		    boolean isSuc=false;
		    for(Student s:stuList){
		    if(id.equals(s.getId())){
		    	stuList.remove(s);
		    	isSuc=true;
		        }
		    }
		    return isSuc;
	    }
	    	    
	    public List<Student> query(){
	    	return this.stuList;
	    
	
}
}
