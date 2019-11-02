import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class HomeFrame extends JFrame
{
Container c;
JButton btnAdd,btnView,btnUpdate,btnDelete;
HomeFrame()
{
super("Home");
c =getContentPane();
c.setLayout(new FlowLayout());
btnAdd =new JButton("Add");
btnView =new JButton("View");
btnUpdate =new JButton("Update");
btnDelete =new JButton("Delete");
c.add(btnAdd);
c.add(btnView);
c.add(btnUpdate);
c.add(btnDelete);

setSize(500,150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);
setLocationRelativeTo(null);
setVisible(true);

btnAdd.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent a)
{
AddEmployee e=new AddEmployee();
dispose();
}
});

btnUpdate.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent a)
{
UpdateEmployee e=new UpdateEmployee();
dispose();
}
});

btnView.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent a)
{
ViewEmployee e=new ViewEmployee();
dispose();
}
});

btnDelete.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent a)
{
DeleteEmployee e=new DeleteEmployee();
dispose();
}
});

}//end of constructor

public static void main(String args[])
{
HomeFrame h=new HomeFrame();


}//end of main()
}//end of class
