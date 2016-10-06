/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaime
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {

        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }

    }

    public static void limpiadoTabla(JTable tabla1) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);

            }
        }
    }

    public static void porDefectoTabla(JTable tabla) {

        DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);

    }

    public static void habilitarBotones(JButton[] botones) {

        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {

        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void Figura1(JTable tabla1, JTable tabla2) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

    
                if ((j == 0) || (i == 0 && j != nc - 1) || (i == nf / 2 && j != nc - 1) || (i == nf - 1 && j != nc - 1) || (j == nc - 1 && i != 0 && i != nf / 2 && i != nf - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
        public static void figura2(JTable tabla1, JTable tabla2) {
    
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || nf / 2 - i == j || i - j == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }


    public static void figura3(JTable tabla1, JTable tabla2){

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
 
                if (j == 0 || j == nc - 1 || (i == j && i + j <= nf) || (i + j == nf - 1 && i <= j)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

     public static void figura4(JTable tabla1, JTable tabla2) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
     
                if (j == 0 || j == nc - 1 || (i == j && i + j >= nf) || nf - 1 - i == j && i >= j) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura5(JTable tabla1, JTable tabla2) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 && j != 0 && j != nf - 1 || (j == 0 && i <= nf / 2 && i != 0) || (((nf / 2 + 1) == i && j != 0 && j != nf - 1)) || (j == nc - 1 && i <= nf / 2 && i != 0) || (i == j && i > nf / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura6(JTable tabla1, JTable tabla2) {
        
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
     
                if (i == 0 || j == nc / 2 || i == nf - 1 && j < nc / 2 || j == 0 && i > nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura7(JTable tabla1, JTable tabla2) {
        
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
     
                if (j == 0 || i == 0 || i == nf - 1 || j == nc - 1 && j / i <= 2 || i == nf / 3 || (j == nc - 1 && j / i >= nc - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura8(JTable tabla1, JTable tabla2) {
        
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
     
                if ((j == 0 || i == 0 || i == nf / 2) || (j == nc - 1 && j / i >= 2) || (i == j && i + j >= nf)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura9(JTable tabla1, JTable tabla2) {
       
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

                if (((i >= j && nf - 1 - i <= j)) || (i <= j) && (nf - 1 - i >= j)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura10(JTable tabla1, JTable tabla2) {
        
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

                if (((j >= i && nf - 1 - j <= i)) || (j <= i) && (nf - 1 - j >= i)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura11(JTable tabla1, JTable tabla2) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
                
                if (j == nc / 2 || j == (nc / 2) - 1 || i == nf / 2 || i == (nf / 2) - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void figura12(JTable tabla1, JTable tabla2) {

        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
       
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);
                
                if ( (i == j-nf/2) || (nf/2 - i == j) || (nf - i + nf/2-1 == j) || (i == j+nf/2) ) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

}
