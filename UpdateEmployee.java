import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class UpdateEmployee extends JFrame
{
Container c;
JLabel lblId,lblName;
JTextField txtId,txtName;
JButton btnSave,btnBack;
JPanel p1,p2;
UpdateEmployee()
{
super("Upadte   Employee");
c= getContentPane();
p1= new JPanel();
p1.setLayout(new FlowLayout());
lblId= new JLabel("ID: ");
txtId=new JTextField(4);
lblName= new JLabel("Name: ");
txtName=new JTextField(15);
p1.add(lblId);
p1.add(txtId);
p1.add(lblName);
p1.add(txtName);
c.add(p1);

p2 =new JPanel();
p2.setLayout(new FlowLayout());
btnSave=new JButton("Save");
btnBack=new JButton("Back");
p2.add(btnSave);
p2.add(btnBack);
c.add("South",p2);

setSize(500,150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);
setLocationRelativeTo(null);
setVisible(true);

btnBack.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent a)
{
HomeFrame e=new HomeFrame();
dispose();
}
});


}//end of constructor

}//end of class