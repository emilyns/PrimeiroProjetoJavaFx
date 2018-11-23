
import com.placeholder.PlaceHolder;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Emily Nascimento
 */
public class JanelaCadastro extends javax.swing.JFrame {
    PlaceHolder holder;
    ArrayList<Funcionario> ListaFunc;
    String modo;
    
    public void LoadTableFun(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", 
                                                                      "Matricula",
                                                                      "CPF",
                                                                      "Nº da Carteira de Trabalho",
                                                                      "Periodo de Contrato"},0);
        
        
        for (int i = 0; i < ListaFunc.size(); i++) {
            modelo.addRow(new Object[]{ListaFunc.get(i).getNome(),
                                       ListaFunc.get(i).getTempo(),
                                       ListaFunc.get(i).getCpf(),
                                       ListaFunc.get(i).getMatricula(),
                                       ListaFunc.get(i).getCarteira(),});
        }
        tbl.setModel(modelo);
        tbl.getColumnModel().getColumn(1).setPreferredWidth(80);          //espaço nas colunas
        tbl.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbl.getColumnModel().getColumn(3).setPreferredWidth(30);
        tbl.getColumnModel().getColumn(4).setPreferredWidth(20);
        tbl.getColumnModel().getColumn(5).setPreferredWidth(20);
    }
    
    /**
     * Creates new form JanelaCadastro
     */
    public JanelaCadastro() {
        initComponents();
        
         
        holder = new PlaceHolder(Text1, "Digite seu nome aqui");        //deixar escrito no campo de digitação
        holder = new PlaceHolder(Text2, "Digite sua matricula");
        holder = new PlaceHolder(Text3, "Digite seu cpf aqui");
        holder = new PlaceHolder(Text4, "Digite seu numero aqui");
        holder = new PlaceHolder(Text5, "Digite aqui");
        
        setLocationRelativeTo(null);                                   //tela centralizada
        ListaFunc = new ArrayList();                                   //criar lista
        modo = "Navegar";
        ManusearInterface();
    }
    
    public void ManusearInterface(){
        switch(modo){
            case "Navegar":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                Text1.setEnabled(false);
                Text2.setEnabled(false);
                Text3.setEnabled(false);
                Text4.setEnabled(false);
                Text5.setEnabled(false);
                break;
            case "Novo":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_novo.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                Text1.setEnabled(true);
                Text2.setEnabled(true);
                Text3.setEnabled(true);
                Text4.setEnabled(true);
                Text5.setEnabled(true);
                break;
            case "Editar":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                Text1.setEnabled(true);
                Text2.setEnabled(true);
                Text3.setEnabled(true);
                Text4.setEnabled(true);
                Text5.setEnabled(true);
                break;
            case "Excluir":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                Text1.setEnabled(false);
                Text2.setEnabled(false);
                Text3.setEnabled(false);
                Text4.setEnabled(false);
                Text5.setEnabled(false);
                break;
            case "Selecao":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                Text1.setEnabled(false);
                Text2.setEnabled(false);
                Text3.setEnabled(false);
                Text4.setEnabled(false);
                Text5.setEnabled(false);
            default: System.out.println("Modo inválido");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text2 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 204, 255));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "CPF", "Nº da Carteira de Trabalho", "Período de COntrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbl.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbl.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbl.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro"));

        btn_novo.setBackground(new java.awt.Color(51, 204, 255));
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button-novo (1).png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(51, 204, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-editar (2).png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(51, 204, 255));
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button-excluir (1).png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Período de Contrato:");

        jLabel4.setText("Matrícula:");

        jLabel5.setText("Nº da Carteira de Trabalho:");

        btn_salvar.setBackground(new java.awt.Color(51, 204, 255));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(51, 204, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_novo)
                        .addGap(38, 38, 38)
                        .addComponent(btn_editar)
                        .addGap(39, 39, 39)
                        .addComponent(btn_excluir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Text5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text2)
                            .addComponent(Text4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btn_salvar)
                        .addGap(62, 62, 62)
                        .addComponent(btn_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_excluir))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Funcionário", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
        
        modo = "Novo";
        ManusearInterface();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
        modo = "Navegar";
        ManusearInterface();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(modo.equals("Novo")){
            Funcionario F = new Funcionario(Text1.getText(),Text2.getText(),Text3.getText(),Text4.getText(),Text5.getText());
            ListaFunc.add(F);
        }else if(modo.equals("Editar")){
            int index = tbl.getSelectedRow();
            ListaFunc.get(index).setNome(Text1.getText());
            ListaFunc.get(index).setTempo(Text2.getText());
            ListaFunc.get(index).setCpf(Text3.getText());
            ListaFunc.get(index).setMatricula(Text4.getText());
            ListaFunc.get(index).setCarteira(Text5.getText());
        }
        LoadTableFun();
        modo = "Navegar";
        ManusearInterface();
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int index = tbl.getSelectedRow();
        if(index >= 0 && index < ListaFunc.size()){
            Funcionario f = ListaFunc.get(index);
            
            Text1.setText(f.getNome());
            Text2.setText(f.getTempo());
            Text3.setText(f.getCpf());
            Text4.setText(f.getMatricula());
            Text5.setText(f.getCarteira());
            modo = "Selecao";
            ManusearInterface();
        }
    }//GEN-LAST:event_tblMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        modo = "Editar";
        ManusearInterface();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int index = tbl.getSelectedRow();
        if(index >= 0 && index < ListaFunc.size()){
            ListaFunc.remove(index);
        }
        LoadTableFun();
        modo = "Navegar";
        ManusearInterface();
    }//GEN-LAST:event_btn_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JTextField Text5;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
