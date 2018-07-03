package calc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 {

    TextField tf = new TextField(40);       //显示文本框
    StringBuffer s1 = new StringBuffer();   //记录运算数字，以及保留结果
    StringBuffer s2 = new StringBuffer();   //记录运算数字，保留上一个输入的数字或运算结果
    static String flag = new String();      //标记运算符号：+，-，*，/
    boolean start = true;   //标记运算开始或结束,保证一次运算之后，第二次进行运算时能同时清空显示界面，即s1为空

    public void init(){
        //主界面
        JFrame f = new JFrame("计算器");
        JPanel p1 = new JPanel();
        p1.add(tf);
        f.add(p1,BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3));
        //动作监听器
        ActionListener listen =new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

            	System.out.println(arg0.getActionCommand());
                //输入数字0~9
                if(arg0.getActionCommand()=="0"){

                    if(!s1.toString().equals(new String())){
                        if(!start){
                            //s1清零，保证可以重新输入数字
                            s1.delete(0, s1.length());
                        }
                        start = true;
                        tf.setText(s1.append("0").toString());
                    }   
                }
                if(arg0.getActionCommand()=="1"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("1").toString());
                }
                if(arg0.getActionCommand()=="2"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("2").toString());
                }
                if(arg0.getActionCommand()=="3"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("3").toString());
                }
                if(arg0.getActionCommand()=="4"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("4").toString());
                }
                if(arg0.getActionCommand()=="5"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("5").toString());
                }
                if(arg0.getActionCommand()=="6"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("6").toString());
                }
                if(arg0.getActionCommand()=="7"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("7").toString());
                }
                if(arg0.getActionCommand()=="8"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("8").toString());
                }
                if(arg0.getActionCommand()=="9"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    tf.setText(s1.append("9").toString());
                }
                //输入小数点
                if(arg0.getActionCommand()=="."){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start=true;
                    if(s1.toString().equals(new String()))
                        tf.setText(s1.append("0.").toString());
                    else if(s1.length()==1&&s1.charAt(0)=='-')
                        tf.setText(s1.append("0.").toString());
                    else
                        tf.setText(s1.append(".").toString());
                }
                //输入负号
                if(arg0.getActionCommand()=="+/-"){
                    if(!start){
                        s1.delete(0, s1.length());
                    }
                    start = true;
                    if(s1.toString().equals(new String()))
                        tf.setText(s1.append('-').toString());
                }
                //退格Backspace
                if(arg0.getActionCommand()=="Backspace"){
                    start = true;
                    if(s1.length()!=0){
                        //删除最后输入的一位
                        s1.deleteCharAt(s1.length()-1);
                        tf.setText(s1.toString());
                    }
                }
                //归零CE
                if(arg0.getActionCommand()=="CE"){
                    //清空所有，start标记设为true
                    start = true;
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    tf.setText(s1.toString());
                }
                //清除C
                if(arg0.getActionCommand()=="C"){
                    //清空当前输入，即s1清零
                    start = true;
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //加号
                if(arg0.getActionCommand()=="+"){
                    start = true;
                    flag="+";
                    //s2接收s1的值
                    s2.append(String.valueOf(s1.toString()));
                    //s1清零，重新接收下一个数据
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //减号
                if(arg0.getActionCommand()=="-"){
                    start = true;
                    flag="-";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //乘号
                if(arg0.getActionCommand()=="*"){
                    start = true;
                    flag="*";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //除号
                if(arg0.getActionCommand()=="/"){
                    start = true;
                    flag="/";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s1.toString());
                }
                //开根号
                if(arg0.getActionCommand()=="sqrt"){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                tf.setText(s1.append(String.valueOf(Math.sqrt(s))).toString());
                }
                //求%
                if(arg0.getActionCommand()=="%"){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                    tf.setText(s1.append(String.valueOf(s/100)).toString());
                }
                //求1/x
                if(arg0.getActionCommand()=="1/x"&&!s1.toString().equals(new String())&&Double.parseDouble(s1.toString())!=0){
                    start =false;
                    double s=Double.parseDouble(s1.toString());
                    s1.delete(0, s1.length());
                    tf.setText(s1.append(String.valueOf(1/s)).toString());
                }
                //求结果
                if(arg0.getActionCommand()=="="&&s1.length()!=0&&s2.length()!=0){
                    //start标记为false
                    start =false;
                    //分别获取s1和s2的值
                    double s4=Double.parseDouble(s1.toString()); 
                    double s3=Double.parseDouble(s2.toString());
                    //清空s1和s2，便于开始下一次运算
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    //四则运算
                    if(flag=="+"){
                        tf.setText(s1.append(String.valueOf(s3+s4)).toString());
                    }
                    if(flag=="-"){
                        tf.setText(s1.append(String.valueOf(s3-s4)).toString());
                    }
                    if(flag=="*"){
                        tf.setText(s1.append(String.valueOf(s3*s4)).toString());
                    }
                    if(flag=="/"){
                        tf.setText(s1.append(String.valueOf(s3/s4)).toString());
                    }
                }       

            }
        };
        //添加按钮以及监听器
        JButton bks = new JButton("Backspace");
        bks.addActionListener(listen);
        JButton ce = new JButton("CE");
        ce.addActionListener(listen);
        JButton c = new JButton("C");
        c.addActionListener(listen);
        p2.add(bks);
        p2.add(ce);
        p2.add(c);
        f.add(p2);
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,5));
        JButton b1 = new JButton("7");
        p3.add(b1);
        b1.addActionListener(listen);
        JButton b2 = new JButton("8");
        p3.add(b2);
        b2.addActionListener(listen);
        JButton b3 = new JButton("9");
        p3.add(b3);
        b3.addActionListener(listen);
        JButton b4 = new JButton("/");
        p3.add(b4);
        b4.addActionListener(listen);
        JButton b5 = new JButton("sqrt");
        p3.add(b5);
        b5.addActionListener(listen);
        JButton b6 = new JButton("4");
        p3.add(b6);
        b6.addActionListener(listen);
        JButton b7 = new JButton("5");
        p3.add(b7);
        b7.addActionListener(listen);
        JButton b8 = new JButton("6");
        p3.add(b8);
        b8.addActionListener(listen);
        JButton b9 = new JButton("*");
        p3.add(b9);
        b9.addActionListener(listen);
        JButton b10 = new JButton("%");
        p3.add(b10);
        b10.addActionListener(listen);
        JButton b11 = new JButton("1");
        p3.add(b11);
        b11.addActionListener(listen);
        JButton b12 = new JButton("2");
        p3.add(b12);
        b12.addActionListener(listen);
        JButton b13 = new JButton("3");
        p3.add(b13);
        b13.addActionListener(listen);
        JButton b14 = new JButton("-");
        p3.add(b14);
        b14.addActionListener(listen);
        JButton b15 = new JButton("1/x");
        p3.add(b15);
        b15.addActionListener(listen);
        JButton b16 = new JButton("0");
        p3.add(b16);
        b16.addActionListener(listen);
        JButton b17 = new JButton("+/-");
        p3.add(b17);
        b17.addActionListener(listen);
        JButton b18 = new JButton(".");
        p3.add(b18);
        b18.addActionListener(listen);
        JButton b19 = new JButton("+");
        p3.add(b19);
        b19.addActionListener(listen);
        JButton b20 = new JButton("=");
        p3.add(b20);
        b20.addActionListener(listen);
        f.add(p3,BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]){
        //调用方法，实现计算器
        new Calculator2().init();
    }

}