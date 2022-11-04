package Lab9;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
 
import javax.swing.*;
import javax.swing.event.*;
 
public class ListTest extends JFrame implements ListSelectionListener{
 
      //JFrame frame = new JFrame("Selecting JList");
 
      String labels[] = { "Chardonnay", "Sauvignon", "Riesling", "Cabernet",
              "Zinfandel", "Merlot", "Pinot Noir", "Sauvignon Blanc",
              "Syrah", "Gewurztraminer" };
 
    JList jlist = new JList(labels);
 
    final JTextArea textArea = new JTextArea();
 
 
      ListTest(){
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
 
             JScrollPane scrollPane1 = new JScrollPane(jlist);
             add(scrollPane1, BorderLayout.WEST);
 
 
             textArea.setEditable(false);
             JScrollPane scrollPane2 = new JScrollPane(textArea);
             add(scrollPane2, BorderLayout.CENTER);
 
             jlist.addListSelectionListener(this);
 
             jlist.addMouseListener(new MyMouseListener());
 
             setSize(350, 200);
             setVisible(true);
 
 
 
      }
 
      public void valueChanged(ListSelectionEvent listSelectionEvent) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.print("First index: " + listSelectionEvent.getFirstIndex());
        pw.print(", Last index: " + listSelectionEvent.getLastIndex());
        boolean adjust = listSelectionEvent.getValueIsAdjusting();
        pw.println(", Adjusting? " + adjust);
        if (!adjust) {
          JList list = (JList) listSelectionEvent.getSource();
          int selections[] = list.getSelectedIndices();
          Object selectionValues[] = list.getSelectedValues();
          for (int i = 0, n = selections.length; i < n; i++) {
            if (i == 0) {
              pw.print("  Selections: ");
            }
            pw
                .print(selections[i] + "/" + selectionValues[i]
                    + " ");
          }
          pw.println();
        }
        textArea.append(sw.toString());
      }
 
      class MyMouseListener extends MouseAdapter{
            public void mouseClicked(MouseEvent mouseEvent) {
              JList theList = (JList) mouseEvent.getSource();
              if (mouseEvent.getClickCount() == 2) {
                int index = theList.locationToIndex(mouseEvent.getPoint());
                if (index >= 0) {
                  Object o = theList.getModel().getElementAt(index);
                  textArea.append("Double-clicked on: " + o.toString());
                  textArea.append(System.getProperty("line.separator"));
                }
              }
            }
      }
 
  public static void main(String args[]) {
        new ListTest();
 
   }
}
