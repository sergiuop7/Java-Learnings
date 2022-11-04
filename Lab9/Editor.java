package Lab9;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
import javax.swing.*;
 
 
public class Editor extends JFrame
{
      JMenuBar mb;
      JMenu f;
      JMenu t;
      JMenuItem s,o,e;
      JTextArea ta;
 
      Editor()
      {
            mb = new JMenuBar();
            f = new JMenu("File");
 
            s = new JMenuItem("Save");
            o = new JMenuItem("Open");
            e = new JMenuItem("Exit");
 
            s.addActionListener(new A());
            o.addActionListener(new A());
            e.addActionListener(new A());
 
            mb.add(f);
            f.add(s);
            f.add(o);
            f.add(e);
 
            setJMenuBar(mb);
 
            ta = new JTextArea();
            add(ta);
 
            setSize(500,400);
            setVisible(true);
      }
 
      void save(String f)
      {
            try
            {
            PrintWriter pw = new PrintWriter(
                  new FileWriter(new File(f)));
            pw.println(ta.getText());
            pw.close();
            }catch(Exception e)
            {
 
            }
 
      }
 
      void open(String f)
      {
            try
            {
            ta.setText("");
            BufferedReader bf =
                  new BufferedReader(
                        new FileReader(new File(f)));
            String l = "";
            l = bf.readLine();
            while (l!=null)
            {
                  ta.append(l+"\n");
                  l = bf.readLine();
            }
            }catch(Exception e){}
      }
 
      class A implements ActionListener
      {
            public void actionPerformed(ActionEvent e)
            {
                  String t = ((JMenuItem)e.getSource()).getLabel();           
                  if(t.equals("Save")){
                  FileDialog d = new FileDialog(Editor.this,"Incarca f",FileDialog.SAVE);
                  d.setVisible(true);
                  save(d.getDirectory()+d.getFile());
                  }
 
                  if (t.equals("Open"))
                  {
                   FileDialog d = new FileDialog(Editor.this,"Incarca f",FileDialog.LOAD);
                   d.setVisible(true);
                   open(d.getDirectory()+d.getFile());
                  }
 
            }
      }
 
      public static void main(String args[])
      {
            new Editor();
      }
}
