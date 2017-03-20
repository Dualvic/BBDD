package org.foobarspam.interfaz;

/*
* Libraries
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.foobarspam.personas.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */

public class PracticaCheckbox extends javax.swing.JFrame {
    
    // Variable declaration (Arraylist persons, simulating a DB)
    
    static ArrayList<Persona> personas = new ArrayList<>();
 
 
    /**
     * Creates the form "Checkbox practice"
     */
    
    public PracticaCheckbox() {
        initComponents();
    }

    /**
     * Form init
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        checkUnemployment = new javax.swing.JCheckBox();
        checkStudent = new javax.swing.JCheckBox();
        checkWorker = new javax.swing.JCheckBox();
        genreComboBox = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NameField.setText(" Introduce tu nombre");
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        surnameField.setText(" Introduce tus apellidos");

        checkUnemployment.setText("En paro");
        checkUnemployment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUnemploymentActionPerformed(evt);
            }
        });

        checkStudent.setText("Estudiante");
        checkStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStudentActionPerformed(evt);
            }
        });

        checkWorker.setText("Trabajador");
        checkWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWorkerActionPerformed(evt);
            }
        });

        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        Save.setText("Guardar");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setText("Limpiar");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        nameLabel.setText("Nombre");

        surnameLabel.setText("Apellidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkUnemployment)
                        .addGap(18, 18, 18)
                        .addComponent(checkStudent)
                        .addGap(18, 18, 18)
                        .addComponent(checkWorker))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Save)
                        .addGap(18, 18, 18)
                        .addComponent(Clear)
                        .addGap(18, 18, 18)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(surnameField)
                            .addComponent(NameField)))
                    .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkUnemployment)
                    .addComponent(checkStudent)
                    .addComponent(checkWorker))
                .addGap(18, 18, 18)
                .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Clear)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Checkbox for worker status
    */
    
    private void checkWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWorkerActionPerformed
        checkStudent.setSelected(false);
        checkUnemployment.setSelected(false);
    }//GEN-LAST:event_checkWorkerActionPerformed
    /*
    * Clear button and his logic
    */
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
                
        NameField.setText("");
        surnameField.setText("");
        checkUnemployment.setSelected(false);
        checkWorker.setSelected(false);
        checkStudent.setSelected(false);
        genreComboBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_ClearActionPerformed
    /*
    * Exit button and his logic
    */
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    try(FileWriter fw = new FileWriter("src/org/foobarspam/savedfiles/savedfiles.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {
					for (int i = 0; i<personas.size(); i++) {
						out.println(personas.get(i).getName()+ " " + personas.get(i).getSurname() + " " +
									personas.get(i).getStatus()+ " " +
									personas.get(i).getGenre());
					}
					} catch (IOException error) {
						System.out.println(error);
					}   
        
        
        if (evt.getSource() == Exit) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed
    
    /*
    * Save button and his logic
    */
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if (evt.getSource() == Save) {
            
            String name = NameField.getText();
            String surname = surnameField.getText();
            String genre = genreComboBox.getSelectedItem().toString();
            String status = "";
            
            if (checkUnemployment.isSelected()) {
                status = "en paro";
            }else if (checkStudent.isSelected()) {
                status = "estudiante";

            } else {
                status = "trabajador";
            }
            
            // create person and saved on the arraylist persona 
            
            Persona p = new Persona(name, surname, status, genre);
            personas.add(p);
            
            // Correct input message
            
            String message = "Acabas de guardar " + p.toStringPesona() + " Correctamente";
            JOptionPane.showMessageDialog(null, message);
        }
    }//GEN-LAST:event_SaveActionPerformed
    
    /*
    * Checkbox for unemployer status
    */
    
    private void checkUnemploymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUnemploymentActionPerformed
        checkStudent.setSelected(false);
        checkWorker.setSelected(false);
    }//GEN-LAST:event_checkUnemploymentActionPerformed

    /*
    * Checkbox for student status
    */
    
    private void checkStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStudentActionPerformed
        checkUnemployment.setSelected(false);
        checkWorker.setSelected(false);
    }//GEN-LAST:event_checkStudentActionPerformed
    
    /*
    * Input name field
    */
    
    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
 
    }//GEN-LAST:event_NameFieldActionPerformed

    /*
     * command line for run
     */
    
    public static void main(String args[]) {

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticaCheckbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton Save;
    private javax.swing.JCheckBox checkStudent;
    private javax.swing.JCheckBox checkUnemployment;
    private javax.swing.JCheckBox checkWorker;
    private javax.swing.JComboBox<String> genreComboBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    // End of variables declaration//GEN-END:variables
}
