package proyectouniversae;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author zabadev
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private final ImageIcon[] originalIcon = new ImageIcon[6];
    private final ImageIcon[] originalLogo = new ImageIcon[14];
    PantallaGame pantalla = new PantallaGame();

    public PantallaPrincipal() {
        initComponents();

        JLabel[] logos = {jLabelIcon0, jLabelIcon1, jLabelIcon2, jLabelIcon3, jLabelIcon4, jLabelIcon5, jLabelIcon6, jLabelIcon7, jLabelIcon8, jLabelIcon9, jLabelIcon10, jLabelIcon11, jLabelIcon12, jLabelIcon13};
        // Llenar el array de originalIcons con los íconos originales de cada etiqueta
        for (int i = 0; i < originalLogo.length; i++) {
            originalLogo[i] = (ImageIcon) logos[i].getIcon();

        }

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

        jLabelLogoUniversae = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelMiniatura1 = new javax.swing.JLabel();
        labelMiniatura3 = new javax.swing.JLabel();
        labelMiniatura2 = new javax.swing.JLabel();
        labelMiniatura4 = new javax.swing.JLabel();
        labelMiniatura5 = new javax.swing.JLabel();
        labelMiniatura6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelIcon0 = new javax.swing.JLabel();
        jLabelIcon1 = new javax.swing.JLabel();
        jLabelIcon2 = new javax.swing.JLabel();
        jLabelIcon3 = new javax.swing.JLabel();
        jLabelIcon4 = new javax.swing.JLabel();
        jLabelIcon5 = new javax.swing.JLabel();
        jLabelIcon6 = new javax.swing.JLabel();
        jLabelIcon7 = new javax.swing.JLabel();
        jLabelIcon8 = new javax.swing.JLabel();
        jLabelIcon9 = new javax.swing.JLabel();
        jLabelIcon10 = new javax.swing.JLabel();
        jLabelIcon11 = new javax.swing.JLabel();
        jLabelIcon12 = new javax.swing.JLabel();
        jLabelIcon13 = new javax.swing.JLabel();
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

        jLabelLogoUniversae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoUniversaeMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelLogoUniversae, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 140));

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        labelMiniatura1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton0.png"))); // NOI18N
        labelMiniatura1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniatura1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniatura1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMiniatura1MousePressed(evt);
            }
        });

        labelMiniatura3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiniatura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazHome/Miniaturas simuladores/HomeButton2.png"))); // NOI18N
        labelMiniatura3.setAutoscrolls(true);
        labelMiniatura3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelMiniatura3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura3MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura2MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura4MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura5MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniatura6MouseClicked(evt);
            }
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

        jLabelIcon0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        jLabelIcon0.setAlignmentY(0.0F);
        jLabelIcon0.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabelIcon0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelIcon0.setIconTextGap(1);
        jLabelIcon0.setInheritsPopupMenu(false);
        jLabelIcon0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon0MouseExited(evt);
            }
        });

        jLabelIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton0.png"))); // NOI18N
        jLabelIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon1MouseExited(evt);
            }
        });

        jLabelIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton1.png"))); // NOI18N
        jLabelIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon2MouseExited(evt);
            }
        });

        jLabelIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        jLabelIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon3MouseExited(evt);
            }
        });

        jLabelIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        jLabelIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon4MouseExited(evt);
            }
        });

        jLabelIcon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        jLabelIcon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon5MouseExited(evt);
            }
        });

        jLabelIcon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        jLabelIcon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon6MouseExited(evt);
            }
        });

        jLabelIcon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        jLabelIcon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon7MouseExited(evt);
            }
        });

        jLabelIcon8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        jLabelIcon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon8MouseExited(evt);
            }
        });

        jLabelIcon9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        jLabelIcon9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon9MouseExited(evt);
            }
        });

        jLabelIcon10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        jLabelIcon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon10MouseExited(evt);
            }
        });

        jLabelIcon11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        jLabelIcon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon11MouseExited(evt);
            }
        });

        jLabelIcon12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        jLabelIcon12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon12MouseExited(evt);
            }
        });

        jLabelIcon13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        jLabelIcon13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcon13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelIcon13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelIcon0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIcon8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelIcon9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelIcon10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelIcon12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelIcon13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIcon0, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelIcon13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabelIcon1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        labelFondoBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/FondoBase.png"))); // NOI18N
        labelFondoBase.setFocusTraversalPolicyProvider(true);
        labelFondoBase.setName(""); // NOI18N
        jPanel1.add(labelFondoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMiniatura1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura1MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon currentIcon = (ImageIcon) labelMiniatura1.getIcon();
        Image currentImage = currentIcon.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledImage = currentImage.getScaledInstance(450, 350, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);
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
        labelMiniatura3.setIcon(originalIcon[2]);
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
        labelMiniatura2.setIcon(originalIcon[1]);
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
        labelMiniatura4.setIcon(originalIcon[3]);
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
        labelMiniatura5.setIcon(originalIcon[4]);
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
        labelMiniatura6.setIcon(originalIcon[5]);
    }//GEN-LAST:event_labelMiniatura6MouseExited

    private void labelMiniatura1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura1MouseClicked
        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes);
        pantalla.mostrarPrimeraImagenEnPanel();


    }//GEN-LAST:event_labelMiniatura1MouseClicked

    private void labelMiniatura1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura1MousePressed

    }//GEN-LAST:event_labelMiniatura1MousePressed

    private void jLabelLogoUniversaeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoUniversaeMouseClicked
        new PantallaPrincipal().setVisible(true);
    }//GEN-LAST:event_jLabelLogoUniversaeMouseClicked

    private void jLabelIcon13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon13MouseExited
        jLabelIcon13.setIcon(originalLogo[13]);
    }//GEN-LAST:event_jLabelIcon13MouseExited

    private void jLabelIcon13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon13MouseEntered
        // TODO add your handling code  // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon13.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo13 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled13 = new ImageIcon(scaledLogo13);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon13.setIcon(scaled13);
    }//GEN-LAST:event_jLabelIcon13MouseEntered

    private void jLabelIcon12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon12MouseExited
        jLabelIcon12.setIcon(originalLogo[12]);
    }//GEN-LAST:event_jLabelIcon12MouseExited

    private void jLabelIcon12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon12MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon12.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo12 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled12 = new ImageIcon(scaledLogo12);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon12.setIcon(scaled12);
    }//GEN-LAST:event_jLabelIcon12MouseEntered

    private void jLabelIcon11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon11MouseExited
        jLabelIcon11.setIcon(originalLogo[11]);
    }//GEN-LAST:event_jLabelIcon11MouseExited

    private void jLabelIcon11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon11MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon11.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo11 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled11 = new ImageIcon(scaledLogo11);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon11.setIcon(scaled11);
    }//GEN-LAST:event_jLabelIcon11MouseEntered

    private void jLabelIcon10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon10MouseExited
        jLabelIcon10.setIcon(originalLogo[10]);
    }//GEN-LAST:event_jLabelIcon10MouseExited

    private void jLabelIcon10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon10MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon10.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo10 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled10 = new ImageIcon(scaledLogo10);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon10.setIcon(scaled10);
    }//GEN-LAST:event_jLabelIcon10MouseEntered

    private void jLabelIcon9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon9MouseExited
        jLabelIcon9.setIcon(originalLogo[9]);
    }//GEN-LAST:event_jLabelIcon9MouseExited

    private void jLabelIcon9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon9MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon9.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo9 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled9 = new ImageIcon(scaledLogo9);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon9.setIcon(scaled9);
    }//GEN-LAST:event_jLabelIcon9MouseEntered

    private void jLabelIcon8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon8MouseExited
        jLabelIcon8.setIcon(originalLogo[8]);
    }//GEN-LAST:event_jLabelIcon8MouseExited

    private void jLabelIcon8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon8MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon8.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo8 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled8 = new ImageIcon(scaledLogo8);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon8.setIcon(scaled8);
    }//GEN-LAST:event_jLabelIcon8MouseEntered

    private void jLabelIcon7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon7MouseExited
        jLabelIcon7.setIcon(originalLogo[7]);
    }//GEN-LAST:event_jLabelIcon7MouseExited

    private void jLabelIcon7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon7MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon7.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo7 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled7 = new ImageIcon(scaledLogo7);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon7.setIcon(scaled7);
    }//GEN-LAST:event_jLabelIcon7MouseEntered

    private void jLabelIcon6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon6MouseExited
        jLabelIcon6.setIcon(originalLogo[6]);
    }//GEN-LAST:event_jLabelIcon6MouseExited

    private void jLabelIcon6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon6MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon6.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo6 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled6 = new ImageIcon(scaledLogo6);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon6.setIcon(scaled6);
    }//GEN-LAST:event_jLabelIcon6MouseEntered

    private void jLabelIcon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon5MouseExited
        jLabelIcon5.setIcon(originalLogo[5]);
    }//GEN-LAST:event_jLabelIcon5MouseExited

    private void jLabelIcon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon5MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon5.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo5 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled5 = new ImageIcon(scaledLogo5);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon5.setIcon(scaled5);
    }//GEN-LAST:event_jLabelIcon5MouseEntered

    private void jLabelIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon4MouseExited
        jLabelIcon4.setIcon(originalLogo[4]);
    }//GEN-LAST:event_jLabelIcon4MouseExited

    private void jLabelIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon4MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon4.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo4 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled4 = new ImageIcon(scaledLogo4);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon4.setIcon(scaled4);
    }//GEN-LAST:event_jLabelIcon4MouseEntered

    private void jLabelIcon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon3MouseExited
        jLabelIcon3.setIcon(originalLogo[3]);
    }//GEN-LAST:event_jLabelIcon3MouseExited

    private void jLabelIcon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon3MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon3.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo3 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled3 = new ImageIcon(scaledLogo3);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon3.setIcon(scaled3);
    }//GEN-LAST:event_jLabelIcon3MouseEntered

    private void jLabelIcon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon2MouseExited
        jLabelIcon2.setIcon(originalLogo[2]);
    }//GEN-LAST:event_jLabelIcon2MouseExited

    private void jLabelIcon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon2MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon2.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo2 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled2 = new ImageIcon(scaledLogo2);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon2.setIcon(scaled2);
    }//GEN-LAST:event_jLabelIcon2MouseEntered

    private void jLabelIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon1MouseExited
        jLabelIcon1.setIcon(originalLogo[1]);
    }//GEN-LAST:event_jLabelIcon1MouseExited

    private void jLabelIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon1MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon1.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo1 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled1 = new ImageIcon(scaledLogo1);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon1.setIcon(scaled1);
    }//GEN-LAST:event_jLabelIcon1MouseEntered

    private void jLabelIcon0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon0MouseExited
        jLabelIcon0.setIcon(originalLogo[0]);
    }//GEN-LAST:event_jLabelIcon0MouseExited

    private void jLabelIcon0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon0MouseEntered
        // Obtener la imagen actual del JLabel
        ImageIcon jLabelIconCurrent = (ImageIcon) jLabelIcon0.getIcon();
        Image currentLogo = jLabelIconCurrent.getImage();

        // Escalar la imagen cuando el ratón entra en el JLabel
        Image scaledLogo0 = currentLogo.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaled0 = new ImageIcon(scaledLogo0);

        // Establecer la imagen escalada en el JLabel
        jLabelIcon0.setIcon(scaled0);
    }//GEN-LAST:event_jLabelIcon0MouseEntered

    private void labelMiniatura2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura2MouseClicked

        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes1);
        pantalla.mostrarPrimeraImagenEnPanel();

    }//GEN-LAST:event_labelMiniatura2MouseClicked

    private void labelMiniatura3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura3MouseClicked
        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes2);
        pantalla.mostrarPrimeraImagenEnPanel();
    }//GEN-LAST:event_labelMiniatura3MouseClicked

    private void labelMiniatura4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura4MouseClicked
        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes3);
        pantalla.mostrarPrimeraImagenEnPanel();
    }//GEN-LAST:event_labelMiniatura4MouseClicked

    private void labelMiniatura5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura5MouseClicked
        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes4);
        pantalla.mostrarPrimeraImagenEnPanel();
    }//GEN-LAST:event_labelMiniatura5MouseClicked

    private void labelMiniatura6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniatura6MouseClicked
        try {
            reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        } catch (JavaLayerException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pantalla.setVisible(true);
        pantalla.inicializarCargaImagenes(pantalla.imagenes5);
        pantalla.mostrarPrimeraImagenEnPanel();
    }//GEN-LAST:event_labelMiniatura6MouseClicked
    public static void reproducirSonido(String rutaArchivo) throws JavaLayerException {
        try {
            // Crea un flujo de entrada para el archivo MP3
            FileInputStream entradaMp3 = new FileInputStream(rutaArchivo);

            // Crea un objeto Player para reproducir el archivo MP3
            Player player = new Player(entradaMp3);

            // Reproduce el sonido
            player.play();
        } catch (FileNotFoundException e) {
            // Manejo de excepciones
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelIcon0;
    private javax.swing.JLabel jLabelIcon1;
    private javax.swing.JLabel jLabelIcon10;
    private javax.swing.JLabel jLabelIcon11;
    private javax.swing.JLabel jLabelIcon12;
    private javax.swing.JLabel jLabelIcon13;
    private javax.swing.JLabel jLabelIcon2;
    private javax.swing.JLabel jLabelIcon3;
    private javax.swing.JLabel jLabelIcon4;
    private javax.swing.JLabel jLabelIcon5;
    private javax.swing.JLabel jLabelIcon6;
    private javax.swing.JLabel jLabelIcon7;
    private javax.swing.JLabel jLabelIcon8;
    private javax.swing.JLabel jLabelIcon9;
    private javax.swing.JLabel jLabelLogoUniversae;
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
