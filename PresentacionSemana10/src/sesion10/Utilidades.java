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

    protected void alinearCeldas(JTable table, int alignment) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }

    protected void AnchoCeldas(TableColumnModel modelo) {
        modelo.getColumn(0).setPreferredWidth(30);
        modelo.getColumn(1).setPreferredWidth(100);
        modelo.getColumn(2).setPreferredWidth(100);
        modelo.getColumn(3).setPreferredWidth(100);
        modelo.getColumn(4).setPreferredWidth(100);
        modelo.getColumn(5).setPreferredWidth(70);
        modelo.getColumn(6).setPreferredWidth(100);
        modelo.getColumn(7).setPreferredWidth(50);
        modelo.getColumn(8).setPreferredWidth(80);
        modelo.getColumn(9).setPreferredWidth(40);
        modelo.getColumn(10).setPreferredWidth(100);
    }

}
