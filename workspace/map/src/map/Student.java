package map;

public class Student {
	     private String id;
	     private int tell;
	     private String name;
		/**
		 * 初始化数据
		 */
		public Student(String id,int tell,String name) {//构造函数赋初值
			// TODO 自动生成的构造函数存根
			this.id=id;
			this.tell=tell;
			this.name=name;
		}

		/**
		 * 
		 * @param 传入数据set与get方法，数据的安全性，给了方法自己传入数据
		 */
		
		public void setId(String id){
			this.id=id;
		}
		public void setTell(int tell){
			this.tell=tell;
		}
		public void setName(String name){
			this.name=name;
		}
	    public String getId(){
	    	return id;
	    }
	    public int geiTell(){
	    	return tell;
	    }
	    public String geiName(){
	    	return name;
	    }
}
