package com.edusys.entity;

public class NhanVien {

    String maNV, matKhau, hoTen, email;
    boolean vaiTro, trangThai;

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String unShowPass(String matKhau) {
        return "**********";
    }

    @Override
    public String toString() {
        return this.maNV;
    }

//    @Override
//    public boolean equals(Object obj) {
//        NhanVien other = (NhanVien) obj;
//        return other.getMaNV().equals(this.getMaNV());
//    }

}
