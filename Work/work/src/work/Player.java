package work;

public class Player {
 private String name;
 private int hp;
 private int attack;
public Player(String name,int hp,int attack){//构造函数，初始化值
	this.name=name;
	this.hp=hp;
	this.attack=attack;
}
    public void setName(String name) {//获取值
	   
   this.name=name;	
}
    public String getName(){
	return name;
}
    public void setHp(int hp){
    	this.hp=hp;
    }
    public int getHp(){
    	return hp;
    }
     public void setAttack(int attack){
    	 this.attack=attack;
     }
     public int getAttack(){
    	 return attack;
     }/**
     *
     *攻击行为、
     *player 为攻击对象
     ***/
     public void hit(Player player){
    	 //被打的对象（血量=血量-本人攻击力）
    	player.hp=player.hp-this.attack;
    	if(player.hp<0){
    		player.hp=0;
    	System.out.println(this.name+"攻击了"+player.name+"打出了"+attack+"点伤害."+player.name+"还剩下多沙"+player.hp+"血量");
    	}
     }
}

