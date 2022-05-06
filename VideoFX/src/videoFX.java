
import java.awt.BorderLayout;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 *
 * @author Jose_Duran
 */
public class videoFX extends javax.swing.JFrame {

    private final JFXPanel jfxPanel = new JFXPanel();
    LllamarVideo  v = new LllamarVideo();
     MediaPlayer oracleVid;
    boolean control = false;
    
  
    public videoFX(Media file) {
        initComponents();
        
        createScene(file);

        setTitle("Reproducción Jose");
        setResizable(false);
        setLocationRelativeTo(null);
        //Añadimos el panel de JavaFX al JPanel Swing
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel, BorderLayout.CENTER);
        // hilo.start();
    }
    Thread hilo = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    metHilo();
                }
            } catch (InterruptedException e) {
            }
        }
    };
   
   

    private void createScene(Media file) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                StackPane root = new StackPane();
                //File f=new File("C://Users//Jose//Videos//Video3.mp4");
               //  System.out.println(f.isFile());
               // Media file=new Media(f.toURI().toString());
                /*Media file = new Media("file:/C:/Users/Jose_Duran/Desktop/videos/DavidGuetta-Dangerous.mp4");*/
                oracleVid = new MediaPlayer(file);
                oracleVid.setAutoPlay(true);

                MediaView theView = new MediaView(oracleVid);
                root.getChildren().add(theView);
                //se añade video al jfxPanel
                Scene Scene = new Scene(root, 1200, 640);

                jfxPanel.setScene(Scene);

            }
        });
        asiganarTiempo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PausarReproducirBoton = new javax.swing.JButton();
        barraProgreso = new javax.swing.JSlider();
        tiempoTranscurridoLabel = new javax.swing.JLabel();
        tiempoLabel = new javax.swing.JLabel();
        VolumeSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        PausarReproducirBoton.setText("Pausar");
        PausarReproducirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PausarReproducirBotonMousePressed(evt);
            }
        });

        barraProgreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barraProgresoMouseReleased(evt);
            }
        });

        tiempoTranscurridoLabel.setText("00:00:00");

        tiempoLabel.setText("00:00:00");

        VolumeSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolumeSliderMouseReleased(evt);
            }
        });

        jLabel3.setText("Volumen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tiempoTranscurridoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PausarReproducirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(VolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(tiempoLabel))
                    .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PausarReproducirBoton)
                        .addComponent(tiempoLabel)
                        .addComponent(jLabel3))
                    .addComponent(tiempoTranscurridoLabel)
                    .addComponent(VolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean estado = true;
    private void PausarReproducirBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PausarReproducirBotonMousePressed
        // TODO add your handling code here:
        //oracleVid.play();
        if (estado) {
            PausarReproducirBoton.setText("Reproducir");
            oracleVid.pause();
            estado = false;
        } else if (!estado) {
            PausarReproducirBoton.setText("Pausar");
            oracleVid.play();
            estado = true;
        }


    }//GEN-LAST:event_PausarReproducirBotonMousePressed
    void asiganarTiempo() {
        try {
            Thread.sleep(1000);
            VolumeSlider.setMinimum(0);
            VolumeSlider.setMaximum(10);
            double sec = oracleVid.getTotalDuration().toSeconds();
            int val = (int) sec;
            barraProgreso.setMaximum(val);

            tiempoLabel.setText(obtenerMinutos(val) + "");
            hilo.start();

        } catch (InterruptedException ex) {
            Logger.getLogger(videoFX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String obtenerMinutos(int val) {
        int horas = 0;
        int minutos = 0;

        while (val > 59) {
            if (val > 59) {
                val -= 60;
                minutos++;
            }
            if (minutos > 59) {
                minutos -= 60;
                horas++;
            }
        }
        String hor = horas + "";
        String min = minutos + "";
        String sec = val + "";
        if (horas < 10) {
            hor = "0" + hor;
        }
        if (minutos < 10) {
            min = "0" + min;
        }
        if (val < 10) {
            sec = "0" + sec;
        }
        return hor + ":" + min + ":" + sec;
    }

    public void metHilo() {

        double sec = oracleVid.getCurrentTime().toSeconds();
        int val = (int) sec;
        barraProgreso.setValue(val);

        tiempoTranscurridoLabel.setText(obtenerMinutos(val));

    }

    private void barraProgresoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraProgresoMouseReleased
        // TODO add your handling code here:
        //tratar de trabajar todo en segundo

        //reproduce se obtiene el valor del jSlider1 y se manda al video
        int val = barraProgreso.getValue();
        oracleVid.seek(Duration.seconds(val));


    }//GEN-LAST:event_barraProgresoMouseReleased

    private void VolumeSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeSliderMouseReleased
        // TODO add your handling code here:
        double val = VolumeSlider.getValue();
        val *= 0.1;
        oracleVid.setVolume(val);


    }//GEN-LAST:event_VolumeSliderMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        oracleVid.dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(videoFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(videoFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(videoFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(videoFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

               // new videoFX().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PausarReproducirBoton;
    private javax.swing.JSlider VolumeSlider;
    private javax.swing.JSlider barraProgreso;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tiempoLabel;
    private javax.swing.JLabel tiempoTranscurridoLabel;
    // End of variables declaration//GEN-END:variables
}
