/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conector.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IFSP
 */
public class TelaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuarios
     */
    public TelaUsuarios() {
        initComponents();
        //Centraliza a tela no monitor
        this.setLocationRelativeTo(null);
        //desabilita o botão excluir
        btnEcluir.setEnabled(false);
        PopulaJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        brnSalvar = new javax.swing.JButton();
        btnEcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuários");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuários");

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        jLabel4.setText("Senha");

        brnSalvar.setText("Salvar");
        brnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSalvarActionPerformed(evt);
            }
        });

        btnEcluir.setText("Excluir");
        btnEcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcluirActionPerformed(evt);
            }
        });

        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuarios);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuários:");

        jLabel6.setText("ID");

        txtID.setEditable(false);
        txtID.setEnabled(false);
        txtID.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenha)
                                .addComponent(txtLogin)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNovo)
                                    .addGap(73, 73, 73)
                                    .addComponent(brnSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEcluir))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(brnSalvar)
                    .addComponent(btnEcluir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcluirActionPerformed
        String strID = txtID.getText();
        int opcao;
        opcao = JOptionPane.showConfirmDialog(
                null, 
                "Deseja excluir?",
                "Excluir?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                 null);
        if(opcao == 0){
            //exclui o registro
            Conector conector = new Conector();
            Connection con = (Connection) 
                conector.getConnection();
            PreparedStatement stm = null;
            String sql = 
                    "DELETE from Player where "
                    + "id = ?;";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, strID);
                stm.execute();
                JOptionPane.
                        showMessageDialog(null, 
                                "Usuário excuilido");
                stm.close();
                con.close();
                PopulaJtable();
                txtID.setText("");
                txtNome.setText("");
                txtLogin.setText("");
                btnEcluir.setEnabled(false);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
                
        }
    }//GEN-LAST:event_btnEcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtID.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
        btnEcluir.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jtUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuariosMouseClicked
        int linha = 
                jtUsuarios.getSelectedRow();
        txtID.setText(
           jtUsuarios.getValueAt(linha, 0).
                   toString());
        txtNome.setText(
            jtUsuarios.getValueAt(linha, 1).
                    toString());
        txtLogin.setText(
            jtUsuarios.getValueAt(linha, 2).
                    toString());
        btnEcluir.setEnabled(true);
    }//GEN-LAST:event_jtUsuariosMouseClicked

    private void brnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSalvarActionPerformed
        String strID = 
                txtID.getText();
        String strNome = 
                txtNome.getText();
        String strLogin = 
                txtLogin.getText();
        String strSenha = 
                txtSenha.getText();
        if(strID.equals("")){
            //Verifica os campos vazios
            if(strNome.equals("") || 
                    strSenha.equals("") ||
                    strLogin.equals("")){
                String strMsg = 
                        "Preencha todos"
                    + " os campos para "
                    + "salvar";
                JOptionPane.showMessageDialog(
                        null, strMsg);
            }else{
                //insere no banco
                String sql = "INSERT INTO Player "
                        + "(nome, login, senha) "
                        + "VALUES (?, ?, ?)";
                Conector conector = new Conector();
                Connection con = conector.getConnection(); 
                try {
                    PreparedStatement stm =
                            con.prepareStatement(sql);
                    stm.setString(1, strNome);
                    stm.setString(2, strLogin);
                    stm.setString(3, strSenha);
                    stm.execute();
                    stm.close();
                    con.close();
                    JOptionPane.showMessageDialog(
                        null, "Usuário inserido!");
                    txtNome.setText("");
                    txtLogin.setText("");
                    txtSenha.setText("");
                    PopulaJtable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(
                        null, ex);
                }
            }
        }
    }//GEN-LAST:event_brnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSalvar;
    private javax.swing.JButton btnEcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void PopulaJtable() {
        String sql = 
         "SELECT * FROM Player";
        try {
            Conector conector = new Conector();
            Connection con =
            conector.getConnection();        
            PreparedStatement banco =
                    con.prepareStatement(sql);
            banco.execute();
            ResultSet resultado =
                    banco.executeQuery(sql);
            DefaultTableModel model = 
                    (DefaultTableModel) 
                    jtUsuarios.getModel();
            model.setNumRows(0);
            while (resultado.next()){
                model.addRow(new Object[]{
                    resultado.getString("ID"),
                    resultado.getString("nome"),
                    resultado.getString("login")
                });
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
