package work2;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
		// 建立一个List容器装数据
		 private List<Student> stuList;
		 
	     public MyClass(){
		    stuList=new ArrayList<Student>();//建立一个stu对象
	     }
	     	     	    
	     public boolean isHere(Student stu){//封装判断一个数的方法
	    	 boolean is=false;
	    	 for(Student s:stuList){//遍历for each 
	    		 if(stu.getId().equals(s.getId()))//容器里传入的对象数据=遍历的对象数据，则存在，否则不存在
	    			 is=true;
	    	 }
	    	 return is;//返回判断
	     }
	         
	     public boolean add(Student stu){
	    	 //首先判断是否存在
	        boolean is=this.isHere(stu);
	        if(!is){
	        	stuList.add(stu);
	    	 }
	        return !is;
	        }
	     
	    public boolean upDate(Student stu){
	    	//首先判断是否存在
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
