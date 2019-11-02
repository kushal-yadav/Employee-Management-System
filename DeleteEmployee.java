import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DeleteEmployee extends JFrame
{
Container c;
JLabel lblId;
JTextField txtId;
JButton btnDelete;
JPanel p1,p2;
DeleteEmployee()
{
super("Delete  Employee");
c= getContentPane();
p1= new JPanel();
p1.setLayout(new FlowLayout());
lblId= new JLabel("ID: ");
txtId=new JTextField(4);
p1.add(lblId);
p1.add(txtId);
c.add(p1);

p2 =new JPanel();
p2.setLayout(new FlowLayout());
btnDelete=new JButton("Delete");
p2.add(btnDelete);
c.add("South",p2);

setSize(500,150);
setResizable(false);
setLocationRelativeTo(null);
setVisible(true);


this.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
HomeFrame ah=new HomeFrame();
dispose();

}
});

}//end of constructor

}//end of class