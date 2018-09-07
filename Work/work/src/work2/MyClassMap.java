package work2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyClassMap {
	    private Map<String, Student> stuMap;
		public MyClassMap(){
		stuMap=new HashMap<String, Student>();
		}
		public boolean add(Student stu){
			boolean isSuc=false;
			if(!stuMap.containsKey(stu.getId())){
				stuMap.put(stu.getId(), stu);
				isSuc=true;
			}
			return isSuc;
		}
	   public boolean update(Student stu){
		   boolean isSuc=false;
		   if(stuMap.containsKey(stu.getId())){
			   stuMap.put(stu.getId(), stu);
			   isSuc=true;
		   }
		   return isSuc;
	   }
	   public boolean delete(String id){
		   boolean isSuc=false;
		   if(stuMap.containsKey(id)){
			   stuMap.remove(id);
			   isSuc=true;
		   }
		   return isSuc;
	   }
	   public Collection<Student> query(){
		   return stuMap.values();
	   }
}
