package com.mycompany.pattern_games.swing;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import com.mycompany.pattern_games.entidades.Cliente;
import com.mycompany.pattern_games.gerenciadores.GerenciadorDeCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/**
 *
 * @author kaique
 */
public class Edit_Client extends javax.swing.JPanel {

    /**
     * Creates new form New_Client
     */
    public Edit_Client() {
        initComponents();
        this.clientJlist.setListData(new GerenciadorDeCliente().listCliente().toArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisarClienteTextFild = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientJlist = new javax.swing.JList();
        jSeparator5 = new javax.swing.JSeparator();
        emailTextFild = new javax.swing.JTextField();
        editarJbutton = new javax.swing.JButton();
        cancelarJbutton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeTextFild = new javax.swing.JTextField();
        CPFJtextFild = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Editar Cliente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisar :");

        pesquisarClienteTextFild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisarClienteTextFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteTextFildActionPerformed(evt);
            }
        });
        pesquisarClienteTextFild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisarClienteTextFildKeyPressed(evt);
            }
        });

        clientJlist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        clientJlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientJlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientJlist);

        emailTextFild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTextFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFildActionPerformed(evt);
            }
        });

        editarJbutton.setText("Salvar");
        editarJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarJbuttonActionPerformed(evt);
            }
        });

        cancelarJbutton.setText("Cancelar");
        cancelarJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJbuttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("CPF");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("E-mail");

        nomeTextFild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            CPFJtextFild.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarClienteTextFild, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                    .addComponent(jSeparator5))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addComponent(nomeTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(CPFJtextFild))
                        .addComponent(emailTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editarJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(cancelarJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesquisarClienteTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFJtextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarClienteTextFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteTextFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarClienteTextFildActionPerformed

    private void emailTextFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFildActionPerformed

    private void editarJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarJbuttonActionPerformed
        GerenciadorDeCliente gc = new GerenciadorDeCliente();
        CPFValidator validator = new CPFValidator();
        Cliente clienteSelecionado = (Cliente) clientJlist.getSelectedValue();

        clienteSelecionado.setNome(nomeTextFild.getText());
        clienteSelecionado.setCpf(CPFJtextFild.getText());
        clienteSelecionado.setEmail(emailTextFild.getText());

        if (gc.updateCliente(clienteSelecionado)) {
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso.");
        } else {
            List<ValidationMessage> invalidMessagesFor = validator.invalidMessagesFor(CPFJtextFild.getText());
            for (ValidationMessage invalidMessagesFor1 : invalidMessagesFor) {
                JOptionPane.showMessageDialog(null, invalidMessagesFor1);
            }

        }
    }//GEN-LAST:event_editarJbuttonActionPerformed

    private void cancelarJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJbuttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarJbuttonActionPerformed

    private void pesquisarClienteTextFildKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarClienteTextFildKeyPressed
        clientJlist.setSelectedIndex(clientJlist.getNextMatch(pesquisarClienteTextFild.getText(), 0, Position.Bias.Forward));
    }//GEN-LAST:event_pesquisarClienteTextFildKeyPressed

    private void clientJlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientJlistMouseClicked
        Cliente clienteSelecionado = (Cliente) clientJlist.getSelectedValue();
        nomeTextFild.setText(clienteSelecionado.getNome());
        CPFJtextFild.setText(clienteSelecionado.getCpf());
        emailTextFild.setText(clienteSelecionado.getEmail());
    }//GEN-LAST:event_clientJlistMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CPFJtextFild;
    private javax.swing.JButton cancelarJbutton;
    private javax.swing.JList clientJlist;
    private javax.swing.JButton editarJbutton;
    private javax.swing.JTextField emailTextFild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nomeTextFild;
    private javax.swing.JTextField pesquisarClienteTextFild;
    // End of variables declaration//GEN-END:variables
}
