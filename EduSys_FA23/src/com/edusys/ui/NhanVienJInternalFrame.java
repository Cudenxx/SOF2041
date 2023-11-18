package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.awt.event.MouseEvent;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NhanVienJInternalFrame extends javax.swing.JInternalFrame {

    private int index;
    private NhanVienDAO dao;
    private DefaultTableModel model;
    private List<NhanVien> list;

    public NhanVienJInternalFrame() {
        this.initComponents();

        this.model = (DefaultTableModel) this.tblNhanVien.getModel();
        this.dao = new NhanVienDAO();

        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        puUpdate = new javax.swing.JMenuItem();
        lblTitle = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblXacNhanMK = new javax.swing.JLabel();
        txtXacNhanMK = new javax.swing.JPasswordField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblVaiTro = new javax.swing.JLabel();
        rdoTP = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        puUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/refresh-option.png"))); // NOI18N
        puUpdate.setText("updateTrangThai");
        puUpdate.setToolTipText("");
        puUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puUpdateActionPerformed(evt);
            }
        });
        popupMenu.add(puUpdate);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EduSys - Quản Lý Nhân Viên");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        lblMaNV.setText("Mã nhân viên");

        lblMatKhau.setText("Mật khẩu");

        lblXacNhanMK.setText("Xác nhận mật khẩu");

        lblHoTen.setText("Họ và tên");

        lblVaiTro.setText("Vai trò");

        buttonGroup1.add(rdoTP);
        rdoTP.setText("Trưởng phòng");

        buttonGroup1.add(rdoNV);
        rdoNV.setText("Nhân viên");

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/Save.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/Edit.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/Add.png"))); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/previous.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/rewind.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/forward.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/ui/icon/next.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(lblMaNV)
                    .addComponent(lblMatKhau)
                    .addComponent(lblXacNhanMK)
                    .addComponent(lblHoTen)
                    .addComponent(jLabel1)
                    .addComponent(lblVaiTro)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(rdoTP)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNV))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(txtMaNV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnDelete, btnInsert, btnUpdate});

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtHoTen, txtMatKhau, txtXacNhanMK});

        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXacNhanMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoNV)
                    .addComponent(rdoTP))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnInsert)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtHoTen, txtMaNV, txtMatKhau, txtXacNhanMK});

        Tabs.addTab("CẬP NHẬT", pnlEdit);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Mật Khẩu", "Họ Và Tên", "Email", "Vai Trò", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("DANH SÁCH", pnlList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.index = this.tblNhanVien.getSelectedRow();
            this.edit();
            this.role();
        }
        if (Auth.isManager()) {
            if (evt.getButton() == MouseEvent.BUTTON3) {
                this.popupMenu.show(this, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
//        if (this.checkT() == true && this.check() == true) {
//            this.insert();
//        }
        this.insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        if (this.check() == true) {
//            this.update();
//        }
        this.update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void puUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puUpdateActionPerformed
        this.trangThai();
    }//GEN-LAST:event_puUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhanMK;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem puUpdate;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoTP;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);
        this.Tabs.setSelectedIndex(1);
        this.rdoNV.setSelected(true);
        this.fillNhanVienHienTai();
        this.index = -1;
//        this.updateStatus();
    }

    private NhanVien getForm() {
        try {
            NhanVien nv = new NhanVien();
            nv.setMaNV(txtMaNV.getText());
            nv.setMatKhau(new String(txtMatKhau.getPassword()));
            nv.setHoTen(txtHoTen.getText());
            nv.setEmail(txtEmail.getText());
            nv.setVaiTro(rdoNV.isSelected());
            nv.setTrangThai(true);
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtMatKhau.setText(nv.getMatKhau());
        txtXacNhanMK.setText(nv.getMatKhau());
        txtHoTen.setText(nv.getHoTen());
        txtEmail.setText(nv.getEmail());
        rdoTP.setSelected(nv.isVaiTro());
        rdoNV.setSelected(!nv.isVaiTro());
    }

    private void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.txtXacNhanMK.setText("");
        this.index = -1;
        this.updateStatus();
    }

    private void edit() {
        String maNV = (String) tblNhanVien.getValueAt(this.index, 0);
        NhanVien nv = dao.selectByID(maNV);
        setForm(nv);
        Tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private void role() {
        if (!Auth.isManager() || this.tblNhanVien.getValueAt(index, 5).equals("Không hoạt động")) {
            this.txtMatKhau.setEditable(false);
            this.txtXacNhanMK.setEditable(false);
            this.txtHoTen.setEditable(false);
            this.txtEmail.setEditable(false);
            this.btnUpdate.setEnabled(false);
            this.rdoNV.setEnabled(false);
            this.rdoTP.setEnabled(false);
        } else {
            this.txtMatKhau.setEditable(false);
            this.txtXacNhanMK.setEditable(false);
            this.txtHoTen.setEditable(true);
            this.txtEmail.setEditable(true);
            this.rdoNV.setEnabled(true);
            this.rdoTP.setEnabled(true);
        }
    }

    private void insert() {
        try {
            NhanVien nv = this.getForm();
            String matKhau2 = new String(txtXacNhanMK.getPassword());
            if (!matKhau2.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
                txtXacNhanMK.requestFocus();
            } else {
                try {
                    this.dao.insert(nv);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.clearForm();
                    MsgBox.alert(this, "Thêm mới thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Thêm mới thất bại");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update() {
        try {
            NhanVien nv = this.getForm();
            String matKhau2 = new String(txtXacNhanMK.getPassword());
            if (!matKhau2.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
                txtXacNhanMK.requestFocus();
            } else {
                try {
                    this.dao.update(nv);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.txtXacNhanMK.setText("");
                    MsgBox.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Cập nhật thất bại");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean check() {
        // Check mã nv
        if (this.txtMaNV.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập mã nhân viên!");
            this.txtMaNV.requestFocus();
            return false;
        } else if (this.txtMaNV.getText().length() < 3) {
            MsgBox.alert(this, "Mã nhân viên phải nhiều hơn 3 ký tự");
            this.txtMaNV.requestFocus();
            return false;
        }

        // Check mật khẩu
        if (this.txtMatKhau.getPassword().length == 0) {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu!");
            this.txtMatKhau.requestFocus();
            return false;
        } else if (this.txtMatKhau.getPassword().length < 3) {
            MsgBox.alert(this, "Mật khẩu phải dài hơn 3 ký tự");
            this.txtMatKhau.requestFocus();
            return false;
        }

        // Check xác nhận mật khẩu
        if (this.txtXacNhanMK.getPassword().length == 0) {
            MsgBox.alert(this, "Vui lòng xác nhận mật khẩu!");
            this.txtXacNhanMK.requestFocus();
            return false;
        }

        // Check họ tên
        if (this.txtHoTen.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập họ và tên!");
            this.txtHoTen.requestFocus();
            return false;
        }

        // Check email
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (this.txtEmail.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập Email!");
            this.txtEmail.requestFocus();
            return false;
        } else if (!this.txtEmail.getText().matches(reEmail)) {
            MsgBox.alert(this, "Email không đúng định dạng");
            this.txtEmail.requestFocus();
            return false;
        }
        return true;
    }

    private boolean checkT() {
        if (this.dao.selectByID(this.txtMaNV.getText()) != null) {
            MsgBox.alert(this, "Mã nhân viên đã tồn tại");
            this.txtMaNV.requestFocus();
            return false;
        }
        return true;
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String maNV = txtMaNV.getText();
            if (maNV.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn !");
            } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này ?")) {
                try {
                    this.dao.delete(maNV);
                    this.fillNhanVienHienTai();
                    this.Tabs.setSelectedIndex(1);
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }

    private void first() {
        this.index = 0;
        this.edit();
    }

    private void prev() {
        if (this.index > 0) {
            this.index--;
            this.edit();
        }
    }

    private void next() {
        if (this.index < this.tblNhanVien.getRowCount() - 1) {
            this.index++;
            this.edit();
        }
    }

    private void last() {
        this.index = tblNhanVien.getRowCount() - 1;
        this.edit();
    }

    private void fillNhanVienHienTai() {
        model.setRowCount(0);
        try {
            list = dao.selectAll();
            for (NhanVien nv : list) {
                model.addRow(new Object[]{nv.getMaNV(), nv.unShowPass(nv.getMatKhau()), nv.getHoTen(), nv.getEmail(),
                    nv.isVaiTro() ? "Trưởng Phòng" : "Nhân Viên", nv.isTrangThai() ? "Đang hoạt động" : "Không hoạt động"});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    private void trangThai() {
//        this.index = this.tblNhanVien.getSelectedRow();
//        if (this.index < 0) {
//            MsgBox.alert(this, "Bạn chưa chọn dòng nào trên table");
//        } else {
//            if (this.tblNhanVien.getValueAt(this.index, 5).equals("Đang hoạt động")) {
//                NhanVien nv = new NhanVien();
//                nv.setMaNV((String) this.tblNhanVien.getValueAt(this.index, 0));
//                this.dao.updateKHD(nv);
//                this.fillNhanVienCu();
//                MsgBox.alert(this, "Cập nhật trạng thái nhân viên thành công");
//            } else if (this.tblNhanVien.getValueAt(this.index, 5).equals("Không hoạt động")) {
//                NhanVien nv = new NhanVien();
//                nv.setMaNV((String) this.tblNhanVien.getValueAt(this.index, 0));
//                this.dao.updateHD(nv);
//                this.fillNhanVienHienTai();
//                MsgBox.alert(this, "Cập nhật trạng thái nhân viên thành công");
//            }
//        }
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == tblNhanVien.getRowCount() - 1);

        // Trạng thái form
        this.txtMaNV.setEditable(!edit);
        this.btnInsert.setEnabled(!edit);
        this.btnUpdate.setEnabled(edit);
        this.btnDelete.setEnabled(edit);

        // Trạng thái điều hướng
        this.btnFirst.setEnabled(edit && !first);
        this.btnPrev.setEnabled(edit && !first);
        this.btnNext.setEnabled(edit && !last);
        this.btnLast.setEnabled(edit && !last);

        // Trạng thái các role
        this.txtMatKhau.setEditable(true);
        this.txtXacNhanMK.setEditable(true);
        this.txtHoTen.setEditable(true);
        this.txtEmail.setEditable(true);
        if (!Auth.isManager()) {
            this.rdoNV.setEnabled(true);
            this.rdoTP.setEnabled(false);
        } else {
            this.rdoTP.setEnabled(true);
            this.rdoNV.setEnabled(true);
        }
    }

}
