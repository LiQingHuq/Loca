package work;

import java.util.Scanner;
/**
 * @author 游戏
 *
 */
public class Game {
      Scanner sc=new Scanner(System.in);
      
       // 从控制台接受数据并且封装成一个玩家对象
       
	public Player enter(String player) {//封装玩家信息
		System.out.println("输入"+player+"姓名");
		String name=sc.next();
		System.out.println("输入"+player+"血量");
		int hp=sc.nextInt();
		System.out.println("输入"+player+"攻击力");
		int attack=sc.nextInt();
		Player backPlayer=new Player(name, hp,attack);
		return backPlayer;
		}
    public void start() {
	   //从封装好的函数中输入玩家的信息
	   Player player1=this.enter("玩家一");
	   Player player2=this.enter("玩家二");
	   boolean go=true;
	   while(go){
		   //玩家一打了玩家二
	   player1.hit(player2);
	   if(player2.getHp()<0){
		  
	   System.out.println(player1.getName()+"ko了"+player2.getName()+"游戏结束!fighting！！！！！！！！！！");
	   break;
	   }
		   //玩家二打了玩家一
	     player2.hit(player1);
	   if(player1.getHp()<0){
	  
	   System.out.println(player2.getName()+"ko了"+player1.getName()+"游戏结束!fighting！！！！！！！！！！");
	   go=false;
	   }
	   }
}
	public static void main(String[] args) {
	   Game game=new Game();
	   game.start();
}
}
