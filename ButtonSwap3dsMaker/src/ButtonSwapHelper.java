
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ButtonSwapHelper extends javax.swing.JFrame {

        static int I1, I2, O1, O2, slot, IsMode3;
        static String I4a, I4b,I4c, I4d, I4e, I4f, O4a, O4b, O4c, O4d, O4e, O4f;
        static int I3a, I3b, I3c, I3d, I3e, I3f, O3a, O3b, O3c, O3d, O3e, O3f = 0;
        static int SLOT;
        
        
    public ButtonSwapHelper() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        BannerButton = new javax.swing.JButton();
        BannerField = new javax.swing.JTextField();
        IconButton = new javax.swing.JButton();
        IconField = new javax.swing.JTextField();
        RsButton = new javax.swing.JButton();
        RsfField = new javax.swing.JTextField();
        AudioButton = new javax.swing.JButton();
        AudioField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CiaName = new javax.swing.JTextField();
        UID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RebindingOptionsPanel = new javax.swing.JPanel();
        OutputType = new javax.swing.JComboBox<>();
        InputType = new javax.swing.JComboBox<>();
        Input1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Input2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Output1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Output2 = new javax.swing.JComboBox<>();
        BuildPanel = new javax.swing.JPanel();
        BuildM3 = new javax.swing.JButton();
        BuildNM3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        WipeSlot = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SlotTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jFileChooser1.setControlButtonsAreShown(false);
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users"));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ButtonSwap3dsMaker");
        setResizable(false);

        BannerButton.setText("Choose Banner");
        BannerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BannerButtonActionPerformed(evt);
            }
        });

        IconButton.setText("Choose Icon");
        IconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconButtonActionPerformed(evt);
            }
        });

        RsButton.setText("Choose .rsf");
        RsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsButtonActionPerformed(evt);
            }
        });

        AudioButton.setText("Choose Audio");
        AudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudioButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("CIA name");

        UID.setText("0x96e90");

        jLabel5.setText("UniqueID");

        jLabel6.setText("First 2 must be 0x, Last 5 must be 0-9, a-f");

        OutputType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Button\t Input", "Double Button Input" }));
        OutputType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputTypeActionPerformed(evt);
            }
        });

        InputType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Button\t Input", "Double Button Input" }));
        InputType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTypeActionPerformed(evt);
            }
        });

        Input1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "X", "Y", "L", "R", "Up", "Down", "Left", "Right", "Start", "Select", "None" }));

        jLabel2.setText("and");

        Input2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "X", "Y", "L", "R", "Up", "Down", "Left", "Right", "Start", "Select", "None" }));
        Input2.setSelectedIndex(12);
        Input2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("=");

        Output1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "X", "Y", "L", "R", "Up", "Down", "Left", "Right", "Start", "Select", "None" }));

        jLabel4.setText("and");

        Output2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "X", "Y", "L", "R", "Up", "Down", "Left", "Right", "Start", "Select", "None" }));
        Output2.setSelectedIndex(12);
        Output2.setEnabled(false);

        javax.swing.GroupLayout RebindingOptionsPanelLayout = new javax.swing.GroupLayout(RebindingOptionsPanel);
        RebindingOptionsPanel.setLayout(RebindingOptionsPanelLayout);
        RebindingOptionsPanelLayout.setHorizontalGroup(
            RebindingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RebindingOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(Output1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Output2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OutputType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RebindingOptionsPanelLayout.setVerticalGroup(
            RebindingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RebindingOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RebindingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(RebindingOptionsPanelLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(RebindingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InputType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Output1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Output2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OutputType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        BuildM3.setText("Build Mode 3");
        BuildM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildM3ActionPerformed(evt);
            }
        });

        BuildNM3.setText("Build");
        BuildNM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildNM3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuildPanelLayout = new javax.swing.GroupLayout(BuildPanel);
        BuildPanel.setLayout(BuildPanelLayout);
        BuildPanelLayout.setHorizontalGroup(
            BuildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuildPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuildM3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuildNM3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        BuildPanelLayout.setVerticalGroup(
            BuildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuildNM3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuildM3)
                .addContainerGap())
        );

        WipeSlot.setText("Wipe current slot");
        WipeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WipeSlotActionPerformed(evt);
            }
        });

        jButton3.setText("Save Values to slot");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slot 1", "Slot 2", "Slot 3", "Slot 4", "Slot 5", "Slot 6" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WipeSlot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WipeSlot)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Donate");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        SlotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Slot 1", "None", "None"},
                {"Slot 2", "None", "None"},
                {"Slot 3", "None", "None"},
                {"Slot 4", "None", "None"},
                {"Slot 5", "None", "None"},
                {"Slot 6", "None", "None"}
            },
            new String [] {
                "Slot", "Input Buttons", "Output Buttons"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SlotTable);
        if (SlotTable.getColumnModel().getColumnCount() > 0) {
            SlotTable.getColumnModel().getColumn(0).setResizable(false);
            SlotTable.getColumnModel().getColumn(0).setPreferredWidth(75);
            SlotTable.getColumnModel().getColumn(1).setResizable(false);
            SlotTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Report A Bug");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AudioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AudioField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BannerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BannerField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IconField)
                            .addComponent(RsfField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CiaName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(BuildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RebindingOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AudioButton)
                            .addComponent(AudioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BannerButton)
                                .addComponent(BannerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IconButton)
                            .addComponent(IconField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RsButton)
                            .addComponent(RsfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CiaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(UID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addComponent(RebindingOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BuildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuildNM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildNM3ActionPerformed
        String BannerPic = BannerField.getText();
        String BannerAudio = AudioField.getText();
        String CIAName = CiaName.getText() + ".cia";
        String RSFName = RsfField.getText();
        String MakeNM3Path = Paths.get("MakeNM3.bat").toAbsolutePath().toString();
        System.out.println(MakeNM3Path);
        File MakeNM3File = new File(MakeNM3Path);    
        IsMode3 = 0;
        
        
            try {
                RebindWriter();
                RSFWriter();
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {}  
            
        try{
            PrintWriter writer = new PrintWriter(MakeNM3File, "UTF-8");
            writer.println("make clean");
            writer.println("make");
            writer.println("cd meta");
            writer.println("bannertool makesmdh -s \"3DS Rebind\" -l \"Rebinds some buttons\" -p \"Danger229's Rebind Maker Program\" -i icon.png -o App.smdh");
            writer.println("bannertool makebanner -i " + BannerPic + " -a " + BannerAudio + " -o  Banner.bin");
            writer.println("move Banner.bin ..\\");
            writer.println("move App.smdh ..\\");
            writer.println("copy " + RSFName + " ..\\");
            writer.println("cd ..\\");
            writer.println("makerom -f cia -o " + CIAName + " -rsf " + RSFName +" -target t -exefslogo -elf ButtonSwap3DS-master.elf -icon App.smdh -banner Banner.bin");
            writer.println("del banner.bin");
            writer.println("del App.smdh");
            writer.println("del " + RSFName);
            writer.println("exit");
            writer.close();
        } catch (IOException e) {}
        
    try {
            String[] command = {"cmd.exe", "/C", "Start", MakeNM3Path};
            Process p =  Runtime.getRuntime().exec(command);           
        } catch (IOException ex) {}        


    }//GEN-LAST:event_BuildNM3ActionPerformed

    private void BannerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BannerButtonActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(null);
        if(returnVal == jFileChooser1.APPROVE_OPTION) { BannerField.setText(jFileChooser1.getSelectedFile().getName()); }
    }//GEN-LAST:event_BannerButtonActionPerformed

    private void IconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconButtonActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(null);
        if(returnVal == jFileChooser1.APPROVE_OPTION) { IconField.setText(jFileChooser1.getSelectedFile().getName()); }
    }//GEN-LAST:event_IconButtonActionPerformed

    private void RsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsButtonActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(null);
        if(returnVal == jFileChooser1.APPROVE_OPTION) { RsfField.setText(jFileChooser1.getSelectedFile().getName()); }
    }//GEN-LAST:event_RsButtonActionPerformed

    private void AudioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudioButtonActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(null);
        if(returnVal == jFileChooser1.APPROVE_OPTION) { AudioField.setText(jFileChooser1.getSelectedFile().getName()); }
    }//GEN-LAST:event_AudioButtonActionPerformed

    private void InputTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTypeActionPerformed
        int IT = InputType.getSelectedIndex();
                
        if (IT == 0)
        { Input2.setSelectedIndex(12); 
        Input2.setEnabled(false); 
        }
        if (IT == 1)
        { Input2.setSelectedIndex(0); 
        Input2.setEnabled(true); 
        }
        
    }//GEN-LAST:event_InputTypeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MaskValue();
        
        SLOT = jComboBox1.getSelectedIndex();
        DefaultTableModel model = (DefaultTableModel)SlotTable.getModel();
        
        String icb1 = String.valueOf(Input1.getSelectedItem());
        String icb2 = String.valueOf(Input2.getSelectedItem());
        String icb3 = icb1 + " + " + icb2;
        String ocb1 = String.valueOf(Output1.getSelectedItem());
        String ocb2 = String.valueOf(Output2.getSelectedItem());
        String ocb3 = ocb1 + " + " + ocb2;
        
        model.setValueAt(icb3,SLOT,1);
        model.setValueAt(ocb3,SLOT,2);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OutputTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputTypeActionPerformed
        int OT = OutputType.getSelectedIndex();
                
        if (OT == 0)
        { Output2.setSelectedIndex(12); 
        Output2.setEnabled(false); 
        }
        if (OT == 1)
        { Output2.setSelectedIndex(0); 
        Output2.setEnabled(true); 
        }
    }//GEN-LAST:event_OutputTypeActionPerformed

    private void WipeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WipeSlotActionPerformed
        int SLOT = jComboBox1.getSelectedIndex();
                
        if (SLOT == 0)
        { 
            I3a = 0;
            O3a = 0;
            I4a = null;
            O4a = null;
        }
        if (SLOT == 1)
        { 
            I3b = 0;
            O3b = 0;
            I4b = null;
            O4b = null;
        }
        if (SLOT == 2)
        { 
            I3c = 0;
            O3c = 0;
            I4c = null;
            O4c = null;
        }
        if (SLOT == 3)
        { 
            I3d = 0;
            O3d = 0;
            I4d = null;
            O4d = null;
        }
        if (SLOT == 4)
        { 
            I3e = 0;
            O3e = 0;
            I4e = null;
            O4e = null;
        }
        if (SLOT == 5)
        { 
            I3f = 0;
            O3f = 0;
            I4f = null;
            O4f = null;
        }
        
        DefaultTableModel model = (DefaultTableModel)SlotTable.getModel();
        model.setValueAt("None", SLOT, 1);
        model.setValueAt("None", SLOT, 2);
    }//GEN-LAST:event_WipeSlotActionPerformed

    private void BuildM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildM3ActionPerformed
        String BannerPic = BannerField.getText();
        String BannerAudio = AudioField.getText();
        String CIAName = CiaName.getText() + ".cia";
        String RSFName = RsfField.getText();
        String MakeM3Path = Paths.get("MakeM3.bat").toAbsolutePath().toString();
        System.out.println(MakeM3Path);
        File MakeM3File = new File(MakeM3Path);    
        IsMode3 = 1;
        
            try {
                RebindWriter();
                RSFWriter();
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {}
            
            
        try{
            PrintWriter writer = new PrintWriter(MakeM3File, "UTF-8");
            writer.println("make clean");
            writer.println("make");
            writer.println("cd meta");
            writer.println("bannertool makesmdh -s \"3DS Rebind\" -l \"Rebinds some buttons\" -p \"Danger229's Rebind Maker Program\" -i icon.png -o App.smdh");
            writer.println("bannertool makebanner -i " + BannerPic + " -a " + BannerAudio + " -o  Banner.bin");
            writer.println("move Banner.bin ..\\");
            writer.println("move App.smdh ..\\");
            writer.println("copy " + RSFName + " ..\\");
            writer.println("cd ..\\");
            writer.println("makerom -f cia -o " + CIAName + " -rsf " + RSFName +" -target t -exefslogo -elf ButtonSwap3DS-master_stripped.elf -icon App.smdh -banner Banner.bin");
            writer.println("del banner.bin");
            writer.println("del App.smdh");
            writer.println("del " + RSFName);
            writer.println("exit");
            writer.close();
        } catch (IOException e) {}
        
    try {
            String[] command = {"cmd.exe", "/C", "Start", MakeM3Path};
            Process p =  Runtime.getRuntime().exec(command);           
        } catch (IOException ex) {}        

    }//GEN-LAST:event_BuildM3ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {                                     
            String s = "cmd.exe /c start chrome paypal.me/dangerjack22";
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(URI.create(s));
        } catch (IOException ex) {}
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {                                     
            String s = "https://github.com/danger229/ButtonSwap3dsMaker/issues";
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(URI.create(s));
        } catch (IOException ex) {}
    }//GEN-LAST:event_jLabel8MouseClicked

    public static void MaskValue()
    {     
        int i1 = Input1.getSelectedIndex();
        int i2 = Input2.getSelectedIndex();
        
        int o1 = Output1.getSelectedIndex();
        int o2 = Output2.getSelectedIndex();
        SLOT = jComboBox1.getSelectedIndex();
                
        if (SLOT == 0)
        { slot = 1; }
        if (SLOT == 1)
        { slot = 2; }
        if (SLOT == 2)
        { slot = 3; }
        if (SLOT == 3)
        { slot = 4; }
        if (SLOT == 4)
        { slot = 5; }
        if (SLOT == 5)
        { slot = 6; }

        // <editor-fold defaultstate="collapsed" desc="Input 1">
        if (i1 == 0) // A
        { I1 = 1; }
        if (i1 == 1) // B
        { I1 = 2; }
        if (i1 == 2) // X
        { I1 = 1024; }
        if (i1 == 3) // Y
        { I1 = 2048; }
        if (i1 == 4) // L
        { I1 = 512; }
        if (i1 == 5) // R
        { I1 = 256; }
        if (i1 == 6)// Up
        { I1 = 64; }
        if (i1 == 7) // Down
        { I1 = 128; }
        if (i1 == 8) // Left
        { I1 = 32; }
        if (i1 == 9) // Right
        { I1 = 16; }
        if (i1 == 10) // Start
        { I1 = 8; }
        if (i1 == 11) // Select
        { I1 = 4; }
        if (i1 == 12) // None
        { I1 = 0; }
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Input 2">
        if (i2 == 0) // A
        { I2 = 1; }
        if (i2 == 1) // B
        { I2 = 2; }
        if (i2 == 2) // X
        { I2 = 1024; }
        if (i2 == 3) // Y
        { I2 = 2048; }
        if (i2 == 4) // L
        { I2 = 512; }
        if (i2 == 5) // R
        { I2 = 256; }
        if (i2 == 6)// Up
        { I2 = 64; }
        if (i2 == 7) // Down
        { I2 = 128; }
        if (i2 == 8) // Left
        { I2 = 32; }
        if (i2 == 9) // Right
        { I2 = 16; }
        if (i2 == 10) // Start
        { I2 = 8; }
        if (i2 == 11) // Select
        { I2 = 4; }
        if (i2 == 12) // None
        { I2 = 0; }
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Output 1">
        if (o1 == 0) // A
        { O1 = 1; }
        if (o1 == 1) // B
        { O1 = 2; }
        if (o1 == 2) // X
        { O1 = 1024; }
        if (o1 == 3) // Y
        { O1 = 2048; }
        if (o1 == 4) // L
        { O1 = 512; }
        if (o1 == 5) // R
        { O1 = 256; }
        if (o1 == 6)// Up
        { O1 = 64; }
        if (o1 == 7) // Down
        { O1 = 128; }
        if (o1 == 8) // Left
        { O1 = 32; }
        if (o1 == 9) // Right
        { O1 = 16; }
        if (o1 == 10) // Start
        { O1 = 8; }
        if (o1 == 11) // Select
        { O1 = 4; }
        if (o1 == 12) // None
        { O1 = 0; }
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Output 2">
        if (o2 == 0) // A
        { O2 = 1; }
        if (o2 == 1) // B
        { O2 = 2; }
        if (o2 == 2) // X
        { O2 = 1024; }
        if (o2 == 3) // Y
        { O2 = 2048; }
        if (o2 == 4) // L
        { O2 = 512; }
        if (o2 == 5) // R
        { O2 = 256; }
        if (o2 == 6)// Up
        { O2 = 64; }
        if (o2 == 7) // Down
        { O2 = 128; }
        if (o2 == 8) // Left
        { O2 = 32; }
        if (o2 == 9) // Right
        { O2 = 16; }
        if (o2 == 10) // Start
        { O2 = 8; }
        if (o2 == 11) // Select
        { O2 = 4; }
        if (o2 == 12) // None
        { O2 = 0; }
        //</editor-fold>
    
        if (slot == 1)
        {
        I3a = I1 + I2;
        O3a = O1 + O2;
        I4a = "0x" + Integer.toHexString(I3a);
        O4a = "0x" + Integer.toHexString(O3a);
        }
        if (slot == 2)
        {
        I3b = I1 + I2;
        O3b = O1 + O2;
        I4b = "0x" + Integer.toHexString(I3b);
        O4b = "0x" + Integer.toHexString(O3b);
        }    
        if (slot == 3)
        {
        I3c = I1 + I2;
        O3c = O1 + O2;
        I4c = "0x" + Integer.toHexString(I3c);
        O4c = "0x" + Integer.toHexString(O3c);
        }
        if (slot == 4)
        {
        I3d = I1 + I2;
        O3d = O1 + O2;
        I4d = "0x" + Integer.toHexString(I3d);
        O4d = "0x" + Integer.toHexString(O3d);
        }
        if (slot == 5)
        {
        I3e = I1 + I2;
        O3e = O1 + O2;
        I4e = "0x" + Integer.toHexString(I3e);
        O4e = "0x" + Integer.toHexString(O3e);
        }
        if (slot == 6)
        {
        I3f = I1 + I2;
        O3f = O1 + O2;
        I4f = "0x" + Integer.toHexString(I3f);
        O4f = "0x" + Integer.toHexString(O3f);
        }
    }

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ButtonSwapHelper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonSwapHelper().setVisible(true);
                
            }});
    }

    
    public static void RebindWriter() throws FileNotFoundException, UnsupportedEncodingException
    {
         String EditRebindsPath = Paths.get("source/injected.s").toAbsolutePath().toString();
         System.out.println(EditRebindsPath);
         
        PrintWriter writer = new PrintWriter(EditRebindsPath, "UTF-8");
writer.println(".global read_input");
writer.println(".global read_input_sz");
writer.println(".set lr, r14");
writer.println("");
writer.println("read_input:");
writer.println("stmfd   SP!, {R4-R8,LR}");
writer.println("mov     R5, R1");
writer.println("mrc     p15, 0, R4,c13,c0, 3");
writer.println("mov     R1, #0x10000");
writer.println("str     R1, [R4,#0x80]!");
writer.println("ldr     R0, [R0]");
writer.println("svc     0x32");
writer.println("ands    R1, R0, #0x80000000");
writer.println("bmi     .ret");
writer.println("push    {r3}");
writer.println("ldr     r3, =0x10df08");
writer.println("ldrd    R0, [R4,#8]");
writer.println("strd    R0, [R3, #8]");
writer.println("ldrd	  r0, [R3]");
writer.println("strd	  r0,	[R5]");
writer.println("ldr     R0, [R4,#4]");
writer.println("pop     {r3}");
writer.println("");
writer.println("@buttons init");
writer.println("ldr     r0, =0x10df20");
writer.println("ldr     r1, =0xFFF");
writer.println("str     r1, [r0]");
writer.println("");
writer.println("@touch init");
writer.println("ldr     r0, =0x10df24");
writer.println("ldr     r1, =0x2000000");
writer.println("str     r1, [r0]");
writer.println("");
writer.println("@cpad init");
writer.println("ldr     r0, =0x10df28");
writer.println("ldr     r1, =0x800800");
writer.println("str     r1, [r0]");
writer.println("");
writer.println("@perform mappings, skip if no buttons pressed (it can be a lot of code)");
writer.println("ldr     r0, =0x1ec46000");
writer.println("ldr     r1, =0xFFF");
writer.println("ldr     r0, [r0]");
writer.println("cmp     r0, r1");
writer.println("blne    .swap");
writer.println("");
writer.println("@buttons copy");
writer.println("ldr     r0, =0x10df20");
writer.println("ldr     r1, =0xFFFF");
writer.println("ldr     r2, =0x1ec46000");
writer.println("ldr     r3, =0x10df00");
writer.println("bl      .copy");
writer.println("");
writer.println("@touch copy");
writer.println("ldr     r0, =0x10df24");
writer.println("ldr     r1, =0x2000000");
writer.println("ldr     r2, =0x10df10");
writer.println("ldr     r3, =0x10df08");
writer.println("bl      .copy");
writer.println("");
writer.println("@cpad copy");
writer.println("ldr     r0, =0x10df28");
writer.println("ldr     r1, =0x800800");
writer.println("ldr     r2, =0x10df14");
writer.println("ldr     r3, =0x10df0c");
writer.println("bl      .copy");
writer.println("");
writer.println(".ret:");
writer.println("ldmfd   SP!, {R4-R8,PC}");
writer.println("");
writer.println(".copy:");
writer.println("ldr     r4, [r0]");
writer.println("cmp     r4, r1");
writer.println("ldreq   r4, [r2]");
writer.println("str     r4, [r3]");
writer.println("mov     pc, r14");
writer.println("");
writer.println("@=======================================@");
writer.println(".swap:                                  @");
writer.println("@ DO NOT MODIFY R0                      @");
writer.println("@ R0 = Actual HID value                 @");
writer.println("@ R1 = Button check register            @");
writer.println("@ R2 = Press HID Register               @");
writer.println("@ R3 = Unpress HID Register             @");
writer.println("@ R4 = Button mask                      @");
writer.println("@ R5 = Press mask                       @");
writer.println("@ R6 = Arguments for functions          @");
writer.println("@=======================================@");
writer.println("@ Initialization                        @");
writer.println("push    {r14}                           @");
writer.println("ldr     r0, =0x1ec46000                 @");
writer.println("ldr     r0, [r0]                        @");
writer.println("mov     r2, #0                          @");
writer.println("mov     r3, #0                          @");
writer.println("@=======================================@");
writer.println("");
writer.println("@====================================@");
writer.println("@              BUTTONS               @");
writer.println("@====================================@");
writer.println("@          Mapping syntax            @");
writer.println("@ ldr r4, =[button mask]             @");
writer.println("@ ldr r5, =[press mask]              @");
writer.println("@ bl .button                         @");
writer.println("@====================================@");
writer.println("");
writer.println("@ Add mappings here");
if (I4a != null && O4a != null)
{
writer.println("ldr r4, =[" + I4a + "]");
writer.println("ldr r5, =[" + O4a + "]");
writer.println("bl .button");
}
if (I4b != null && O4b != null)
{
writer.println("ldr r4, =[" + I4b + "]");
writer.println("ldr r5, =[" + O4b + "]");
writer.println("bl .button");
}
if (I4c != null && O4c != null)
{
writer.println("ldr r4, =[" + I4c + "]");
writer.println("ldr r5, =[" + O4c + "]");
writer.println("bl .button");
}
if (I4d != null && O4d != null)
{
writer.println("ldr r4, =[" + I4d + "]");
writer.println("ldr r5, =[" + O4d + "]");
writer.println("bl .button");
}
if (I4e != null && O4e != null)
{
writer.println("ldr r4, =[" + I4e + "]");
writer.println("ldr r5, =[" + O4e + "]");
writer.println("bl .button");
}
if (I4f != null && O4f != null)
{
writer.println("ldr r4, =[" + I4f + "]");
writer.println("ldr r5, =[" + O4f + "]");
writer.println("bl .button");
}



writer.println("");
writer.println("@=============================@");
writer.println("@         TOUCHSCREEN         @");
writer.println("@=============================@");
writer.println("@ Mapping syntax              @");
writer.println("@ ldr r4, =[button mask]      @");
writer.println("@ ldr r6, =[touchscreen data] @");
writer.println("@ bl .touch                   @");
writer.println("@=============================@");
writer.println("ldr     r5, =0x2000000        @");
writer.println("@=============================@");
writer.println("");
writer.println("@ Add mappings here");
writer.println("");
writer.println("@=================@");
writer.println(".tp_end:          @");
writer.println("ldr r1, =0x10df24 @");
writer.println("str r5, [r1]      @");
writer.println("@=================@");
writer.println("");
writer.println("@========================@");
writer.println("@          CPAD          @");
writer.println("@========================@");
writer.println("@     Mapping syntax     @");
writer.println("@ ldr r4, =[button mask] @");
writer.println("@ ldr r6, =[cpad value]  @");
writer.println("@ bl .cpad               @");
writer.println("@========================@");
writer.println("@    Some C-pad values   @");
writer.println("@ Left  = 0x000800       @");
writer.println("@ Right = 0x0007FF       @");
writer.println("@ Up    = 0x7FF000       @");
writer.println("@ Down  = 0x800000       @");
writer.println("@========================@");
writer.println("ldr     r5, =0x800800    @");
writer.println("@========================@");
writer.println("");
writer.println("@ Add mappings here");
writer.println("");
writer.println("@=====================@");
writer.println("ldr     r1, =0x10df28 @");
writer.println("str     r5, [r1]      @");
writer.println("@=====================@");
writer.println("");
writer.println("@============================================@");
writer.println("@ load our HID memory with final button data @");
writer.println("ldr     r1, =0x10df20                        @");
writer.println("orr     r0, r0, r3                           @");
writer.println("orr     r0, r0, r2                           @");
writer.println("sub     r0, r0, r2                           @");
writer.println("str     r0, [r1]                             @");
writer.println("@============================================@");
writer.println("");
writer.println("@============@");
writer.println("@ return     @");
writer.println("pop     {pc} @");
writer.println("@============@");
writer.println("");
writer.println("@====================@");
writer.println("@ Swapping functions @");
writer.println("@====================@");
writer.println(".button:             @");
writer.println("and     r1, r0, r4   @ Extract button values");
writer.println("cmp     r1, #0       @ Check if all buttons are pressed");
writer.println("orreq   r2, r2, r5   @ If so, add press register to); HID");
writer.println("orreq   r3, r3, r4   @ And add button mask to - HID to unpress trigger buttons");
writer.println("bx      r14          @");
writer.println("                     @");
writer.println(".touch:              @");
writer.println("and     r1, r4, r0   @ Extract buttons");
writer.println("cmp     r1, #0       @ Check if all buttons are pressed");
writer.println("moveq   r5, r6       @ Move touchscreen data to register");
writer.println("orreq   r3, r3, r4   @ Un-press buttons");
writer.println("beq     .tp_end      @");
writer.println("bxne    r14          @");
writer.println("                     @");
writer.println(".cpad:               @");
writer.println("and     r1, r4, r0   @ Extract buttons");
writer.println("cmp     r1, #0       @ Check if all buttons are pressed");
writer.println("eoreq   r5, r6       @ Move c-pad data to register");
writer.println("orreq   r3, r3, r4   @ Un-press buttons");
writer.println("bx      r14          @");
writer.println("@====================@");
writer.println("");
writer.println(".LTORG # assembles literal pool");
writer.println("");
writer.println("read_input_sz:");
writer.println(".4byte .-read_input");
writer.println("");
writer.println("@====================@");
writer.println("@ DEVELOPER USE ONLY @");
writer.println("@====================@");
writer.println(".crash:");
writer.println("@ Use for viewing HID states via Luma3DS");
writer.println("ldr     r6, =0x10df20");
writer.println("ldr     r6, [r6]");
writer.println("ldr     r7, =0x10df24");
writer.println("ldr     r7, [r7]");
writer.println("ldr     r8, =0x10df28");
writer.println("ldr     r8, [r8]");
writer.println("bkpt    #0");
        writer.close();
    
}
    
    public static void RSFWriter() throws FileNotFoundException, UnsupportedEncodingException{
    String uid = UID.getText(); 
    int mem = 0;
    
    if (IsMode3 == 1)
    { mem = 80; }
    if (IsMode3 == 0)
    { mem = 64; }
    
    String EditRSFNM3 = Paths.get("meta/" + RsfField.getText()).toAbsolutePath().toString();
    System.out.println(EditRSFNM3);
        
    PrintWriter writer = new PrintWriter(EditRSFNM3, "UTF-8");
    writer.println("BasicInfo:");
writer.println("  Title                   : BtnSwp");
writer.println("  ProductCode             : CTR-A-BTS3");
writer.println("  Logo                    : Homebrew # Nintendo / Licensed / Distributed / iQue / iQueForSystem");
writer.println("");
writer.println("TitleInfo:");
writer.println("  Category                : Application");
writer.println("  UniqueId                : "+uid);
writer.println("");
writer.println("Option:");
writer.println("  UseOnSD                 : true # true if App is to be installed to SD");
writer.println("  FreeProductCode         : true # Removes limitations on ProductCode");
writer.println("  MediaFootPadding        : false # If true CCI files are created with padding");
writer.println("  EnableCrypt             : false # Enables encryption for NCCH and CIA");
writer.println("  EnableCompress          : true # Compresses where applicable (currently only exefs:/.code)");
writer.println("  ");
writer.println("AccessControlInfo:");
writer.println("  CoreVersion                   : 2");
writer.println("");
writer.println("  # Exheader Format Version");
writer.println("  DescVersion                   : 2");
writer.println("  ");
writer.println("  # Minimum Required Kernel Version (below is for 4.5.0)");
writer.println("  ReleaseKernelMajor            : \"02\"");
writer.println("  ReleaseKernelMinor            : \"33\" ");
writer.println("");
writer.println("  # ExtData");
writer.println("  UseExtSaveData                : false # enables ExtData       ");
writer.println("  #ExtSaveDataId                : 0x300 # only set this when the ID is different to the UniqueId");
writer.println("");
writer.println("  # FS:USER Archive Access Permissions");
writer.println("  # Uncomment as required");
writer.println("  FileSystemAccess:");
writer.println("   - CategorySystemApplication");
writer.println("   - CategoryHardwareCheck");
writer.println("   - CategoryFileSystemTool");
writer.println("   - Debug");
writer.println("   - TwlCardBackup");
writer.println("   - TwlNandData");
writer.println("   - Boss");
writer.println("   - DirectSdmc");
writer.println("   - Core");
writer.println("   - CtrNandRo");
writer.println("   - CtrNandRw");
writer.println("   - CtrNandRoWrite");
writer.println("   - CategorySystemSettings");
writer.println("   - CardBoard");
writer.println("   - ExportImportIvs");
writer.println("   - DirectSdmcWrite");
writer.println("   - SwitchCleanup");
writer.println("   - SaveDataMove");
writer.println("   - Shop");
writer.println("   - Shell");
writer.println("   - CategoryHomeMenu");
writer.println("  IoAccessControl:");
writer.println("   - FsMountNand");
writer.println("   - FsMountNandRoWrite");
writer.println("   - FsMountTwln");
writer.println("   - FsMountWnand");
writer.println("   - FsMountCardSpi");
writer.println("   - UseSdif3");
writer.println("   - CreateSeed");
writer.println("   - UseCardSpi");
writer.println("");
writer.println("  # Process Settings");
writer.println("  MemoryType                    : Application # Application/System/Base");
writer.println("  SystemMode                    : " + mem + "MB # 64MB(Default)/96MB/80MB/72MB/32MB");
writer.println("  IdealProcessor                : 0");
writer.println("  AffinityMask                  : 1");
writer.println("  Priority                      : 16");
writer.println("  MaxCpu                        : 0x9E # Default");
writer.println("  HandleTableSize               : 0x200");
writer.println("  DisableDebug                  : false");
writer.println("  EnableForceDebug              : false");
writer.println("  CanWriteSharedPage            : true");
writer.println("  CanUsePrivilegedPriority      : false");
writer.println("  CanUseNonAlphabetAndNumber    : true");
writer.println("  PermitMainFunctionArgument    : true");
writer.println("  CanShareDeviceMemory          : true");
writer.println("  RunnableOnSleep               : false");
writer.println("  SpecialMemoryArrange          : true");
writer.println("");
writer.println("  # New3DS Exclusive Process Settings");
writer.println("  SystemModeExt                 : Legacy # Legacy(Default)/124MB/178MB  Legacy:Use Old3DS SystemMode");
writer.println("  CpuSpeed                      : 804Mhz # 268MHz(Default)/804MHz");
writer.println("  EnableL2Cache                 : true # false(default)/true");
writer.println("  CanAccessCore2                : true ");
writer.println("");
writer.println("  # Virtual Address Mappings");
writer.println("  IORegisterMapping:");
writer.println("   - 1ff00000-1ff7ffff   # DSP memory");
writer.println("  MemoryMapping: ");
writer.println("   - 1f000000-1f5fffff:r # VRAM");
writer.println("");
writer.println("  # Accessible SVCs, <Name>:<ID>");
writer.println("  SystemCallAccess: ");
writer.println("    ControlMemory: 1");
writer.println("    QueryMemory: 2");
writer.println("    ExitProcess: 3");
writer.println("    GetProcessAffinityMask: 4");
writer.println("    SetProcessAffinityMask: 5");
writer.println("    GetProcessIdealProcessor: 6");
writer.println("    SetProcessIdealProcessor: 7");
writer.println("    CreateThread: 8");
writer.println("    ExitThread: 9");
writer.println("    SleepThread: 10");
writer.println("    GetThreadPriority: 11");
writer.println("    SetThreadPriority: 12");
writer.println("    GetThreadAffinityMask: 13");
writer.println("    SetThreadAffinityMask: 14");
writer.println("    GetThreadIdealProcessor: 15");
writer.println("    SetThreadIdealProcessor: 16");
writer.println("    GetCurrentProcessorNumber: 17");
writer.println("    Run: 18");
writer.println("    CreateMutex: 19");
writer.println("    ReleaseMutex: 20");
writer.println("    CreateSemaphore: 21");
writer.println("    ReleaseSemaphore: 22");
writer.println("    CreateEvent: 23");
writer.println("    SignalEvent: 24");
writer.println("    ClearEvent: 25");
writer.println("    CreateTimer: 26");
writer.println("    SetTimer: 27");
writer.println("    CancelTimer: 28");
writer.println("    ClearTimer: 29");
writer.println("    CreateMemoryBlock: 30");
writer.println("    MapMemoryBlock: 31");
writer.println("    UnmapMemoryBlock: 32");
writer.println("    CreateAddressArbiter: 33");
writer.println("    ArbitrateAddress: 34");
writer.println("    CloseHandle: 35");
writer.println("    WaitSynchronization1: 36");
writer.println("    WaitSynchronizationN: 37");
writer.println("    SignalAndWait: 38");
writer.println("    DuplicateHandle: 39");
writer.println("    GetSystemTick: 40");
writer.println("    GetHandleInfo: 41");
writer.println("    GetSystemInfo: 42");
writer.println("    GetProcessInfo: 43");
writer.println("    GetThreadInfo: 44");
writer.println("    ConnectToPort: 45");
writer.println("    SendSyncRequest1: 46");
writer.println("    SendSyncRequest2: 47");
writer.println("    SendSyncRequest3: 48");
writer.println("    SendSyncRequest4: 49");
writer.println("    SendSyncRequest: 50");
writer.println("    OpenProcess: 51");
writer.println("    OpenThread: 52");
writer.println("    GetProcessId: 53");
writer.println("    GetProcessIdOfThread: 54");
writer.println("    GetThreadId: 55");
writer.println("    GetResourceLimit: 56");
writer.println("    GetResourceLimitLimitValues: 57");
writer.println("    GetResourceLimitCurrentValues: 58");
writer.println("    GetThreadContext: 59");
writer.println("    Break: 60");
writer.println("    OutputDebugString: 61");
writer.println("    ControlPerformanceCounter: 62");
writer.println("    CreatePort: 71");
writer.println("    CreateSessionToPort: 72");
writer.println("    CreateSession: 73");
writer.println("    AcceptSession: 74");
writer.println("    ReplyAndReceive1: 75");
writer.println("    ReplyAndReceive2: 76");
writer.println("    ReplyAndReceive3: 77");
writer.println("    ReplyAndReceive4: 78");
writer.println("    ReplyAndReceive: 79");
writer.println("    BindInterrupt: 80");
writer.println("    UnbindInterrupt: 81");
writer.println("    InvalidateProcessDataCache: 82");
writer.println("    StoreProcessDataCache: 83");
writer.println("    FlushProcessDataCache: 84");
writer.println("    StartInterProcessDma: 85");
writer.println("    StopDma: 86");
writer.println("    GetDmaState: 87");
writer.println("    RestartDma: 88");
writer.println("    DebugActiveProcess: 96");
writer.println("    BreakDebugProcess: 97");
writer.println("    TerminateDebugProcess: 98");
writer.println("    GetProcessDebugEvent: 99");
writer.println("    ContinueDebugEvent: 100");
writer.println("    GetProcessList: 101");
writer.println("    GetThreadList: 102");
writer.println("    GetDebugThreadContext: 103");
writer.println("    SetDebugThreadContext: 104");
writer.println("    QueryDebugProcessMemory: 105");
writer.println("    ReadProcessMemory: 106");
writer.println("    WriteProcessMemory: 107");
writer.println("    SetHardwareBreakPoint: 108");
writer.println("    GetDebugThreadParam: 109");
writer.println("    ControlProcessMemory: 112");
writer.println("    MapProcessMemory: 113");
writer.println("    UnmapProcessMemory: 114");
writer.println("    CreateCodeSet: 115");
writer.println("    CreateProcess: 117");
writer.println("    TerminateProcess: 118");
writer.println("    SetProcessResourceLimits: 119");
writer.println("    CreateResourceLimit: 120");
writer.println("    SetResourceLimitValues: 121");
writer.println("    AddCodeSegment: 122");
writer.println("    Backdoor: 123");
writer.println("    KernelSetState: 124");
writer.println("    QueryProcessMemory: 125");
writer.println("");
writer.println("  # Service List");
writer.println("  # Maximum 34 services (32 if firmware is prior to 9.6.0)");
writer.println("  ServiceAccessControl:");
writer.println("   - APT:U");
writer.println("   - ac:u");
writer.println("   - am:net");
writer.println("   - boss:U");
writer.println("   - cam:u");
writer.println("   - cecd:u");
writer.println("   - cfg:nor");
writer.println("   - cfg:u");
writer.println("   - csnd:SND");
writer.println("   - dsp::DSP");
writer.println("   - frd:u");
writer.println("   - fs:USER");
writer.println("   - gsp::Gpu");
writer.println("   - gsp::Lcd");
writer.println("   - hid:USER");
writer.println("   - http:C");
writer.println("   - ir:rst");
writer.println("   - ir:u");
writer.println("   - ir:USER");
writer.println("   - mic:u");
writer.println("   - ndm:u");
writer.println("   - news:s");
writer.println("   - nwm::EXT");
writer.println("   - nwm::UDS");
writer.println("   - ptm:sysm");
writer.println("   - ptm:u");
writer.println("   - pxi:dev");
writer.println("   - soc:U");
writer.println("   - ssl:C");
writer.println("   - y2r:u");
writer.println("");
writer.println("");
writer.println("SystemControlInfo:");
writer.println("  SaveDataSize: 0KB # Change if the app uses savedata");
writer.println("  RemasterVersion: 0");
writer.println("  StackSize: 0x40000");
writer.println("");
writer.println("  # Modules that run services listed above should be included below");
writer.println("  # Maximum 48 dependencies");
writer.println("  # <module name>:<module titleid>");
writer.println("  Dependency: ");
writer.println("    ac: 0x0004013000002402");
writer.println("    #act: 0x0004013000003802");
writer.println("    am: 0x0004013000001502");
writer.println("    boss: 0x0004013000003402");
writer.println("    camera: 0x0004013000001602");
writer.println("    cecd: 0x0004013000002602");
writer.println("    cfg: 0x0004013000001702");
writer.println("    codec: 0x0004013000001802");
writer.println("    csnd: 0x0004013000002702");
writer.println("    dlp: 0x0004013000002802");
writer.println("    dsp: 0x0004013000001a02");
writer.println("    friends: 0x0004013000003202");
writer.println("    gpio: 0x0004013000001b02");
writer.println("    gsp: 0x0004013000001c02");
writer.println("    hid: 0x0004013000001d02");
writer.println("    http: 0x0004013000002902");
writer.println("    i2c: 0x0004013000001e02");
writer.println("    ir: 0x0004013000003302");
writer.println("    mcu: 0x0004013000001f02");
writer.println("    mic: 0x0004013000002002");
writer.println("    ndm: 0x0004013000002b02");
writer.println("    news: 0x0004013000003502");
writer.println("    #nfc: 0x0004013000004002");
writer.println("    nim: 0x0004013000002c02");
writer.println("    nwm: 0x0004013000002d02");
writer.println("    pdn: 0x0004013000002102");
writer.println("    ps: 0x0004013000003102");
writer.println("    ptm: 0x0004013000002202");
writer.println("    #qtm: 0x0004013020004202");
writer.println("    ro: 0x0004013000003702");
writer.println("    socket: 0x0004013000002e02");
writer.println("    spi: 0x0004013000002302");
writer.println("    ssl: 0x0004013000002f02");
    writer.close();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AudioButton;
    private javax.swing.JTextField AudioField;
    private javax.swing.JButton BannerButton;
    private javax.swing.JTextField BannerField;
    private javax.swing.JButton BuildM3;
    private javax.swing.JButton BuildNM3;
    private javax.swing.JPanel BuildPanel;
    private javax.swing.JTextField CiaName;
    private javax.swing.JButton IconButton;
    private javax.swing.JTextField IconField;
    private static javax.swing.JComboBox<String> Input1;
    private static javax.swing.JComboBox<String> Input2;
    private javax.swing.JComboBox<String> InputType;
    private static javax.swing.JComboBox<String> Output1;
    private static javax.swing.JComboBox<String> Output2;
    private javax.swing.JComboBox<String> OutputType;
    private javax.swing.JPanel RebindingOptionsPanel;
    private javax.swing.JButton RsButton;
    private static javax.swing.JTextField RsfField;
    private javax.swing.JTable SlotTable;
    private static javax.swing.JTextField UID;
    private javax.swing.JButton WipeSlot;
    private javax.swing.JButton jButton3;
    private static javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
