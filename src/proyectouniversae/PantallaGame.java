package proyectouniversae;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static proyectouniversae.Controladora.escalarImagen;
import static proyectouniversae.PantallaPrincipal.imagenActualIndex;

/**
 *
 * @author zabadev
 */
public class PantallaGame extends javax.swing.JFrame {

    public static final List<ImageIcon> imagenes = new ArrayList<>();
    public static final List<ImageIcon> imagenes1 = new ArrayList<>();
    public static final List<ImageIcon> imagenes2 = new ArrayList<>();
    public static final List<ImageIcon> imagenes3 = new ArrayList<>();
    public static final List<ImageIcon> imagenes4 = new ArrayList<>();
    public static final List<ImageIcon> imagenes5 = new ArrayList<>();

    public static List<ImageIcon> listaImagenesCargadas; // Nueva variable para mantener la lista de imágenes actualmente cargada
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
        jLabelBarrita = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextParrafo = new javax.swing.JTextArea();
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

        jLabelBarrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectouniversae/InterfazGame/Barrita aislada descripción.png"))); // NOI18N
        jPanelBaseFondo.add(jLabelBarrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 760, 10, 40));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBaseFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, 760, 50));

        jTextParrafo.setEditable(false);
        jTextParrafo.setBackground(new java.awt.Color(255, 255, 255));
        jTextParrafo.setColumns(20);
        jTextParrafo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jTextParrafo.setForeground(new java.awt.Color(255, 255, 255));
        jTextParrafo.setLineWrap(true);
        jTextParrafo.setRows(5);
        jTextParrafo.setToolTipText("");
        jTextParrafo.setOpaque(false);
        jPanelBaseFondo.add(jTextParrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 840, 900, 200));

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
            imagenActualIndex--; // Disminuye el índice de la imagen actual.

        } else {
            // Si estamos en la primera imagen, establece el índice al de la última imagen.
            imagenActualIndex = listaImagenesCargadas.size() - 1;
        }

        // Ajustar el índice si es mayor que 3
        if (imagenActualIndex > 4) {
            imagenActualIndex = 4;
        }

        // Muestra la imagen actual en el panel.
        Controladora.mostrarImagenActualEnPanel(listaImagenesCargadas);
        // Actualiza los círculos correspondientes al nuevo índice de imagen si es válido
        if (imagenActualIndex >= 0 && imagenActualIndex < listaImagenesCargadas.size()) {
            Controladora.actualizarCirculos(imagenActualIndex);
        } else {
            System.err.println("Índice de imagen fuera de los límites.");
        }

    }//GEN-LAST:event_jLabelBtnIzqMouseClicked

    private void jLabelBtnDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnDerMouseClicked

        if (imagenActualIndex < listaImagenesCargadas.size() - 1) {
            imagenActualIndex++; // Incrementa el índice de la imagen actual.
        } else {
            // Si estamos en la última imagen, establece el índice al de la primera imagen.
            imagenActualIndex = 0;
        }

        // Ajustar el índice si es mayor que 3
        if (imagenActualIndex > 4) {
            imagenActualIndex = 0;
        }

        // Muestra la imagen actual en el panel.
        Controladora.mostrarImagenActualEnPanel(listaImagenesCargadas);
        // Actualiza los círculos correspondientes al nuevo índice de imagen si es válido
        if (imagenActualIndex >= 0 && imagenActualIndex < listaImagenesCargadas.size()) {
            Controladora.actualizarCirculos(imagenActualIndex);
        } else {
            System.err.println("Índice de imagen fuera de los límites.");
        }


    }//GEN-LAST:event_jLabelBtnDerMouseClicked

    private void jLabelLogoUniversaeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoUniversaeMouseClicked

        Controladora.logoReset();
    }//GEN-LAST:event_jLabelLogoUniversaeMouseClicked

    private void jLabelIcon0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon0MouseEntered
        // Llamada al método para escalar la imagen del jLabelIcon13 a 120x120
        escalarImagen(jLabelIcon0, 120, 120);
    }//GEN-LAST:event_jLabelIcon0MouseEntered

    private void jLabelIcon0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon0MouseExited
        jLabelIcon0.setIcon(originalLogo[0]);
    }//GEN-LAST:event_jLabelIcon0MouseExited

    private void jLabelIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon1MouseEntered
        escalarImagen(jLabelIcon1, 120, 120);
    }//GEN-LAST:event_jLabelIcon1MouseEntered

    private void jLabelIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon1MouseExited
        jLabelIcon1.setIcon(originalLogo[1]);
    }//GEN-LAST:event_jLabelIcon1MouseExited

    private void jLabelIcon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon2MouseEntered
        escalarImagen(jLabelIcon2, 120, 120);
    }//GEN-LAST:event_jLabelIcon2MouseEntered

    private void jLabelIcon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon2MouseExited
        jLabelIcon2.setIcon(originalLogo[2]);
    }//GEN-LAST:event_jLabelIcon2MouseExited

    private void jLabelIcon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon3MouseEntered
        escalarImagen(jLabelIcon3, 120, 120);
    }//GEN-LAST:event_jLabelIcon3MouseEntered

    private void jLabelIcon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon3MouseExited
        jLabelIcon3.setIcon(originalLogo[3]);
    }//GEN-LAST:event_jLabelIcon3MouseExited

    private void jLabelIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon4MouseEntered
        escalarImagen(jLabelIcon4, 120, 120);
    }//GEN-LAST:event_jLabelIcon4MouseEntered

    private void jLabelIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon4MouseExited
        jLabelIcon4.setIcon(originalLogo[4]);
    }//GEN-LAST:event_jLabelIcon4MouseExited

    private void jLabelIcon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon5MouseEntered
        escalarImagen(jLabelIcon5, 120, 120);
    }//GEN-LAST:event_jLabelIcon5MouseEntered

    private void jLabelIcon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon5MouseExited
        jLabelIcon5.setIcon(originalLogo[5]);
    }//GEN-LAST:event_jLabelIcon5MouseExited

    private void jLabelIcon6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon6MouseEntered
        escalarImagen(jLabelIcon6, 120, 120);
    }//GEN-LAST:event_jLabelIcon6MouseEntered

    private void jLabelIcon6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon6MouseExited
        jLabelIcon6.setIcon(originalLogo[6]);
    }//GEN-LAST:event_jLabelIcon6MouseExited

    private void jLabelIcon7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon7MouseEntered
        escalarImagen(jLabelIcon7, 120, 120);
    }//GEN-LAST:event_jLabelIcon7MouseEntered

    private void jLabelIcon7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon7MouseExited
        jLabelIcon7.setIcon(originalLogo[7]);
    }//GEN-LAST:event_jLabelIcon7MouseExited

    private void jLabelIcon8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon8MouseEntered
        escalarImagen(jLabelIcon8, 120, 120);
    }//GEN-LAST:event_jLabelIcon8MouseEntered

    private void jLabelIcon8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon8MouseExited
        jLabelIcon8.setIcon(originalLogo[8]);
    }//GEN-LAST:event_jLabelIcon8MouseExited

    private void jLabelIcon9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon9MouseEntered
        escalarImagen(jLabelIcon9, 120, 120);
    }//GEN-LAST:event_jLabelIcon9MouseEntered

    private void jLabelIcon9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon9MouseExited
        jLabelIcon9.setIcon(originalLogo[9]);
    }//GEN-LAST:event_jLabelIcon9MouseExited

    private void jLabelIcon10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon10MouseEntered
        escalarImagen(jLabelIcon10, 120, 120);
    }//GEN-LAST:event_jLabelIcon10MouseEntered

    private void jLabelIcon10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon10MouseExited
        jLabelIcon10.setIcon(originalLogo[10]);
    }//GEN-LAST:event_jLabelIcon10MouseExited

    private void jLabelIcon11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon11MouseEntered
        escalarImagen(jLabelIcon11, 120, 120);
    }//GEN-LAST:event_jLabelIcon11MouseEntered

    private void jLabelIcon11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon11MouseExited
        jLabelIcon11.setIcon(originalLogo[11]);
    }//GEN-LAST:event_jLabelIcon11MouseExited

    private void jLabelIcon12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon12MouseEntered
        escalarImagen(jLabelIcon12, 120, 120);
    }//GEN-LAST:event_jLabelIcon12MouseEntered

    private void jLabelIcon12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon12MouseExited
        jLabelIcon12.setIcon(originalLogo[12]);
    }//GEN-LAST:event_jLabelIcon12MouseExited

    private void jLabelIcon13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon13MouseEntered
        escalarImagen(jLabelIcon13, 120, 120);
    }//GEN-LAST:event_jLabelIcon13MouseEntered

    private void jLabelIcon13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcon13MouseExited
        jLabelIcon13.setIcon(originalLogo[13]);
    }//GEN-LAST:event_jLabelIcon13MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabelBarrita;
    private javax.swing.JLabel jLabelBtnDer;
    private javax.swing.JLabel jLabelBtnIzq;
    public static javax.swing.JLabel jLabelCircle1;
    public static javax.swing.JLabel jLabelCircle2;
    public static javax.swing.JLabel jLabelCircle3;
    public static javax.swing.JLabel jLabelCircle4;
    public static javax.swing.JLabel jLabelCircle5;
    public static javax.swing.JLabel jLabelCircleFill1;
    public static javax.swing.JLabel jLabelCircleFill2;
    public static javax.swing.JLabel jLabelCircleFill3;
    public static javax.swing.JLabel jLabelCircleFill4;
    public static javax.swing.JLabel jLabelCircleFill5;
    private javax.swing.JLabel jLabelComenzar;
    public static javax.swing.JLabel jLabelContent;
    public static javax.swing.JLabel jLabelIcon0;
    public static javax.swing.JLabel jLabelIcon1;
    public static javax.swing.JLabel jLabelIcon10;
    public static javax.swing.JLabel jLabelIcon11;
    public static javax.swing.JLabel jLabelIcon12;
    private javax.swing.JLabel jLabelIcon13;
    public static javax.swing.JLabel jLabelIcon2;
    public static javax.swing.JLabel jLabelIcon3;
    public static javax.swing.JLabel jLabelIcon4;
    public static javax.swing.JLabel jLabelIcon5;
    public static javax.swing.JLabel jLabelIcon6;
    public static javax.swing.JLabel jLabelIcon7;
    public static javax.swing.JLabel jLabelIcon8;
    public static javax.swing.JLabel jLabelIcon9;
    private javax.swing.JLabel jLabelLogoUniversae;
    public static javax.swing.JLabel jLabelTitulo;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBaseFondo;
    private javax.swing.JPanel jPanelContent;
    public static javax.swing.JTextArea jTextParrafo;
    private javax.swing.JLabel labelFondoBase;
    // End of variables declaration//GEN-END:variables
}
