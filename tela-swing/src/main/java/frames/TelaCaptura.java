/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes.banco.Componentes;
import conexoes.banco.ConexaoAzure;
import conexoes.banco.ConexaoLocal;
import classes.banco.Totem;
import frames.TelaLogin;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TelaCaptura extends javax.swing.JFrame {

    private List<Totem> listaTotem;
    private List<Componentes> listaComponentes;
    private TelaLogin telaLogin;

    public TelaCaptura(TelaLogin telaLogin) {
        initComponents();
        
        this.telaLogin = telaLogin;
        
   addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowOpened(java.awt.event.WindowEvent evt) {
            validarMaquinaRegistrada();
//          iniciarCaptura();
        }
    });
    }

    private void validarMaquinaRegistrada() {

        Looca looca = new Looca();
        
        ConexaoAzure conexaoA = new ConexaoAzure();
        JdbcTemplate conA = conexaoA.getConnection();
        
        ConexaoLocal conexaoL = new ConexaoLocal();
        JdbcTemplate conL = conexaoL.getConnection();
        
        Integer fkEmpresa = telaLogin.getListaUsuarios().get(0).getFkEmpresa();
        String hostNameAtual = looca.getRede().getParametros().getHostName();
        Boolean totemIsExists = false;
        listaTotem = new ArrayList();

        listaTotem = conA.query("select * from Totem where hostName = ?",
                new BeanPropertyRowMapper(Totem.class), hostNameAtual);
        

        if(!listaTotem.isEmpty()) {
            System.out.println("Totem cadastrado vou só capturar dados!");
            // capturarDados();
        }  else  {
            // cadastrei o totem
            System.out.println("Vou cadastrar esse totem na empresa que logou e tudo mais");
            conA.update("insert into Totem(hostName, fkEmpresa) values (?, ?)", hostNameAtual, fkEmpresa);
            // cadastrarComponentes();
            // capturarDados();
            
        } 
        
//   -------------------------------------- LOCAL -----------------------------------------
        
//        listaTotem = new ArrayList();
//        totemIsExists = false;
//        listaTotem = conL.query("select * from Totem where hostName = ?",
//                new BeanPropertyRowMapper(Totem.class), hostNameAtual);
//        if(listaTotem.size() == 1) {
//            System.out.println("Totem cadastrado vou só capturar dados!");
//        }  else if (listaTotem.isEmpty() && qtdTotem > 0 ) {
//            // cadastrei o totem
//            System.out.println("Vou cadastrar esse totem na empresa que logou e tudo mais");
//            conL.update("insert into Totem(hostName, fkEmpresa) values (?, ?)", hostNameAtual, fkEmpresa);
////            cadastrarComponentes();
//
////          capturarDados()
//        }  else {
//            System.out.println("Você atingiu o limite de totens do seu pacote! Essa máquina não poderá ser monitorada.");
//        }
    }

//    private void cadastrarComponentes() {
//        Looca looca = new Looca();
//        ConexaoAzure conexao = new ConexaoAzure();
//        JdbcTemplate con = conexao.getConnection();
//
//        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
//        List<Disco> discos = grupoDeDiscos.getDiscos();
//
//        RedeInterfaceGroup grupoDeInterfaces = looca.getRede().getGrupoDeInterfaces();
//        List<RedeInterface> grupodeInterface = grupoDeInterfaces.getInterfaces();
//        
//        
//        listaComponentes = new ArrayList();
//        listaComponentes = con.query("select * from componentes", new BeanPropertyRowMapper(Componentes.class));
//
//        System.out.println(listaComponentes);
//        
//        if (listaComponentes.isEmpty()) {
//            //criar modelos para o meu
//           
//            //Cadastrar CPU
//            con.update("insert into componente(nome, unidadeMedida) values ('CPU', 'GHz')");
//
//            //Cadastrar RAM
//            con.update("insert into componente(nome, unidadeMedida) values ('RAM', 'GB')");
//
//            //Cadastrar Disco
//            for (Disco disco : discos) {
//                long tamanhoDisco = disco.getTamanho();
//
//                // Converter para GB
//                Double tamanhoGB = (double) tamanhoDisco / (1024 * 1024 * 1024);
//
//                // Converter para TB
//                Double tamanhoTB = tamanhoGB / 1024;
//
//                if (tamanhoTB >= 1.0) {
//                    con.update("insert into componente(nome, unidadeMedida) values ('Disco', 'TB')");
//                } else {
//                    con.update("insert into componente(nome, unidadeMedida) values ('Disco', 'GB')");
//                }
//            }
//
//            //Cadastrar Rede
//            con.update("insert into componente(nome, unidadeMedida) values ('Rede', 'Mbps')");
//        } else {
//            // verificar se o meu se enquadra
//            // for
//            System.out.println("Não está vazia a Lista de Componentes!");
//            // se achei e se enquandra cadastro uma config com id do comp e fk do totem
//            // se não crio um componente com essa modalidade e cadastro com id e fk
//        }
//
//    }

    public TelaLogin getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }
    
    
    public void iniciarCaptura() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                System.out.println("Funcionei");
                // Restante do código...
            }
        }, 0, 5000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste de Tela");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funciona!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 220, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
