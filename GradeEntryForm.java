/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GradeEntryForm.java
 *
 * Created on Jan 21, 2012, 5:37:49 PM
 */
package Presentation;
import Application.Course;
import Application.Student;
import Application.Employee;

/**
 *
 * @author lapowner
 */
public class GradeEntryForm extends javax.swing.JFrame {

    Course[] course;
    Student[] student;
    int count = 0, length = 0, courseid = 0, studentid = 0;
    /** Creates new form GradeEntryForm */
    public GradeEntryForm() {
        initComponents();
        getStudentList();
        course = student[count].getCourseList(0); 

        int len = course.length;
        
        String[] str= new String[len];

        try{
            for(int i = 0; i<len; i++) 
                str[i] = course[i].getTitle();            
            CourseList.setListData(str);
        }
        catch (Exception e){};
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        InsertButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        StudentListLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CourseList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grade Entry Form");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First name", "Father's name", "Grandfather's name", "Grade Erned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                StudentTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTable);

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        StudentListLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));

        CourseList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        CourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CourseList);

        jLabel1.setText("Select a course from the list below");

        jLabel2.setText("Enter the \"Grade Erned\" for");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(InsertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(ClearButton)
                        .addGap(107, 107, 107)
                        .addComponent(CloseButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(StudentListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertButton)
                    .addComponent(CloseButton)
                    .addComponent(ClearButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void CourseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseListMouseClicked
        try{
            for(int i=0; i< length;i++){
               StudentTable.setValueAt(null, i, 0);
               StudentTable.setValueAt(null, i, 1);            
               StudentTable.setValueAt(null, i, 2);
               StudentTable.setValueAt(null, i, 3);           
            }
            int k = CourseList.getLeadSelectionIndex();
            //Display the selected course for which grade is entered
            StudentListLabel.setText(course[k].getTitle());        

            Student stud = new Student();
            courseid = course[k].getCourseId();
            student = stud.getStudentsRegisteredFor(courseid);
            length = student.length;
            for(int i = 0; i < length; i++){
                   StudentTable.setValueAt(student[i].getName(), i, 0);
                   StudentTable.setValueAt(student[i].getFatherName(), i, 1);            
                   StudentTable.setValueAt(student[i].getGrandFather(), i, 2); 
            }
        }
        catch (Exception e) {}
    }//GEN-LAST:event_CourseListMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        try{ 
            for(int i=0; i< length;i++)
               StudentTable.setValueAt(null, i, 3);  
        }
        catch (Exception e) {}        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        try{
            Employee employee = new Employee();
            boolean isValid = false;
            for(int i = 0; i < length; i++){
                //grade input validation
                String grade = StudentTable.getValueAt(i, 3).toString();
                if(grade!=null){
                    String[] lettergrades = {"A","B","C","D","F","N","I"};
                    for (int j = 0; j< lettergrades.length; j++)
                        if(grade.equals(lettergrades[j])) isValid = true;
                    if(isValid);
                        employee.SubmitGrade(student[i].getId(),courseid, grade);
                    //JOptionPane.showMessageDialog(null, student[i].getId()+" "+courseid+" "+StudentTable.getValueAt(i, 3));
                }
            }  
            this.dispose();
        }
        catch (Exception e){}
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void StudentTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentTableKeyReleased
        try{
            boolean isValid = false;
            String[] lettergrades = {"A","B","C","D","F"};        
            for(int i = 0; i < length; i++){
                //grade input validation
                isValid = false;
                String grade = StudentTable.getValueAt(i, 3).toString();
                for (int j = 0; j< lettergrades.length; j++)
                    if(grade.equals(lettergrades[j])) isValid = true;
                if(!isValid)
                    StudentTable.setValueAt("invalid",i, 3);
                }   
        }
        catch (Exception e){}
    }//GEN-LAST:event_StudentTableKeyReleased

    private void getStudentList(){
        try{
             Student stud = new Student();
             student = stud.getStudentList();
        }
        catch (Exception e) {}         
    }
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
            java.util.logging.Logger.getLogger(GradeEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GradeEntryForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JList CourseList;
    private javax.swing.JButton InsertButton;
    private javax.swing.JLabel StudentListLabel;
    private javax.swing.JTable StudentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
