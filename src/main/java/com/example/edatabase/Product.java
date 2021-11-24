package com.example.edatabase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;
    private String nama_lengkap;
    private String tempat_lahir;
    private String tenggal_lahir;
    private String RT_RW_Dusun;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;
    private String golongan_darah;
    private String kode_pos;
    private String nik;
    private String no_hp;
    private String email;
    private String namaayah;
    private String pekerjaanayah;
    private String namaibu;
    private String pekerjaanibu;
    private String sdmi;
    private String smpmts;
    private String smasmk;
    private String s1;
    private String s2;
    private String keahliansatu;
    private String keahliandua;
    private String prestasisatu;
    private String prestasidua;
    private String prestasitiga;
    private String penyelenggaramakesta;
    private String tahunmakesta;
    private String sertifikatmakesta;
    private String penyelenggaralakmud;
    private String tahunlakmud;
    private String sertifikatlakmud;
    private String penyelenggaralakut;
    private String tahunlakut;
    private String sertifikatlakut;
    private String penyelenggaralatin;
    private String tahunlatin;
    private String sertifikatlatin;
    private String penyelenggaradiklatama;
    private String tahundiklatama;
    private String sertifikatdiklatama;
    private String penyelenggaradiklatmad;
    private String tahundikalmad;
    private String sertifikatdiklatmad;
    private String penyelenggarapelatihan;
    private String namapelatihan;
    private String tahunpelatihan;
    private String sertifikatpelatihan;
    private String penyelenggarapelatihan2;
    private String namapelatihan2;
    private String tahunpelatihan2;
    private String sertifikatpelatihan2;
    protected Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTenggal_lahir() {
        return tenggal_lahir;
    }

    public void setTenggal_lahir(String tenggal_lahir) {
        this.tenggal_lahir = tenggal_lahir;
    }

    public String getRT_RW_Dusun() {
        return RT_RW_Dusun;
    }

    public void setRT_RW_Dusun(String RT_RW_Dusun) {
        this.RT_RW_Dusun = RT_RW_Dusun;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getGolongan_darah() {
        return golongan_darah;
    }

    public void setGolongan_darah(String golongan_darah) {
        this.golongan_darah = golongan_darah;
    }

    public String getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    public String getPekerjaanayah() {
        return pekerjaanayah;
    }

    public void setPekerjaanayah(String pekerjaanayah) {
        this.pekerjaanayah = pekerjaanayah;
    }

    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    public String getPekerjaanibu() {
        return pekerjaanibu;
    }

    public void setPekerjaanibu(String pekerjaanibu) {
        this.pekerjaanibu = pekerjaanibu;
    }

    public String getSdmi() {
        return sdmi;
    }

    public void setSdmi(String sdmi) {
        this.sdmi = sdmi;
    }

    public String getSmpmts() {
        return smpmts;
    }

    public void setSmpmts(String smpmts) {
        this.smpmts = smpmts;
    }

    public String getSmasmk() {
        return smasmk;
    }

    public void setSmasmk(String smasmk) {
        this.smasmk = smasmk;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getKeahliansatu() {
        return keahliansatu;
    }

    public void setKeahliansatu(String keahliansatu) {
        this.keahliansatu = keahliansatu;
    }

    public String getKeahliandua() {
        return keahliandua;
    }

    public void setKeahliandua(String keahliandua) {
        this.keahliandua = keahliandua;
    }

    public String getPrestasisatu() {
        return prestasisatu;
    }

    public void setPrestasisatu(String prestasisatu) {
        this.prestasisatu = prestasisatu;
    }

    public String getPrestasidua() {
        return prestasidua;
    }

    public void setPrestasidua(String prestasidua) {
        this.prestasidua = prestasidua;
    }

    public String getPrestasitiga() {
        return prestasitiga;
    }

    public void setPrestasitiga(String prestasitiga) {
        this.prestasitiga = prestasitiga;
    }

    public String getPenyelenggaramakesta() {
        return penyelenggaramakesta;
    }

    public void setPenyelenggaramakesta(String penyelenggaramakesta) {
        this.penyelenggaramakesta = penyelenggaramakesta;
    }

    public String getTahunmakesta() {
        return tahunmakesta;
    }

    public void setTahunmakesta(String tahunmakesta) {
        this.tahunmakesta = tahunmakesta;
    }

    public String getSertifikatmakesta() {
        return sertifikatmakesta;
    }

    public void setSertifikatmakesta(String sertifikatmakesta) {
        this.sertifikatmakesta = sertifikatmakesta;
    }

    public String getPenyelenggaralakmud() {
        return penyelenggaralakmud;
    }

    public void setPenyelenggaralakmud(String penyelenggaralakmud) {
        this.penyelenggaralakmud = penyelenggaralakmud;
    }

    public String getTahunlakmud() {
        return tahunlakmud;
    }

    public void setTahunlakmud(String tahunlakmud) {
        this.tahunlakmud = tahunlakmud;
    }

    public String getSertifikatlakmud() {
        return sertifikatlakmud;
    }

    public void setSertifikatlakmud(String sertifikatlakmud) {
        this.sertifikatlakmud = sertifikatlakmud;
    }

    public String getPenyelenggaralakut() {
        return penyelenggaralakut;
    }

    public void setPenyelenggaralakut(String penyelenggaralakut) {
        this.penyelenggaralakut = penyelenggaralakut;
    }

    public String getTahunlakut() {
        return tahunlakut;
    }

    public void setTahunlakut(String tahunlakut) {
        this.tahunlakut = tahunlakut;
    }

    public String getSertifikatlakut() {
        return sertifikatlakut;
    }

    public void setSertifikatlakut(String sertifikatlakut) {
        this.sertifikatlakut = sertifikatlakut;
    }

    public String getPenyelenggaralatin() {
        return penyelenggaralatin;
    }

    public void setPenyelenggaralatin(String penyelenggaralatin) {
        this.penyelenggaralatin = penyelenggaralatin;
    }

    public String getTahunlatin() {
        return tahunlatin;
    }

    public void setTahunlatin(String tahunlatin) {
        this.tahunlatin = tahunlatin;
    }

    public String getSertifikatlatin() {
        return sertifikatlatin;
    }

    public void setSertifikatlatin(String sertifikatlatin) {
        this.sertifikatlatin = sertifikatlatin;
    }

    public String getPenyelenggaradiklatama() {
        return penyelenggaradiklatama;
    }

    public void setPenyelenggaradiklatama(String penyelenggaradiklatama) {
        this.penyelenggaradiklatama = penyelenggaradiklatama;
    }

    public String getTahundiklatama() {
        return tahundiklatama;
    }

    public void setTahundiklatama(String tahundiklatama) {
        this.tahundiklatama = tahundiklatama;
    }

    public String getSertifikatdiklatama() {
        return sertifikatdiklatama;
    }

    public void setSertifikatdiklatama(String sertifikatdiklatama) {
        this.sertifikatdiklatama = sertifikatdiklatama;
    }

    public String getPenyelenggaradiklatmad() {
        return penyelenggaradiklatmad;
    }

    public void setPenyelenggaradiklatmad(String penyelenggaradiklatmad) {
        this.penyelenggaradiklatmad = penyelenggaradiklatmad;
    }

    public String getTahundikalmad() {
        return tahundikalmad;
    }

    public void setTahundikalmad(String tahundikalmad) {
        this.tahundikalmad = tahundikalmad;
    }

    public String getSertifikatdiklatmad() {
        return sertifikatdiklatmad;
    }

    public void setSertifikatdiklatmad(String sertifikatdiklatmad) {
        this.sertifikatdiklatmad = sertifikatdiklatmad;
    }

    public String getPenyelenggarapelatihan() {
        return penyelenggarapelatihan;
    }

    public void setPenyelenggarapelatihan(String penyelenggarapelatihan) {
        this.penyelenggarapelatihan = penyelenggarapelatihan;
    }

    public String getNamapelatihan() {
        return namapelatihan;
    }

    public void setNamapelatihan(String namapelatihan) {
        this.namapelatihan = namapelatihan;
    }

    public String getTahunpelatihan() {
        return tahunpelatihan;
    }

    public void setTahunpelatihan(String tahunpelatihan) {
        this.tahunpelatihan = tahunpelatihan;
    }

    public String getSertifikatpelatihan() {
        return sertifikatpelatihan;
    }

    public void setSertifikatpelatihan(String sertifikatpelatihan) {
        this.sertifikatpelatihan = sertifikatpelatihan;
    }

    public String getPenyelenggarapelatihan2() {
        return penyelenggarapelatihan2;
    }

    public void setPenyelenggarapelatihan2(String penyelenggarapelatihan2) {
        this.penyelenggarapelatihan2 = penyelenggarapelatihan2;
    }

    public String getNamapelatihan2() {
        return namapelatihan2;
    }

    public void setNamapelatihan2(String namapelatihan2) {
        this.namapelatihan2 = namapelatihan2;
    }

    public String getTahunpelatihan2() {
        return tahunpelatihan2;
    }

    public void setTahunpelatihan2(String tahunpelatihan2) {
        this.tahunpelatihan2 = tahunpelatihan2;
    }

    public String getSertifikatpelatihan2() {
        return sertifikatpelatihan2;
    }

    public void setSertifikatpelatihan2(String sertifikatpelatihan2) {
        this.sertifikatpelatihan2 = sertifikatpelatihan2;
    }
}
