package work;

public class Player {
 private String name;
 private int hp;
 private int attack;
public Player(String name,int hp,int attack){//���캯������ʼ��ֵ
	this.name=name;
	this.hp=hp;
	this.attack=attack;
}
    public void setName(String name) {//��ȡֵ
	   
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
     *������Ϊ��
     *player Ϊ��������
     ***/
     public void hit(Player player){
    	 //����Ķ���Ѫ��=Ѫ��-���˹�������
    	player.hp=player.hp-this.attack;
    	if(player.hp<0){
    		player.hp=0;
    	System.out.println(this.name+"������"+player.name+"�����"+attack+"���˺�."+player.name+"��ʣ�¶�ɳ"+player.hp+"Ѫ��");
    	}
     }
}

