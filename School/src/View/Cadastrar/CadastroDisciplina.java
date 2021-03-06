/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastrar;

import DAO.DisciplinaDAO;
import Model.Disciplina;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class CadastroDisciplina extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarMateria
     */
    public CadastroDisciplina() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFDisciplina = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setPreferredSize(new java.awt.Dimension(450, 300));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 119, 36));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Disciplinas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 90);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Disciplina");

        TFDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDisciplinaActionPerformed(evt);
            }
        });
        TFDisciplina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFDisciplinaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFDisciplinaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDisciplinaKeyTyped(evt);
            }
        });

        Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Disciplina128px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salvar))
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salvar)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 90, 450, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:

        if (TFDisciplina.getText().matches("[0-9]+") || TFDisciplina.getText().matches("[!@#$%¨&*]")) {
            JOptionPane.showMessageDialog(null, "Dados Invalidos", "", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TFDisciplina.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio", "", JOptionPane.ERROR_MESSAGE);
            } else if (TFDisciplina.getText().length() >= 30) {
                JOptionPane.showMessageDialog(null, "O tamanho deve ser no máximo 30 caracteres", "", JOptionPane.ERROR_MESSAGE);
            } else {
                String a = TFDisciplina.getText();
                String b = "";
                boolean continuar = true;
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) == ' ' && continuar) {

                    } else {
                        continuar = false;
                        b += a.charAt(i);
                      // System.out.println(b);
                    }
                }

                if (b.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio", "", JOptionPane.ERROR_MESSAGE);
                    TFDisciplina.setText("");
                } else {
                    cadastrarNoBanco(b);
                }
            }

        }
        

    }//GEN-LAST:event_SalvarActionPerformed

    private void cadastrarNoBanco(String a) {
        Disciplina disc = new Disciplina();
        DisciplinaDAO discDAO = new DisciplinaDAO();
        disc.setDisciplina(a);
        TFDisciplina.setText("");
        discDAO.criarDisciplina(disc);
    }
    private void TFDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDisciplinaActionPerformed

    private void TFDisciplinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDisciplinaKeyReleased
        // TODO add your handling code here:
        checkLength();


    }//GEN-LAST:event_TFDisciplinaKeyReleased

    private void TFDisciplinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDisciplinaKeyTyped
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_TFDisciplinaKeyTyped

    private void TFDisciplinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDisciplinaKeyPressed
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_TFDisciplinaKeyPressed

    private void checkLength() {
        if (TFDisciplina.getText().length() >= 30) {
            char[] textoTF = TFDisciplina.getText().toCharArray();
            String a = "";
            try {
                for (int i = 0; i < 30; i++) {
                    a += textoTF[i];

                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
            TFDisciplina.setText(a);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField TFDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
