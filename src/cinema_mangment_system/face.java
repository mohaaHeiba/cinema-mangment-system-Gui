package cinema_mangment_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class face extends JFrame {


    face(){

        JPanel  panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(185,0,1500,900);
        panel.setBackground(new Color(0xCAC1C1));
        add(panel);


        JPanel panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,1550,900);
        panel1.setBackground(new Color(0x141B59));
        add(panel1);




        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icon/1.jpg"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        ImageIcon originalIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/4k-interstellar-matthew-mcconaughey-astronaut-wallpaper-preview.jpg"));
        Image scaledImage1 = originalIcon1.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);


        ImageIcon originalIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/3.jpg"));
        Image scaledImage2 = originalIcon2.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);

        ImageIcon originalIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/9.jpg"));
        Image scaledImage3 = originalIcon3.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);

        ImageIcon originalIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/11.jpg"));
        Image scaledImage4 = originalIcon4.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);


        ImageIcon originalIcon5 = new ImageIcon(ClassLoader.getSystemResource("icon/19.jpg"));
        Image scaledImage5 = originalIcon5.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);

        ImageIcon originalIcon6 = new ImageIcon(ClassLoader.getSystemResource("icon/12.jpg"));
        Image scaledImage6 = originalIcon6.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);

        ImageIcon originalIcon7 = new ImageIcon(ClassLoader.getSystemResource("icon/16.jpg"));
        Image scaledImage7 = originalIcon7.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);


        ImageIcon originalIcon8 = new ImageIcon(ClassLoader.getSystemResource("icon/13.jpg"));
        Image scaledImage8 = originalIcon8.getImage().getScaledInstance(200, 250  , Image.SCALE_DEFAULT);
        ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);




        JButton button1 = new JButton(scaledIcon);
        button1.setPreferredSize(new Dimension(300, 100));
        button1.setBounds(930, 70, 200, 250);
        panel.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });
        JButton button2 = new JButton(scaledIcon1);
        button2.setPreferredSize(new Dimension(300, 100));
        button2.setBounds(930, 430, 200, 250);
        panel.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });

        JButton button3 = new JButton(scaledIcon2);
        button3.setPreferredSize(new Dimension(300, 100));
        button3.setBounds(630, 70, 200, 250);
        panel.add(button3);


        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        JButton button4 = new JButton(scaledIcon3);
        button4.setPreferredSize(new Dimension(300, 100));
        button4.setBounds(930, 430, 200, 250);
        panel.add(button4);

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        JButton button5 = new JButton(scaledIcon4);
        button5.setPreferredSize(new Dimension(300, 100));
        button5.setBounds(630, 430, 200, 250);
        panel.add(button5);

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        JButton button6 = new JButton(scaledIcon5);
        button6.setPreferredSize(new Dimension(300, 100));
        button6.setBounds(330, 430, 200, 250);
        panel.add(button6);


        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        JButton button7 = new JButton(scaledIcon6);
        button7.setPreferredSize(new Dimension(300, 100));
        button7.setBounds(330, 70, 200, 250);
        panel.add(button7);


        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        JButton button8 = new JButton(scaledIcon7);
        button8.setPreferredSize(new Dimension(300, 100));
        button8.setBounds(30, 70, 200, 250);
        panel.add(button8);

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });

        JButton button9 = new JButton(scaledIcon8);
        button9.setPreferredSize(new Dimension(300, 100));
        button9.setBounds(30, 430, 200, 250);
        panel.add(button9);


        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new user();}
        });


        ImageIcon i1111111111 = new ImageIcon(ClassLoader.getSystemResource("icon/12724606.png"));
        Image admin=i1111111111.getImage().getScaledInstance(150,120,Image.SCALE_DEFAULT);
        ImageIcon i2222222222=new ImageIcon(admin);
        JLabel label111111111=new JLabel(i2222222222);
        label111111111.setBounds(10,-410,190,1000);
        panel1.add(label111111111);




        JButton btn2=new JButton("Add movie");
        btn2.setBounds(30,220,120,30);
        btn2.setBackground(new Color(4, 96, 255));
        btn2.setForeground(Color.white);
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddMovie();
            }
        });

        JButton btn3=new JButton("delete and modify");
        btn3.setBounds(30,280,120,30);
        btn3.setBackground(new Color(4, 96, 255));
        btn3.setForeground(Color.white);
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Delete();
            }
        });

        JButton btn4 =new JButton("Under construction");
        btn4.setBounds(30,400,120,30);
        btn4.setBackground(new Color(4, 96, 255));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Under construction", "new", JOptionPane.CLOSED_OPTION);
            }
        });
        panel1.add(btn4);


        JButton btn5 =new JButton("Trending Moive");
        btn5.setBounds(30,340,120,30);
        btn5.setBackground(new Color(4, 96, 255));
        btn5.setForeground(Color.white);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewTrendingMovie ();
            }
        });
        panel1.add(btn5);


        JButton btn6 =new JButton("Under construction");
        btn6.setBounds(30,460,120,30);
        btn6.setBackground(new Color(4, 96, 255));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Under construction", "Under construction", JOptionPane.CLOSED_OPTION);
            }
        });
        panel1.add(btn6);


        JButton btn1=new JButton("Report");
        btn1.setBounds(30,520,120,30);
        btn1.setBackground(new Color(4, 96, 255));
        btn1.setForeground(Color.white);
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new report();
            }
        });


        JButton btn7 =new JButton("log out ");
        btn7.setBounds(30,700,120,30);
        btn7.setBackground(new Color(4, 96, 255));
        btn7.setForeground(Color.white);
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(1950,1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new face();
    }
}