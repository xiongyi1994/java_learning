package calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
public class Caculator implements ActionListener,KeyListener{
   public static void main(String args[]) {
    new Caculator();
  }
  JFrame frame;
  JTextField textAnswer;
  JTextArea help;
  JPanel panel,panel1,panel2,panel3,panel4;
  JButton button[];
  JButton buttonAdd,buttonEqual,buttonDot,buttonSub,buttonDiv,buttonMul;
  JButton buttonBk, buttonCe, buttonC;
  double num1,num2;
  double answer;
  boolean intflag=true;
  boolean operatorflag=true;
  boolean equalflag=true;
  int key;
  DecimalFormat df;
 
  public Caculator() {
    df = new DecimalFormat("0.##############"); //设置数据输出精度(对于double型值)
    frame = new JFrame("建四狼的计算器");
    frame.setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (dim.width)/2-150;
    int y = (dim.height)/2-250;
    frame.setLocation(x,y); //设置窗口位置
    panel=new JPanel();
    textAnswer=new JTextField(15);
    textAnswer.setText("");
    textAnswer.setHorizontalAlignment(SwingConstants.RIGHT);
    textAnswer.setEditable(false);
    textAnswer.setBackground(new Color(255,255,255));
    textAnswer.addKeyListener(this);
    help=new JTextArea(8,10);
    help.setEditable(false);
    help.append("本程序由建四狼编写\n");
    help.append("只实现简单的计算功能\n");
    help.append("怎么用这就不介绍了,呵呵\n");
    help.append("有错误的地方再所难免\n");
    help.append("可以通过键盘输入\n");
    help.append("QQ:274839490\n");
    help.append("---------------------------------\n");
    help.append("                2007年4月重邮\n");
    frame.getContentPane().add(panel);
    panel.setLayout(new BorderLayout());
    panel2=new JPanel();
    panel2.add(help,BorderLayout.CENTER);
    panel4=new JPanel();
    panel.add(panel4,BorderLayout.CENTER);
    panel4.setLayout(new BorderLayout());
    panel3=new JPanel();
    panel4.add(panel3,BorderLayout.CENTER);
    buttonBk=new JButton("BackSpace");
    panel3.add(buttonBk);
    buttonBk.addActionListener(this);
    buttonBk.addKeyListener(this);
    buttonCe=new JButton("CE");
    panel3.add(buttonCe);
    buttonCe.addActionListener(this);
    buttonCe.addKeyListener(this);
    buttonC=new JButton("C");
    panel3.add(buttonC);
    buttonC.addActionListener(this);
    buttonC.addKeyListener(this);
    panel.add(textAnswer,BorderLayout.NORTH);
    panel.add(panel2,BorderLayout.WEST);

    panel1=new JPanel();
    panel4.add(panel1,BorderLayout.SOUTH);
    button = new JButton[10];
    for (int i = 0; i < button.length; i++) {
      button[i] = new JButton(Integer.toString(i));
      button[i].setForeground(new Color(0, 0, 255));
    }
    buttonAdd=new JButton("+");
    buttonSub=new JButton("-");
    buttonDiv=new JButton("/");
    buttonMul=new JButton("*");
    buttonDot=new JButton(".");
    buttonEqual=new JButton("=");
    panel1.setLayout(new GridLayout(4,4));
    panel1.add(button[7]);
    button[7].addActionListener(this);
    button[7].addKeyListener(this);
    panel1.add(button[8]);
    button[8].addActionListener(this);
    button[8].addKeyListener(this);
    panel1.add(button[9]);
    button[9].addActionListener(this);
    button[9].addKeyListener(this);
    panel1.add(buttonAdd);
    buttonAdd.addActionListener(this);
    buttonAdd.addKeyListener(this);
    panel1.add(button[4]);
    button[4].addActionListener(this);
    button[4].addKeyListener(this);
    panel1.add(button[5]);
    button[5].addActionListener(this);
    button[5].addKeyListener(this);
    panel1.add(button[6]);
    button[6].addActionListener(this);
    button[6].addKeyListener(this);
    panel1.add(buttonSub);
    buttonSub.addActionListener(this);
    panel1.add(button[1]);
    button[1].addActionListener(this);
    button[1].addKeyListener(this);
    panel1.add(button[2]);
    button[2].addActionListener(this);
    button[2].addKeyListener(this);
    panel1.add(button[3]);
    button[3].addActionListener(this);
    button[3].addKeyListener(this);
    panel1.add(buttonMul);
    buttonMul.addActionListener(this);
    buttonMul.addKeyListener(this);
    panel1.add(button[0]);
    button[0].addActionListener(this);
    button[0].addKeyListener(this);
    panel1.add(buttonDot);
    buttonDot.addActionListener(this);
    buttonDot.addKeyListener(this);
    panel1.add(buttonEqual);
    buttonEqual.addActionListener(this);
    buttonEqual.addKeyListener(this);
    panel1.add(buttonDiv);
    buttonDiv.addActionListener(this);
    buttonDiv.addKeyListener(this);
    //buttonAdd.setFocusable(true);
    frame.addKeyListener(this);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.pack();
    frame.show();
  }
    public void keyPressed(KeyEvent e){
          int i=e.getKeyCode();
          char c=e.getKeyChar();
          System.out.println(c);
          if(i==KeyEvent.VK_ADD){
                Add();
          }
          else if(i==KeyEvent.VK_SUBTRACT){
                 Sub();
          }
          else if(i==KeyEvent.VK_DIVIDE){
                 Div();
          }
          else if(i==KeyEvent.VK_MULTIPLY){
                 Mul();
          }
          else if(i==KeyEvent.VK_ENTER){
                  Enter();
          }
          else if(c=='.'){
                  Dot();
          }
          else if(i==KeyEvent.VK_BACK_SPACE){
                  Backspace();
          }
          else if(i==KeyEvent.VK_Q){
                  clear();
          }
          Input(c);
    }
   public void keyReleased(KeyEvent e) {
  // TODO 自动生成方法存根
 }
 public void keyTyped(KeyEvent e) {
  // TODO 自动生成方法存根
 }
 
  //设置各个按钮行为
  public void actionPerformed(ActionEvent event) {
    Object temp = event.getSource();
    //boolean operatorflag=true;
    if(temp==KeyStroke.getKeyStroke('f')){
          temp=button[1];
    }
    try{
       for(int i=0;i<10;i++)
          Input(temp,i);
       if(temp==buttonAdd||temp==buttonMul||temp==buttonDiv||temp==buttonSub){
          if(temp==buttonAdd){
              Add();
          }
          if(temp==buttonSub){
             Sub();
          }
          if(temp==buttonMul){
             Mul();
           }
           if(temp==buttonDiv){
              Div();
           }
       }
       if(temp==buttonEqual){
          Enter();
       }
       if(temp==buttonC){
          clear();
       }
       if(temp==buttonBk){
          Backspace();
       }
       if(temp==buttonDot){
          Dot();
       }

    }
    catch(Exception e){
       textAnswer.setText("非法操作");
    }
  }
  public void culcator(Exception e){
  }
  public void Input(char c){
     int i=c-48;
     if(i<0||i>9)
         return;
     if(operatorflag&&equalflag){
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle(frame.getTitle()+Integer.toString(i));
          }
          else if(operatorflag==false&&!equalflag){
              textAnswer.setText("");
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle("建四狼的计算器"+Integer.toString(i));
              operatorflag=true;
              equalflag=true;
          }
          else if(operatorflag&&!equalflag){
              textAnswer.setText("");
              equalflag=true;
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle(frame.getTitle()+Integer.toString(i));
              }
  }
  public void Input(Object temp,int i){
       if(temp==button[i]&&operatorflag&&equalflag){
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle(frame.getTitle()+Integer.toString(i));
          }
          else if(temp==button[i]&&operatorflag==false&&!equalflag){
              textAnswer.setText("");
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle("建四狼的计算器"+Integer.toString(i));
              operatorflag=true;
              equalflag=true;
          }
          else if(temp==button[i]&&operatorflag&&!equalflag){
              textAnswer.setText("");
              equalflag=true;
              textAnswer.setText(textAnswer.getText()+Integer.toString(i));
              frame.setTitle(frame.getTitle()+Integer.toString(i));
              }
     }
   public void Add(){
      if(intflag==true){
                 num1=Double.parseDouble(textAnswer.getText());
             }
             textAnswer.setText("+");
             operatorflag=true;
             equalflag=false;
             key=1;
      if(answer==0)
          frame.setTitle("建四狼的计算器"+df.format(num1)+"+");
   }
   public void Sub(){
      if(intflag==true){
                 num1=Double.parseDouble(textAnswer.getText());
      }
      textAnswer.setText("-");
      operatorflag=true;
      equalflag=false;
      key=2;
      if(answer==0)
          frame.setTitle("建四狼的计算器"+df.format(num1)+"-");
   }
   public void Div(){
      if(intflag==true){
                 num1=Double.parseDouble(textAnswer.getText());
              }
             textAnswer.setText("/");
             operatorflag=true;
             equalflag=false;
             key=4;
      if(answer==0)
          frame.setTitle("建四狼的计算器"+df.format(num1)+"/");
  }
  public void Mul(){
      if(intflag==true){
                 num1=Double.parseDouble(textAnswer.getText());
              }
             textAnswer.setText("*");
             operatorflag=true;
             equalflag=false;
             key=3;
      if(answer==0)
          frame.setTitle("建四狼的计算器"+df.format(num1)+"*");
  }
  public void Enter(){
     num2=Double.parseDouble(textAnswer.getText());
     char c='+';
          switch(key){
             case 1:
               answer=num1+num2;
               textAnswer.setText(df.format(answer));
               operatorflag=false;
               equalflag=false;
               c='+';
               break;
             case 2:
               answer=num1-num2;
               textAnswer.setText(df.format(answer));
               operatorflag=false;
               equalflag=false;
               c='-';
               break;
             case 3:
               answer=num1*num2;
               textAnswer.setText(df.format(answer));
               operatorflag=false;
               equalflag=false;
               c='*';
               break;
             case 4:
               answer=num1/num2;
               textAnswer.setText(df.format(answer));
               operatorflag=false;
               equalflag=false;
               c='/';
               break;
          }
          double n1=num1;
          double n2=num2;
          num2=0;
          num1=answer;
          answer=0;
          frame.setTitle("建四狼的计算器"+df.format(n1)+c+df.format(n2)+"="+df.format(num1));
  }
  public void Dot(){
       boolean isDot=false;
          for(int i=0;i<10;i++){
        	  if('.'==textAnswer.getText().charAt(i)){
                  isDot=true;
                  break;
              }
          }
          if(isDot==false){
              textAnswer.setText(textAnswer.getText()+".");
              frame.setTitle(frame.getTitle()+".");
          }
  }
  public void Backspace(){
          String s = textAnswer.getText();
          String t=frame.getTitle();
          frame.setTitle("");
          textAnswer.setText("");
          for (int i = 0; i < s.length() - 1; i++) {
              char a = s.charAt(i);
              textAnswer.setText(textAnswer.getText() + a);
          }
          if(t.length()>7){
              for(int i=0;i<10;i++ ){
            	  char b=t.charAt(i);
                  frame.setTitle(frame.getTitle()+b);
              }
           }
           else{
              frame.setTitle("建四狼的计算器");
           }
  }
  public void clear(){
          textAnswer.setText("0");
          num1=0;
          num2=0;
          answer=0;
          operatorflag=true;
          equalflag=false;
          frame.setTitle("建四狼的计算器");
  }

  }
