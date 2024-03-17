
package AplikasiLaundry;
    
    
public class Laporan {
 
    public void laporan(JenisLaundry JenisLaundry){
        int x = JenisLaundry.getJmlLaundry();
        
        System.out.println("================================================");
        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println();
        System.out.println("Kode \tJenis Laundry \tDurasi(menit) \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1) + "\t" + JenisLaundry.getJenisLaundry(i) + "\t" +
                    JenisLaundry.getDurasi(i) + "\t\t" + JenisLaundry.getHarga(i));
        }
        System.out.println("================================================");
    }
    
    public void laporan(Client client){
        int x = client.getJmlClient();
        
        System.out.println("================================================");
        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Id \tNama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1) + "\t" + client.getNama(i) + "\t" + 
                    client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" +
                    client.getSaldo(i));
        }
        System.out.println("================================================");
    }
    public void laporan(Petugas petugas){
        int x = petugas.getJmlPetugas();
        
        System.out.println("================================================");
        System.out.println("\nYang bertugas melayani anda");
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.println("Id \tNama Petugas \tAlamat \t\tTelepon \tJabatan");
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1) + "\t" + petugas.getNama(i) + "\t\t" + 
                    petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t" +
                    petugas.getJabatan(i));
        }
        System.out.println("================================================");
    }
    
    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){
        int x = transaksi.getJmlTransaksi();
        
        System.out.println("================================================");
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis Laundry \tQty \tHarga \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t" +
                    transaksi.getBanyaknya(i) + "\t" + jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "\t"
            + jumlah);
        }
        System.out.println("Total Omset = " + total);
        System.out.println("");
        System.out.println("================================================");
    }
}

