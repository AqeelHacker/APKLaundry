
package AplikasiLaundry;

public class Main {

    public static void main(String[] args) {
        JenisLaundry jenisLaundry = new JenisLaundry();
        Transaksi transaksi = new Transaksi ();
        Client client = new Client();
        Petugas petugas = new Petugas();
        Laporan laporan = new Laporan ();
        
        laporan.laporan(jenisLaundry);
        laporan.laporan(client);
        laporan.laporan(petugas);
        laporan.laporan(transaksi, jenisLaundry);
        
        transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
        
        laporan.laporan(transaksi, jenisLaundry);
        laporan.laporan(jenisLaundry);
        laporan.laporan(client);
        laporan.laporan(petugas);
    }
    
}