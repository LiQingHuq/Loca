package assa;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author KOHB
 */
public class TimeFrame {
    private JFrame jf;
    private JLabel label1;
    private JLabel label2;
    public TimeFrame(){
        jf = new JFrame("倒计时牌");
        label1 = new JLabel("距您年薪达到80万还有：");
        label2 = new JLabel("");
        jf.add(label1,BorderLayout.NORTH);
        jf.add(label2,BorderLayout.CENTER);
        Thread t = new RefreshTimeFrameThread(new GregorianCalendar(1997,Calendar.OCTOBER,1,0,0,0));
        t.start();
    }
    
    
    public void showMe(){
        jf.setBounds(200,200,300,150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args){
        new TimeFrame().showMe();
    }

    
    
    class RefreshTimeFrameThread extends Thread{
        private Calendar targetTime;
        public RefreshTimeFrameThread(Calendar targetTime)
        {
            this.targetTime = targetTime;
        }
        
        
        @Override
        public void run(){
            while(true){
                Calendar todayTime = new GregorianCalendar();
                long seconds = (targetTime.getTimeInMillis() - todayTime.getTimeInMillis())/1000;
                if (seconds <= 0){
                    label2.setText("时间到！");
                    break;
                }
                int day = (int) (seconds/(24 * 60 * 60));
                int hour = (int) (seconds/(60 * 60) % 24);
                int min = (int) (seconds/60 % 60);
                int sec = (int) (seconds % 60);
                String str = day + "天" + hour + "时" + min + "分" + sec + "秒";
                label2.setText(str);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        
        }
    }
}
