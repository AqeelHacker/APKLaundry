
package AplikasiLaundry;


import java.util.ArrayList;

public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> nomorTelepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){
        this.namaPetugas.add("Dwi");
        this.alamat.add("Pakis");
        this.nomorTelepon.add("\t0888928999766");
        this.jabatan.add(0);    
        
        this.namaPetugas.add("Fafa");
        this.alamat.add("Mburing");
        this.nomorTelepon.add("\t089877588181");
        this.jabatan.add(1);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlPetugas(){
        return this.jabatan.size();
    }

    
    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);   
    }
     @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }
    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }
    @Override
    public String getTelepon(int idPetugas) {
        return this.nomorTelepon.get(idPetugas);
    }
    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }
    
    
}
