import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class IguGYM_Ant extends javax.swing.JFrame {
    
    
 DefaultTableModel dtm=new DefaultTableModel();
    public IguGYM_Ant() {
        initComponents();
        table_uyeler.setModel(dtm);
        dtm.setColumnIdentifiers(new String [] {"ad","soyad","dogum tarihi","cinsiyet","e-posta","telefon"});
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uyeForm = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        jScrollPane20 = new javax.swing.JScrollPane();
        posta = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        tel = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        soyad = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextPane();
        cinsiyet = new javax.swing.JComboBox<>();
        antsecim = new javax.swing.JComboBox<>();
        temizlebtn = new javax.swing.JButton();
        ay = new javax.swing.JComboBox<>();
        yil = new javax.swing.JComboBox<>();
        gun = new javax.swing.JComboBox<>();
        ekle = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_uyeler = new javax.swing.JTable();
        ara_uye = new javax.swing.JButton();
        uyesilbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ara_eposta = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ara_soyad = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ara_ad = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IguGYM-Antrenör Anasayfa");
        setResizable(false);

        jPanel4.setPreferredSize(new java.awt.Dimension(1350, 900));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ÜYE BİLGİLERİ");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("IguGYM ");

        uyeForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Üye Kayıt Formu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N
        uyeForm.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel54.setText("Üye Adı");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel55.setText("Üye Soyadı");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel56.setText("Doğum Tarihi");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel57.setText("Cinsiyet");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel58.setText("Üye Telefon");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel59.setText("Üye E-posta");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel60.setText("Üye Parola");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel61.setText("Antrenör Seçimi");

        jScrollPane20.setViewportView(posta);

        jScrollPane21.setViewportView(tel);

        jScrollPane22.setViewportView(soyad);

        jScrollPane23.setViewportView(ad);

        cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinsiyet Seç", "Kadın", "Erkek" }));

        antsecim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinsiyet Seç", "Kadın", "Erkek" }));

        temizlebtn.setText("Temizle");
        temizlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizlebtnActionPerformed(evt);
            }
        });

        ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ay", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıl", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));

        gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gün", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ekle.setText("Üye Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uyeFormLayout = new javax.swing.GroupLayout(uyeForm);
        uyeForm.setLayout(uyeFormLayout);
        uyeFormLayout.setHorizontalGroup(
            uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uyeFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uyeFormLayout.createSequentialGroup()
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addGap(8, 8, 8)
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sifre))
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addComponent(antsecim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 592, Short.MAX_VALUE)
                                .addComponent(temizlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uyeFormLayout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane20))
                    .addGroup(uyeFormLayout.createSequentialGroup()
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane21))
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane22)
                                    .addComponent(jScrollPane23)
                                    .addGroup(uyeFormLayout.createSequentialGroup()
                                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(uyeFormLayout.createSequentialGroup()
                                                .addComponent(gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(49, 49, 49))
        );
        uyeFormLayout.setVerticalGroup(
            uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uyeFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uyeFormLayout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(antsecim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(uyeFormLayout.createSequentialGroup()
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(uyeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temizlebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        table_uyeler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad ", "Soyad", "Doğum Tarihi", "Cinsiyet", "E-posta", "Telefon"
            }
        ));
        table_uyeler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_uyelerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_uyeler);

        ara_uye.setText("Üye Ara");
        ara_uye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_uyeActionPerformed(evt);
            }
        });

        uyesilbtn.setText("Üye Sil");
        uyesilbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyesilbtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ara_eposta);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Üye e-posta :");

        jScrollPane3.setViewportView(ara_soyad);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Üye Soyadı :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Üye Adı :");

        jScrollPane6.setViewportView(ara_ad);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ara_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(uyesilbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uyeForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(uyeForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uyesilbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ara_uye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uyesilbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyesilbtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {}
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igugym?zeroDateTimeBehavior=convertToNull", "root", "");
            st = con.createStatement();
        } catch (SQLException ex) {}

        String sql = "DELETE FROM uyeler where uye_eposta='"+ara_eposta.getText()+"'";
        try {
             st.executeUpdate(sql);   
            JOptionPane.showMessageDialog(this,"Üye silindi.");   
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Üye silinemedi.");  
            System.out.println("Üye silinemedi.");
        }

    }//GEN-LAST:event_uyesilbtnActionPerformed

    private void ara_uyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_uyeActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {}
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igugym?zeroDateTimeBehavior=convertToNull", "root", "");
            st = con.createStatement();
        } catch (SQLException ex) {}

        String sql = "Select * from uyeler where uye_ad='"+ara_ad.getText()+"' AND uye_soyad='"+ara_soyad.getText()+"'";
        try {
            rs = st.executeQuery(sql);
             String [] satirlar = new String[6];
           if(rs.next()) {
                satirlar[0] = rs.getString("uye_ad");
                satirlar[1] = rs.getString("uye_soyad");
                satirlar[2] = rs.getString("uye_dogum");
                satirlar[3] = rs.getString("uye_cins");
                satirlar[4] = rs.getString("uye_eposta");
                satirlar[5] = rs.getString("uye_tel");
                dtm.addRow(satirlar);
            }else {
            JOptionPane.showMessageDialog(this,"Üye Bulunamadı.");}
        } catch (SQLException ex) {
            System.out.println("o1");
        }
    }//GEN-LAST:event_ara_uyeActionPerformed

    private void table_uyelerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_uyelerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_uyelerMouseClicked

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed

        if (ad.getText().equals("") || posta.getText().equals("") || sifre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Boş Alanları Doldurunuz.");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {}
            Connection con = null;          
            Statement st = null;
            ResultSet rs = null;
            
     String sql = "INSERT INTO uyeler (uye_ad,uye_soyad,uye_dogum,uye_cins,uye_tel,uye_eposta,uye_sifre,uye_antsec)" + "VALUES ('"+ ad.getText() +"','" +soyad.getText()+"','"+gun.getSelectedItem().toString()+"/"+ay.getSelectedItem().toString()+"/"+yil.getSelectedItem().toString()+"','"+cinsiyet.getSelectedItem().toString()+"','"+tel.getText()+"','"+posta.getText()+"','"+sifre.getText()+"','"+antsecim.getSelectedItem().toString()+"')";

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igugym?zeroDateTimeBehavior=convertToNull", "root", "");
                st = con.createStatement();    
                st.executeUpdate(sql);
               JOptionPane.showMessageDialog(this,"Üye eklendi");               
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Üye eklenemedi");
                System.out.println("Kayıt eklenemedi.");
            }
        }

    }//GEN-LAST:event_ekleActionPerformed

    private void temizlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizlebtnActionPerformed
           ad.setText("");
           soyad.setText("");
           gun.setSelectedIndex(0);
           ay.setSelectedIndex(0);
           yil.setSelectedIndex(0);
           cinsiyet.setSelectedIndex(0);
           tel.setText("");
           posta.setText("");
           sifre.setText("");
           antsecim.setSelectedIndex(0);
    }//GEN-LAST:event_temizlebtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IguGYM_Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IguGYM_Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IguGYM_Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IguGYM_Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IguGYM_Ant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ad;
    private javax.swing.JComboBox<String> antsecim;
    private javax.swing.JTextPane ara_ad;
    private javax.swing.JTextPane ara_eposta;
    private javax.swing.JTextPane ara_soyad;
    private javax.swing.JButton ara_uye;
    private javax.swing.JComboBox<String> ay;
    private javax.swing.JComboBox<String> cinsiyet;
    private javax.swing.JButton ekle;
    private javax.swing.JComboBox<String> gun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane posta;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JTextPane soyad;
    private javax.swing.JTable table_uyeler;
    private javax.swing.JTextPane tel;
    private javax.swing.JButton temizlebtn;
    private javax.swing.JPanel uyeForm;
    private javax.swing.JButton uyesilbtn;
    private javax.swing.JComboBox<String> yil;
    // End of variables declaration//GEN-END:variables
}
