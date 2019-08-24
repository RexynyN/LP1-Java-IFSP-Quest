/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgameon.gui;

import Config.JDBC;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import projectgameon.Player.Player;

/**
 *
 * @author aluno
 */
public class CriacaoPersonagem extends javax.swing.JFrame {

    private Player playerData;
    private final String slot;
    private String classe = "";
    
    /**
     * Creates new form CriacaoPersonagem
     * @param playerData
     * @param slot
     */
    public CriacaoPersonagem(Player playerData, String slot) {
        initComponents();
        loadGraph();
        this.playerData = playerData;
        this.slot = slot;
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    
    
    public final void loadGraph(){
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projectgameon/gui/img/bg_backup.png")));
        Image im = myImage.getImage();
        Image im2 = im.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(im2);
        jLabel1.setIcon(icon);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTextoTop = new javax.swing.JLabel();
        lTextoMid = new javax.swing.JLabel();
        tfNomePersonagem = new javax.swing.JTextField();
        lTextoBot = new javax.swing.JLabel();
        bSelectArqueiro = new javax.swing.JButton();
        bSelectMago = new javax.swing.JButton();
        bSelectGuerreiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDescriptionMago = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tDescriptionGuerreiro = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDescriptionArqueiro = new javax.swing.JTextArea();
        lPersonagem = new javax.swing.JLabel();
        javax.swing.JLabel tPersonagemText = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bComecar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IF QUEST - Criação de Personagem");
        setResizable(false);

        lTextoTop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTextoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/labels/button_crie-seu-personagem-escolha-seu-nome-e-classe-e-vamos-pra-luta.png"))); // NOI18N

        lTextoMid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTextoMid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/labels/button_digite-o-nome-do-seu-personagem.png"))); // NOI18N

        tfNomePersonagem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfNomePersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomePersonagemActionPerformed(evt);
            }
        });

        lTextoBot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTextoBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/labels/button_escolha-sua-classe.png"))); // NOI18N
        lTextoBot.setText("Escolha a sua classe: ");

        bSelectArqueiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSelectArqueiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/button_arqueiro.png"))); // NOI18N
        bSelectArqueiro.setToolTipText("");
        bSelectArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectArqueiroActionPerformed(evt);
            }
        });

        bSelectMago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSelectMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/button_mago.png"))); // NOI18N
        bSelectMago.setPreferredSize(new java.awt.Dimension(85, 40));
        bSelectMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectMagoActionPerformed(evt);
            }
        });

        bSelectGuerreiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSelectGuerreiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/button_guerreiro.png"))); // NOI18N
        bSelectGuerreiro.setToolTipText("");
        bSelectGuerreiro.setOpaque(true);
        bSelectGuerreiro.setPreferredSize(new java.awt.Dimension(85, 40));
        bSelectGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectGuerreiroActionPerformed(evt);
            }
        });

        tDescriptionMago.setEditable(false);
        tDescriptionMago.setColumns(20);
        tDescriptionMago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tDescriptionMago.setRows(5);
        tDescriptionMago.setText("Os detentores da magia são exatamente\no que você precisa se quiser incendiar, \neletrocutar, congelar ou vaporizar \nqualquer tipo de inimigo pra longe desse \nmundo. ");
        jScrollPane1.setViewportView(tDescriptionMago);

        tDescriptionGuerreiro.setEditable(false);
        tDescriptionGuerreiro.setColumns(20);
        tDescriptionGuerreiro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tDescriptionGuerreiro.setRows(5);
        tDescriptionGuerreiro.setText("Os mais destemidos combatentes da paz\nsão perfeitos pra chegar bem pertinho \ndo inimigo e falar para eles que o reino\nde malfeitorias deles acabou no \nmomento em que cruzou o seu caminho! ");
        jScrollPane4.setViewportView(tDescriptionGuerreiro);

        tDescriptionArqueiro.setEditable(false);
        tDescriptionArqueiro.setColumns(20);
        tDescriptionArqueiro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tDescriptionArqueiro.setRows(5);
        tDescriptionArqueiro.setText("Arqueiros adoram atacar inimigos\nde longe, mas eles não são covardes, \nsó não gostam de levar machadadas, \nesfoladas ou lanças na barriga. \nEspertos são eles!");
        jScrollPane3.setViewportView(tDescriptionArqueiro);

        tPersonagemText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tPersonagemText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/labels/button_seu-personagem.png"))); // NOI18N

        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/button_cancelar.png"))); // NOI18N
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bComecar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgameon/gui/img/button_bora-pra-luta.png"))); // NOI18N
        bComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComecarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tPersonagemText)
                            .addComponent(lPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bSelectGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bSelectArqueiro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bSelectMago, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTextoTop)
                                    .addComponent(tfNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lTextoBot, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTextoMid, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTextoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lTextoMid)
                        .addGap(37, 37, 37)
                        .addComponent(tfNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tPersonagemText)
                        .addGap(27, 27, 27)
                        .addComponent(lPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTextoBot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSelectArqueiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bSelectMago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSelectGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomePersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomePersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomePersonagemActionPerformed

    private void bSelectGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectGuerreiroActionPerformed
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projectgameon/gui/images/sprites/Classes/Guerreiro.png")));
        Image im = myImage.getImage();
        Image im2 = im.getScaledInstance(lPersonagem.getWidth(), lPersonagem.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(im2);
        lPersonagem.setIcon(icon);
        this.classe = "guerreiro";
    }//GEN-LAST:event_bSelectGuerreiroActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        new SelecaoPersonagem(this.playerData).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSelectArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectArqueiroActionPerformed
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projectgameon/gui/images/sprites/Classes/Arqueiro.png")));
        Image im = myImage.getImage();
        Image im2 = im.getScaledInstance(lPersonagem.getWidth(), lPersonagem.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(im2);
        lPersonagem.setIcon(icon);
        this.classe = "arqueiro";
    }//GEN-LAST:event_bSelectArqueiroActionPerformed

    private void bSelectMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectMagoActionPerformed
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projectgameon/gui/images/sprites/Classes/Mago.png")));
        Image im = myImage.getImage();
        Image im2 = im.getScaledInstance(lPersonagem.getWidth(), lPersonagem.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(im2);
        lPersonagem.setIcon(icon);
        this.classe = "mago";
    }//GEN-LAST:event_bSelectMagoActionPerformed

    private void bComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComecarActionPerformed
        if(haveText()){
            if(this.classe.equals("mago")){
                playerData = new JDBC().cadastraPersonagemMago(this.playerData, tfNomePersonagem.getText(), this.slot);
            }else if(this.classe.equals("guerreiro")){
                playerData = new JDBC().cadastraPersonagemGuerreiro(this.playerData, tfNomePersonagem.getText(), this.slot);
            }else if(this.classe.equals("arqueiro")){
                playerData = new JDBC().cadastraPersonagemArqueiro(this.playerData, tfNomePersonagem.getText(), this.slot);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ensira o nome do personagem!");
        }
    }//GEN-LAST:event_bComecarActionPerformed
    
    public boolean haveText(){
        return tfNomePersonagem.getText().length() > 0;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bComecar;
    private javax.swing.JButton bSelectArqueiro;
    private javax.swing.JButton bSelectGuerreiro;
    private javax.swing.JButton bSelectMago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lPersonagem;
    private javax.swing.JLabel lTextoBot;
    private javax.swing.JLabel lTextoMid;
    private javax.swing.JLabel lTextoTop;
    private javax.swing.JTextArea tDescriptionArqueiro;
    private javax.swing.JTextArea tDescriptionGuerreiro;
    private javax.swing.JTextArea tDescriptionMago;
    private javax.swing.JTextField tfNomePersonagem;
    // End of variables declaration//GEN-END:variables
}