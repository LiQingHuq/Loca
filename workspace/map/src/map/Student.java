package map;

public class Student {
	     private String id;
	     private int tell;
	     private String name;
		/**
		 * ��ʼ������
		 */
		public Student(String id,int tell,String name) {//���캯������ֵ
			// TODO �Զ����ɵĹ��캯�����
			this.id=id;
			this.tell=tell;
			this.name=name;
		}

		/**
		 * 
		 * @param ��������set��get���������ݵİ�ȫ�ԣ����˷����Լ���������
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
