package codigo;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.undo.UndoManager;

public class FrmPrincipal extends javax.swing.JFrame {

    private String archivo = "archivo";
    private NumeroLinea NumLinea;
    DefaultTableModel modeloEstatico;
    DefaultTableModel modeloDinamico;
    public static ArrayList<String> errores = new ArrayList<>();

    private final UndoManager administradorCambios;

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SmartHealth");
        NumLinea = new NumeroLinea(txtEntrada);
        scrollEntrada.setRowHeaderView(NumLinea);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Atlas.png")).getImage());
        modeloEstatico = (DefaultTableModel) tablaEstatica.getModel();
        modeloDinamico = (DefaultTableModel) tablaDinamica.getModel();

        tablaEstatica.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tablaDinamica.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));

        // Oculta/Mustra las tablas a pantalla
        validarTablas();

        // Administrador de cambios en sintaxis
        administradorCambios = new UndoManager();                //construye una instancia de UndoManager

        txtEntrada.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                administradorCambios.addEdit(e.getEdit());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        barraHerramientas = new javax.swing.JToolBar();
        sep0 = new javax.swing.JToolBar.Separator();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        sep1 = new javax.swing.JToolBar.Separator();
        btnCortar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        sep2 = new javax.swing.JToolBar.Separator();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        sep3 = new javax.swing.JToolBar.Separator();
        btnCorrer = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        panelConsola = new javax.swing.JPanel();
        scrollConsola = new javax.swing.JScrollPane();
        txtError = new javax.swing.JTextArea();
        lblConsola = new javax.swing.JLabel();
        splitPanelContenedor = new javax.swing.JSplitPane();
        scrollEntrada = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        pesta??asTablas = new javax.swing.JTabbedPane();
        pToken = new javax.swing.JPanel();
        scrollTxtToken = new javax.swing.JScrollPane();
        txtTokens = new javax.swing.JTextArea();
        pTablaEstatica = new javax.swing.JPanel();
        ckbTablaEstatica = new javax.swing.JComboBox<>();
        scrollTablaEstatica = new javax.swing.JScrollPane();
        tablaEstatica = new javax.swing.JTable();
        pTablaDinamica = new javax.swing.JPanel();
        ckbTablaDinamica = new javax.swing.JComboBox<>();
        scrollTablaDinamica = new javax.swing.JScrollPane();
        tablaDinamica = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        mnuAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCerrar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuGuardar = new javax.swing.JMenuItem();
        mnuGuardarC = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        ckbTablas = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraHerramientas.setBackground(new java.awt.Color(255, 255, 255));
        barraHerramientas.setFloatable(false);
        barraHerramientas.setRollover(true);

        sep0.setForeground(new java.awt.Color(255, 255, 255));
        sep0.setEnabled(false);
        sep0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sep0.setOpaque(true);
        barraHerramientas.add(sep0);

        btnAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrirArchivo.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir archivo");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setPreferredSize(new java.awt.Dimension(40, 37));
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnAbrir);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardarArchivo.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar archivo");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnGuardar);

        sep1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        barraHerramientas.add(sep1);

        btnCortar.setBackground(new java.awt.Color(255, 255, 255));
        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cortarArchivo.png"))); // NOI18N
        btnCortar.setToolTipText("Cortar");
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setPreferredSize(new java.awt.Dimension(40, 37));
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCortar);

        btnCopiar.setBackground(new java.awt.Color(255, 255, 255));
        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/copiarArchivo.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.setFocusable(false);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCopiar);

        btnPegar.setBackground(new java.awt.Color(255, 255, 255));
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pegarArchivo.png"))); // NOI18N
        btnPegar.setToolTipText("Pegar");
        btnPegar.setFocusable(false);
        btnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnPegar);
        barraHerramientas.add(sep2);

        btnDeshacer.setBackground(new java.awt.Color(255, 255, 255));
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desHacerCambio.png"))); // NOI18N
        btnDeshacer.setToolTipText("Deshacer cambio");
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnDeshacer);

        btnRehacer.setBackground(new java.awt.Color(255, 255, 255));
        btnRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reHacerCambio.png"))); // NOI18N
        btnRehacer.setToolTipText("Rehacer cambio");
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacerActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnRehacer);
        barraHerramientas.add(sep3);

        btnCorrer.setBackground(new java.awt.Color(255, 255, 255));
        btnCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correrArchivo.png"))); // NOI18N
        btnCorrer.setToolTipText("Ejecutar archivo");
        btnCorrer.setFocusable(false);
        btnCorrer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCorrer);

        getContentPane().add(barraHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(480);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(1);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1230, 650));

        panelConsola.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelConsola.setFocusable(false);
        panelConsola.setPreferredSize(new java.awt.Dimension(1230, 150));

        scrollConsola.setPreferredSize(new java.awt.Dimension(166, 50));

        txtError.setEditable(false);
        txtError.setColumns(20);
        txtError.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        txtError.setRows(5);
        scrollConsola.setViewportView(txtError);

        lblConsola.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblConsola.setText("Consola");

        javax.swing.GroupLayout panelConsolaLayout = new javax.swing.GroupLayout(panelConsola);
        panelConsola.setLayout(panelConsolaLayout);
        panelConsolaLayout.setHorizontalGroup(
            panelConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsolaLayout.createSequentialGroup()
                        .addComponent(scrollConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(panelConsolaLayout.createSequentialGroup()
                        .addComponent(lblConsola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1158, 1158, 1158))))
        );
        panelConsolaLayout.setVerticalGroup(
            panelConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsolaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblConsola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConsola, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jSplitPane1.setRightComponent(panelConsola);

        splitPanelContenedor.setDividerLocation(700);
        splitPanelContenedor.setResizeWeight(1);
        splitPanelContenedor.setMinimumSize(new java.awt.Dimension(113, 120));
        splitPanelContenedor.setPreferredSize(new java.awt.Dimension(1025, 300));

        txtEntrada.setColumns(20);
        txtEntrada.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        txtEntrada.setRows(5);
        scrollEntrada.setViewportView(txtEntrada);

        splitPanelContenedor.setLeftComponent(scrollEntrada);

        pesta??asTablas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pesta??asTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesta??asTablasMousePressed(evt);
            }
        });

        pToken.setBackground(new java.awt.Color(255, 255, 255));

        scrollTxtToken.setBorder(null);

        txtTokens.setEditable(false);
        txtTokens.setColumns(20);
        txtTokens.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        txtTokens.setRows(5);
        txtTokens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        scrollTxtToken.setViewportView(txtTokens);

        javax.swing.GroupLayout pTokenLayout = new javax.swing.GroupLayout(pToken);
        pToken.setLayout(pTokenLayout);
        pTokenLayout.setHorizontalGroup(
            pTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTokenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTxtToken, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTokenLayout.setVerticalGroup(
            pTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTokenLayout.createSequentialGroup()
                .addComponent(scrollTxtToken, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        pesta??asTablas.addTab("Tokens", pToken);

        ckbTablaEstatica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ckbTablaEstatica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palabras reservadas", "Operadores", "Signos" }));
        ckbTablaEstatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTablaEstaticaActionPerformed(evt);
            }
        });

        tablaEstatica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tablaEstatica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Componente Lexico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEstatica.setRowHeight(20);
        tablaEstatica.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablaEstatica.setSelectionForeground(new java.awt.Color(42, 42, 42));
        tablaEstatica.setShowGrid(false);
        tablaEstatica.getTableHeader().setResizingAllowed(false);
        tablaEstatica.getTableHeader().setReorderingAllowed(false);
        scrollTablaEstatica.setViewportView(tablaEstatica);

        javax.swing.GroupLayout pTablaEstaticaLayout = new javax.swing.GroupLayout(pTablaEstatica);
        pTablaEstatica.setLayout(pTablaEstaticaLayout);
        pTablaEstaticaLayout.setHorizontalGroup(
            pTablaEstaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaEstaticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaEstaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTablaEstatica, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addComponent(ckbTablaEstatica, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaEstaticaLayout.setVerticalGroup(
            pTablaEstaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaEstaticaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ckbTablaEstatica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTablaEstatica, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        pesta??asTablas.addTab("Tabla Est??tica", pTablaEstatica);

        ckbTablaDinamica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ckbTablaDinamica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Variables", "Funciones" }));

        tablaDinamica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Valor", "Linea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTablaDinamica.setViewportView(tablaDinamica);

        javax.swing.GroupLayout pTablaDinamicaLayout = new javax.swing.GroupLayout(pTablaDinamica);
        pTablaDinamica.setLayout(pTablaDinamicaLayout);
        pTablaDinamicaLayout.setHorizontalGroup(
            pTablaDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaDinamicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTablaDinamica, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addComponent(ckbTablaDinamica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaDinamicaLayout.setVerticalGroup(
            pTablaDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaDinamicaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ckbTablaDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTablaDinamica, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        pesta??asTablas.addTab("Tabla Dinamica", pTablaDinamica);

        splitPanelContenedor.setRightComponent(pesta??asTablas);

        jSplitPane1.setTopComponent(splitPanelContenedor);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 650));

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(189, 30));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuLogo.png"))); // NOI18N
        jMenu5.setEnabled(false);
        jMenu5.setFocusable(false);
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuBar2.add(jMenu5);

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mnuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNuevo);

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAbrir);
        jMenu3.add(jSeparator1);

        mnuCerrar.setText("Cerrar");
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCerrar);
        jMenu3.add(jSeparator2);

        mnuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGuardar);

        mnuGuardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuGuardarC.setText("Guardar como");
        mnuGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarCActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGuardarC);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Compilar");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuBar2.add(jMenu4);

        jMenu1.setText("Ver");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jMenuItem1.setText("Analisis L??xico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Analisis Sintactico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        ckbTablas.setText("Visualizar tablas ");
        ckbTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTablasActionPerformed(evt);
            }
        });
        jMenu1.add(ckbTablas);

        jCheckBoxMenuItem2.setText("Visualizar errores");
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" analizadorLexico ">
    private void analizarLexico() throws IOException {
        int cont = 1;
        
        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        lexer.pintar.insertar(expr);
        txtTokens.setDocument(lexer.pintar.caja2.getDocument());
        String resultado = "LINEA " + cont + "\t\t\tLEXEMA\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtTokens.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;

//********************************T I P O   D A T O**********************************************
                case Cadena:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Atlas:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Int:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Char:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Logic:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Float:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Double:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Condition:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Until:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Option:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Ventilate:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case EmptyRoom:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Admit:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Dispense:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Distance:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case DeviceControl:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case DriverLights:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case OpenDoor:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case RegisterA:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Start:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case As:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Begin:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case Declare:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;

//******************************O P E R A D O R E S*******************************************                  
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Aritmetico:
                    resultado += "  <Operador aritmetico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;

//*****************************************************************************************
                case Exit:
                    resultado += "  <Palabra Reservada>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t" + lexer.lexeme + "\n";
                    break;
                case Texto:
                    resultado += "  <Texto>\t" + lexer.lexeme + "\n";
                    break;
                case Caracter:
                    resultado += "  <Caracter>\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido> " + lexer.lexeme + "\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    //</editor-fold>

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtTokens.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String ST = txtEntrada.getText();
        Sintax s = new Sintax(new LexerCup(new StringReader(ST)));

        try {
            errores.clear();
            s.parse();
            if (errores.size() == 0) {
                txtError.setText("Analisis realizado correctamente");
                txtError.setForeground(new Color(25, 111, 61));
            }
            for (String st : errores) {
                txtError.setText(st);
                txtError.setForeground(Color.red);
            }
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtError.setText(txtError.getText() + "\n" + "Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtError.setForeground(Color.red);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
        if (txtEntrada.getText().equals("")) {
            return;
        }
        int op = javax.swing.JOptionPane.showConfirmDialog(this, "Desea guardar?");
        if (op == -1 || op == 2) {
            return;
        } else if (op == 0) {
            mnuGuardarActionPerformed(evt);
        }
        txtEntrada.setText("");
        archivo = "";
    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
        if (archivo == "") {
            mnuGuardarActionPerformed(evt);
        }
        System.exit(0);
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
        if (archivo.equals("")) {
            mnuGuardarCActionPerformed(evt);
        }
        try {
            /*Flujos de Bytes
            java.io.FileOutputStream fbs=new java.io.FileOutputStream("Archivo.txt");
            byte b[]=txtEditor.getText().getBytes();
            fbs.write(b);
            fbs.flush();
            fbs.close();
             */
            //Flujos de Caracteres
            java.io.FileWriter fcs = new java.io.FileWriter(archivo);
            fcs.write(txtEntrada.getText());
            fcs.flush();
            fcs.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void mnuGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarCActionPerformed
        javax.swing.JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT", "txt");
        f.setFileFilter(filtro);

        String dir = "C:\\Users\\ximen\\OneDrive\\Documentos\\NetBeansProjects\\SmartHealth_V3\\SmartHealth\\";
        File directorio = new File(dir);
        f.setCurrentDirectory(directorio);

        if (f.showSaveDialog(this) == APPROVE_OPTION && f.getFileFilter() == filtro) {
            archivo = f.getSelectedFile().getName() + ".txt";
            mnuGuardarActionPerformed(evt);
        } else {
            showMessageDialog(this, "Solo archivos de texto");
        }
    }//GEN-LAST:event_mnuGuardarCActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtTokens.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void ckbTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTablasActionPerformed
        validarTablas();
    }//GEN-LAST:event_ckbTablasActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        try {
            administradorCambios.undo();
        } catch (Exception ex) {
            showMessageDialog(null, "No hay mas cambios que deshacer.");
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacerActionPerformed
        try {
            administradorCambios.redo();
        } catch (Exception ex) {
            showMessageDialog(null, "No hay mas cambios que rehacer.");
        }
    }//GEN-LAST:event_btnRehacerActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        txtEntrada.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        txtEntrada.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        txtEntrada.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ckbTablaEstaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTablaEstaticaActionPerformed
        llenadoTEstatico(ckbTablaEstatica.getSelectedIndex());
    }//GEN-LAST:event_ckbTablaEstaticaActionPerformed

    private void pesta??asTablasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesta??asTablasMousePressed
        llenadoTEstatico(ckbTablaEstatica.getSelectedIndex());
    }//GEN-LAST:event_pesta??asTablasMousePressed

    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            return;
        }

        String ST = txtEntrada.getText();
        Sintax s = new Sintax(new LexerCup(new StringReader(ST)));


        try {
            errores.clear();
            s.parse();
            if (errores.size() == 0) {
                txtError.setText("Analisis realizado correctamente");
                txtError.setForeground(new Color(25, 111, 61));
            }
            for (String st : errores) {
                txtError.setText(st);
                txtError.setForeground(Color.red);
            }
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtError.setText(txtError.getText() + "\n" + "Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtError.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnCorrerActionPerformed

    // Funciones
    //Pendiente
    private void nuevoArchivo() {
        if (txtEntrada.getText().equals("")) {
            return;
        }
        int op = javax.swing.JOptionPane.showConfirmDialog(this, "Desea guardar?");
        if (op == -1 || op == 2) {
            return;
        } else if (op == 0) {
            guardarArchivo();
        }
        txtEntrada.setText("");
        archivo = "";
    }

    private void abrirArchivo() {
        JFileChooser fc = getJFileChooser();
        int state = fc.showOpenDialog(this.getJFrame());
        String s1, sl;

        if (state == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (!(f.getName().endsWith(".atlas"))) {
                JOptionPane.showMessageDialog(null, "Solo los archivos con extensi??n .atlas son admitidos");
                abrirArchivo();
                return;
            }
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));

                sl = br.readLine();
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1;
                }
                txtEntrada.setText(sl);

                br.close();    //cierra el flujo
                this.setTitle("SH - " + f.getName());
            } catch (IOException ex) {
                showMessageDialog(null, ex);
            }
        }
    }
    //Pendiente

    private void guardarArchivo() {
        if (archivo.equals("")) {
            guardarCArchivo();
        }
        try {
            //Flujos de Caracteres
            java.io.FileWriter fcs = new java.io.FileWriter(archivo);
            fcs.write(txtEntrada.getText());
            fcs.flush();
            fcs.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Pendiente

    private void guardarCArchivo() {
        javax.swing.JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT", "txt");
        f.setFileFilter(filtro);

        String dir = "B:\\TEC\\SEMESTRE_7\\AUTOMATAS_1\\SmartHealth_V3.zip\\SmartHealth_V3\\SmartHealth\\";
        File directorio = new File(dir);
        f.setCurrentDirectory(directorio);

        if (f.showSaveDialog(this) == APPROVE_OPTION && f.getFileFilter() == filtro) {
            archivo = f.getSelectedFile().getName() + ".txt";
            guardarArchivo();
        } else {
            showMessageDialog(this, "Solo archivos de texto");
        }
    }

    private void llenadoTEstatico(int index) {

        int col = 0;
        int row = 0;

        String[] palabras_reservadas = new String[]{
            "pin", "Atlas(p??blico)", "Distance", "Device", "Temperature",
            "Admit", "Ventilate", "Dispense", "Control_Device", "LogA",
            "OpenDoor", "Exit", "Start", "End", "Codition", "Else", "Until", "Do",
            "EmptyRoom", "DeviceControl", "RegistarA",
            "int", "float", "double", "logic", "char"
        };
        palabras_reservadas = ordenarLista(palabras_reservadas);

        String[] operaciones = new String[]{
            "*", "+", "-", "/", // Aritmeticos   0-3
            "==", "<=", ">=", "<", ">", "!=", // Comparaciones 4-9
            "&&", "||", "!", // Logicos       10-12
            "*=", "+=", "/=", "-=", "=", // Asignacion    13-17
            "{", "}", "[", "]", "(", ")" // Agrupaci??n    18-23
        };

        String[] signos = new String[]{
            "'", ";", ":", ".", ","
        };

        String[] funcionSigno = new String[]{
            "Ej1", "Ej2", "Ej3", "Ej4", "Ej5"
        };

        switch (index) {
            case -1:
                limpiarTablaEstatica();
                for (int i = 0; i < palabras_reservadas.length; i++) {
                    modeloEstatico.addRow(new Object[]{"", ""});
                    tablaEstatica.setValueAt(palabras_reservadas[i], row, col);
                    col++;
                    tablaEstatica.setValueAt("Palabra reservada", row, col);
                    row++;
                    col--;
                }
                break;
            case 0:
                limpiarTablaEstatica();
                for (int i = 0; i < palabras_reservadas.length; i++) {
                    modeloEstatico.addRow(new Object[]{"", ""});
                    tablaEstatica.setValueAt(palabras_reservadas[i], row, col);
                    col++;
                    tablaEstatica.setValueAt("Palabra reservada", row, col);
                    row++;
                    col--;
                }
                break;
            case 1:
                limpiarTablaEstatica();
                for (int i = 0; i < operaciones.length; i++) {
                    modeloEstatico.addRow(new Object[]{"", ""});
                    tablaEstatica.setValueAt(operaciones[i], row, col);
                    col++;
                    // Aritmeticos   0-3
                    // Comparaciones 4-9
                    // Logicos       10-12
                    // Asignacion    13-17
                    // Agrupaci??n    18-23

                    if (i >= 0 && i <= 3) {
                        tablaEstatica.setValueAt("Op. Aritmetica", row, col);
                    }
                    if (i >= 4 && i <= 9) {
                        tablaEstatica.setValueAt("Op. Comparativa", row, col);
                    }
                    if (i >= 10 && i <= 12) {
                        tablaEstatica.setValueAt("Op. Logica", row, col);
                    }
                    if (i >= 13 && i <= 17) {
                        tablaEstatica.setValueAt("Dec. Asignaci??n", row, col);
                    }
                    if (i >= 18 && i <= 23) {
                        tablaEstatica.setValueAt("Dec. Agrupaci??n", row, col);
                    }

                    row++;
                    col--;
                }
                break;
            case 2:
                limpiarTablaEstatica();
                for (int i = 0; i < signos.length; i++) {
                    modeloEstatico.addRow(new Object[]{"", ""});
                    tablaEstatica.setValueAt(signos[i], row, col);
                    col++;
                    tablaEstatica.setValueAt(funcionSigno[i], row, col);
                    row++;
                    col--;
                }
                break;
            default:
                System.out.println("hello");
        }

    }

    public void limpiarTablaEstatica() {
        modeloEstatico.getDataVector().removeAllElements();
        modeloEstatico.fireTableDataChanged();
        revalidate();
    }

    public void limpiarTablaDinamica() {
        modeloDinamico.getDataVector().removeAllElements();
        modeloDinamico.fireTableDataChanged();
        revalidate();
    }

    private void validarTablas() {
        int div = 0;
        div = splitPanelContenedor.getDividerLocation();

        pesta??asTablas.setVisible(ckbTablas.getState());
        splitPanelContenedor.setDividerLocation(600);
        revalidate();
    }

    public String[] ordenarLista(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) > 0) {
                    String temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }

    private static FileFilter textFileFilter = new FileFilter() {

        @Override
        public boolean accept(File f) {
            //acepta directorios y archivos de extensi??n .txt
            return f.isDirectory() || f.getName().toLowerCase().endsWith("sh");
        }

        @Override
        public String getDescription() {
            //la descripci??n del tipo de archivo aceptado
            return "Archivos SH";
        }
    };

    private static JFileChooser getJFileChooser() {
        JFileChooser fc = new JFileChooser();                     //construye un JFileChooser
        fc.setDialogTitle("SH - Elige un archivo:");    //se le establece un t??tulo
        fc.setMultiSelectionEnabled(false);                       //desactiva la multi-selecci??n
        fc.setFileFilter(textFileFilter);                         //aplica un filtro de extensiones
        return fc;    //retorna el JFileChooser
    }

    JFrame getJFrame() {
        return this;
    }

    // Codigo main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCorrer;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JComboBox<String> ckbTablaDinamica;
    private javax.swing.JComboBox<String> ckbTablaEstatica;
    private javax.swing.JCheckBoxMenuItem ckbTablas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblConsola;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuCerrar;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuGuardarC;
    private javax.swing.JMenuItem mnuNuevo;
    private javax.swing.JPanel pTablaDinamica;
    private javax.swing.JPanel pTablaEstatica;
    private javax.swing.JPanel pToken;
    private javax.swing.JPanel panelConsola;
    private javax.swing.JTabbedPane pesta??asTablas;
    private javax.swing.JScrollPane scrollConsola;
    private javax.swing.JScrollPane scrollEntrada;
    private javax.swing.JScrollPane scrollTablaDinamica;
    private javax.swing.JScrollPane scrollTablaEstatica;
    private javax.swing.JScrollPane scrollTxtToken;
    private javax.swing.JToolBar.Separator sep0;
    private javax.swing.JToolBar.Separator sep1;
    private javax.swing.JToolBar.Separator sep2;
    private javax.swing.JToolBar.Separator sep3;
    private javax.swing.JSplitPane splitPanelContenedor;
    private javax.swing.JTable tablaDinamica;
    private javax.swing.JTable tablaEstatica;
    private javax.swing.JTextArea txtEntrada;
    public static javax.swing.JTextArea txtError;
    private javax.swing.JTextArea txtTokens;
    // End of variables declaration//GEN-END:variables
}
