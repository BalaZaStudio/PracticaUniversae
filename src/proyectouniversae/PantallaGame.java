package proyectouniversae;

import java.awt.Image;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author zabadev
 */
public class PantallaGame extends javax.swing.JFrame {

    private int imagenActualIndex = 0; // Variable Imagen Actual
    public final List<ImageIcon> imagenes = new ArrayList<>();
    public final List<ImageIcon> imagenes1 = new ArrayList<>();
    public final List<ImageIcon> imagenes2 = new ArrayList<>();
    public final List<ImageIcon> imagenes3 = new ArrayList<>();
    public final List<ImageIcon> imagenes4 = new ArrayList<>();
    public final List<ImageIcon> imagenes5 = new ArrayList<>();

    private List<ImageIcon> listaImagenesCargadas; // Nueva variable para mantener la lista de imágenes actualmente cargada
    private final ImageIcon[] originalLogo = new ImageIcon[14];

    public PantallaGame() {

        initComponents();
        JLabel[] logos = {jLabelIcon0, jLabelIcon1, jLabelIcon2, jLabelIcon3, jLabelIcon4, jLabelIcon5, jLabelIcon6, jLabelIcon7, jLabelIcon8, jLabelIcon9, jLabelIcon10, jLabelIcon11, jLabelIcon12, jLabelIcon13};
        // Llenar el array de originalIcons con los íconos originales de cada etiqueta
        for (int i = 0; i < originalLogo.length; i++) {
            originalLogo[i] = (ImageIcon) logos[i].getIcon();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogoUniversae = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jLabelContent = new javax.swing.JLabel();
        jPanelBaseFondo = new javax.swing.JPanel();
        jLabelCircle1 = new javax.swing.JLabel();
        jLabelCircle2 = new javax.swing.JLabel();
        jLabelBtnIzq = new javax.swing.JLabel();
        jLabelCircle3 = new javax.swing.JLabel();
        jLabelCircle4 = new javax.swing.JLabel();
        jLabelCircle5 = new javax.swing.JLabel();
        jLabelCircleFill1 = new javax.swing.JLabel();
        jLabelCircleFill2 = new javax.swing.JLabel();
        jLabelCircleFill3 = new javax.swing.JLabel();
        jLabelCircleFill4 = new javax.swing.JLabel();
        jLabelCircleFill5 = new javax.swing.JLabel();
        jLabelBtnDer = new javax.swing.JLabel();
        jLabelComenzar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        getContentPane().add(jLabelLogoUniversae, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 150));

        jPanelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContent.setAlignmentY(0.0F);
        jLabelContent.setAutoscrolls(true);
        jLabelContent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelContent.setInheritsPopupMenu(false);
        jPanelContent.add(jLabelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 664, 500));

        getContentPane().add(jPanelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 670, 500));

        jPanelBaseFondo.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanelBaseFondo.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanelBaseFondo.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanelBaseFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCircle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 730, -1, -1));

        jLabelCircle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 730, -1, -1));

        jLabelBtnIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/Flecha izquierda.png"))); // NOI18N
        jLabelBtnIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnIzqMouseClicked(evt);
            }
        });
        jPanelBaseFondo.add(jLabelBtnIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 40, 60));

        jLabelCircle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 730, -1, -1));

        jLabelCircle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 730, -1, -1));

        jLabelCircle5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 730, -1, -1));

        jLabelCircleFill1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircleFill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 730, -1, -1));

        jLabelCircleFill2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircleFill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 730, -1, -1));

        jLabelCircleFill3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircleFill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 730, -1, -1));

        jLabelCircleFill4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircleFill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 730, -1, -1));

        jLabelCircleFill5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelCircleFill5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 730, -1, -1));

        jLabelBtnDer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/Flecha derecha.png"))); // NOI18N
        jLabelBtnDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnDerMouseClicked(evt);
            }
        });
        jPanelBaseFondo.add(jLabelBtnDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1632, 435, 40, 50));

        jLabelComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/Comenzar.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 900, -1, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/Cuadrado fondo enfocado.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setMaximumSize(new java.awt.Dimension(980, 463));
        jLabel15.setMinimumSize(new java.awt.Dimension(980, 463));
        jLabel15.setPreferredSize(new java.awt.Dimension(980, 463));
        jPanelBaseFondo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 790, -1));
        jLabel15.getAccessibleContext().setAccessibleParent(this);

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

        jPanelBaseFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        labelFondoBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazBase/FondoBase.png"))); // NOI18N
        labelFondoBase.setFocusTraversalPolicyProvider(true);
        labelFondoBase.setName(""); // NOI18N
        jPanelBaseFondo.add(labelFondoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelBaseFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBtnIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnIzqMouseClicked

        if (imagenActualIndex > 0) {
            imagenActualIndex--;
        } else {
            imagenActualIndex = listaImagenesCargadas.size() - 1;
        }
        mostrarImagenActualEnPanel(listaImagenesCargadas);

    }//GEN-LAST:event_jLabelBtnIzqMouseClicked

    private void jLabelBtnDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnDerMouseClicked

        if (imagenActualIndex < listaImagenesCargadas.size() - 1) {
            imagenActualIndex++;
        } else {
            imagenActualIndex = 0;
        }
        mostrarImagenActualEnPanel(listaImagenesCargadas);

    }//GEN-LAST:event_jLabelBtnDerMouseClicked

    private void jLabelLogoUniversaeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoUniversaeMouseClicked
        new PantallaPrincipal().setVisible(true);
    }//GEN-LAST:event_jLabelLogoUniversaeMouseClicked

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

    private void jLabelIcon0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon0MouseExited
        jLabelIcon0.setIcon(originalLogo[0]);
    }//GEN-LAST:event_jLabelIcon0MouseExited

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

    private void jLabelIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon1MouseExited
        jLabelIcon1.setIcon(originalLogo[1]);
    }//GEN-LAST:event_jLabelIcon1MouseExited

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

    private void jLabelIcon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon2MouseExited
        jLabelIcon2.setIcon(originalLogo[2]);
    }//GEN-LAST:event_jLabelIcon2MouseExited

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

    private void jLabelIcon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon3MouseExited
        jLabelIcon3.setIcon(originalLogo[3]);
    }//GEN-LAST:event_jLabelIcon3MouseExited

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

    private void jLabelIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon4MouseExited
        jLabelIcon4.setIcon(originalLogo[4]);
    }//GEN-LAST:event_jLabelIcon4MouseExited

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

    private void jLabelIcon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon5MouseExited
        jLabelIcon5.setIcon(originalLogo[5]);
    }//GEN-LAST:event_jLabelIcon5MouseExited

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

    private void jLabelIcon6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon6MouseExited
        jLabelIcon6.setIcon(originalLogo[6]);
    }//GEN-LAST:event_jLabelIcon6MouseExited

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

    private void jLabelIcon7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon7MouseExited
        jLabelIcon7.setIcon(originalLogo[7]);
    }//GEN-LAST:event_jLabelIcon7MouseExited

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

    private void jLabelIcon8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon8MouseExited
        jLabelIcon8.setIcon(originalLogo[8]);
    }//GEN-LAST:event_jLabelIcon8MouseExited

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

    private void jLabelIcon9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon9MouseExited
        jLabelIcon9.setIcon(originalLogo[9]);
    }//GEN-LAST:event_jLabelIcon9MouseExited

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

    private void jLabelIcon10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon10MouseExited
        jLabelIcon10.setIcon(originalLogo[10]);
    }//GEN-LAST:event_jLabelIcon10MouseExited

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

    private void jLabelIcon11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon11MouseExited
        jLabelIcon11.setIcon(originalLogo[11]);
    }//GEN-LAST:event_jLabelIcon11MouseExited

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

    private void jLabelIcon12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon12MouseExited
        jLabelIcon12.setIcon(originalLogo[12]);
    }//GEN-LAST:event_jLabelIcon12MouseExited

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

    private void jLabelIcon13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon13MouseExited
        jLabelIcon13.setIcon(originalLogo[13]);
    }//GEN-LAST:event_jLabelIcon13MouseExited
    private void cargarImagenes(List<ImageIcon> listaImagenes, String carpeta, String[] nombresArchivos) {
        for (String nombreArchivo : nombresArchivos) {
            ImageIcon imagen = new ImageIcon("C:/Users/zabal/Documents/GitHub/PracticaUniversae/src/proyectouniversae/InterfazGame/Miniaturas/" + carpeta + "/" + nombreArchivo);
            listaImagenes.add(imagen);
        }
    }

    public void inicializarCargaImagenes(List<ImageIcon> listaImagenes) {
        String[] nombresHelicoptero = {"Helicoptero0.png", "Helicoptero1.png", "Helicoptero2.png", "Helicoptero3.png", "Helicoptero4.png"};
        String[] nombresHemorragia = {"Hemorragia0.png", "Hemorragia1.png", "Hemorragia2.png", "Hemorragia3.png", "Hemorragia4.png"};
        String[] nombresExtincion = {"Extincion0.png", "Extincion1.png", "Extincion2.png", "Extincion3.png", "Extincion4.png"};
        String[] nombresEPIS = {"EPIS0.png", "EPIS1.png", "EPIS2.png", "EPIS3.png", "EPIS4.png"};
        String[] nombresHelicoptero1 = {"Helicoptero0.png", "Helicoptero1.png", "Helicoptero2.png", "Helicoptero3.png", "Helicoptero4.png"};
        String[] nombresAscensor = {"Ascensor0.png", "Ascensor1.png", "Ascensor2.png", "Ascensor3.png", "Ascensor4.png"};

        cargarImagenes(imagenes, "Helicoptero", nombresHelicoptero);
        cargarImagenes(imagenes1, "Hemorragia", nombresHemorragia);
        cargarImagenes(imagenes2, "Extincion", nombresExtincion);
        cargarImagenes(imagenes3, "EPIS", nombresEPIS);
        cargarImagenes(imagenes4, "Helicoptero", nombresHelicoptero1);
        cargarImagenes(imagenes5, "Ascensor", nombresAscensor);

        listaImagenesCargadas = !listaImagenes.isEmpty() ? listaImagenes : new ArrayList<>();
    }

    public void mostrarPrimeraImagenEnPanel() {
        if (!listaImagenesCargadas.isEmpty()) {
            mostrarImagenActualEnPanel(listaImagenesCargadas);
        }
    }

    private void mostrarImagenActualEnPanel(List<ImageIcon> listaImagenes) {
        if (!listaImagenes.isEmpty()) {
            ImageIcon imagenOriginal = listaImagenes.get(imagenActualIndex);

            // Especificar el tamaño deseado para la imagen
            int anchoDeseado = 700;
            int altoDeseado = 550;

            // Redimensionar la imagen al tamaño deseado
            Image imagenRedimensionada = imagenOriginal.getImage().getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH);

            // Crear un nuevo ImageIcon con la imagen redimensionada
            ImageIcon imagenEscalada = new ImageIcon(imagenRedimensionada);

            // Mostrar la imagen redimensionada en el JLabel
            jLabelContent.setIcon(imagenEscalada);
            actualizarCirculos(imagenActualIndex);
            pack();
        }
    }

    private void actualizarCirculos(int indiceImagen) {
        // Primero, ocultar todos los jLabelCircle y jLabelCircleFill
        jLabelCircle1.setVisible(false);
        jLabelCircleFill1.setVisible(false);
        jLabelCircle2.setVisible(false);
        jLabelCircleFill2.setVisible(false);
        jLabelCircle3.setVisible(false);
        jLabelCircleFill3.setVisible(false);
        jLabelCircle4.setVisible(false);
        jLabelCircleFill4.setVisible(false);
        jLabelCircle5.setVisible(false);
        jLabelCircleFill5.setVisible(false);

        // Activar el jLabelCircleFill correspondiente y desactivar el jLabelCircle
        switch (indiceImagen) {
            case 0:
                jLabelCircleFill1.setVisible(true);
                jLabelCircle1.setVisible(true);
                jLabelCircle2.setVisible(true);
                jLabelCircle3.setVisible(true);
                jLabelCircle4.setVisible(true);
                jLabelCircle5.setVisible(true);
                break;
            case 1:
                jLabelCircleFill2.setVisible(true);
                jLabelCircle1.setVisible(true);
                jLabelCircle2.setVisible(true);
                jLabelCircle3.setVisible(true);
                jLabelCircle4.setVisible(true);
                jLabelCircle5.setVisible(true);
                break;
            case 2:
                jLabelCircleFill3.setVisible(true);
                jLabelCircle1.setVisible(true);
                jLabelCircle2.setVisible(true);
                jLabelCircle3.setVisible(true);
                jLabelCircle4.setVisible(true);
                jLabelCircle5.setVisible(true);
                break;
            case 3:
                jLabelCircleFill4.setVisible(true);
                jLabelCircle1.setVisible(true);
                jLabelCircle2.setVisible(true);
                jLabelCircle3.setVisible(true);
                jLabelCircle4.setVisible(true);
                jLabelCircle5.setVisible(true);
                break;
            case 4:
                jLabelCircleFill5.setVisible(true);
                jLabelCircle1.setVisible(true);
                jLabelCircle2.setVisible(true);
                jLabelCircle3.setVisible(true);
                jLabelCircle4.setVisible(true);
                jLabelCircle5.setVisible(true);
                break;
            default:
                // Opcional: manejar cualquier caso no previsto
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabelBtnDer;
    private javax.swing.JLabel jLabelBtnIzq;
    private javax.swing.JLabel jLabelCircle1;
    private javax.swing.JLabel jLabelCircle2;
    private javax.swing.JLabel jLabelCircle3;
    private javax.swing.JLabel jLabelCircle4;
    private javax.swing.JLabel jLabelCircle5;
    private javax.swing.JLabel jLabelCircleFill1;
    private javax.swing.JLabel jLabelCircleFill2;
    private javax.swing.JLabel jLabelCircleFill3;
    private javax.swing.JLabel jLabelCircleFill4;
    private javax.swing.JLabel jLabelCircleFill5;
    private javax.swing.JLabel jLabelComenzar;
    private javax.swing.JLabel jLabelContent;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBaseFondo;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JLabel labelFondoBase;
    // End of variables declaration//GEN-END:variables
}
