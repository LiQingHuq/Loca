package lei;

public class Me {
  public static void main(String[] args) {
   Student stu1=new Student();
   stu1.setName("李青华");
   stu1.setAge(21);
 System.out.println(stu1.getName()+"的年龄为"+stu1.getAge());
  /* stu1.id="201612052474";
   stu1.age=21;
   stu1.name="李青华";
   stu1.watch();*/
   Student stu2=new Student();
   /*stu2.name="李承敏";*/
   stu2.setAge(19);
   stu2.setId("201612052474");
   stu2.setName("李承敏");
   stu2.love();
   
}
}