package lei;

public class Me {
  public static void main(String[] args) {
   Student stu1=new Student();
   stu1.setName("���໪");
   stu1.setAge(21);
 System.out.println(stu1.getName()+"������Ϊ"+stu1.getAge());
  /* stu1.id="201612052474";
   stu1.age=21;
   stu1.name="���໪";
   stu1.watch();*/
   Student stu2=new Student();
   /*stu2.name="�����";*/
   stu2.setAge(19);
   stu2.setId("201612052474");
   stu2.setName("�����");
   stu2.love();
   
}
}