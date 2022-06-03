package gui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import pyr.*;
import javax.swing.*;

public class Plataforma extends javax.swing.JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelScore = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelPregunta = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Respuesta1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Respuesta2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Respuesta3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Respuesta4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelScore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore.setText("username Tu  puntaje:000");

        jButtonExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(204, 0, 0));
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPregunta.setText("Pregunta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escogerRespuesta('3');
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        registrarJuego();
        JOptionPane.showMessageDialog(null,"Saliste del juego\nTu puntaje fue guardado");
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    escogerRespuesta('1');
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escogerRespuesta('2');
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escogerRespuesta('4');
    }//GEN-LAST:event_jButton4ActionPerformed
        
    private Usuario usuario;
    private Premio premio = new Premio(0);
    private int lvl = 1;
    private Pregunta pregunta;
    private boolean correcto = true;
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception ex) {}
        
            new Plataforma();
    }
    
    public void crearUsuario() { //Se ejecuta el juego
        Scanner leer = new Scanner(System.in);
		System.out.println("Bienvenido al TriviaQuest! \nIngresa un nombre de usuario en la consola para comenzar a jugar");
		String nombreuser = leer.nextLine();
		this.usuario = new Usuario(nombreuser,premio);
                while (nombreuser.isBlank()) {
                    System.out.println("Porfavor ingresa un nombre de usuario");
                    nombreuser = leer.nextLine();
		}
    }
    
    public void mostrarPregunta(String q, String r1, String r2, String r3, String r4, String username, int score){ //Coloca las respouestas en los botones, la pregunta en su label y el puntaje obtenido
        jLabelPregunta.setText(q);
        jLabelScore.setText(username + "  Puntos:" + score);
        jButton1.setText(r1);
        jButton2.setText(r2);
        jButton3.setText(r3);
        jButton4.setText(r4);
    }
    
    public void generarPregunta(int lvl){ //selecciona una pregunta random
        Categorias categoria = new Categorias(lvl);
	Nivel nivel = new Nivel(lvl, categoria);
	Pregunta preg = nivel.selectRandomPreg();
        this.pregunta = preg;
    }
    
    void escogerRespuesta(char a) {//Toma las acciones al responder la pregunta
        if(pregunta.getCorrecta() == a){
            JOptionPane.showMessageDialog(null,"Respuesta correcta!\nGanaste "+ this.premio.premioDeNivel(this.lvl) + " puntos", "SIGUIENTE NIVEL", JOptionPane.INFORMATION_MESSAGE);
            this.lvl++;
            this.premio.sumarMonto(this.premio.premioDeNivel(this.lvl - 1));
            victoria();
            jugar();
        }
        else {
            JOptionPane.showMessageDialog(null,"Respuesta incorrecta\nGanaste 0 puntos","FIN DEL JUEGO", JOptionPane.ERROR_MESSAGE);
            this.correcto = false;
            this.premio.reiniciarMonto();
            registrarJuego();
            System.exit(0);
        }
    }
    
    public void jugar(){ //Rellena la interfaz con la pregunta elegida
        generarPregunta(this.lvl);
        mostrarPregunta(this.pregunta.getEnunciado(), 
                this.pregunta.getRespuesta().getRespuestaN(0), 
                this.pregunta.getRespuesta().getRespuestaN(1),
                this.pregunta.getRespuesta().getRespuestaN(2), 
                this.pregunta.getRespuesta().getRespuestaN(3),
                this.usuario.getNombre(), 
                this.usuario.getPuntaje().getMonto());
        
    }
    
    public void victoria(){ //Ejecuta en caso de completar el juego
        if (this.lvl == 6){
            registrarJuego();
            JOptionPane.showMessageDialog(null,"FELICITACIONES!\nCOMPLETASTE EL JUEGO\nTu puntaje fue guardado","GANASTE", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    public void registrarJuego(){ //Registra la partida
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
        Archivador registro = new Archivador();
        registro.escribir(this.usuario.getNombre(), this.premio.getMonto(), fecha.format(LocalDateTime.now()));
    }
    
    public Plataforma(){ //Interfaz
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearUsuario();
        setVisible(true);
        jugar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
