import java.util.Scanner;

public class datawargakancil {
    public void warga1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------oOo----------------");
        System.out.println("*** Data Warga ***");

        System.out.println("Masukan Nama : ");
        String nama = sc.nextLine();
        System.out.println("Masukan NIK : ");
        String nik = sc.nextLine();
        System.out.println("Masukan Alamat : ");
        String alamat = sc.nextLine();
        System.out.println("Masukan Telepon : ");
        String telepon = sc.nextLine();
        System.out.println("---------------oOo----------------");
        System.out.println("**** Data Pekerjaan ****");
        System.out.println("Masukan Pekerjaan : ");
        String pekerjaan = sc.nextLine();
        System.out.println("Masukan Alamat Kantor : ");
        String alamatkantor = sc.nextLine();
        System.out.println("---------------oOo----------------");
        System.out.println("**** Data Status ****");
        System.out.println("Masukan Status : ");
        String status = sc.nextLine();
        System.out.println("Masukan Nama Suami/Istri : ");
        String namasuamiistri = sc.nextLine();
        System.out.println("Masukan Jumlah Anak : ");
        String jumlah = sc.nextLine();

        System.out.println("Lanjut Bayar Iuran ?");
        String lanjutan = sc.nextLine();
        System.out.println();
    }
        public void warga2() {
        Scanner sc = new Scanner(System.in);
        int total,iuransampah,iurankeamanan,sumbangan;
        String nik = "23100879";

        System.out.println("---------------oOo----------------");
        System.out.println("*** Data Iuran Pokok ***");
        System.out.println("NIK =>"+nik);
        System.out.println("Masukan Iuran Sampah ");
        iuransampah = sc.nextInt();
        System.out.println("Masukan Iuran Keamanan ");
        iurankeamanan = sc.nextInt();
        System.out.println();        

        System.out.println("*** Data Iuran Sekunder ***");
        System.out.println("Masukan Sumbangan ");
        sumbangan = sc.nextInt();
        System.out.println("Lanjut Bayar Iuran ?");
        System.out.println("tidak");

        total = iuransampah+iurankeamanan+sumbangan;

        System.out.println(); 
        System.out.println("||NIK                               ||  23100879");
        System.out.println("||Total Pembyaran Iuran Warga       || Rp." +total+"");
        System.out.println("Terimakasih Hardiyanto Iuran sudah di Bayarkan"); 


    }
} 
