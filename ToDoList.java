import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoList implements ActionListener {
    ImageIcon icon = new ImageIcon("Tick1.png");
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    JTextField task1,task2,task3,task4,task5,task6,task7,task8,task9,task10;
    Color gray = new Color(0xD8D8D8);
    Color green = new Color(0x57C64C);
    ToDoList(){

        JFrame frame   =  new JFrame();
        JPanel panel1  =  new JPanel();
        JPanel panel2  =  new JPanel();
        JPanel panel3  =  new JPanel();
        JPanel panel4  =  new JPanel();
        JPanel panel5  =  new JPanel();
        JPanel panel6  =  new JPanel();
        JPanel panel7  =  new JPanel();
        JPanel panel8  =  new JPanel();
        JPanel panel9  =  new JPanel();
        JPanel panel10 =  new JPanel();
//     ***************************************************************************
        task1 = new JTextField("Enter a task here") ;
        button1 = new JButton(icon);  
        task1.setSize(100, 0);
        task1.setBackground(gray);
        // task1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        button1.setBounds(66, 8, 30, 30);
        task1.setBounds(164, 13, 100, 25);
        task1.setName("Enter a task here");
        panel1.setBackground(new Color(0x9F7FC0));
        panel1.setLayout(null);
        panel1.add(button1);
        panel1.add(task1);
        panel1.setBounds(0, 0, 330, 40);
        button1.addActionListener(this);
//     ***************************************************************************
        task2 = new JTextField("Enter a task here") ;
        button2 = new JButton(icon);
        panel2.setLayout(null);
        task2.setBackground(gray);
        button2.addActionListener(this);
        button2.setBounds(66, 8, 30, 30);
        task2.setBounds(164, 13, 100, 25);
        panel2.setBackground(new Color(0x9F7FC0));
        panel2.add(button2);
        panel2.add(task2);
        panel2.setBounds(0, 40, 330, 40);
//     ***************************************************************************
        task3 = new JTextField("Enter a task here") ;
        button3 = new JButton(icon);
        panel3.setBackground(new Color(0x9F7FC0));
        panel3.setLayout(null);
        button3.setBounds(66, 8, 30, 30);
        task3.setBackground(gray);
        task3.setBounds(164, 13, 100, 25);
        panel3.add(button3);
        panel3.add(task3);
        panel3.setBounds(0, 80, 330, 40);
        button3.addActionListener(this);
//     ***************************************************************************
        task4 = new JTextField("Enter a task here") ;
        button4 = new JButton(icon);
        panel4.setLayout(null);
        button4.setBounds(66, 8, 30, 30);
        task4.setBounds(164, 13, 100, 25);
        task4.setBackground(gray);
        panel4.add(button4);
        panel4.add(task4);
        panel4.setBackground(new Color(0x9F7FC0));
        button4.addActionListener(this);
        panel4.setBounds(0, 120, 330, 40);
//     ***************************************************************************
        task5 = new JTextField("Enter a task here") ;
        button5 = new JButton(icon);
        panel5.setBackground(new Color(0x9F7FC0));
        panel5.add(button5);
        panel5.add(task5);
        panel5.setLayout(null);
        task5.setBackground(gray);
        button5.setBounds(66, 8, 30, 30);
        task5.setBounds(164, 13, 100, 25);
        panel5.setBounds(0, 160, 330, 40);
        button5.addActionListener(this);
//     ***************************************************************************        
        task6 = new JTextField("Enter a task here") ;
        button6 = new JButton(icon);
        panel6.setBackground(new Color(0x9F7FC0));
        panel6.add(button6);
        panel6.add(task6);
        button6.addActionListener(this);
        panel6.setLayout(null);
        button6.setBounds(66, 8, 30, 30);
        task6.setBackground(gray);
        task6.setBounds(164, 13, 100, 25);
        panel6.setBounds(0, 200, 330, 40);
//     ***************************************************************************        
        task7 = new JTextField("Enter a task here") ;
        button7 = new JButton(icon);
        panel7.setLayout(null);
        button7.setBounds(66, 8, 30, 30);
        task7.setBounds(164, 13, 100, 25);        
        panel7.setBackground(new Color(0x9F7FC0));
        panel7.add(button7);
        panel7.add(task7);
        task7.setBackground(gray);
        button7.addActionListener(this);
        panel7.setBounds(0, 240, 330, 40);
//     ***************************************************************************
        task8 = new JTextField("Enter a task here") ;
        button8 = new JButton(icon);
        panel8.add(button8);
        panel8.add(task8);
        panel8.setLayout(null);
        button8.setBounds(66, 8, 30, 30);
        task8.setBounds(164, 13, 100, 25);
        panel8.setBackground(new Color(0x9F7FC0));
        task8.setBackground(gray);
        button8.addActionListener(this);
        panel8.setBounds(0, 280, 330, 40);
//     ***************************************************************************        
        task9 = new JTextField("Enter a task here") ;
        button9 = new JButton(icon);
        panel9.add(button9);
        panel9.add(task9);
        panel9.setLayout(null);
        button9.setBounds(66, 8, 30, 30);
        task9.setBounds(164, 13, 100, 25);
        panel9.setBackground(new Color(0x9F7FC0));
        button9.addActionListener(this);
        task9.setBackground(gray);
        panel9.setBounds(0, 320, 330, 40);
//     ***************************************************************************
        task10 = new JTextField("Enter a task here") ;
        button10 = new JButton(icon);
        panel10.add(button10);
        panel10.add(task10);
        panel10.setLayout(null);
        button10.setBounds(66, 8, 30, 30);
        task10.setBounds(164, 13, 100, 25);
        panel10.setBackground(new Color(0x9F7FC0));
        button10.addActionListener(this);
        task10.setBackground(gray);
        panel10.setBounds(0, 360, 330, 50);
//     ***************************************************************************
        frame.setLayout(null);
        frame.setSize(330, 445);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Faisal's To do");
        frame.setIconImage(new ImageIcon("Tick2.png").getImage());
        frame.setResizable(false);
        frame.setBackground(new Color(0x9F7FC0));
        frame.setLocationRelativeTo(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);

        // frame.pack();
        frame.setVisible(true);
    }
//     ***************************************************************************
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button1){
            System.out.println("Button1");
            if (task1.isEditable()){
                task1.setEditable(false);
                task1.setBackground(green);}
            else{
                task1.setEditable(true);
                task1.setBackground(gray);}
        }
        else if (e.getSource() == button2){
            System.out.println("Button2");
            if (task2.isEditable()){
                task2.setEditable(false);
                task2.setBackground(green);}
            else{
                task2.setEditable(true);
                task2.setBackground(gray);}
        }
        else if (e.getSource() == button3){
            System.out.println("Button3");
            if (task3.isEditable()){
                task3.setEditable(false);
                task3.setBackground(green);}
            else{
                task3.setEditable(true);
                task3.setBackground(gray);}
        }
        else if (e.getSource() == button4){
            System.out.println("Button4");
            if (task4.isEditable()){
                task4.setEditable(false);
                task4.setBackground(green);}
            else{
                task4.setEditable(true);
                task4.setBackground(gray);}
        }
        else if (e.getSource() == button5){
            System.out.println("Button5");
            if (task5.isEditable()){
                task5.setEditable(false);
                task5.setBackground(green);}
            else{
                task5.setEditable(true);
                task5.setBackground(gray);}
        }
        else if (e.getSource() == button6){
            System.out.println("Button6");
            if (task6.isEditable()){
                task6.setEditable(false);
                task6.setBackground(green);}
            else{
                task6.setEditable(true);
                task6.setBackground(gray);}
        }
        else if (e.getSource() == button7){
            System.out.println("Button7");
            if (task7.isEditable()){
                task7.setEditable(false);
                task7.setBackground(green);}
            else{
                task7.setEditable(true);
                task7.setBackground(gray);}
        }
        else if (e.getSource() == button8){
            System.out.println("Button8");
            if (task8.isEditable()){
                task8.setEditable(false);
                task8.setBackground(green);}
            else{
                task8.setEditable(true);
                task8.setBackground(gray);}
        }
        else if (e.getSource() == button9){
            System.out.println("Button9");
            if (task9.isEditable()){
                task9.setEditable(false);
                task9.setBackground(green);}
            else{
                task9.setEditable(true);
                task9.setBackground(gray);}
        }
        else if (e.getSource() == button10){
            System.out.println("Button10");
            if (task10.isEditable()){
                task10.setEditable(false);
                task10.setBackground(green);}
            else{
                task10.setEditable(true);
                task10.setBackground(gray);}
        }
    }

}