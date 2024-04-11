package proyectouniversae;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author zabal
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private ImageIcon[] originalIcon = new ImageIcon[6];

    public PantallaPrincipal() {
        initComponents();
        // Array de JLabels para acceder a las etiquetas por índice
        JLabel[] labels = {labelMiniatura1, labelMiniatura2, labelMiniatura3, labelMiniatura4, labelMiniatura5, labelMiniatura6};

// Llenar el array de originalIcons con los íconos originales de cada etiqueta
        for (int i = 0; i < originalIcon.length; i++) {
            originalIcon[i] = (ImageIcon) labels[i].getIcon();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelMiniatura1 = new javax.swing.JLabel();
        labelMiniatura3 = new javax.swing.JLabel();
        labelMiniatura2 = new javax.swing.JLabel();
        labelMiniatura4 = new javax.swing.JLabel();
        labelMiniatura5 = new javax.swing.JLabel();
        labelMiniatura6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGame = new javax.swing.JButton();
        labelFondoBase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        labelMiniatura1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton0.png"))); // NOI18N
        labelMiniatura1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura1MouseExited(evt);
            }
        });

        labelMiniatura3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton2.png"))); // NOI18N
        labelMiniatura3.setAutoscrolls(true);
        labelMiniatura3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura3MouseExited(evt);
            }
        });

        labelMiniatura2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton1.png"))); // NOI18N
        labelMiniatura2.setAutoscrolls(true);
        labelMiniatura2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura2MouseExited(evt);
            }
        });

        labelMiniatura4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton3.png"))); // NOI18N
        labelMiniatura4.setAutoscrolls(true);
        labelMiniatura4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura4MouseExited(evt);
            }
        });

        labelMiniatura5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton4.png"))); // NOI18N
        labelMiniatura5.setAutoscrolls(true);
        labelMiniatura5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura5MouseExited(evt);
            }
        });

        labelMiniatura6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton5.png"))); // NOI18N
        labelMiniatura6.setAutoscrolls(true);
        labelMiniatura6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelMiniatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(labelMiniatura2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelMiniatura3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelMiniatura4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(labelMiniatura5, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelMiniatura6, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMiniatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMiniatura2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMiniatura3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMiniatura4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMiniatura5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMiniatura6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        jPanel2.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        jPanel2.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton0.png"))); // NOI18N
        jPanel2.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton1.png"))); // NOI18N
        jPanel2.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        jPanel2.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        jPanel2.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        jPanel2.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        jPanel2.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        jPanel2.add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        jPanel2.add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        jPanel2.add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        jPanel2.add(jLabel11);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        jPanel2.add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        jPanel2.add(jLabel13);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        jPanel2.add(jLabel14);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        btnGame.setText("Game");
        btnGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        labelFondoBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/FondoBase.png"))); // NOI18N
        labelFondoBase.setFocusTraversalPolicyProvider(true);
        labelFondoBase.setName(""); // NOI18N
        jPanel1.add(labelFondoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGameActionPerformed
        new PantallaGame().setVisible(true);
    }//GEN-LAST:event_btnGameActionPerformed

    private void labelMiniatura1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura1MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon = (ImageIcon) labelMiniatura1.getIcon();
        Image currentImage = currentIcon.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage = currentImage.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Establecer la imagen escalada en el JLabel
        labelMiniatura1.setIcon(scaledIcon);

    }//GEN-LAST:event_labelMiniatura1MouseEntered

    private void labelMiniatura1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura1MouseExited
        labelMiniatura1.setIcon(originalIcon[0]); // Reemplaza 'iconOriginal' con tu ícono original

    }//GEN-LAST:event_labelMiniatura1MouseExited

    private void labelMiniatura3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura3MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon = (ImageIcon) labelMiniatura3.getIcon();
        Image currentImage = currentIcon.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage = currentImage.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Establecer la imagen escalada en el JLabel
        labelMiniatura3.setIcon(scaledIcon);
    }//GEN-LAST:event_labelMiniatura3MouseEntered

    private void labelMiniatura3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura3MouseExited
        labelMiniatura3.setIcon(originalIcon[2]); // Reemplaza 'iconOriginal' con tu ícono original
    }//GEN-LAST:event_labelMiniatura3MouseExited

    private void labelMiniatura2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura2MouseEntered
        ImageIcon currentIcon2 = (ImageIcon) labelMiniatura2.getIcon();
        Image currentImage8 = currentIcon2.getImage();
        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage2 = currentImage8.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        // Establecer la imagen escalada en el JLabel
        labelMiniatura2.setIcon(scaledIcon2);
    }//GEN-LAST:event_labelMiniatura2MouseEntered

    private void labelMiniatura2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura2MouseExited
        labelMiniatura2.setIcon(originalIcon[1]); // Reemplaza 'iconOriginal' con tu ícono original
    }//GEN-LAST:event_labelMiniatura2MouseExited

    private void labelMiniatura4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura4MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon4 = (ImageIcon) labelMiniatura4.getIcon();
        Image currentImage4 = currentIcon4.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage4 = currentImage4.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);

        // Establecer la imagen escalada en el JLabel
        labelMiniatura4.setIcon(scaledIcon4);
    }//GEN-LAST:event_labelMiniatura4MouseEntered

    private void labelMiniatura4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura4MouseExited
        labelMiniatura4.setIcon(originalIcon[3]); // Reemplaza 'iconOriginal' con tu ícono original
    }//GEN-LAST:event_labelMiniatura4MouseExited

    private void labelMiniatura5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura5MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon5 = (ImageIcon) labelMiniatura5.getIcon();
        Image currentImage = currentIcon5.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage5 = currentImage.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);

        // Establecer la imagen escalada en el JLabel
        labelMiniatura5.setIcon(scaledIcon5);
    }//GEN-LAST:event_labelMiniatura5MouseEntered

    private void labelMiniatura5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura5MouseExited
        labelMiniatura5.setIcon(originalIcon[4]); // Reemplaza 'iconOriginal' con tu ícono original
    }//GEN-LAST:event_labelMiniatura5MouseExited

    private void labelMiniatura6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura6MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon6 = (ImageIcon) labelMiniatura6.getIcon();
        Image currentImage6 = currentIcon6.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage6 = currentImage6.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);

        // Establecer la imagen escalada en el JLabel
        labelMiniatura6.setIcon(scaledIcon6);
    }//GEN-LAST:event_labelMiniatura6MouseEntered

    private void labelMiniatura6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura6MouseExited
        labelMiniatura6.setIcon(originalIcon[5]); // Reemplaza 'iconOriginal' con tu ícono original
    }//GEN-LAST:event_labelMiniatura6MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGame;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFondoBase;
    private javax.swing.JLabel labelMiniatura1;
    private javax.swing.JLabel labelMiniatura2;
    private javax.swing.JLabel labelMiniatura3;
    private javax.swing.JLabel labelMiniatura4;
    private javax.swing.JLabel labelMiniatura5;
    private javax.swing.JLabel labelMiniatura6;
    // End of variables declaration//GEN-END:variables
}
