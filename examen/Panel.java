 
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;

    public class Panel implements ActionListener{  
        JTextField tf1,tf2,tf3;  
        JButton b1,b2;  
        private JComboBox<String> combo; // Si le quitás el parametrizado va a tomar como Object
    	private String[] names;
        Panel(){  
        	names = new String[] { "Marcelo", "Roberto", "Lucas", "Gisella", "Ismael", "Mauricio" };
        	combo = new JComboBox<String>(names);
        	combo.setBounds(50,50,150,20);

            JFrame f= new JFrame();  
            JLabel label1=new JLabel("Selecciona un usuario");
        	label1.setBounds(50,20,300,30);
            
            JLabel label2=new JLabel("Nombre");
        	label2.setBounds(50,80,150,30);
            tf2=new JTextField();  
            tf2.setBounds(50,110,150,20); 
            tf2.setEditable(false); 
            
            JLabel label3=new JLabel("Email");
        	label3.setBounds(50,150,150,30);
            tf3=new JTextField();  
            tf3.setBounds(50,180,150,20);  
            tf3.setEditable(false);   
            b1=new JButton("Agregar");  
            b1.setBounds(100,210,100,30);             
            b1.addActionListener(this);   

            f.add(combo);f.add(tf2);f.add(tf3);f.add(b1);f.add(label1);f.add(label2);f.add(label3);  
            f.setSize(300,300);  
            f.setLayout(null);  
            f.setVisible(true);  

            combo.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                tf2.setText(event.getItem().toString());
            }
        	});
        }         
        public void actionPerformed(ActionEvent e) {  
            String s1=tf1.getText();  
            String s2=tf2.getText();  
            int a=Integer.parseInt(s1);  
            int b=Integer.parseInt(s2);  
            int c=0;  
            if(e.getSource()==b1){  
                //Regpanel regpan = new Regpanel();  
                //regpan.main();
            }else{  
                 
            }  
            String result=String.valueOf(c);  
            tf3.setText(result);  
        }  

        

    public static void main(String[] args) {  
        new Panel();  
    } }  