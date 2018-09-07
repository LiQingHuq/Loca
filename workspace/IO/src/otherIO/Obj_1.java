package otherIO;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Obj_1 {

	public Obj_1() {
		// TODO 自动生成的构造函数存根
	}
      public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		File f=new File("obj.object");
		//write(f);
		read(f);
	}
    private static void read(File f) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
    	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
	while(true){
		try{
    	Person p=(Person)ois.readObject();    	
		System.out.println("姓名\t"+p.getName()+"\t年龄：\t"+p.getAge()+"\t学号\t"+p.getId());
		}
		catch(Exception e){
			continue;
		}
		
		}
	} 
	public static void   write(File f) throws IOException{
    	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
  		oos.writeObject(new Person("清华大咖",12,22));
  		oos.writeObject(new Person("清华小咖",15,29));
  		oos.writeObject(new Person("清华卡卡",52,25));
  		oos.writeObject(new Person("清华大打",12,27));
  		oos.close();
      }
}
