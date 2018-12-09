package Interface;
import Codigos.Instrução;
import Codigos.Registrador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class SimuladorAssembly extends javax.swing.JFrame {

    public SimuladorAssembly() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelInserirCodigoAssembly = new javax.swing.JLabel();
        textAreaAssembly = new javax.swing.JTextArea();
        BotaoAssemblyOK = new javax.swing.JButton();
        BotaoStep = new javax.swing.JButton();
        botãoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelInserirCodigoAssembly.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LabelInserirCodigoAssembly.setText("Inserir o código Assembly:");

        textAreaAssembly.setColumns(20);
        textAreaAssembly.setRows(5);

        BotaoAssemblyOK.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotaoAssemblyOK.setText("OK");
        BotaoAssemblyOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOk(evt);
            }
        });

        BotaoStep.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotaoStep.setText("STEP");
        BotaoStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStep(evt);
            }
        });

        botãoSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botãoSair.setText("Sair");
        botãoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSair(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Exemplos de entrada:");

        jLabel2.setText("MOV_ R1,001");

        jLabel3.setText("MOVE R1,R2");

        jLabel4.setText("ADD_ R1,R2,R3");

        jLabel5.setText("ADDI R1,R2,010");

        jLabel6.setText("SUB_ R1,R2,R3");

        jLabel7.setText("SUBI R1,R2,120");

        jLabel8.setText("JUMP ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelInserirCodigoAssembly)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textAreaAssembly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BotaoStep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotaoAssemblyOK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelInserirCodigoAssembly)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textAreaAssembly, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8))
                            .addComponent(BotaoStep, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botãoSair)
                    .addComponent(BotaoAssemblyOK))
                .addGap(0, 133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOk
        ArrayList<Registrador> listaRegistradores = new ArrayList<>(); //Lista que conterá os registradores
        for(int k = 1; k <= 32; k++){ // inicia a lista inserindo os 32 registradores e setando nome R1,R2 ... R11...,Rk
            Registrador r = new Registrador("R"+k);
            listaRegistradores.add(r);
        }
        Instrução i = new Instrução();
        FileWriter fileR;
        BufferedWriter buffer;
        ArrayList<Integer> listaValores = new ArrayList<>();
        String areaTextAssembly = textAreaAssembly.getText();
        char c;
        int cont=0, contFinal, origem, destino;
        String capturaInstrucao = null, capturaPrimeiroParametro = null;
        String capturaSegundoParametro = null, capturaTerceiroParametro = null;
        for(int k=0;k<areaTextAssembly.length();k++){
            c = areaTextAssembly.charAt(k);
            cont++;
            if(cont == 4){  //ESTE IF É PARA A PRIMEIRA LINHA DO CODIGO ASSEMBLY
                capturaInstrucao = areaTextAssembly.substring(0, 4);
                if(capturaInstrucao.equals("MOV_")){    //EX: MOV_ R1,001
                    origem = cont; //ORIGEM RECEBE A POSIÇAO DEPOIS DE CAPTURAR A INSTRUÇAO
                    origem++; //ORIGEM RECEBE +1 PARA NAO CAPTURAR O ESPAÇO
                    destino = origem + 2; //DESTINO RECEBE A POSICAO DA ORIGEM +2 PARA PEGAR A POSIÇAO FINAL DO PRIMEIRO PARAMETRO
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1; //ORIGEM RECEBE O DESTINO +1 PARA NAO CAPTURAR A VIRGULA
                    destino = origem + 3; //DESTINO RECEBE ORIGEM PARA SABER A POSIÇAO FINAL DO SEGUNDO PARAMETRO
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    
                    //ARMAZENAR OS VALORES CAPTURADOS
                    for(Registrador r: listaRegistradores){ //verifica se o registrador colocado na linha assembly está na lista
                        if(r.getNome().equals(capturaPrimeiroParametro)){
                            Integer valor = Integer.parseInt(capturaSegundoParametro); // converte a string do valor para inteiro de fato
                            i.move(r, valor); // o MOV_ ocorre
                            System.out.println("VALOR DO MOV_ OTARIO: " + r.getValor());
                        }
                    }
                    
                  
                    
                    
                }
                else if(capturaInstrucao.equals("MOVE")){
                    origem = cont;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    
                    //ARMAZENAR VALORES CAPTURADOS
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                i.move(r2, r, listaRegistradores);
                                System.out.println("VALOR DO MOVE: " + r.getValor());
                            }
                        }
                    }
                    
                }
                else if(capturaInstrucao.equals("ADD_")){
                    origem = cont;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            for(Registrador r3: listaRegistradores){
                                if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro) && r3.getNome().equals(capturaTerceiroParametro)){
                                    i.add(r, r2, r3);
                                    System.out.println("valor do reg da soma 1: " + r.getValor());
                                }
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("ADDI")){    
                    origem = cont;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 3;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                Integer valor = Integer.parseInt(capturaTerceiroParametro);
                                i.addi(r, r2, valor);
                                System.out.println("Resultado do addi: " + r.getValor());
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("SUB_")){
                    origem = cont;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            for(Registrador r3: listaRegistradores){
                                if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro) && r3.getNome().equals(capturaTerceiroParametro)){
                                    i.sub(r, r2, r3);
                                    System.out.println("valor do sub: " + r.getValor());
                                }
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("SUBI")){
                    origem = cont;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 3;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                Integer valor = Integer.parseInt(capturaTerceiroParametro);
                                i.subi(r, r2, valor);
                                System.out.println("valor do subi: " + r.getValor());
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("JUMP")){
                    
                }
                
                
                /*
                try{
                    fileR = new FileWriter("teste.txt");
                    buffer = new BufferedWriter(fileR);
                    
                    
                    
                    //buffer.write("Héctor");
                    buffer.close();
                    fileR.close();
                }
                catch(IOException ex){
                    
                }*/
                //usar listas para gerenciar os valores dos registradores durante os steps a ideia é cada step ter sua própria lista
                for(Registrador r : listaRegistradores){
                    if(r.getValor() == null){
                        listaValores.add(0);
                    }
                    else{
                        listaValores.add(r.getValor());
                    }
                }
                
                for(Integer v: listaValores){
                    //System.out.println("Valor: " + v);
                    try{
                        fileR = new FileWriter("teste.txt");
                        buffer = new BufferedWriter(fileR);
                        buffer.write(v);
                    
                    
                          //buffer.write("Héctor");
                        buffer.close();
                        fileR.close();
                }
                   catch(IOException ex){
                    
                   }
                }
                
                
                
                
            }
            if(c == '\n'){  //ESTE IF É PARA AS DEMAIS LINHAS DE CODIGO ASSEMBLY
                contFinal = cont + 4;
                System.out.println("------" + cont);
                capturaInstrucao = areaTextAssembly.substring(cont, contFinal);
                System.out.println(capturaInstrucao);
                if(capturaInstrucao.equals("MOV_")){
                    origem = contFinal; //ORIGEM RECEBE A POSIÇAO DEPOIS DE CAPTURAR A INSTRUÇAO
                    origem++; //ORIGEM RECEBE +1 PARA NAO CAPTURAR O ESPAÇO
                    destino = origem + 2; //DESTINO RECEBE A POSICAO DA ORIGEM +2 PARA PEGAR A POSIÇAO FINAL DO PRIMEIRO PARAMETRO
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1; //ORIGEM RECEBE O DESTINO +1 PARA NAO CAPTURAR A VIRGULA
                    destino = origem + 3; //DESTINO RECEBE ORIGEM PARA SABER A POSIÇAO FINAL DO SEGUNDO PARAMETRO
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r: listaRegistradores){ //verifica se o registrador colocado na linha assembly está na lista
                        if(r.getNome().equals(capturaPrimeiroParametro)){
                            Integer valor = Integer.parseInt(capturaSegundoParametro); // converte a string do valor para inteiro de fato
                            i.move(r, valor); // o MOV_ ocorre
                            System.out.println("VALOR DO MOV_: " + r.getValor());
                        }
                    }
                    
                }
                else if(capturaInstrucao.equals("MOVE")){
                    origem = contFinal;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                i.move(r2, r, listaRegistradores);
                                System.out.println("VALOR DO MOVE: " + r.getValor());
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("ADD_")){
                    origem = contFinal;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            for(Registrador r3: listaRegistradores){
                                if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro) && r3.getNome().equals(capturaTerceiroParametro)){
                                    i.add(r, r2, r3);
                                    System.out.println("valor do ADD_: " + r.getValor());
                                }
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("ADDI")){
                    origem = contFinal;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 3;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                Integer valor = Integer.parseInt(capturaTerceiroParametro);
                                i.addi(r, r2, valor);
                                System.out.println("VALOR DO ADDI: " + r.getValor());
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("SUB_")){
                    origem = contFinal;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            for(Registrador r3: listaRegistradores){
                                if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro) && r3.getNome().equals(capturaTerceiroParametro)){
                                    i.sub(r, r2, r3);
                                    System.out.println("valor do SUB_: " + r.getValor());
                                }
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("SUBI")){
                    origem = contFinal;
                    origem++;
                    destino = origem + 2;
                    capturaPrimeiroParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 2;
                    capturaSegundoParametro = areaTextAssembly.substring(origem, destino);
                    origem = destino + 1;
                    destino = origem + 3;
                    capturaTerceiroParametro = areaTextAssembly.substring(origem, destino);
                    for(Registrador r : listaRegistradores){
                        for(Registrador r2: listaRegistradores){
                            if(r.getNome().equals(capturaPrimeiroParametro) && r2.getNome().equals(capturaSegundoParametro)){
                                Integer valor = Integer.parseInt(capturaTerceiroParametro);
                                i.subi(r, r2, valor);
                                System.out.println("valor do subi: " + r.getValor());
                            }
                        }
                    }
                }
                else if(capturaInstrucao.equals("JUMP")){
                    
                }
                
                
            }
        }
        
    }//GEN-LAST:event_botaoOk

    private void botaoSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSair
        System.exit(0);
    }//GEN-LAST:event_botaoSair

    private void botaoStep(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStep
        
    }//GEN-LAST:event_botaoStep

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(SimuladorAssembly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimuladorAssembly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimuladorAssembly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimuladorAssembly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimuladorAssembly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAssemblyOK;
    private javax.swing.JButton BotaoStep;
    private javax.swing.JLabel LabelInserirCodigoAssembly;
    private javax.swing.JButton botãoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextArea textAreaAssembly;
    // End of variables declaration//GEN-END:variables
}
