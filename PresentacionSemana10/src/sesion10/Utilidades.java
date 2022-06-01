/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10;

import com.raven.datechooser.DateChooser;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jhair
 */
public class Utilidades {

    protected void calendar(DateChooser dateChooser) {
        dateChooser.addEventDateChooser((SelectedAction action, SelectedDate date) -> {
            if (action.getAction() == SelectedAction.DAY_SELECTED) {
                dateChooser.hidePopup();
            }
        });
    }

    public static void alinearCeldas(JTable table, int alignment) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }

    private void AnchoCeldas(TableColumnModel modelo) {
        modelo.getColumn(0).setPreferredWidth(70);  //ID
        modelo.getColumn(1).setPreferredWidth(200); //Nombres
        modelo.getColumn(2).setPreferredWidth(180); //Ape. Paterno
        modelo.getColumn(3).setPreferredWidth(180); //Ape. Materno
        modelo.getColumn(4).setPreferredWidth(150); //Sueldo Base
        modelo.getColumn(5).setPreferredWidth(150); //Ventas Realizadas
        modelo.getColumn(6).setPreferredWidth(140); //Estado Civil
        modelo.getColumn(7).setPreferredWidth(130); //Número de hijo
        modelo.getColumn(8).setPreferredWidth(150); //Sueldo Neto
    }

}
