/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
NEW
 */
package Account;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author ozknsmz
 */
public class UserPanel extends javax.swing.JFrame {

    public  JTable getMytable() {
        return mytable;
    }

int k=0;
  
 /**
     * Creates new form User_Panel
     */
    DefaultTableModel model, model2 ;//model1-event,model2-mytable
     
    
    
    public void dinamicSearch(String search){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        tableevent.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }
       
       
    private static Scanner x; 
    public static void removeRecord(String filepath,Object removeTerm)
    {
        System.out.println(filepath);
        String tempFile="updatejoinEvent.txt";
        File oldFile=new File(filepath);
        File newFile=new File(tempFile);
        
        String name,loc,date,username;
        Object id;
    
        try{
        FileWriter fw=new FileWriter(tempFile);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        
        x=new Scanner (new File(filepath));
        x.useDelimiter(",");
        
        while(x.hasNextLine())
        {
            String line=x.nextLine();
            String [] arr=line.split(",");
            
            
        
            if(!arr[1].equals(removeTerm))
            {
                pw.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
            
            }
        }
        x.close();
        pw.flush();
        pw.close();
        oldFile.delete();
        File dump=new File(filepath);
        newFile.renameTo(dump);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        
        
        
        }
    
    
    
    }
     
    
    
    public UserPanel() {
        initComponents();
      

       
        notipan.setVisible(false);
        gif.setVisible(false);
        scrolpan.setVisible(false);
 
       
        
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Events = new javax.swing.JPanel();
        lbw = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        gif = new javax.swing.JLabel();
        displabel = new javax.swing.JLabel();
        joinlabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        srcev = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        scrolpan = new javax.swing.JScrollPane();
        tableevent = new javax.swing.JTable();
        Myevents = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        notification = new javax.swing.JLabel();
        bleave = new javax.swing.JButton();
        displabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        eventlabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        notipan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tanoti = new javax.swing.JTextArea();
        mytablepan = new javax.swing.JScrollPane();
        mytable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Panel");
        setUndecorated(true);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        lbw.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbw.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(6, 36, 61));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/upcoming event.gif"))); // NOI18N
        gif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray));

        displabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        displabel.setForeground(new java.awt.Color(255, 255, 255));
        displabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/icons8-show-property-64.png"))); // NOI18N
        displabel.setText("DISPLAY EVENTS");
        displabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displabelMouseExited(evt);
            }
        });

        joinlabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        joinlabel.setForeground(new java.awt.Color(255, 255, 255));
        joinlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/icons8-add-64.png"))); // NOI18N
        joinlabel.setText("JOIN EVENTS");
        joinlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                joinlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                joinlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(gif)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displabel, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(joinlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(displabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joinlabel)
                .addGap(56, 56, 56)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gif, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 380, 770);

        jPanel3.setBackground(new java.awt.Color(6, 36, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/icons8-search-64.png"))); // NOI18N

        srcev.setBackground(new java.awt.Color(204, 204, 255));
        srcev.setForeground(new java.awt.Color(0, 51, 51));
        srcev.setText("SEARCH EVENT...");
        srcev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srcevMouseClicked(evt);
            }
        });
        srcev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcevActionPerformed(evt);
            }
        });
        srcev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srcevKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(srcev, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srcev))
                .addGap(43, 43, 43))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(390, 0, 690, 140);

        info.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        info.setText("Event Process ....");
        jPanel1.add(info);
        info.setBounds(420, 120, 587, 72);

        tableevent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Id", "Event Name", "Event Location", "Event Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrolpan.setViewportView(tableevent);
        if (tableevent.getColumnModel().getColumnCount() > 0) {
            tableevent.getColumnModel().getColumn(0).setResizable(false);
            tableevent.getColumnModel().getColumn(1).setResizable(false);
            tableevent.getColumnModel().getColumn(2).setResizable(false);
            tableevent.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(scrolpan);
        scrolpan.setBounds(400, 200, 660, 570);

        javax.swing.GroupLayout EventsLayout = new javax.swing.GroupLayout(Events);
        Events.setLayout(EventsLayout);
        EventsLayout.setHorizontalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lbw, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(776, Short.MAX_VALUE))
            .addGroup(EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventsLayout.setVerticalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
            .addGroup(EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Events", Events);

        Myevents.setBackground(new java.awt.Color(51, 255, 204));

        jPanel5.setBackground(new java.awt.Color(6, 36, 61));
        jPanel5.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(80, 670, 200, 40);

        notification.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 255, 255));
        notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/icons8-info-64.png"))); // NOI18N
        notification.setText("ANNOUNCEMENTS");
        notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notificationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notificationMouseExited(evt);
            }
        });
        jPanel5.add(notification);
        notification.setBounds(40, 240, 310, 60);

        bleave.setBackground(new java.awt.Color(6, 36, 61));
        bleave.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        bleave.setForeground(new java.awt.Color(255, 51, 51));
        bleave.setText("leave event");
        bleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleaveActionPerformed(evt);
            }
        });
        jPanel5.add(bleave);
        bleave.setBounds(70, 350, 260, 60);

        displabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        displabel1.setForeground(new java.awt.Color(255, 255, 255));
        displabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/icons8-show-property-64.png"))); // NOI18N
        displabel1.setText("DISPLAY MY EVENTS");
        displabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displabel1MouseExited(evt);
            }
        });
        jPanel5.add(displabel1);
        displabel1.setBounds(40, 160, 320, 64);

        jPanel6.setBackground(new java.awt.Color(6, 36, 61));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        eventlabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        eventlabel.setText("Event Process...");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));

        notipan.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account/announcement2.gif"))); // NOI18N

        tanoti.setColumns(20);
        tanoti.setRows(5);
        jScrollPane1.setViewportView(tanoti);

        javax.swing.GroupLayout notipanLayout = new javax.swing.GroupLayout(notipan);
        notipan.setLayout(notipanLayout);
        notipanLayout.setHorizontalGroup(
            notipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notipanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        notipanLayout.setVerticalGroup(
            notipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notipanLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(notipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        mytablepan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Id", "Event Name", "Event Location", "Event Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mytablepan.setViewportView(mytable);
        if (mytable.getColumnModel().getColumnCount() > 0) {
            mytable.getColumnModel().getColumn(0).setResizable(false);
            mytable.getColumnModel().getColumn(1).setResizable(false);
            mytable.getColumnModel().getColumn(2).setResizable(false);
            mytable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLayeredPane1.setLayer(notipan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(mytablepan, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mytablepan, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mytablepan, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MyeventsLayout = new javax.swing.GroupLayout(Myevents);
        Myevents.setLayout(MyeventsLayout);
        MyeventsLayout.setHorizontalGroup(
            MyeventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyeventsLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MyeventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MyeventsLayout.createSequentialGroup()
                        .addGroup(MyeventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1)
                            .addGroup(MyeventsLayout.createSequentialGroup()
                                .addComponent(eventlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        MyeventsLayout.setVerticalGroup(
            MyeventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyeventsLayout.createSequentialGroup()
                .addGroup(MyeventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MyeventsLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("MyEvents", Myevents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String user=Welcomepage.username.getText();
         lbw.setText("Login as: "+user);
        
       
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void bleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bleaveActionPerformed
      
       model2 = (DefaultTableModel) mytable.getModel();
    
      int selected_row=mytable.getSelectedRow();

    
      String username =Welcomepage.username.getText();
      
      if(mytable.getRowCount()!=0)
      {
          if(selected_row==-1)
          eventlabel.setText("Select a row to leave !");
          else
           {
              Object id= mytable.getValueAt(selected_row, 0);
              
          
              removeRecord("joinedEvent.txt",id);
           
              eventlabel.setText("You have leaved "+ mytable.getValueAt(selected_row, 1)+" event successfully !"  );
              model2.removeRow(selected_row);
         
           }
      }
      else
          eventlabel.setText("There is no event to leave !");
      
        
        
    }//GEN-LAST:event_bleaveActionPerformed

    private void srcevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srcevMouseClicked
        srcev.setText("");
    }//GEN-LAST:event_srcevMouseClicked

    private void srcevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Welcomepage a=new Welcomepage();
        a.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void srcevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcevKeyReleased
      String search=srcev.getText();
        dinamicSearch(search);
        
        
    }//GEN-LAST:event_srcevKeyReleased

    private void joinlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinlabelMouseClicked
       model = (DefaultTableModel) tableevent.getModel();
       model2 = (DefaultTableModel) mytable.getModel();
        
       String username=Welcomepage.username.getText();

        int selected_row=tableevent.getSelectedRow();

       if(!scrolpan.isShowing())
       info.setText("Display events first !");
       
        if(tableevent.getRowCount() > 0)
        {
            if(selected_row!=-1)
            {

                int id=(int) model.getValueAt(selected_row, 0);
                String name=(String) model.getValueAt(selected_row,1);
                String loc=(String) model.getValueAt(selected_row,2);
                String date=(String) model.getValueAt(selected_row,3);

                UserInfo.joinedEventWriter(username, id, name, loc, date);

                Object [] o={id,name,loc,date};
                model2.addRow(o);
                
                
                info.setText("You joined "+name+ " event successfully !!");
                model.removeRow(selected_row);
                tableevent.clearSelection();
              

            }
            else{
                info.setText("Select a row to join event !");
            }

        }
        if(tableevent.getRowCount()<1)
            info.setText("There is no event to join !");
       

       
    }//GEN-LAST:event_joinlabelMouseClicked

    private void joinlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinlabelMouseEntered
        joinlabel.setForeground(Color.red);
    }//GEN-LAST:event_joinlabelMouseEntered

    private void joinlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinlabelMouseExited
        joinlabel.setForeground(Color.white);
    }//GEN-LAST:event_joinlabelMouseExited

    private void notificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseClicked

        
        
        if(notipan.isShowing()){
           notipan.setVisible(false);
           mytablepan.setVisible(false);
           
        }
        else
        {
           notipan.setVisible(true);     
           mytablepan.setVisible(false);
           
            try {
                String text=Admin_Panel.getTa().getText();
                tanoti.setText(text);
                
            } catch (NullPointerException e) {
                tanoti.setText("There is no announcement !");
            }
           
           
          
        }
        
        
        
    }//GEN-LAST:event_notificationMouseClicked

    private void displabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabelMouseExited
        displabel.setForeground(Color.white);
    }//GEN-LAST:event_displabelMouseExited

    private void displabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabelMouseEntered
        displabel.setForeground(Color.red);
    }//GEN-LAST:event_displabelMouseEntered

    private void displabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabelMouseClicked
        gif.setVisible(true);
        scrolpan.setVisible(true);

        model= (DefaultTableModel) tableevent.getModel();

        int size=Admin.getMyEvent().size();

        int row_count=tableevent.getRowCount();

        for (int i = 0; i < size; i++) {
            if(row_count<size)
            {
                Object [] o={Admin.getMyEvent().get(i).getEvent_id(),Admin.getMyEvent().get(i).getEvent_name(),Admin.getMyEvent().get(i).getLocation(),Admin.getMyEvent().get(i).getCalendartoString()};
                model.addRow(o);

                row_count++;

            }

        }
    }//GEN-LAST:event_displabelMouseClicked

    private void displabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabel1MouseClicked
       

        if(mytablepan.isShowing())
        {
            mytablepan.setVisible(false);
            notipan.setVisible(false);
        }
        else{
            mytablepan.setVisible(true);
            notipan.setVisible(false);
            
            if(mytable.getRowCount()<1)
                eventlabel.setText("There is no event ");
            else
                eventlabel.setText("Event Process ...");
            
        String username=Welcomepage.username.getText();
       
        try {//joinedEvent.txt reader 
            BufferedReader br = new BufferedReader(new FileReader("joinedEvent.txt"));
           
            
            DefaultTableModel model = (DefaultTableModel)mytable.getModel();
     
            
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            
       
            for(int i = 0; i < tableLines.length; i++)
            {
                if(k<tableLines.length && tableLines.length !=mytable.getRowCount() )
                {String line = tableLines[i].toString().trim();
                
                
                String[] dataRow = line.split(",");
                if(dataRow[0].equals(username)){
                Object [] o={dataRow[1],dataRow[2],dataRow[3],dataRow[4]};
                model.addRow(o);
                 k++;
                }
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }

        
   
      
    }//GEN-LAST:event_displabel1MouseClicked

    private void displabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabel1MouseEntered
          displabel1.setForeground(Color.red);
    }//GEN-LAST:event_displabel1MouseEntered

    private void displabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displabel1MouseExited
        displabel1.setForeground(Color.white);
    }//GEN-LAST:event_displabel1MouseExited

    private void notificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseEntered
        notification.setForeground(Color.red);
    }//GEN-LAST:event_notificationMouseEntered

    private void notificationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseExited
       notification.setForeground(Color.white);
    }//GEN-LAST:event_notificationMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Events;
    private javax.swing.JPanel Myevents;
    private javax.swing.JButton bleave;
    private javax.swing.JLabel displabel;
    private javax.swing.JLabel displabel1;
    private javax.swing.JLabel eventlabel;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel joinlabel;
    public static javax.swing.JLabel lbw;
    public javax.swing.JTable mytable;
    private javax.swing.JScrollPane mytablepan;
    private javax.swing.JLabel notification;
    private javax.swing.JPanel notipan;
    private javax.swing.JScrollPane scrolpan;
    private javax.swing.JTextField srcev;
    private javax.swing.JTable tableevent;
    private javax.swing.JTextArea tanoti;
    // End of variables declaration//GEN-END:variables
}
