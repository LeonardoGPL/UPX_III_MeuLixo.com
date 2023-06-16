/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package upxiii;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JList;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author leogo
 */
public class AtualizarLocal extends javax.swing.JFrame {
    ArrayList<String> checkboxitens = new ArrayList();
    /**
     * Creates new form AtualizarLocal
     */
    public AtualizarLocal() {
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

        jLabel10 = new javax.swing.JLabel();
        btn_salvar_atualizar = new javax.swing.JButton();
        btn_voltar_atualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfc_bairro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfc_nome = new javax.swing.JTextField();
        tfc_email = new javax.swing.JTextField();
        tfc_rua = new javax.swing.JTextField();
        tfc_tel = new javax.swing.JTextField();
        tfc_num = new javax.swing.JTextField();
        tfc_compl = new javax.swing.JTextField();
        tfc_cep = new javax.swing.JTextField();
        tfc_cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_id = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        chkSmart = new javax.swing.JCheckBox();
        chkTablet = new javax.swing.JCheckBox();
        chkPilha = new javax.swing.JCheckBox();
        chkOleo = new javax.swing.JCheckBox();
        chkMed = new javax.swing.JCheckBox();
        chkSofa = new javax.swing.JCheckBox();
        chkMicro = new javax.swing.JCheckBox();
        cb_cat = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        tfc_id_atl = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualiza��o de Dados");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Baloo 2", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 90, 72));
        jLabel10.setText("Atualiza��o de Dados");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 10, 390, 40);

        btn_salvar_atualizar.setBackground(new java.awt.Color(240, 240, 240));
        btn_salvar_atualizar.setFont(new java.awt.Font("Baloo 2", 1, 18)); // NOI18N
        btn_salvar_atualizar.setForeground(new java.awt.Color(122, 122, 122));
        btn_salvar_atualizar.setText("Salvar");
        btn_salvar_atualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        btn_salvar_atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar_atualizar);
        btn_salvar_atualizar.setBounds(640, 490, 166, 54);

        btn_voltar_atualizar.setBackground(new java.awt.Color(240, 240, 240));
        btn_voltar_atualizar.setFont(new java.awt.Font("Baloo 2", 1, 18)); // NOI18N
        btn_voltar_atualizar.setForeground(new java.awt.Color(122, 122, 122));
        btn_voltar_atualizar.setText("Voltar");
        btn_voltar_atualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        btn_voltar_atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar_atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar_atualizar);
        btn_voltar_atualizar.setBounds(70, 490, 170, 50);

        jPanel1.setBackground(new java.awt.Color(237, 250, 234));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(508, 771));
        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(122, 122, 122));
        jLabel14.setText("Bairro");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 250, 36, 17);

        tfc_bairro.setForeground(new java.awt.Color(122, 122, 122));
        tfc_bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_bairro);
        tfc_bairro.setBounds(140, 240, 210, 18);

        jLabel1.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 122, 122));
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(36, 75, 70, 25);

        jLabel2.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 122, 122));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(36, 106, 70, 25);

        jLabel3.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 122, 122));
        jLabel3.setText("logradouro");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(36, 174, 80, 25);

        jLabel4.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 122, 122));
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(36, 137, 70, 25);

        jLabel5.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(122, 122, 122));
        jLabel5.setText("Complemento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 270, 93, 25);

        jLabel6.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(122, 122, 122));
        jLabel6.setText("N�mero");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(36, 211, 70, 25);

        jLabel7.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(122, 122, 122));
        jLabel7.setText("Cidade");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 330, 70, 25);

        jLabel8.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(122, 122, 122));
        jLabel8.setText("CEP");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 300, 70, 25);

        jLabel9.setFont(new java.awt.Font("Baloo 2", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 90, 72));
        jLabel9.setText("Dados Pessoais");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(36, 11, 290, 58);

        tfc_nome.setForeground(new java.awt.Color(122, 122, 122));
        tfc_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        tfc_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfc_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(tfc_nome);
        tfc_nome.setBounds(140, 80, 329, 18);

        tfc_email.setForeground(new java.awt.Color(122, 122, 122));
        tfc_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_email);
        tfc_email.setBounds(140, 110, 299, 18);

        tfc_rua.setForeground(new java.awt.Color(122, 122, 122));
        tfc_rua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_rua);
        tfc_rua.setBounds(140, 180, 377, 18);

        tfc_tel.setForeground(new java.awt.Color(122, 122, 122));
        tfc_tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        tfc_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfc_telActionPerformed(evt);
            }
        });
        jPanel1.add(tfc_tel);
        tfc_tel.setBounds(140, 140, 195, 18);

        tfc_num.setForeground(new java.awt.Color(122, 122, 122));
        tfc_num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_num);
        tfc_num.setBounds(140, 210, 150, 18);

        tfc_compl.setForeground(new java.awt.Color(122, 122, 122));
        tfc_compl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_compl);
        tfc_compl.setBounds(140, 270, 362, 18);

        tfc_cep.setForeground(new java.awt.Color(122, 122, 122));
        tfc_cep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_cep);
        tfc_cep.setBounds(140, 300, 156, 18);

        tfc_cidade.setForeground(new java.awt.Color(122, 122, 122));
        tfc_cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        jPanel1.add(tfc_cidade);
        tfc_cidade.setBounds(140, 330, 195, 18);

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(5, 421, 748, 5);

        btn_id.setBackground(new java.awt.Color(237, 228, 224));
        btn_id.setFont(new java.awt.Font("Baloo 2", 1, 18)); // NOI18N
        btn_id.setForeground(new java.awt.Color(159, 135, 114));
        btn_id.setText("Qual minha Identifica��o?");
        btn_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(159, 135, 114), 4, true));
        btn_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idActionPerformed(evt);
            }
        });
        jPanel1.add(btn_id);
        btn_id.setBounds(460, 350, 280, 60);

        jPanel2.setBackground(new java.awt.Color(237, 250, 234));

        chkSmart.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkSmart.setForeground(new java.awt.Color(122, 122, 122));
        chkSmart.setText("SmarthPhone");
        chkSmart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkSmart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkSmart.setName("1"); // NOI18N
        chkSmart.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkSmartStateChanged(evt);
            }
        });
        chkSmart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkSmartMouseClicked(evt);
            }
        });
        chkSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSmartActionPerformed(evt);
            }
        });

        chkTablet.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkTablet.setForeground(new java.awt.Color(122, 122, 122));
        chkTablet.setText("Tablet");
        chkTablet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkTablet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkTablet.setName("2"); // NOI18N
        chkTablet.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkTabletStateChanged(evt);
            }
        });
        chkTablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkTabletMouseClicked(evt);
            }
        });

        chkPilha.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkPilha.setForeground(new java.awt.Color(122, 122, 122));
        chkPilha.setText("Pilha");
        chkPilha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkPilha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkPilha.setName("3"); // NOI18N
        chkPilha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPilhaStateChanged(evt);
            }
        });
        chkPilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkPilhaMouseClicked(evt);
            }
        });

        chkOleo.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkOleo.setForeground(new java.awt.Color(122, 122, 122));
        chkOleo.setText("�leo de Cozinha");
        chkOleo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkOleo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkOleo.setName("6"); // NOI18N
        chkOleo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOleoStateChanged(evt);
            }
        });
        chkOleo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkOleoMouseClicked(evt);
            }
        });
        chkOleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOleoActionPerformed(evt);
            }
        });

        chkMed.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkMed.setForeground(new java.awt.Color(122, 122, 122));
        chkMed.setText("Medicamentos");
        chkMed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkMed.setName("5"); // NOI18N
        chkMed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkMedStateChanged(evt);
            }
        });
        chkMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMedMouseClicked(evt);
            }
        });

        chkSofa.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkSofa.setForeground(new java.awt.Color(122, 122, 122));
        chkSofa.setText("Sof�");
        chkSofa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkSofa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkSofa.setName("4"); // NOI18N
        chkSofa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkSofaStateChanged(evt);
            }
        });
        chkSofa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkSofaMouseClicked(evt);
            }
        });
        chkSofa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSofaActionPerformed(evt);
            }
        });

        chkMicro.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        chkMicro.setForeground(new java.awt.Color(122, 122, 122));
        chkMicro.setText("Micro-ondas");
        chkMicro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 123, 123), 1, true));
        chkMicro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkMicro.setName("7"); // NOI18N
        chkMicro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkMicroStateChanged(evt);
            }
        });
        chkMicro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMicroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTablet, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPilha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMed, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSofa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkTablet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPilha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkOleo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSofa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMicro)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 560, 120, 200);

        cb_cat.setFont(new java.awt.Font("Baloo 2", 1, 13)); // NOI18N
        cb_cat.setForeground(new java.awt.Color(102, 90, 72));
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Categoria", "Eletronico", "Pilhas e Baterias", "Vestuario", "Medicamentos", "M�veis", "�leos", "Pl�sticos", "Eletrodom�sticos" }));
        cb_cat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        cb_cat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_catActionPerformed(evt);
            }
        });
        jPanel1.add(cb_cat);
        cb_cat.setBounds(196, 523, 190, 30);

        jLabel13.setFont(new java.awt.Font("Baloo 2", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(159, 135, 114));
        jLabel13.setText("Filtrar Categoria");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(46, 523, 160, 30);

        jLabel16.setFont(new java.awt.Font("Baloo 2", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 90, 72));
        jLabel16.setText("  Materiais Aceitos");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(36, 453, 229, 58);

        id_label.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        id_label.setForeground(new java.awt.Color(122, 122, 122));
        id_label.setText("Identifica��o");
        jPanel1.add(id_label);
        id_label.setBounds(40, 360, 91, 25);

        tfc_id_atl.setForeground(new java.awt.Color(122, 122, 122));
        tfc_id_atl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 1, true));
        tfc_id_atl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfc_id_atlActionPerformed(evt);
            }
        });
        jPanel1.add(tfc_id_atl);
        tfc_id_atl.setBounds(140, 360, 102, 18);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 760, 420);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upxiii/imagens/Tela_inicial_cadastro.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 870, 570);

        setSize(new java.awt.Dimension(884, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvar_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_atualizarActionPerformed
        // TODO add your handling code here:
        try{
             Connection conn = BancoD.getConnection("meulixo", "root", "Finn20022122@");
            System.out.println("Nome: ");
            String nome = tfc_nome.getText();
            System.out.println("Email: ");
            String email = tfc_email.getText();
            System.out.println("Telefone: ");
            String telefone = tfc_tel.getText();
            System.out.println("logradouro: ");
            String logradouro = tfc_rua.getText();
            System.out.println("Numero: ");
            String numero = tfc_num.getText();
            System.out.println("Bairro: ");
            String bairro = tfc_bairro.getText();
            System.out.println("Complemento: ");
            String complemento = tfc_compl.getText();
            System.out.println("CEP: ");
            String cep = tfc_cep.getText();
            System.out.println("Cidade: ");
            String cidade = tfc_cidade.getText();
            System.out.println("ID: ");
            int id = Integer.parseInt(tfc_id_atl.getText());
            System.out.println("Ativado: ");
            
            
             String sql = String.format(Locale.US,
                     "update local_descarte set email='%s',nome='%s',telefone='%s' where id_local_descarte=%d;",
                     email, nome,telefone,id
             );
             BancoD.insert(conn, sql);
              String sql2 = String.format(Locale.US,
                     "update endereco set logradouro='%s',numero='%s',bairro='%s',complemento='%s',cep='%s',cidade='%s' where id_local_descarte=%d;",
                     logradouro, numero,bairro,complemento,cep,cidade,id
             );
            BancoD.insert(conn, sql2);
            
            
            String sql3 = String.format(
                    "delete from material_local_descarte where id_local_descarte='%s';",
                    id);
            BancoD.insert(conn, sql3);
           for (String checkboxiten : checkboxitens) {
                
                int idMaterial = Integer.parseInt(checkboxiten);
                String sql4 = String.format(Locale.US, 
                        "insert into material_local_descarte(id_material, id_local_descarte)" + "values('%d','%d');",
                        idMaterial,id
                        );
                BancoD.insert(conn, sql4);
                }
            
            JOptionPane.showMessageDialog(null, "Usuario Atualizado com Sucesso!");
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo deu Errado! Tente Novamente");
        }
        
    }//GEN-LAST:event_btn_salvar_atualizarActionPerformed

    private void btn_voltar_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar_atualizarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            Local l = new Local ();
            l.setVisible(true);
  //          l.setLocation(null);
            
        }catch(Exception e){

        }
    }//GEN-LAST:event_btn_voltar_atualizarActionPerformed

    private void tfc_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfc_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfc_nomeActionPerformed

    private void chkSmartStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkSmartStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("Eletronico")){
            chkSmart.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("Eletronico")){
            chkSmart.setVisible(false);
        }
    }//GEN-LAST:event_chkSmartStateChanged

    private void chkTabletStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkTabletStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("Eletronico")){
            chkTablet.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("Eletronico")){
            chkTablet.setVisible(false);
        }
    }//GEN-LAST:event_chkTabletStateChanged

    private void chkPilhaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPilhaStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("Pilhas e Baterias")){
            chkPilha.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("Pilhas e Baterias")){
            chkPilha.setVisible(false);
        }
    }//GEN-LAST:event_chkPilhaStateChanged

    private void chkOleoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOleoStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("�leos")){
            chkOleo.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("�leos")){
            chkOleo.setVisible(false);
        }
    }//GEN-LAST:event_chkOleoStateChanged

    private void chkMedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkMedStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("Medicamentos")){
            chkMed.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("Medicamentos")){
            chkMed.setVisible(false);
        }
    }//GEN-LAST:event_chkMedStateChanged

    private void chkSofaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkSofaStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("M�veis")){
            chkSofa.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("M�veis")){
            chkSofa.setVisible(false);
        }
    }//GEN-LAST:event_chkSofaStateChanged

    private void chkSofaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSofaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSofaActionPerformed

    private void chkMicroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkMicroStateChanged
        // TODO add your handling code here:
        if(cb_cat.getSelectedItem().equals("Eletrodom�sticos")){
            chkMicro.setVisible(true);
        }else if(!cb_cat.getSelectedItem().equals("Eletrodom�sticos")){
            chkMicro.setVisible(false);
        }
    }//GEN-LAST:event_chkMicroStateChanged

    private void cb_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_catActionPerformed
        // TODO add your handling code here:
        //Selecione uma Categoria0, Eletronico1, Pilhas e Baterias2, Vestuario3, Medicamentos4, Móveis5, Óleos6, Plásticos7, Eletrodomésticos8
        //        lista.setVisible(false);
        //        jCheckBox1.setVisible(false);
        //            jCheckBox2.setVisible(false);
        //        if(cb_cat.getSelectedItem().equals("Eletronico")){
            //            jCheckBox1.setVisible(true);
            //            jCheckBox2.setVisible(true);
            //            System.out.println("Eletronico");
            //            lista.setVisible(true);
            //        }
        //        if(cb_cat.getSelectedItem().equals("Eletronico")){
            //            chkSmart.setVisible(true);
            //        }if(cb_cat.getSelectedItem().equals("Eletronico")){
            //            chkTablet.setVisible(true);
            //        }if(cb_cat.getSelectedItem().equals("Eletronico")){
            //            chkPilha.setVisible(true);
            //        }if(cb_cat.getSelectedItem().equals("Óleos")){
            //            chkOleo.setVisible(true);
            //        }
        switch(cb_cat.getSelectedIndex()){
            case 1:
            chkSmart.setVisible(true);
            chkTablet.setVisible(true);

            break;
            case 2:
            chkPilha.setVisible(true);
            break;
            case 4:
            chkMed.setVisible(true);
            case 5:
            chkSofa.setVisible(true);
            break;
            case 6:
            chkOleo.setVisible(true);
            break;
            case 8:
            chkMicro.setVisible(true);
            break;

        }
    }//GEN-LAST:event_cb_catActionPerformed

    private void tfc_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfc_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfc_telActionPerformed

    private void tfc_id_atlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfc_id_atlActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfc_id_atlActionPerformed

    private void btn_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            Identificacao id = new Identificacao();
            id.setVisible(true);

            //            this.setVisible(false);
            //            this.setLocation(null);

        }catch(Exception e){

        }
    }//GEN-LAST:event_btn_idActionPerformed

    private void chkSmartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkSmartMouseClicked
        // TODO add your handling code here:
         if(chkSmart.isSelected()){
            checkboxitens.add(chkSmart.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkSmart.getName());
        }
        
        
    }//GEN-LAST:event_chkSmartMouseClicked

    private void chkTabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkTabletMouseClicked
        // TODO add your handling code here:
         if(chkTablet.isSelected()){
            checkboxitens.add(chkTablet.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkTablet.getName());
        }
         
    }//GEN-LAST:event_chkTabletMouseClicked

    private void chkPilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkPilhaMouseClicked
        // TODO add your handling code here:
        if(chkPilha.isSelected()){
            checkboxitens.add(chkPilha.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkPilha.getName());
        }
    }//GEN-LAST:event_chkPilhaMouseClicked

    private void chkOleoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkOleoMouseClicked
        // TODO add your handling code here:
        if(chkOleo.isSelected()){
            checkboxitens.add(chkOleo.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkOleo.getName());
        }
    }//GEN-LAST:event_chkOleoMouseClicked

    private void chkMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMedMouseClicked
        // TODO add your handling code here:
        if(chkMed.isSelected()){
            checkboxitens.add(chkMed.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkMed.getName());
        }
    }//GEN-LAST:event_chkMedMouseClicked

    private void chkSofaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkSofaMouseClicked
        // TODO add your handling code here:
        if(chkSofa.isSelected()){
            checkboxitens.add(chkSofa.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkSofa.getName());
        }
    }//GEN-LAST:event_chkSofaMouseClicked

    private void chkMicroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMicroMouseClicked
        // TODO add your handling code here:
        if(chkMicro.isSelected()){
            checkboxitens.add(chkMicro.getName());
            System.out.println(checkboxitens);
        }else{
            checkboxitens.remove(chkMicro.getName());
        }
    }//GEN-LAST:event_chkMicroMouseClicked

    private void chkSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSmartActionPerformed

    private void chkOleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOleoActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarLocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_id;
    private javax.swing.JButton btn_salvar_atualizar;
    private javax.swing.JButton btn_voltar_atualizar;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JCheckBox chkMed;
    private javax.swing.JCheckBox chkMicro;
    private javax.swing.JCheckBox chkOleo;
    private javax.swing.JCheckBox chkPilha;
    private javax.swing.JCheckBox chkSmart;
    private javax.swing.JCheckBox chkSofa;
    private javax.swing.JCheckBox chkTablet;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfc_bairro;
    private javax.swing.JTextField tfc_cep;
    private javax.swing.JTextField tfc_cidade;
    private javax.swing.JTextField tfc_compl;
    private javax.swing.JTextField tfc_email;
    private javax.swing.JTextField tfc_id_atl;
    private javax.swing.JTextField tfc_nome;
    private javax.swing.JTextField tfc_num;
    private javax.swing.JTextField tfc_rua;
    private javax.swing.JTextField tfc_tel;
    // End of variables declaration//GEN-END:variables
}