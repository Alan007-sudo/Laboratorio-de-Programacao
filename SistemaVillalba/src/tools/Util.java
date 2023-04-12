
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Util {
    //serve para habilitar e desabilidar os botões, dependendo de do valor do boolean.
    //se for falso desabilita e se for verdadeiro habiilita
    public static void habilitar (boolean valor, JComponent...componentes){      
        for (int i = 0; i < componentes.length; i++) {
        componentes[i].setEnabled(valor);
        }
    }
    //Serve para limpar os componentes inseridos nos campos
    public static void limpar (JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++){
            
            if (componentes[i] instanceof JTextField){
            JTextField comp = (JTextField)  componentes [i];
            comp.setText(""); 
            } 
            if (componentes [i] instanceof JComboBox){
            JComboBox comp = (JComboBox) componentes[i];
            comp.setSelectedIndex(-1); 
            }
            if (componentes [i] instanceof JCheckBox){
                JCheckBox comp = (JCheckBox) componentes [i];
                comp.setSelected(false);
            }
            if (componentes [i] instanceof JPasswordField){
            JPasswordField comp = (JPasswordField) componentes [i];
            comp.setText("");
        }
        }
    }
        
   
        public static void mensage(String msg){
            JOptionPane.showMessageDialog(null, msg);
        }
        
        public static boolean quest (String msg){
            return JOptionPane.showConfirmDialog(null, msg, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }

        public static int strInt (String cad){
            return Integer.valueOf(cad); 
        }
        public static String intStr (int num){
            return String.valueOf(num);
        }
        public static double strDouble (String cad){
            return Double.valueOf(cad);
        }
        public static String doubleStr(double num){
            return String.valueOf(num);
        }
        public static Date strDate (String cad){
            return null;
        }
        public static String dateStr (Date data){
            return String.valueOf(data);
        }

        
    }  
    


