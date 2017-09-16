/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_programacion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffer A. Mendoza
 */
public class Numero {
    int num;
    
public static void verificar(int num)
{
        if (num > 0){
             JOptionPane.showMessageDialog(null, "El numero "+num+" es Positivo");
        }
        else if (num < 0){
           JOptionPane.showMessageDialog(null, "El numero "+num+" es Negativo");
        }
        else if (num == 0){
            JOptionPane.showMessageDialog(null, "El numero "+num+" es Nulo");
        }
}

}
