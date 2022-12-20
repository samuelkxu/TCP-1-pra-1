/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
public class telaIni extends javax.swing.JFrame {

    /**
     * Creates new form telaIni
     */
    public telaIni() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        CBLetra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBTamanho = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CBCor = new javax.swing.JComboBox<>();
        BAltera = new javax.swing.JButton();
        BLimpa = new javax.swing.JButton();
        BApaga = new javax.swing.JButton();
        RBNegrito = new javax.swing.JRadioButton();
        RBNormal = new javax.swing.JRadioButton();
        RBItalico = new javax.swing.JRadioButton();
        RBItalicoNegrito = new javax.swing.JRadioButton();
        BEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TNomeArq = new javax.swing.JTextField();
        TNomeArq2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fonte:");

        CBLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "TimeNew", "Lora", "Pacifico" }));
        CBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBLetraActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamanho:");

        CBTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "15", "20", "25" }));

        jLabel3.setText("Cor:");

        CBCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Vermelho", "Azul", "Amarelo" }));

        BAltera.setText("Alterar Formatação");
        BAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlteraActionPerformed(evt);
            }
        });

        BLimpa.setText("Limpar Formatação");
        BLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpaActionPerformed(evt);
            }
        });

        BApaga.setText("Apagar Texto");
        BApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BApagaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBNegrito);
        RBNegrito.setText("Negrito");

        buttonGroup1.add(RBNormal);
        RBNormal.setSelected(true);
        RBNormal.setText("Normal");
        RBNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNormalActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBItalico);
        RBItalico.setText("Italico");

        buttonGroup1.add(RBItalicoNegrito);
        RBItalicoNegrito.setText("Negrito - Italico");

        BEnviar.setText("Enviar");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });

        TText.setColumns(20);
        TText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TText.setRows(5);
        jScrollPane1.setViewportView(TText);

        jLabel4.setText("Nome do Arquivo:");

        jLabel5.setText("Nome do Segundo Arquivo:");

        TNomeArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeArqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(RBNegrito)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RBNormal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RBItalico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RBItalicoNegrito)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BApaga))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(BAltera)
                                .addGap(28, 28, 28)
                                .addComponent(BLimpa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TNomeArq2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(TNomeArq))
                        .addGap(18, 18, 18)
                        .addComponent(BEnviar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CBTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAltera)
                    .addComponent(BLimpa))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BApaga)
                    .addComponent(RBNegrito)
                    .addComponent(RBNormal)
                    .addComponent(RBItalico)
                    .addComponent(RBItalicoNegrito))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BEnviar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(TNomeArq, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TNomeArq2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBLetraActionPerformed

    private void BAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlteraActionPerformed
    
        String letra;
        int num;
        
        if(CBLetra.getSelectedItem().equals("Arial")){
            
            letra = "Arial";
        }
        else if(CBLetra.getSelectedItem().equals("TimeNew")){
            
            letra = "Times New Roman";
        }
        else if(CBLetra.getSelectedItem().equals("Lora")){
            
            letra = "Lora";
        }
        else{
            
            letra = "Pacifico";
        }
        
        if(CBCor.getSelectedItem().equals("Preto")){
            
            TText.setForeground(Color.black);
        }
        else if(CBCor.getSelectedItem().equals("Vermelho")){
            
            TText.setForeground(Color.red);
        }
        else if(CBCor.getSelectedItem().equals("Azul")){
            
            TText.setForeground(Color.blue);
        }
        else{
            
            TText.setForeground(Color.yellow);
        }
        
        if(CBTamanho.getSelectedItem().equals("12")){
            
            num = 12;
        }
        else if(CBTamanho.getSelectedItem().equals("15")){
            
            num = 15;
        }
        else if(CBTamanho.getSelectedItem().equals("20")){
            
           num = 20;
        }
        else{
            
           num = 25;
        }
        
        if(RBNormal.isSelected()==true){
            
            Font fonte =  new Font(letra+"",Font.PLAIN,num);
            TText.setFont(fonte);
        }
        else if(RBItalico.isSelected()==true){
            
            Font fonte =  new Font(letra+"",Font.ITALIC+Font.PLAIN,num);
            TText.setFont(fonte);
        }
        else if(RBItalicoNegrito.isSelected()==true){
            
            Font fonte =  new Font(letra+"",Font.BOLD+Font.ITALIC,num);
            TText.setFont(fonte);
        }
        else if(RBNegrito.isSelected()==true){
            
            Font fonte =  new Font(letra+"",Font.BOLD,num);
            TText.setFont(fonte);
        }
        
    }//GEN-LAST:event_BAlteraActionPerformed

    private void BApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BApagaActionPerformed
        TText.setText("");
    }//GEN-LAST:event_BApagaActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        
        String name = TNomeArq.getText();
        String name2 = TNomeArq2.getText();
        String letra, cor, tam, tipo;
        
        if(CBLetra.getSelectedItem().equals("Arial")){
            
            letra = "Arial";
        }
        else if(CBLetra.getSelectedItem().equals("TimeNew")){
            
            letra = "TimeNew";
        }
        
        if(CBCor.getSelectedItem().equals("Preto")){
            
            cor = "Preto";
        }
        else if(CBCor.getSelectedItem().equals("Vermelho")){
            
            cor = "Vermelho";
        }
        else if(CBCor.getSelectedItem().equals("Azul")){
            
            cor = "Azul";
        }
        else{
            
            cor = "Amarelo";
        }
        
        if(CBTamanho.getSelectedItem().equals("12")){
            
            tam = "12";
        }
        else if(CBTamanho.getSelectedItem().equals("15")){
            
            tam = "15";
        }
        else if(CBTamanho.getSelectedItem().equals("20")){
            
            tam = "20";
        }
        else{
            
            tam = "25";
        }
        
        if(RBNormal.isSelected()==true){
            
            tipo = "Normal";
        }
        if(RBItalico.isSelected()==true){
            
            tipo = "Italico";
        }
        if(RBItalicoNegrito.isSelected()==true){
            
            tipo = "Italico Negrito";
        }
        else{
            
            tipo = "Negrito";
        }
        
        try{
            DatagramSocket socket = new DatagramSocket();            
            
            byte[] mensagem = new byte[50];
            
            String texto = TText.getText();
            mensagem = texto.getBytes();
          
            try{ 
                PrintWriter pw = new PrintWriter(name+".txt");
                pw.println(texto);
                pw.flush();
                
                
                
            }catch(IOException t){
                System.out.println("Erro ao criar arquivo!!"+ t.getMessage());
            }
            
            try{ 
                PrintWriter pw2 = new PrintWriter(name2+".txt");
                pw2.println("Fonte:"+letra+"\nCor:"+cor+"\nTamanho:"+tam+"\nTipagem:"+tipo+"\n");
                pw2.flush();
                
                
                
            }catch(IOException t){
                System.out.println("Erro ao criar arquivo!!"+ t.getMessage());
            }
            
            DatagramPacket pacote = new DatagramPacket(mensagem,mensagem.length,InetAddress.getByName("127.0.0.1"),1500);
            
            socket.send(pacote);
            System.out.println("Mensagem Enviada!!");
            
        }catch(SocketException e){          
            System.out.println("Erro de conexao "+ e.getMessage());
        }catch(IOException e){
            System.out.println("Erro no pacote!"+ e.getMessage());
        }
        
        TText.setText("");
        TNomeArq.setText("");
        TNomeArq2.setText("");
    }//GEN-LAST:event_BEnviarActionPerformed

    private void TNomeArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeArqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomeArqActionPerformed

    private void BLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpaActionPerformed
        
        Font fonte =  new Font("Arial",Font.PLAIN,12);
        TText.setFont(fonte);
        TText.setForeground(Color.black);
        
        CBTamanho.setSelectedItem("12");
        CBCor.setSelectedItem("Preto");
        CBLetra.setSelectedItem("Arial");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_BLimpaActionPerformed

    private void RBNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNormalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaIni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAltera;
    private javax.swing.JButton BApaga;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BLimpa;
    private javax.swing.JComboBox<String> CBCor;
    private javax.swing.JComboBox<String> CBLetra;
    private javax.swing.JComboBox<String> CBTamanho;
    private javax.swing.JRadioButton RBItalico;
    private javax.swing.JRadioButton RBItalicoNegrito;
    private javax.swing.JRadioButton RBNegrito;
    private javax.swing.JRadioButton RBNormal;
    private javax.swing.JTextField TNomeArq;
    private javax.swing.JTextField TNomeArq2;
    private javax.swing.JTextArea TText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
