/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgBiling.java
 *
 * Created on 07 Jun 10, 19:07:06
 */

package khanzaantrianpoli;

import fungsi.BackgroundMusic;
import fungsi.WarnaTable;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Blob;
import java.sql.Connection;

/**
 *
 * @author perpustakaan
 */
public class DlgAntrian extends javax.swing.JDialog implements ActionListener{    
    private Connection koneksi=koneksiDB.condb();
    private final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();   
    /** Creates new form DlgBiling
     * @param parent
     * @param modal */
    public DlgAntrian(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(super.getClass().getResource("/picture/addressbook-edit24.png")).getImage());
        
        this.setSize(screen.width,screen.height);
        
        Object[] row={"No.Reg",
            "Nomer RM",
            "Pasien",
            "No.Rawat",
            "Dokter Dituju",
            "Jam Daftar"};
        tabMode1=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table1.setModel(tabMode1);

        Table1.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table1.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table1.setDefaultRenderer(Object.class, new WarnaTable());
        
        tabMode2=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table2.setModel(tabMode2);

        Table2.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table2.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table2.setDefaultRenderer(Object.class, new WarnaTable());
        
        tabMode3=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table3.setModel(tabMode3);

        Table3.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table3.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table3.setDefaultRenderer(Object.class, new WarnaTable());


        tabMode4=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table4.setModel(tabMode4);

        Table4.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table4.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table4.setDefaultRenderer(Object.class, new WarnaTable());

        tabMode5=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table5.setModel(tabMode5);

        Table5.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table5.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table5.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table5.setDefaultRenderer(Object.class, new WarnaTable());

        tabMode6=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };
        Table6.setModel(tabMode6);

        Table6.setPreferredScrollableViewportSize(new Dimension(800,800));
        Table6.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 6; i++) {
            TableColumn column = Table6.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(60);
            }else if(i==1){
                column.setPreferredWidth(100);
            }else if(i==2){
                column.setPreferredWidth(200);
            }else if(i==3){
                column.setPreferredWidth(100);   
            }else if(i==4){
                column.setPreferredWidth(200);
            }else if(i==5){
                column.setPreferredWidth(100);
            }
        }
        Table6.setDefaultRenderer(Object.class, new WarnaTable());
        
        
        javax.swing.Timer timer = new javax.swing.Timer(100, this);
        timer.start();
    }
    
    private final DefaultTableModel tabMode1;
    private final DefaultTableModel tabMode2;
    private final DefaultTableModel tabMode3;
    private final DefaultTableModel tabMode4;
    private final DefaultTableModel tabMode5;
    private final DefaultTableModel tabMode6;
    private DlgCariDokter dokter=new DlgCariDokter(null,false);
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private int pilihan=0;
    private DlgCariPoli poli=new DlgCariPoli(null,false);


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgDisplay = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        form1 = new widget.InternalFrame();
        labelantri1 = new widget.Label();
        jPanel6 = new javax.swing.JPanel();
        labelpas1 = new widget.Label();
        labeldokter1 = new widget.Label();
        form2 = new widget.InternalFrame();
        labelantri2 = new widget.Label();
        jPanel7 = new javax.swing.JPanel();
        labelpas2 = new widget.Label();
        labeldokter2 = new widget.Label();
        form3 = new widget.InternalFrame();
        labelantri3 = new widget.Label();
        jPanel8 = new javax.swing.JPanel();
        labelpas3 = new widget.Label();
        labeldokter3 = new widget.Label();
        form4 = new widget.InternalFrame();
        labelantri4 = new widget.Label();
        jPanel9 = new javax.swing.JPanel();
        labelpas4 = new widget.Label();
        labeldokter4 = new widget.Label();
        form5 = new widget.InternalFrame();
        labelantri5 = new widget.Label();
        jPanel10 = new javax.swing.JPanel();
        labelpas5 = new widget.Label();
        labeldokter5 = new widget.Label();
        form6 = new widget.InternalFrame();
        labelantri6 = new widget.Label();
        jPanel11 = new javax.swing.JPanel();
        labelpas6 = new widget.Label();
        labeldokter6 = new widget.Label();
        Popup1 = new javax.swing.JPopupMenu();
        ppAntri1 = new javax.swing.JMenuItem();
        ppUndo1 = new javax.swing.JMenuItem();
        Popup2 = new javax.swing.JPopupMenu();
        ppAntri2 = new javax.swing.JMenuItem();
        ppUndo2 = new javax.swing.JMenuItem();
        Popup3 = new javax.swing.JPopupMenu();
        ppAntri3 = new javax.swing.JMenuItem();
        ppUndo3 = new javax.swing.JMenuItem();
        Popup4 = new javax.swing.JPopupMenu();
        ppClose = new javax.swing.JMenuItem();
        norawat1 = new widget.TextBox();
        norawat2 = new widget.TextBox();
        norawat3 = new widget.TextBox();
        Popup5 = new javax.swing.JPopupMenu();
        ppAntri4 = new javax.swing.JMenuItem();
        ppUndo4 = new javax.swing.JMenuItem();
        Popup6 = new javax.swing.JPopupMenu();
        ppAntri5 = new javax.swing.JMenuItem();
        ppUndo5 = new javax.swing.JMenuItem();
        Popup7 = new javax.swing.JPopupMenu();
        ppAntri6 = new javax.swing.JMenuItem();
        ppUndo6 = new javax.swing.JMenuItem();
        norawat4 = new widget.TextBox();
        norawat5 = new widget.TextBox();
        norawat6 = new widget.TextBox();
        internalFrame1 = new widget.InternalFrame();
        panelisi1 = new widget.panelisi();
        BtnDisplay = new widget.Button();
        BtnKeluar = new widget.Button();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelisi2 = new widget.panelisi();
        BtnSeek2 = new widget.Button();
        Unit1 = new widget.TextBox();
        BtnSeek5 = new widget.Button();
        Dokter1 = new widget.TextBox();
        Scroll = new widget.ScrollPane();
        Table1 = new widget.Table();
        panelisi5 = new widget.panelisi();
        BtnAntri1 = new widget.Button();
        BtnBatal1 = new widget.Button();
        BtnBatal4 = new widget.Button();
        jPanel3 = new javax.swing.JPanel();
        panelisi3 = new widget.panelisi();
        BtnSeek3 = new widget.Button();
        Unit2 = new widget.TextBox();
        BtnSeek6 = new widget.Button();
        Dokter2 = new widget.TextBox();
        Scroll1 = new widget.ScrollPane();
        Table2 = new widget.Table();
        panelisi6 = new widget.panelisi();
        BtnAntri2 = new widget.Button();
        BtnBatal2 = new widget.Button();
        BtnBatal5 = new widget.Button();
        jPanel4 = new javax.swing.JPanel();
        panelisi4 = new widget.panelisi();
        BtnSeek4 = new widget.Button();
        Unit3 = new widget.TextBox();
        BtnSeek7 = new widget.Button();
        Dokter3 = new widget.TextBox();
        Scroll2 = new widget.ScrollPane();
        Table3 = new widget.Table();
        panelisi7 = new widget.panelisi();
        BtnAntri3 = new widget.Button();
        BtnBatal3 = new widget.Button();
        BtnBatal6 = new widget.Button();
        jPanel12 = new javax.swing.JPanel();
        panelisi8 = new widget.panelisi();
        BtnSeek8 = new widget.Button();
        Unit4 = new widget.TextBox();
        BtnSeek9 = new widget.Button();
        Dokter4 = new widget.TextBox();
        Scroll3 = new widget.ScrollPane();
        Table4 = new widget.Table();
        panelisi9 = new widget.panelisi();
        BtnAntri4 = new widget.Button();
        BtnBatal7 = new widget.Button();
        BtnBatal8 = new widget.Button();
        jPanel13 = new javax.swing.JPanel();
        panelisi10 = new widget.panelisi();
        BtnSeek10 = new widget.Button();
        Unit5 = new widget.TextBox();
        BtnSeek11 = new widget.Button();
        Dokter5 = new widget.TextBox();
        Scroll4 = new widget.ScrollPane();
        Table5 = new widget.Table();
        panelisi11 = new widget.panelisi();
        BtnAntri5 = new widget.Button();
        BtnBatal9 = new widget.Button();
        BtnBatal10 = new widget.Button();
        jPanel14 = new javax.swing.JPanel();
        panelisi12 = new widget.panelisi();
        BtnSeek12 = new widget.Button();
        Unit6 = new widget.TextBox();
        BtnSeek13 = new widget.Button();
        Dokter6 = new widget.TextBox();
        Scroll5 = new widget.ScrollPane();
        Table6 = new widget.Table();
        panelisi13 = new widget.panelisi();
        BtnAntri6 = new widget.Button();
        BtnBatal11 = new widget.Button();
        BtnBatal12 = new widget.Button();

        DlgDisplay.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DlgDisplay.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        DlgDisplay.setName("DlgDisplay"); // NOI18N

        jPanel5.setBackground(new java.awt.Color(150, 255, 150));
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(550, 100));
        jPanel5.setLayout(new java.awt.GridLayout(3, 2));

        form1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form1.setName("form1"); // NOI18N
        form1.setPreferredSize(new java.awt.Dimension(500, 110));
        form1.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form1.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form1.setLayout(new java.awt.BorderLayout());

        labelantri1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri1.setForeground(new java.awt.Color(0, 0, 0));
        labelantri1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri1.setText("000");
        labelantri1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri1.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri1.setName("labelantri1"); // NOI18N
        labelantri1.setPreferredSize(new java.awt.Dimension(200, 50));
        form1.add(labelantri1, java.awt.BorderLayout.EAST);

        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(2, 0));

        labelpas1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas1.setForeground(new java.awt.Color(0, 0, 0));
        labelpas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas1.setText("Pasien 1");
        labelpas1.setFocusable(false);
        labelpas1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas1.setName("labelpas1"); // NOI18N
        labelpas1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel6.add(labelpas1);

        labeldokter1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter1.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter1.setText("Dokter 1");
        labeldokter1.setFocusable(false);
        labeldokter1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter1.setName("labeldokter1"); // NOI18N
        labeldokter1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel6.add(labeldokter1);

        form1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel5.add(form1);

        form2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form2.setName("form2"); // NOI18N
        form2.setPreferredSize(new java.awt.Dimension(500, 110));
        form2.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form2.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form2.setLayout(new java.awt.BorderLayout());

        labelantri2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri2.setForeground(new java.awt.Color(0, 0, 0));
        labelantri2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri2.setText("000");
        labelantri2.setToolTipText("");
        labelantri2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri2.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri2.setName("labelantri2"); // NOI18N
        labelantri2.setPreferredSize(new java.awt.Dimension(200, 50));
        form2.add(labelantri2, java.awt.BorderLayout.EAST);

        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        labelpas2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas2.setForeground(new java.awt.Color(0, 0, 0));
        labelpas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas2.setText("Pasien 2");
        labelpas2.setFocusable(false);
        labelpas2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas2.setName("labelpas2"); // NOI18N
        labelpas2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel7.add(labelpas2);

        labeldokter2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter2.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter2.setText("Dokter 2");
        labeldokter2.setFocusable(false);
        labeldokter2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter2.setName("labeldokter2"); // NOI18N
        labeldokter2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel7.add(labeldokter2);

        form2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel5.add(form2);

        form3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form3.setName("form3"); // NOI18N
        form3.setPreferredSize(new java.awt.Dimension(500, 110));
        form3.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form3.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form3.setLayout(new java.awt.BorderLayout());

        labelantri3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri3.setForeground(new java.awt.Color(0, 0, 0));
        labelantri3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri3.setText("000");
        labelantri3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri3.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri3.setName("labelantri3"); // NOI18N
        labelantri3.setPreferredSize(new java.awt.Dimension(200, 50));
        form3.add(labelantri3, java.awt.BorderLayout.EAST);

        jPanel8.setName("jPanel8"); // NOI18N
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        labelpas3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas3.setForeground(new java.awt.Color(0, 0, 0));
        labelpas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas3.setText("Pasien 3");
        labelpas3.setFocusable(false);
        labelpas3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas3.setName("labelpas3"); // NOI18N
        labelpas3.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel8.add(labelpas3);

        labeldokter3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter3.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter3.setText("Dokter 3");
        labeldokter3.setFocusable(false);
        labeldokter3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter3.setName("labeldokter3"); // NOI18N
        labeldokter3.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel8.add(labeldokter3);

        form3.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(form3);

        form4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form4.setName("form4"); // NOI18N
        form4.setPreferredSize(new java.awt.Dimension(500, 110));
        form4.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form4.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form4.setLayout(new java.awt.BorderLayout());

        labelantri4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri4.setForeground(new java.awt.Color(0, 0, 0));
        labelantri4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri4.setText("000");
        labelantri4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri4.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri4.setName("labelantri4"); // NOI18N
        labelantri4.setPreferredSize(new java.awt.Dimension(200, 50));
        form4.add(labelantri4, java.awt.BorderLayout.EAST);
        labelantri4.getAccessibleContext().setAccessibleName("004");

        jPanel9.setName("jPanel9"); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(2, 0));

        labelpas4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas4.setForeground(new java.awt.Color(0, 0, 0));
        labelpas4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas4.setText("Pasien 1");
        labelpas4.setFocusable(false);
        labelpas4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas4.setName("labelpas4"); // NOI18N
        labelpas4.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel9.add(labelpas4);

        labeldokter4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter4.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter4.setText("Dokter 1");
        labeldokter4.setFocusable(false);
        labeldokter4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter4.setName("labeldokter4"); // NOI18N
        labeldokter4.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel9.add(labeldokter4);

        form4.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(form4);
        form4.getAccessibleContext().setAccessibleName(" Antrian Pasien 4");

        form5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 5", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form5.setName("form5"); // NOI18N
        form5.setPreferredSize(new java.awt.Dimension(500, 110));
        form5.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form5.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form5.setLayout(new java.awt.BorderLayout());

        labelantri5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri5.setForeground(new java.awt.Color(0, 0, 0));
        labelantri5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri5.setText("000");
        labelantri5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri5.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri5.setName("labelantri5"); // NOI18N
        labelantri5.setPreferredSize(new java.awt.Dimension(200, 50));
        form5.add(labelantri5, java.awt.BorderLayout.EAST);
        labelantri5.getAccessibleContext().setAccessibleName("005");

        jPanel10.setName("jPanel10"); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(2, 0));

        labelpas5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas5.setForeground(new java.awt.Color(0, 0, 0));
        labelpas5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas5.setText("Pasien 1");
        labelpas5.setFocusable(false);
        labelpas5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas5.setName("labelpas5"); // NOI18N
        labelpas5.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel10.add(labelpas5);

        labeldokter5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter5.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter5.setText("Dokter 1");
        labeldokter5.setFocusable(false);
        labeldokter5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter5.setName("labeldokter5"); // NOI18N
        labeldokter5.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel10.add(labeldokter5);

        form5.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel5.add(form5);
        form5.getAccessibleContext().setAccessibleName(" Antrian Pasien 5");

        form6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), " Antrian Pasien 6", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 38), new java.awt.Color(50, 100, 50))); // NOI18N
        form6.setName("form6"); // NOI18N
        form6.setPreferredSize(new java.awt.Dimension(500, 110));
        form6.setWarnaAtas(new java.awt.Color(255, 255, 255));
        form6.setWarnaBawah(new java.awt.Color(230, 255, 230));
        form6.setLayout(new java.awt.BorderLayout());

        labelantri6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "No.Antrian :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelantri6.setForeground(new java.awt.Color(0, 0, 0));
        labelantri6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelantri6.setText("000");
        labelantri6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelantri6.setFont(new java.awt.Font("Serif", 1, 100)); // NOI18N
        labelantri6.setName("labelantri6"); // NOI18N
        labelantri6.setPreferredSize(new java.awt.Dimension(200, 50));
        form6.add(labelantri6, java.awt.BorderLayout.EAST);
        labelantri6.getAccessibleContext().setAccessibleName("006");

        jPanel11.setName("jPanel11"); // NOI18N
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(2, 0));

        labelpas6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Pasien :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labelpas6.setForeground(new java.awt.Color(0, 0, 0));
        labelpas6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelpas6.setText("Pasien 1");
        labelpas6.setFocusable(false);
        labelpas6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelpas6.setName("labelpas6"); // NOI18N
        labelpas6.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel11.add(labelpas6);

        labeldokter6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 250, 150)), "Dokter :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 26), new java.awt.Color(50, 100, 50))); // NOI18N
        labeldokter6.setForeground(new java.awt.Color(0, 0, 0));
        labeldokter6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldokter6.setText("Dokter 1");
        labeldokter6.setFocusable(false);
        labeldokter6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labeldokter6.setName("labeldokter6"); // NOI18N
        labeldokter6.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel11.add(labeldokter6);

        form6.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel5.add(form6);
        form6.getAccessibleContext().setAccessibleName(" Antrian Pasien 6");

        DlgDisplay.getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        Popup1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup1.setName("Popup1"); // NOI18N

        ppAntri1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri1.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri1.setText("Masukkan Antrian");
        ppAntri1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri1.setIconTextGap(8);
        ppAntri1.setName("ppAntri1"); // NOI18N
        ppAntri1.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri1ActionPerformed(evt);
            }
        });
        Popup1.add(ppAntri1);

        ppUndo1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo1.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo1.setText("Batal Periksa");
        ppUndo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo1.setIconTextGap(8);
        ppUndo1.setName("ppUndo1"); // NOI18N
        ppUndo1.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo1ActionPerformed(evt);
            }
        });
        Popup1.add(ppUndo1);

        Popup2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup2.setName("Popup2"); // NOI18N

        ppAntri2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri2.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri2.setText("Masukkan Antrian");
        ppAntri2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri2.setIconTextGap(8);
        ppAntri2.setName("ppAntri2"); // NOI18N
        ppAntri2.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri2ActionPerformed(evt);
            }
        });
        Popup2.add(ppAntri2);

        ppUndo2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo2.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo2.setText("Batal Periksa");
        ppUndo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo2.setIconTextGap(8);
        ppUndo2.setName("ppUndo2"); // NOI18N
        ppUndo2.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo2ActionPerformed(evt);
            }
        });
        Popup2.add(ppUndo2);

        Popup3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup3.setName("Popup3"); // NOI18N

        ppAntri3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri3.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri3.setText("Masukkan Antrian");
        ppAntri3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri3.setIconTextGap(8);
        ppAntri3.setName("ppAntri3"); // NOI18N
        ppAntri3.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri3ActionPerformed(evt);
            }
        });
        Popup3.add(ppAntri3);

        ppUndo3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo3.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo3.setText("Batal Periksa");
        ppUndo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo3.setIconTextGap(8);
        ppUndo3.setName("ppUndo3"); // NOI18N
        ppUndo3.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo3ActionPerformed(evt);
            }
        });
        Popup3.add(ppUndo3);

        Popup4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup4.setName("Popup4"); // NOI18N

        ppClose.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppClose.setForeground(new java.awt.Color(102, 51, 0));
        ppClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppClose.setText("Tutup Display");
        ppClose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppClose.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppClose.setIconTextGap(8);
        ppClose.setName("ppClose"); // NOI18N
        ppClose.setPreferredSize(new java.awt.Dimension(150, 25));
        ppClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppCloseActionPerformed(evt);
            }
        });
        Popup4.add(ppClose);

        norawat1.setEditable(false);
        norawat1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat1.setName("norawat1"); // NOI18N
        norawat1.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat1.setSelectionColor(new java.awt.Color(255, 255, 255));

        norawat2.setEditable(false);
        norawat2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat2.setName("norawat2"); // NOI18N
        norawat2.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat2.setSelectionColor(new java.awt.Color(255, 255, 255));

        norawat3.setEditable(false);
        norawat3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat3.setName("norawat3"); // NOI18N
        norawat3.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat3.setSelectionColor(new java.awt.Color(255, 255, 255));

        Popup5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup5.setName("Popup5"); // NOI18N

        ppAntri4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri4.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri4.setText("Masukkan Antrian");
        ppAntri4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri4.setIconTextGap(8);
        ppAntri4.setName("ppAntri4"); // NOI18N
        ppAntri4.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri4ActionPerformed(evt);
            }
        });
        Popup5.add(ppAntri4);

        ppUndo4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo4.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo4.setText("Batal Periksa");
        ppUndo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo4.setIconTextGap(8);
        ppUndo4.setName("ppUndo4"); // NOI18N
        ppUndo4.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo4ActionPerformed(evt);
            }
        });
        Popup5.add(ppUndo4);

        Popup6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup6.setName("Popup6"); // NOI18N

        ppAntri5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri5.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri5.setText("Masukkan Antrian");
        ppAntri5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri5.setIconTextGap(8);
        ppAntri5.setName("ppAntri5"); // NOI18N
        ppAntri5.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri5ActionPerformed(evt);
            }
        });
        Popup6.add(ppAntri5);

        ppUndo5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo5.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo5.setText("Batal Periksa");
        ppUndo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo5.setIconTextGap(8);
        ppUndo5.setName("ppUndo5"); // NOI18N
        ppUndo5.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo5ActionPerformed(evt);
            }
        });
        Popup6.add(ppUndo5);

        Popup7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Popup7.setName("Popup7"); // NOI18N

        ppAntri6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppAntri6.setForeground(new java.awt.Color(102, 51, 0));
        ppAntri6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/011.png"))); // NOI18N
        ppAntri6.setText("Masukkan Antrian");
        ppAntri6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppAntri6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppAntri6.setIconTextGap(8);
        ppAntri6.setName("ppAntri6"); // NOI18N
        ppAntri6.setPreferredSize(new java.awt.Dimension(150, 25));
        ppAntri6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppAntri6ActionPerformed(evt);
            }
        });
        Popup7.add(ppAntri6);

        ppUndo6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ppUndo6.setForeground(new java.awt.Color(102, 51, 0));
        ppUndo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        ppUndo6.setText("Batal Periksa");
        ppUndo6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppUndo6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ppUndo6.setIconTextGap(8);
        ppUndo6.setName("ppUndo6"); // NOI18N
        ppUndo6.setPreferredSize(new java.awt.Dimension(150, 25));
        ppUndo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppUndo6ActionPerformed(evt);
            }
        });
        Popup7.add(ppUndo6);

        norawat4.setEditable(false);
        norawat4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat4.setName("norawat4"); // NOI18N
        norawat4.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat4.setSelectionColor(new java.awt.Color(255, 255, 255));

        norawat5.setEditable(false);
        norawat5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat5.setName("norawat5"); // NOI18N
        norawat5.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat5.setSelectionColor(new java.awt.Color(255, 255, 255));

        norawat6.setEditable(false);
        norawat6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        norawat6.setName("norawat6"); // NOI18N
        norawat6.setPreferredSize(new java.awt.Dimension(230, 23));
        norawat6.setSelectionColor(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Antrian Periksa Pasien ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi1.setName("panelisi1"); // NOI18N
        panelisi1.setPreferredSize(new java.awt.Dimension(55, 55));
        panelisi1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/editcopy.png"))); // NOI18N
        BtnDisplay.setMnemonic('D');
        BtnDisplay.setText("Display");
        BtnDisplay.setToolTipText("Alt+D");
        BtnDisplay.setIconTextGap(3);
        BtnDisplay.setName("BtnDisplay"); // NOI18N
        BtnDisplay.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDisplayActionPerformed(evt);
            }
        });
        panelisi1.add(BtnDisplay);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setIconTextGap(3);
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        panelisi1.add(BtnKeluar);

        internalFrame1.add(panelisi1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 3));

        jPanel2.setBackground(new java.awt.Color(245, 180, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 1 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi2.setName("panelisi2"); // NOI18N
        panelisi2.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi2.setLayout(null);

        BtnSeek2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek2.setMnemonic('1');
        BtnSeek2.setToolTipText("ALt+1");
        BtnSeek2.setName("BtnSeek2"); // NOI18N
        BtnSeek2.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek2ActionPerformed(evt);
            }
        });
        panelisi2.add(BtnSeek2);
        BtnSeek2.setBounds(6, 10, 28, 23);

        Unit1.setEditable(false);
        Unit1.setName("Unit1"); // NOI18N
        Unit1.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit1.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi2.add(Unit1);
        Unit1.setBounds(39, 10, 230, 23);

        BtnSeek5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek5.setMnemonic('2');
        BtnSeek5.setToolTipText("ALt+2");
        BtnSeek5.setName("BtnSeek5"); // NOI18N
        BtnSeek5.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek5ActionPerformed(evt);
            }
        });
        panelisi2.add(BtnSeek5);
        BtnSeek5.setBounds(6, 42, 28, 23);

        Dokter1.setEditable(false);
        Dokter1.setName("Dokter1"); // NOI18N
        Dokter1.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter1.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi2.add(Dokter1);
        Dokter1.setBounds(39, 42, 230, 23);

        jPanel2.add(panelisi2, java.awt.BorderLayout.PAGE_START);

        Scroll.setComponentPopupMenu(Popup1);
        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        Table1.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table1.setComponentPopupMenu(Popup1);
        Table1.setName("Table1"); // NOI18N
        Scroll.setViewportView(Table1);

        jPanel2.add(Scroll, java.awt.BorderLayout.CENTER);

        panelisi5.setName("panelisi5"); // NOI18N
        panelisi5.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri1.setMnemonic('7');
        BtnAntri1.setText("Antri");
        BtnAntri1.setToolTipText("Alt+7");
        BtnAntri1.setIconTextGap(3);
        BtnAntri1.setName("BtnAntri1"); // NOI18N
        BtnAntri1.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri1ActionPerformed(evt);
            }
        });
        panelisi5.add(BtnAntri1);

        BtnBatal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal1.setMnemonic('8');
        BtnBatal1.setText("Batal");
        BtnBatal1.setToolTipText("Alt+8");
        BtnBatal1.setIconTextGap(3);
        BtnBatal1.setName("BtnBatal1"); // NOI18N
        BtnBatal1.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal1ActionPerformed(evt);
            }
        });
        panelisi5.add(BtnBatal1);

        BtnBatal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal4.setMnemonic('8');
        BtnBatal4.setText("Ulang");
        BtnBatal4.setToolTipText("Alt+8");
        BtnBatal4.setIconTextGap(3);
        BtnBatal4.setName("BtnUlang1"); // NOI18N
        BtnBatal4.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal4ActionPerformed(evt);
            }
        });
        panelisi5.add(BtnBatal4);

        jPanel2.add(panelisi5, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 180, 245));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 2 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi3.setName("panelisi3"); // NOI18N
        panelisi3.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi3.setLayout(null);

        BtnSeek3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek3.setMnemonic('3');
        BtnSeek3.setToolTipText("ALt+3");
        BtnSeek3.setName("BtnSeek3"); // NOI18N
        BtnSeek3.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek3ActionPerformed(evt);
            }
        });
        panelisi3.add(BtnSeek3);
        BtnSeek3.setBounds(6, 10, 28, 23);

        Unit2.setEditable(false);
        Unit2.setName("Unit2"); // NOI18N
        Unit2.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit2.setSelectionColor(new java.awt.Color(255, 255, 255));
        Unit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Unit2ActionPerformed(evt);
            }
        });
        panelisi3.add(Unit2);
        Unit2.setBounds(39, 10, 230, 23);

        BtnSeek6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek6.setMnemonic('4');
        BtnSeek6.setToolTipText("ALt+4");
        BtnSeek6.setName("BtnSeek6"); // NOI18N
        BtnSeek6.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek6ActionPerformed(evt);
            }
        });
        panelisi3.add(BtnSeek6);
        BtnSeek6.setBounds(6, 42, 28, 23);

        Dokter2.setEditable(false);
        Dokter2.setName("Dokter2"); // NOI18N
        Dokter2.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter2.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi3.add(Dokter2);
        Dokter2.setBounds(39, 42, 230, 23);

        jPanel3.add(panelisi3, java.awt.BorderLayout.PAGE_START);

        Scroll1.setComponentPopupMenu(Popup2);
        Scroll1.setName("Scroll1"); // NOI18N
        Scroll1.setOpaque(true);

        Table2.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table2.setComponentPopupMenu(Popup2);
        Table2.setName("Table2"); // NOI18N
        Scroll1.setViewportView(Table2);

        jPanel3.add(Scroll1, java.awt.BorderLayout.CENTER);

        panelisi6.setName("panelisi6"); // NOI18N
        panelisi6.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri2.setMnemonic('9');
        BtnAntri2.setText("Antri");
        BtnAntri2.setToolTipText("Alt+9");
        BtnAntri2.setIconTextGap(3);
        BtnAntri2.setName("BtnAntri2"); // NOI18N
        BtnAntri2.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri2ActionPerformed(evt);
            }
        });
        panelisi6.add(BtnAntri2);

        BtnBatal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal2.setMnemonic('A');
        BtnBatal2.setText("Batal");
        BtnBatal2.setToolTipText("Alt+A");
        BtnBatal2.setIconTextGap(3);
        BtnBatal2.setName("BtnBatal2"); // NOI18N
        BtnBatal2.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal2ActionPerformed(evt);
            }
        });
        panelisi6.add(BtnBatal2);

        BtnBatal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal5.setMnemonic('8');
        BtnBatal5.setText("Ulang");
        BtnBatal5.setToolTipText("Alt+8");
        BtnBatal5.setIconTextGap(3);
        BtnBatal5.setName("BtnBatal5"); // NOI18N
        BtnBatal5.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal5ActionPerformed(evt);
            }
        });
        panelisi6.add(BtnBatal5);

        jPanel3.add(panelisi6, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(245, 180, 245));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 3 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi4.setName("panelisi4"); // NOI18N
        panelisi4.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi4.setLayout(null);

        BtnSeek4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek4.setMnemonic('5');
        BtnSeek4.setToolTipText("ALt+5");
        BtnSeek4.setName("BtnSeek4"); // NOI18N
        BtnSeek4.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek4ActionPerformed(evt);
            }
        });
        panelisi4.add(BtnSeek4);
        BtnSeek4.setBounds(6, 10, 28, 23);

        Unit3.setEditable(false);
        Unit3.setName("Unit3"); // NOI18N
        Unit3.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit3.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi4.add(Unit3);
        Unit3.setBounds(39, 10, 230, 23);

        BtnSeek7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek7.setMnemonic('6');
        BtnSeek7.setToolTipText("ALt+6");
        BtnSeek7.setName("BtnSeek7"); // NOI18N
        BtnSeek7.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek7ActionPerformed(evt);
            }
        });
        panelisi4.add(BtnSeek7);
        BtnSeek7.setBounds(6, 42, 28, 23);

        Dokter3.setEditable(false);
        Dokter3.setName("Dokter3"); // NOI18N
        Dokter3.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter3.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi4.add(Dokter3);
        Dokter3.setBounds(39, 42, 230, 23);

        jPanel4.add(panelisi4, java.awt.BorderLayout.PAGE_START);

        Scroll2.setComponentPopupMenu(Popup3);
        Scroll2.setName("Scroll2"); // NOI18N
        Scroll2.setOpaque(true);

        Table3.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table3.setComponentPopupMenu(Popup3);
        Table3.setName("Table3"); // NOI18N
        Scroll2.setViewportView(Table3);

        jPanel4.add(Scroll2, java.awt.BorderLayout.CENTER);

        panelisi7.setName("panelisi7"); // NOI18N
        panelisi7.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri3.setMnemonic('B');
        BtnAntri3.setText("Antri");
        BtnAntri3.setToolTipText("Alt+B");
        BtnAntri3.setIconTextGap(3);
        BtnAntri3.setName("BtnAntri3"); // NOI18N
        BtnAntri3.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri3ActionPerformed(evt);
            }
        });
        panelisi7.add(BtnAntri3);

        BtnBatal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal3.setMnemonic('C');
        BtnBatal3.setText("Batal");
        BtnBatal3.setToolTipText("Alt+C");
        BtnBatal3.setIconTextGap(3);
        BtnBatal3.setName("BtnBatal3"); // NOI18N
        BtnBatal3.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal3ActionPerformed(evt);
            }
        });
        panelisi7.add(BtnBatal3);

        BtnBatal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal6.setMnemonic('8');
        BtnBatal6.setText("Ulang");
        BtnBatal6.setToolTipText("Alt+8");
        BtnBatal6.setIconTextGap(3);
        BtnBatal6.setName("BtnBatal6"); // NOI18N
        BtnBatal6.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal6ActionPerformed(evt);
            }
        });
        panelisi7.add(BtnBatal6);

        jPanel4.add(panelisi7, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel4);

        jPanel12.setBackground(new java.awt.Color(245, 180, 245));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 4 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel12.setName("jPanel12"); // NOI18N
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi8.setName("panelisi8"); // NOI18N
        panelisi8.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi8.setLayout(null);

        BtnSeek8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek8.setMnemonic('1');
        BtnSeek8.setToolTipText("ALt+1");
        BtnSeek8.setName("BtnSeek8"); // NOI18N
        BtnSeek8.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek8ActionPerformed(evt);
            }
        });
        panelisi8.add(BtnSeek8);
        BtnSeek8.setBounds(6, 10, 28, 23);

        Unit4.setEditable(false);
        Unit4.setName("Unit4"); // NOI18N
        Unit4.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit4.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi8.add(Unit4);
        Unit4.setBounds(39, 10, 230, 23);

        BtnSeek9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek9.setMnemonic('2');
        BtnSeek9.setToolTipText("ALt+2");
        BtnSeek9.setName("BtnSeek9"); // NOI18N
        BtnSeek9.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek9ActionPerformed(evt);
            }
        });
        panelisi8.add(BtnSeek9);
        BtnSeek9.setBounds(6, 42, 28, 23);

        Dokter4.setEditable(false);
        Dokter4.setName("Dokter4"); // NOI18N
        Dokter4.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter4.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi8.add(Dokter4);
        Dokter4.setBounds(39, 42, 230, 23);

        jPanel12.add(panelisi8, java.awt.BorderLayout.PAGE_START);

        Scroll3.setComponentPopupMenu(Popup1);
        Scroll3.setName("Scroll3"); // NOI18N
        Scroll3.setOpaque(true);

        Table4.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table4.setComponentPopupMenu(Popup1);
        Table4.setName("Table4"); // NOI18N
        Scroll3.setViewportView(Table4);

        jPanel12.add(Scroll3, java.awt.BorderLayout.CENTER);

        panelisi9.setName("panelisi9"); // NOI18N
        panelisi9.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri4.setMnemonic('7');
        BtnAntri4.setText("Antri");
        BtnAntri4.setToolTipText("Alt+7");
        BtnAntri4.setIconTextGap(3);
        BtnAntri4.setName("BtnAntri4"); // NOI18N
        BtnAntri4.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri4ActionPerformed(evt);
            }
        });
        panelisi9.add(BtnAntri4);

        BtnBatal7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal7.setMnemonic('8');
        BtnBatal7.setText("Batal");
        BtnBatal7.setToolTipText("Alt+8");
        BtnBatal7.setIconTextGap(3);
        BtnBatal7.setName("BtnBatal7"); // NOI18N
        BtnBatal7.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal7ActionPerformed(evt);
            }
        });
        panelisi9.add(BtnBatal7);

        BtnBatal8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal8.setMnemonic('8');
        BtnBatal8.setText("Ulang");
        BtnBatal8.setToolTipText("Alt+8");
        BtnBatal8.setIconTextGap(3);
        BtnBatal8.setName("BtnBatal8"); // NOI18N
        BtnBatal8.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal8ActionPerformed(evt);
            }
        });
        panelisi9.add(BtnBatal8);

        jPanel12.add(panelisi9, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(245, 180, 245));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 5 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel13.setName("jPanel13"); // NOI18N
        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi10.setName("panelisi10"); // NOI18N
        panelisi10.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi10.setLayout(null);

        BtnSeek10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek10.setMnemonic('1');
        BtnSeek10.setToolTipText("ALt+1");
        BtnSeek10.setName("BtnSeek10"); // NOI18N
        BtnSeek10.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek10ActionPerformed(evt);
            }
        });
        panelisi10.add(BtnSeek10);
        BtnSeek10.setBounds(6, 10, 28, 23);

        Unit5.setEditable(false);
        Unit5.setName("Unit5"); // NOI18N
        Unit5.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit5.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi10.add(Unit5);
        Unit5.setBounds(39, 10, 230, 23);

        BtnSeek11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek11.setMnemonic('2');
        BtnSeek11.setToolTipText("ALt+2");
        BtnSeek11.setName("BtnSeek11"); // NOI18N
        BtnSeek11.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek11ActionPerformed(evt);
            }
        });
        panelisi10.add(BtnSeek11);
        BtnSeek11.setBounds(6, 42, 28, 23);

        Dokter5.setEditable(false);
        Dokter5.setName("Dokter5"); // NOI18N
        Dokter5.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter5.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi10.add(Dokter5);
        Dokter5.setBounds(39, 42, 230, 23);

        jPanel13.add(panelisi10, java.awt.BorderLayout.PAGE_START);

        Scroll4.setComponentPopupMenu(Popup1);
        Scroll4.setName("Scroll4"); // NOI18N
        Scroll4.setOpaque(true);

        Table5.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table5.setComponentPopupMenu(Popup1);
        Table5.setName("Table5"); // NOI18N
        Scroll4.setViewportView(Table5);

        jPanel13.add(Scroll4, java.awt.BorderLayout.CENTER);

        panelisi11.setName("panelisi11"); // NOI18N
        panelisi11.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri5.setMnemonic('7');
        BtnAntri5.setText("Antri");
        BtnAntri5.setToolTipText("Alt+7");
        BtnAntri5.setIconTextGap(3);
        BtnAntri5.setName("BtnAntri5"); // NOI18N
        BtnAntri5.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri5ActionPerformed(evt);
            }
        });
        panelisi11.add(BtnAntri5);

        BtnBatal9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal9.setMnemonic('8');
        BtnBatal9.setText("Batal");
        BtnBatal9.setToolTipText("Alt+8");
        BtnBatal9.setIconTextGap(3);
        BtnBatal9.setName("BtnBatal9"); // NOI18N
        BtnBatal9.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal9ActionPerformed(evt);
            }
        });
        panelisi11.add(BtnBatal9);

        BtnBatal10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal10.setMnemonic('8');
        BtnBatal10.setText("Ulang");
        BtnBatal10.setToolTipText("Alt+8");
        BtnBatal10.setIconTextGap(3);
        BtnBatal10.setName("BtnBatal10"); // NOI18N
        BtnBatal10.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal10ActionPerformed(evt);
            }
        });
        panelisi11.add(BtnBatal10);

        jPanel13.add(panelisi11, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel13);
        jPanel13.getAccessibleContext().setAccessibleName(".: Antrian Pasien 5  :");

        jPanel14.setBackground(new java.awt.Color(245, 180, 245));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), ".: Antrian Pasien 6 :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        jPanel14.setName("jPanel14"); // NOI18N
        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi12.setName("panelisi12"); // NOI18N
        panelisi12.setPreferredSize(new java.awt.Dimension(12, 74));
        panelisi12.setLayout(null);

        BtnSeek12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek12.setMnemonic('1');
        BtnSeek12.setToolTipText("ALt+1");
        BtnSeek12.setName("BtnSeek12"); // NOI18N
        BtnSeek12.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek12ActionPerformed(evt);
            }
        });
        panelisi12.add(BtnSeek12);
        BtnSeek12.setBounds(6, 10, 28, 23);

        Unit6.setEditable(false);
        Unit6.setName("Unit6"); // NOI18N
        Unit6.setPreferredSize(new java.awt.Dimension(230, 23));
        Unit6.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi12.add(Unit6);
        Unit6.setBounds(39, 10, 230, 23);

        BtnSeek13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/190.png"))); // NOI18N
        BtnSeek13.setMnemonic('2');
        BtnSeek13.setToolTipText("ALt+2");
        BtnSeek13.setName("BtnSeek13"); // NOI18N
        BtnSeek13.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSeek13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeek13ActionPerformed(evt);
            }
        });
        panelisi12.add(BtnSeek13);
        BtnSeek13.setBounds(6, 42, 28, 23);

        Dokter6.setEditable(false);
        Dokter6.setName("Dokter6"); // NOI18N
        Dokter6.setPreferredSize(new java.awt.Dimension(230, 23));
        Dokter6.setSelectionColor(new java.awt.Color(255, 255, 255));
        panelisi12.add(Dokter6);
        Dokter6.setBounds(39, 42, 230, 23);

        jPanel14.add(panelisi12, java.awt.BorderLayout.PAGE_START);

        Scroll5.setComponentPopupMenu(Popup1);
        Scroll5.setName("Scroll5"); // NOI18N
        Scroll5.setOpaque(true);

        Table6.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        Table6.setComponentPopupMenu(Popup1);
        Table6.setName("Table6"); // NOI18N
        Scroll5.setViewportView(Table6);

        jPanel14.add(Scroll5, java.awt.BorderLayout.CENTER);

        panelisi13.setName("panelisi13"); // NOI18N
        panelisi13.setPreferredSize(new java.awt.Dimension(12, 44));
        panelisi13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BtnAntri6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Agenda-1-16x16.png"))); // NOI18N
        BtnAntri6.setMnemonic('7');
        BtnAntri6.setText("Antri");
        BtnAntri6.setToolTipText("Alt+7");
        BtnAntri6.setIconTextGap(3);
        BtnAntri6.setName("BtnAntri6"); // NOI18N
        BtnAntri6.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnAntri6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntri6ActionPerformed(evt);
            }
        });
        panelisi13.add(BtnAntri6);

        BtnBatal11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnBatal11.setMnemonic('8');
        BtnBatal11.setText("Batal");
        BtnBatal11.setToolTipText("Alt+8");
        BtnBatal11.setIconTextGap(3);
        BtnBatal11.setName("BtnBatal11"); // NOI18N
        BtnBatal11.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal11ActionPerformed(evt);
            }
        });
        panelisi13.add(BtnBatal11);

        BtnBatal12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_16.png"))); // NOI18N
        BtnBatal12.setMnemonic('8');
        BtnBatal12.setText("Ulang");
        BtnBatal12.setToolTipText("Alt+8");
        BtnBatal12.setIconTextGap(3);
        BtnBatal12.setName("BtnBatal12"); // NOI18N
        BtnBatal12.setPreferredSize(new java.awt.Dimension(90, 30));
        BtnBatal12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal12ActionPerformed(evt);
            }
        });
        panelisi13.add(BtnBatal12);

        jPanel14.add(panelisi13, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel14);
        jPanel14.getAccessibleContext().setAccessibleName(".: Antrian Pasien 6 :");

        internalFrame1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        System.exit(0);
}//GEN-LAST:event_BtnKeluarActionPerformed

private void BtnSeek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek2ActionPerformed
        pilihan=1;
        poli.emptTeks();
        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
}//GEN-LAST:event_BtnSeek2ActionPerformed

private void BtnSeek3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek3ActionPerformed
       pilihan=2;
        poli.emptTeks();
        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
}//GEN-LAST:event_BtnSeek3ActionPerformed

private void BtnSeek4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek4ActionPerformed
        pilihan=3;
        poli.emptTeks();

        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
}//GEN-LAST:event_BtnSeek4ActionPerformed

private void BtnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDisplayActionPerformed
       Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
       DlgDisplay.setSize(screen.width,screen.height);
       if(!Unit1.getText().equals("")){
           form1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit1.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
       
       if(!Unit2.getText().equals("")){
           form2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit2.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
       
       if(!Unit3.getText().equals("")){
           form3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit3.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
       
        if(!Unit4.getText().equals("")){
            form4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit4.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
              
        if(!Unit5.getText().equals("")){
           form5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit5.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
                     
        if(!Unit6.getText().equals("")){
           form6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 100)), Unit6.getText()+" :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(100, 150, 100)));
       }
       isTampil();
       DlgDisplay.setIconImage(new ImageIcon(super.getClass().getResource("/picture/addressbook-edit24.png")).getImage());
       DlgDisplay.setAlwaysOnTop(false);
       DlgDisplay.setVisible(true);
}//GEN-LAST:event_BtnDisplayActionPerformed

private void ppAntri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri1ActionPerformed
        
        if(tabMode1.getRowCount()!=0){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode1.getValueAt(0,0).toString()));
            panggilpoli(Unit1.getText());
                labelantri1.setText(tabMode1.getValueAt(0,0).toString());
                labelpas1.setText(tabMode1.getValueAt(0,2).toString());
                norawat1.setText(tabMode1.getValueAt(0,3).toString());
                labeldokter1.setText(tabMode1.getValueAt(0,4).toString());
//                
//                System.out.println(Integer.parseInt(tabMode1.getValueAt(0,0).toString()));
//                System.out.println(labelantri1.getText());
//                System.out.println(labelpas1.getText());
//                System.out.println(norawat1.getText());
//                System.out.println(labeldokter1.getText());
                
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode1.getValueAt(0,3).toString()+"'");
                tampil1();
        }
}//GEN-LAST:event_ppAntri1ActionPerformed

private void ppAntri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri2ActionPerformed
       
       if(tabMode2.getRowCount()!=0){
           try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode2.getValueAt(0,0).toString()));
            panggilpoli(Unit2.getText());
                labelantri2.setText(tabMode2.getValueAt(0,0).toString());
                labelpas2.setText(tabMode2.getValueAt(0,2).toString());
                norawat2.setText(tabMode2.getValueAt(0,3).toString());
                labeldokter2.setText(tabMode2.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode2.getValueAt(0,3).toString()+"'");
                tampil2();
        }
}//GEN-LAST:event_ppAntri2ActionPerformed

private void ppAntri3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri3ActionPerformed
       
       if(tabMode3.getRowCount()!=0){
           try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode3.getValueAt(0,0).toString()));
            panggilpoli(Unit3.getText());
                labelantri3.setText(tabMode3.getValueAt(0,0).toString());
                labelpas3.setText(tabMode3.getValueAt(0,2).toString());
                norawat3.setText(tabMode3.getValueAt(0,3).toString());
                labeldokter3.setText(tabMode3.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode3.getValueAt(0,3).toString()+"'");
                tampil3();
        }
}//GEN-LAST:event_ppAntri3ActionPerformed

private void ppCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppCloseActionPerformed
    DlgDisplay.setVisible(false);
    DlgDisplay.dispose();
}//GEN-LAST:event_ppCloseActionPerformed

private void ppUndo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo1ActionPerformed
       if(tabMode1.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode1.getValueAt(4,5).toString()+"' where no_rawat='"+norawat1.getText()+"'");
                labelantri1.setText(tabMode1.getValueAt(0,0).toString());
                labelpas1.setText(tabMode1.getValueAt(0,2).toString());
                norawat1.setText(tabMode1.getValueAt(0,3).toString());
                labeldokter1.setText(tabMode1.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode1.getValueAt(0,3).toString()+"'");
                tampil1();
        }else if(tabMode1.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat1.getText()+"'");
                labelantri1.setText(tabMode1.getValueAt(0,0).toString());
                labelpas1.setText(tabMode1.getValueAt(0,2).toString());                
                norawat1.setText(tabMode1.getValueAt(0,3).toString());
                labeldokter1.setText(tabMode1.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode1.getValueAt(0,3).toString()+"'");
                tampil1();
        }
}//GEN-LAST:event_ppUndo1ActionPerformed

private void ppUndo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo2ActionPerformed
       if(tabMode2.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode2.getValueAt(4,5).toString()+"' where no_rawat='"+norawat2.getText()+"'");
                labelantri2.setText(tabMode2.getValueAt(0,0).toString());
                labelpas2.setText(tabMode2.getValueAt(0,2).toString());
                norawat2.setText(tabMode2.getValueAt(0,3).toString());
                labeldokter2.setText(tabMode2.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode2.getValueAt(0,3).toString()+"'");
                tampil2();
        }else if(tabMode2.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat2.getText()+"'");
                labelantri2.setText(tabMode2.getValueAt(0,0).toString());
                labelpas2.setText(tabMode2.getValueAt(0,2).toString());                
                norawat2.setText(tabMode2.getValueAt(0,3).toString());
                labeldokter2.setText(tabMode2.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode2.getValueAt(0,3).toString()+"'");
                tampil2();
        }
}//GEN-LAST:event_ppUndo2ActionPerformed

private void ppUndo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo3ActionPerformed
       if(tabMode3.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode3.getValueAt(4,5).toString()+"' where no_rawat='"+norawat3.getText()+"'");
                labelantri3.setText(tabMode3.getValueAt(0,0).toString());
                labelpas3.setText(tabMode3.getValueAt(0,2).toString());
                norawat3.setText(tabMode3.getValueAt(0,3).toString());
                labeldokter3.setText(tabMode3.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode3.getValueAt(0,3).toString()+"'");
                tampil3();
        }else if(tabMode3.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat3.getText()+"'");
                labelantri3.setText(tabMode3.getValueAt(0,0).toString());
                labelpas3.setText(tabMode3.getValueAt(0,2).toString());                
                norawat3.setText(tabMode3.getValueAt(0,3).toString());
                labeldokter3.setText(tabMode3.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode3.getValueAt(0,3).toString()+"'");
                tampil3();
        }
}//GEN-LAST:event_ppUndo3ActionPerformed

private void BtnSeek5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek5ActionPerformed
       pilihan=1;
       dokter.emptTeks();
        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
}//GEN-LAST:event_BtnSeek5ActionPerformed

private void BtnSeek6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek6ActionPerformed
      pilihan=2;
       dokter.emptTeks();
        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
}//GEN-LAST:event_BtnSeek6ActionPerformed

private void BtnSeek7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek7ActionPerformed
      pilihan=3;
       dokter.emptTeks();

        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
}//GEN-LAST:event_BtnSeek7ActionPerformed

private void BtnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal1ActionPerformed
      ppUndo1ActionPerformed(evt);
}//GEN-LAST:event_BtnBatal1ActionPerformed

private void BtnAntri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri1ActionPerformed
      ppAntri1ActionPerformed(evt);
}//GEN-LAST:event_BtnAntri1ActionPerformed

private void BtnAntri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri2ActionPerformed
      
        ppAntri2ActionPerformed(evt);
}//GEN-LAST:event_BtnAntri2ActionPerformed

private void BtnBatal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal2ActionPerformed
     ppUndo2ActionPerformed(evt);
}//GEN-LAST:event_BtnBatal2ActionPerformed

private void BtnAntri3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri3ActionPerformed
     ppAntri3ActionPerformed(evt);
}//GEN-LAST:event_BtnAntri3ActionPerformed

private void BtnBatal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal3ActionPerformed
    ppUndo3ActionPerformed(evt);
}//GEN-LAST:event_BtnBatal3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        poli.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {}
            @Override
            public void windowClosed(WindowEvent e) {
                if(poli.getTable().getSelectedRow()!= -1){
                    if(pilihan==1){
                        Unit1.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil1();
                        Unit1.requestFocus();
                    }else if(pilihan==2){
                        Unit2.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil2();
                        Unit2.requestFocus();
                    }else if(pilihan==3){
                        Unit3.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil3();
                        Unit3.requestFocus();
                    }else if(pilihan==4){
                        Unit4.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil4();
                        Unit4.requestFocus();
                    }else if(pilihan==5){
                        Unit5.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil5();
                        Unit5.requestFocus();
                    }else if(pilihan==6){
                        Unit6.setText(poli.getTable().getValueAt(poli.getTable().getSelectedRow(),1).toString());
                        tampil6();
                        Unit6.requestFocus();
                    }  
                }                
            }
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });        
        
        dokter.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {}
            @Override
            public void windowClosed(WindowEvent e) {
                if(dokter.getTable().getSelectedRow()!= -1){
                    if(pilihan==1){                    
                        Dokter1.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil1();
                        Dokter1.requestFocus();
                    }else if(pilihan==2){
                        Dokter2.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil2();
                        Dokter2.requestFocus();
                    }else if(pilihan==3){
                        Dokter3.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil3();
                        Dokter3.requestFocus();
                    }else if(pilihan==4){
                        Dokter4.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil4();
                        Dokter4.requestFocus();
                    }else if(pilihan==5){
                        Dokter5.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil5();
                        Dokter5.requestFocus();
                    }else if(pilihan==6){
                        Dokter6.setText(dokter.getTable().getValueAt(dokter.getTable().getSelectedRow(),1).toString());
                        tampil6();
                        Dokter6.requestFocus();
                    }
                }                
            }
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        poli.removeWindowListener(null);        
        dokter.removeWindowListener(null);
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tampil1();
        tampil2();
        tampil3();
        tampil4();
        tampil5();
        tampil6();
    }//GEN-LAST:event_formWindowOpened

    private void BtnBatal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal4ActionPerformed
        if(!labelantri1.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri1.getText()));
            panggilpoli(Unit1.getText());
        }            
    }//GEN-LAST:event_BtnBatal4ActionPerformed

    private void BtnBatal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal5ActionPerformed
        if(!labelantri2.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri2.getText()));
            panggilpoli(Unit2.getText());
        }
    }//GEN-LAST:event_BtnBatal5ActionPerformed

    private void BtnBatal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal6ActionPerformed
        if(!labelantri3.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri3.getText()));
            panggilpoli(Unit3.getText());
        }
    }//GEN-LAST:event_BtnBatal6ActionPerformed

    private void BtnSeek8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek8ActionPerformed
        pilihan=4;
        poli.emptTeks();
        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
    }//GEN-LAST:event_BtnSeek8ActionPerformed

    private void BtnSeek9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek9ActionPerformed
        pilihan=4;
        dokter.emptTeks();
        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
    }//GEN-LAST:event_BtnSeek9ActionPerformed

    private void BtnAntri4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri4ActionPerformed
        ppAntri4ActionPerformed(evt);
    }//GEN-LAST:event_BtnAntri4ActionPerformed

    private void BtnBatal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal7ActionPerformed
        ppUndo4ActionPerformed(evt);
    }//GEN-LAST:event_BtnBatal7ActionPerformed

    private void BtnBatal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal8ActionPerformed
        if(!labelantri4.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri4.getText()));
            panggilpoli(Unit4.getText());
        }
    }//GEN-LAST:event_BtnBatal8ActionPerformed

    private void BtnSeek10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek10ActionPerformed
        pilihan=5;
        poli.emptTeks();
        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
    }//GEN-LAST:event_BtnSeek10ActionPerformed

    private void BtnSeek11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek11ActionPerformed
        pilihan=5;
        dokter.emptTeks();
        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
    }//GEN-LAST:event_BtnSeek11ActionPerformed

    private void BtnAntri5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri5ActionPerformed
        ppAntri5ActionPerformed(evt);
    }//GEN-LAST:event_BtnAntri5ActionPerformed

    private void BtnBatal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal9ActionPerformed
        ppUndo5ActionPerformed(evt);
    }//GEN-LAST:event_BtnBatal9ActionPerformed

    private void BtnBatal10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal10ActionPerformed
        if(!labelantri5.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri5.getText()));
            panggilpoli(Unit5.getText());
        }
    }//GEN-LAST:event_BtnBatal10ActionPerformed

    private void BtnSeek12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek12ActionPerformed
        pilihan=6;
        poli.emptTeks();
        poli.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        poli.setLocationRelativeTo(internalFrame1);
        poli.setAlwaysOnTop(false);
        poli.setVisible(true);
    }//GEN-LAST:event_BtnSeek12ActionPerformed

    private void BtnSeek13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeek13ActionPerformed
        pilihan=6;
        dokter.emptTeks();
        dokter.setSize(internalFrame1.getWidth()-20,internalFrame1.getHeight()-20);
        dokter.setLocationRelativeTo(internalFrame1);
        dokter.setAlwaysOnTop(false);
        dokter.setVisible(true);
    }//GEN-LAST:event_BtnSeek13ActionPerformed

    private void BtnAntri6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntri6ActionPerformed
        ppAntri6ActionPerformed(evt);
    }//GEN-LAST:event_BtnAntri6ActionPerformed

    private void BtnBatal11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal11ActionPerformed
        ppUndo6ActionPerformed(evt);
    }//GEN-LAST:event_BtnBatal11ActionPerformed

    private void BtnBatal12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal12ActionPerformed
        if(!labelantri6.getText().equals("")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(labelantri6.getText()));
            panggilpoli(Unit6.getText());
        }
    }//GEN-LAST:event_BtnBatal12ActionPerformed

    private void Unit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Unit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Unit2ActionPerformed

    private void ppAntri4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri4ActionPerformed
        if(tabMode4.getRowCount()!=0){
           try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode4.getValueAt(0,0).toString()));
            panggilpoli(Unit4.getText());
                labelantri4.setText(tabMode4.getValueAt(0,0).toString());
                labelpas4.setText(tabMode4.getValueAt(0,2).toString());
                norawat4.setText(tabMode4.getValueAt(0,3).toString());
                labeldokter4.setText(tabMode4.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode4.getValueAt(0,3).toString()+"'");
                tampil4();
        }
    }//GEN-LAST:event_ppAntri4ActionPerformed

    private void ppUndo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo4ActionPerformed
        if(tabMode4.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode4.getValueAt(4,5).toString()+"' where no_rawat='"+norawat4.getText()+"'");
                labelantri4.setText(tabMode4.getValueAt(0,0).toString());
                labelpas4.setText(tabMode4.getValueAt(0,2).toString());
                norawat4.setText(tabMode4.getValueAt(0,3).toString());
                labeldokter4.setText(tabMode4.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode4.getValueAt(0,3).toString()+"'");
                tampil4();
        }else if(tabMode4.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat4.getText()+"'");
                labelantri4.setText(tabMode4.getValueAt(0,0).toString());
                labelpas4.setText(tabMode4.getValueAt(0,2).toString());                
                norawat4.setText(tabMode4.getValueAt(0,3).toString());
                labeldokter4.setText(tabMode4.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode4.getValueAt(0,3).toString()+"'");
                tampil4();
        }
    }//GEN-LAST:event_ppUndo4ActionPerformed

    private void ppAntri5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri5ActionPerformed
        if(tabMode5.getRowCount()!=0){
           try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode5.getValueAt(0,0).toString()));
            panggilpoli(Unit5.getText());
                labelantri5.setText(tabMode5.getValueAt(0,0).toString());
                labelpas5.setText(tabMode5.getValueAt(0,2).toString());
                norawat5.setText(tabMode5.getValueAt(0,3).toString());
                labeldokter5.setText(tabMode5.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode5.getValueAt(0,3).toString()+"'");
                tampil5();
        }
    }//GEN-LAST:event_ppAntri5ActionPerformed

    private void ppUndo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo5ActionPerformed
        if(tabMode5.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode5.getValueAt(4,5).toString()+"' where no_rawat='"+norawat5.getText()+"'");
                labelantri5.setText(tabMode5.getValueAt(0,0).toString());
                labelpas5.setText(tabMode5.getValueAt(0,2).toString());
                norawat5.setText(tabMode5.getValueAt(0,3).toString());
                labeldokter5.setText(tabMode5.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode5.getValueAt(0,3).toString()+"'");
                tampil5();
        }else if(tabMode5.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat5.getText()+"'");
                labelantri5.setText(tabMode5.getValueAt(0,0).toString());
                labelpas5.setText(tabMode5.getValueAt(0,2).toString());                
                norawat5.setText(tabMode5.getValueAt(0,3).toString());
                labeldokter5.setText(tabMode5.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode5.getValueAt(0,3).toString()+"'");
                tampil5();
        }
    }//GEN-LAST:event_ppUndo5ActionPerformed

    private void ppAntri6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppAntri6ActionPerformed
        if(tabMode6.getRowCount()!=0){
           try {
                BackgroundMusic bm = new BackgroundMusic("./suara/nomor-urut.mp3");
                bm.start();
                Thread.sleep(2000);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            } 
            panggil(Integer.parseInt(tabMode6.getValueAt(0,0).toString()));
            panggilpoli(Unit6.getText());
                labelantri6.setText(tabMode6.getValueAt(0,0).toString());
                labelpas6.setText(tabMode6.getValueAt(0,2).toString());
                norawat6.setText(tabMode6.getValueAt(0,3).toString());
                labeldokter6.setText(tabMode6.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode6.getValueAt(0,3).toString()+"'");
                tampil6();
        }
    }//GEN-LAST:event_ppAntri6ActionPerformed

    private void ppUndo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppUndo6ActionPerformed
        if(tabMode6.getRowCount()>=5){                
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg='"+tabMode6.getValueAt(4,5).toString()+"' where no_rawat='"+norawat6.getText()+"'");
                labelantri6.setText(tabMode6.getValueAt(0,0).toString());
                labelpas6.setText(tabMode6.getValueAt(0,2).toString());
                norawat6.setText(tabMode6.getValueAt(0,3).toString());
                labeldokter6.setText(tabMode6.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode6.getValueAt(0,3).toString()+"'");
                tampil6();
        }else if(tabMode6.getRowCount()<=5){  
                Sequel.queryu("update reg_periksa set stts='Belum',jam_reg=current_time() where no_rawat='"+norawat6.getText()+"'");
                labelantri6.setText(tabMode6.getValueAt(0,0).toString());
                labelpas6.setText(tabMode6.getValueAt(0,2).toString());                
                norawat6.setText(tabMode6.getValueAt(0,3).toString());
                labeldokter6.setText(tabMode6.getValueAt(0,4).toString());
                Sequel.queryu("update reg_periksa set stts='Sudah' where no_rawat='"+tabMode6.getValueAt(0,3).toString()+"'");
                tampil6();
        }
    }//GEN-LAST:event_ppUndo6ActionPerformed



    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DlgAntrian dialog = new DlgAntrian(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnAntri1;
    private widget.Button BtnAntri2;
    private widget.Button BtnAntri3;
    private widget.Button BtnAntri4;
    private widget.Button BtnAntri5;
    private widget.Button BtnAntri6;
    private widget.Button BtnBatal1;
    private widget.Button BtnBatal10;
    private widget.Button BtnBatal11;
    private widget.Button BtnBatal12;
    private widget.Button BtnBatal2;
    private widget.Button BtnBatal3;
    private widget.Button BtnBatal4;
    private widget.Button BtnBatal5;
    private widget.Button BtnBatal6;
    private widget.Button BtnBatal7;
    private widget.Button BtnBatal8;
    private widget.Button BtnBatal9;
    private widget.Button BtnDisplay;
    private widget.Button BtnKeluar;
    private widget.Button BtnSeek10;
    private widget.Button BtnSeek11;
    private widget.Button BtnSeek12;
    private widget.Button BtnSeek13;
    private widget.Button BtnSeek2;
    private widget.Button BtnSeek3;
    private widget.Button BtnSeek4;
    private widget.Button BtnSeek5;
    private widget.Button BtnSeek6;
    private widget.Button BtnSeek7;
    private widget.Button BtnSeek8;
    private widget.Button BtnSeek9;
    private javax.swing.JDialog DlgDisplay;
    private widget.TextBox Dokter1;
    private widget.TextBox Dokter2;
    private widget.TextBox Dokter3;
    private widget.TextBox Dokter4;
    private widget.TextBox Dokter5;
    private widget.TextBox Dokter6;
    private javax.swing.JPopupMenu Popup1;
    private javax.swing.JPopupMenu Popup2;
    private javax.swing.JPopupMenu Popup3;
    private javax.swing.JPopupMenu Popup4;
    private javax.swing.JPopupMenu Popup5;
    private javax.swing.JPopupMenu Popup6;
    private javax.swing.JPopupMenu Popup7;
    private widget.ScrollPane Scroll;
    private widget.ScrollPane Scroll1;
    private widget.ScrollPane Scroll2;
    private widget.ScrollPane Scroll3;
    private widget.ScrollPane Scroll4;
    private widget.ScrollPane Scroll5;
    private widget.Table Table1;
    private widget.Table Table2;
    private widget.Table Table3;
    private widget.Table Table4;
    private widget.Table Table5;
    private widget.Table Table6;
    private widget.TextBox Unit1;
    private widget.TextBox Unit2;
    private widget.TextBox Unit3;
    private widget.TextBox Unit4;
    private widget.TextBox Unit5;
    private widget.TextBox Unit6;
    private widget.InternalFrame form1;
    private widget.InternalFrame form2;
    private widget.InternalFrame form3;
    private widget.InternalFrame form4;
    private widget.InternalFrame form5;
    private widget.InternalFrame form6;
    private widget.InternalFrame internalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private widget.Label labelantri1;
    private widget.Label labelantri2;
    private widget.Label labelantri3;
    private widget.Label labelantri4;
    private widget.Label labelantri5;
    private widget.Label labelantri6;
    private widget.Label labeldokter1;
    private widget.Label labeldokter2;
    private widget.Label labeldokter3;
    private widget.Label labeldokter4;
    private widget.Label labeldokter5;
    private widget.Label labeldokter6;
    private widget.Label labelpas1;
    private widget.Label labelpas2;
    private widget.Label labelpas3;
    private widget.Label labelpas4;
    private widget.Label labelpas5;
    private widget.Label labelpas6;
    private widget.TextBox norawat1;
    private widget.TextBox norawat2;
    private widget.TextBox norawat3;
    private widget.TextBox norawat4;
    private widget.TextBox norawat5;
    private widget.TextBox norawat6;
    private widget.panelisi panelisi1;
    private widget.panelisi panelisi10;
    private widget.panelisi panelisi11;
    private widget.panelisi panelisi12;
    private widget.panelisi panelisi13;
    private widget.panelisi panelisi2;
    private widget.panelisi panelisi3;
    private widget.panelisi panelisi4;
    private widget.panelisi panelisi5;
    private widget.panelisi panelisi6;
    private widget.panelisi panelisi7;
    private widget.panelisi panelisi8;
    private widget.panelisi panelisi9;
    private javax.swing.JMenuItem ppAntri1;
    private javax.swing.JMenuItem ppAntri2;
    private javax.swing.JMenuItem ppAntri3;
    private javax.swing.JMenuItem ppAntri4;
    private javax.swing.JMenuItem ppAntri5;
    private javax.swing.JMenuItem ppAntri6;
    private javax.swing.JMenuItem ppClose;
    private javax.swing.JMenuItem ppUndo1;
    private javax.swing.JMenuItem ppUndo2;
    private javax.swing.JMenuItem ppUndo3;
    private javax.swing.JMenuItem ppUndo4;
    private javax.swing.JMenuItem ppUndo5;
    private javax.swing.JMenuItem ppUndo6;
    // End of variables declaration//GEN-END:variables
    
    private void tampil1(){
        Valid.tabelKosong(tabMode1);
        try{     
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit1.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter1.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode1.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
    
    private void tampil2(){
        Valid.tabelKosong(tabMode2);
        try{     
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit2.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter2.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode2.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
    
    private void tampil3(){
        Valid.tabelKosong(tabMode3);
        try{
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit3.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter3.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode3.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
    
    private void tampil4(){
        Valid.tabelKosong(tabMode4);
        try{     
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit4.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter4.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode4.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
    
    private void tampil5(){
        Valid.tabelKosong(tabMode5);
        try{     
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit5.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter5.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode5.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
        
    private void tampil6(){
        Valid.tabelKosong(tabMode6);
        try{     
            ResultSet rs=koneksi.createStatement().executeQuery("select reg_periksa.no_reg,reg_periksa.no_rkm_medis, "+
                   "pasien.nm_pasien,reg_periksa.no_rawat,dokter.nm_dokter,reg_periksa.jam_reg "+
                   "from reg_periksa inner join dokter inner join pasien inner join poliklinik "+
                   "on reg_periksa.kd_dokter=dokter.kd_dokter "+
                   "and reg_periksa.no_rkm_medis=pasien.no_rkm_medis "+
                   "and reg_periksa.kd_poli=poliklinik.kd_poli "+
                   "where reg_periksa.tgl_registrasi=current_date() "+
                   "and poliklinik.nm_poli='"+Unit6.getText()+"' "+
                   "and dokter.nm_dokter='"+Dokter6.getText()+"' "+
                   "and stts='Belum' "+
                   "order by reg_periksa.no_reg asc limit 10");
            while(rs.next()){
                String[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6)};
                tabMode6.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error : "+e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        paneliklan.repaint();
//        String oldText = labelruntext.getText();
//        String newText = oldText.substring(1) + oldText.substring(0, 1);
//        labelruntext.setText( newText );
    }
    
    private  void isTampil(){
//        try{
//            ResultSet rs=koneksi.createStatement().executeQuery("select teks, aktifkan, gambar from runtext");
//            while(rs.next()){
//                labelruntext.setText(rs.getString(1));
//                if(rs.getString(2).equals("Yes")){
//                    Blob blob = rs.getBlob(3);
//                    paneliklan.setBackgroundImage(new javax.swing.ImageIcon(blob.getBytes(1, (int) (blob.length()))));
//                    
//                }
//            }
//        }catch(SQLException e){
//            System.out.println(e+"Error : Silahkan Set Aplikasi");
//        }
    } 
    
    private void panggil(int antrian){
        String[] urut={"","./suara/satu.mp3","./suara/dua.mp3","./suara/tiga.mp3","./suara/empat.mp3",
                       "./suara/lima.mp3","./suara/enam.mp3","./suara/tujuh.mp3","./suara/delapan.mp3",
                       "./suara/sembilan.mp3","./suara/sepuluh.mp3","./suara/sebelas.mp3"};
        
        if (antrian < 12){
            try {
                BackgroundMusic bm = new BackgroundMusic(urut[antrian]);
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }            
        }else if (antrian < 20){
            try {
                BackgroundMusic bm = new BackgroundMusic(urut[antrian-10]);
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/belas.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (antrian < 100){
            try {
                BackgroundMusic bm = new BackgroundMusic(urut[antrian/10]);
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/puluh.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            panggil(antrian%10);
        }else if (antrian < 200){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/seratus.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            panggil(antrian-100);
        }else if (antrian < 1000){
            panggil(antrian/100);
            
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/ratus.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            panggil(antrian%100);
        }
    }
    
    private void panggilpoli(String poli){
        System.out.println(poli);
        if(poli.equals("POLIKLINIK JANTUNG")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-JANTUNG.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK ANAK")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-ANAK.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK BEDAH")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-BEDAH.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK DALAM")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-DALAM.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK KANDUNGAN")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-KANDUNGAN.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK PARU")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-PARU.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }else if (poli.equals("POLIKLINIK SARAF")){
            try {
                BackgroundMusic bm = new BackgroundMusic("./suara/POLI-SARAF.mp3");
                bm.start();
                Thread.sleep(1500);
                bm.stop();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
