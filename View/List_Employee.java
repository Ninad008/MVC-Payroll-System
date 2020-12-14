package MVC.com.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import MVC.com.Controller.List_Employee_Controller;


public class List_Employee extends JFrame implements ActionListener {
    JTable j1;
    JButton b1;
    String h[]={"Emp id","Name","Gender","Address","State","City","Email id","Phone"};
    String d[][]=new String[20][8];
    int i=0,j=0;
    ResultSet rs = List_Employee_Controller.Employee_List();

    List_Employee(){
        super("View Employees");

        setSize(1000,400);
        setLocation(450,200);

        try{

            while(rs.next()){
                // i = 0 j = 0
                d[i][j++]=rs.getString("id");
                d[i][j++]=rs.getString("name");
                d[i][j++]=rs.getString("gender");
                d[i][j++]=rs.getString("address");
                d[i][j++]=rs.getString("state");
                d[i][j++]=rs.getString("city");
                d[i][j++]=rs.getString("email");
                d[i][j++]=rs.getString("phone");
                i++;
                j=0;
            }
            j1=new JTable(d,h);

        }
        catch(Exception e){}

        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);

        b1.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }

    public static void main(String s[]){
        new List_Employee().setVisible(true);
    }
}
