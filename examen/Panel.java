 

    import javax.swing.*;  
    import java.awt.event.*;  
    public class Panel implements ActionListener{  
        JTextField tf1,tf2,tf3;  
        JButton b1,b2;  
        Panel(){  
            JFrame f= new JFrame();  
            JLabel label1=new JLabel("Selecciona un usuario");
        	label1.setBounds(50,20,300,30);
            
            JLabel label2=new JLabel("Nombre");
        	label2.setBounds(50,60,150,30);
            tf2=new JTextField();  
            tf2.setBounds(50,90,150,20); 
            tf2.setEditable(false); 
            
            JLabel label3=new JLabel("Email");
        	label3.setBounds(50,120,150,30);
            tf3=new JTextField();  
            tf3.setBounds(50,150,150,20);  
            tf3.setEditable(false);   
            b1=new JButton("Agregar");  
            b1.setBounds(100,200,100,30);             
            b1.addActionListener(this);   

            f.add(tf2);f.add(tf3);f.add(b1);f.add(label1);f.add(label2);f.add(label3);  
            f.setSize(280,300);  
            f.setLayout(null);  
            f.setVisible(true);  
        }         
        public void actionPerformed(ActionEvent e) {  
            String s1=tf1.getText();  
            String s2=tf2.getText();  
            int a=Integer.parseInt(s1);  
            int b=Integer.parseInt(s2);  
            int c=0;  
            if(e.getSource()==b1){  
                c=a+b;  
            }else{  
                 
            }  
            String result=String.valueOf(c);  
            tf3.setText(result);  
        }  
    public static void main(String[] args) {  
        new Panel();  
    } }  