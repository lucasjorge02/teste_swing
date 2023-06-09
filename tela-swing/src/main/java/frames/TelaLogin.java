package frames;

import conexoes.banco.ConexaoAzure;
import classes.banco.Empresa;
import classes.banco.Login;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TelaLogin extends javax.swing.JFrame {

    private List<Login> listaUsuarios;
    private List<Empresa> listaEmpresa;

    public TelaLogin() {
        initComponents();
       
        
        
        Shape roundedShape = new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 20, 20);
        this.setShape(roundedShape);
        setLocationRelativeTo(null);
        setPlaceholder(iptUsuario, "Ex: admin");
        setPlaceholder(iptSenha, "***********");

    }

    private void setPlaceholder(JTextField field, String placeholder) {
        field.setForeground(Color.GRAY);
        field.setText(placeholder);

        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(Color.GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tittleError = new javax.swing.JLabel();
        tittleEagle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        iptUsuario = new javax.swing.JTextField();
        iptSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        tittleEagle1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ErrorEagle - Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittleError.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tittleError.setForeground(new java.awt.Color(153, 0, 0));
        tittleError.setText("Error");
        tittleError.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tittleError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tittleError, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        tittleEagle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tittleEagle.setForeground(new java.awt.Color(0, 0, 0));
        tittleEagle.setText("Eagle");
        tittleEagle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tittleEagle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tittleEagle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 0, 51));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 0, 0));
        btnLogin.setText("Entrar");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 32));

        iptUsuario.setBackground(new java.awt.Color(204, 204, 204));
        iptUsuario.setToolTipText("");
        iptUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        iptUsuario.setMinimumSize(new java.awt.Dimension(64, 25));
        iptUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(iptUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 167, -1));
        iptUsuario.getAccessibleContext().setAccessibleParent(iptUsuario);

        iptSenha.setBackground(new java.awt.Color(204, 204, 204));
        iptSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(iptSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 167, -1));

        txtLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtLogin.setText("USUÁRIO:");
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 20));

        txtSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setText("SENHA:");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 20));

        tittleEagle1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tittleEagle1.setForeground(new java.awt.Color(0, 0, 0));
        tittleEagle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleEagle1.setText("LOGIN");
        tittleEagle1.setToolTipText("");
        tittleEagle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tittleEagle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tittleEagle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, -1));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LUCAS\\Desktop\\teste_swing\\tela-swing\\src\\main\\java\\assets\\ErrorEagle.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 470, 390));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LUCAS\\Desktop\\teste_swing\\tela-swing\\src\\main\\java\\assets\\close.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptSenhaActionPerformed

    private void iptUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptUsuarioActionPerformed

    }//GEN-LAST:event_iptUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        ConexaoAzure conexao = new ConexaoAzure();
        TelaCaptura sc = new TelaCaptura(this);

        JdbcTemplate con = conexao.getConnection();
        String inpSenha = iptSenha.getText();
        String inpEmail = iptUsuario.getText();
        System.out.println(inpEmail);
        System.out.println(inpSenha);
        listaUsuarios = new ArrayList();

        listaUsuarios = con.query("select email, senha, firstAcess, statusFuncionario, fkEmpresa from Funcionario where email = ?",
                new BeanPropertyRowMapper(Login.class), inpEmail);

        if (listaUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
            iptSenha.setText("");
            iptUsuario.setText("");

        } else {

            Login usuario = listaUsuarios.get(0);

            // Fazer toda a validação do Com statusEmpresa 
            listaEmpresa = con.query("select statusEmpresa, bandaLarga from Empresa where id = ?",
                    new BeanPropertyRowMapper(Empresa.class), usuario.getFkEmpresa());

            Empresa empresa = listaEmpresa.get(0);

            if (empresa.getStatusEmpresa() == 0) {

                JOptionPane.showMessageDialog(null, "Verifique a validade do contrato com a errorEagle");

            } else if (usuario.getStatusFuncionario() == 0) {

                JOptionPane.showMessageDialog(null, "Você está inativado, verifique o acesso com seu supervisor ou algum responsável na empresa!");

            } else if (usuario.getSenha().equals(inpSenha)) {

                sc.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao logar! Tente mais tarde");
                System.exit(0);
            }

        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    public List<Login> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Login> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField iptSenha;
    private javax.swing.JTextField iptUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tittleEagle;
    private javax.swing.JLabel tittleEagle1;
    private javax.swing.JLabel tittleError;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
