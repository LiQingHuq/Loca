package work;

import java.util.Scanner;
/**
 * @author ��Ϸ
 *
 */
public class Game {
      Scanner sc=new Scanner(System.in);
      
       // �ӿ���̨�������ݲ��ҷ�װ��һ����Ҷ���
       
	public Player enter(String player) {//��װ�����Ϣ
		System.out.println("����"+player+"����");
		String name=sc.next();
		System.out.println("����"+player+"Ѫ��");
		int hp=sc.nextInt();
		System.out.println("����"+player+"������");
		int attack=sc.nextInt();
		Player backPlayer=new Player(name, hp,attack);
		return backPlayer;
		}
    public void start() {
	   //�ӷ�װ�õĺ�����������ҵ���Ϣ
	   Player player1=this.enter("���һ");
	   Player player2=this.enter("��Ҷ�");
	   boolean go=true;
	   while(go){
		   //���һ������Ҷ�
	   player1.hit(player2);
	   if(player2.getHp()<0){
		  
	   System.out.println(player1.getName()+"ko��"+player2.getName()+"��Ϸ����!fighting��������������������");
	   break;
	   }
		   //��Ҷ��������һ
	     player2.hit(player1);
	   if(player1.getHp()<0){
	  
	   System.out.println(player2.getName()+"ko��"+player1.getName()+"��Ϸ����!fighting��������������������");
	   go=false;
	   }
	   }
}
	public static void main(String[] args) {
	   Game game=new Game();
	   game.start();
}
}
