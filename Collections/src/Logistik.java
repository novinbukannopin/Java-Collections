/**
 *
 * @author NAUFAL RAKHASHEVA
 */
import java.util.*;

public class Logistik
{
    public static void main(String[] args)
    {
        int a, b, c , d , n, i, ulang;
        Scanner input = new Scanner(System.in);
        String data [][] = new String [100][5];
        int kode [] = new int [100];
        a = 0;
        b= 0;
        System.out.println(" ===== PENDATAAN PERUSAHAAN LOGISTIK ===== \n\n");
        do
        {
            n = jumlah();
            c = 1 + b;
            d = b + n;

            for (i = c; i <= d ; i++ )
            {
                a++;
                System.out.print(" === Data barang "+ i +" ===");
                System.out.print(" \n\n");
                System.out.print(" Masukkan Kode Pengiriman = ");
                kode [i] = input.nextInt();
                System.out.print(" Masukkan nama pengirim (Jika ada Spasi diganti _) = ");
                data [i][1] = input.next();
                System.out.print(" Masukkan nama penerima (Jika ada Spasi diganti _) = ");
                data [i][2] = input.next();
                System.out.print(" Masukkan kota pengirim (Jika ada Spasi diganti _) = ");
                data [i][3] = input.next();
                System.out.print(" Masukkan kota penerima (Jika ada Spasi diganti _) = ");
                data [i][4] = input.next();
            }
            b = d;

            System.out.print(" Apakah anda ingin menginputkan lagi? (y/t) ");
            ulang = input.next().charAt(0);
            System.out.print(" \n\n");
        }
        while ((ulang != 't') && (ulang !='T'));
        {
            for (i=1 ;i <= d ;i++ )
            {
                System.out.print( " === Info data barang "+  i + " ===");
                System.out.print( " \n\n");
                System.out.print( " Kode pengiriman = " + kode[i] + "\n" );
                System.out.print( " Nama pengirim = " + data[i][1] + "\n");
                System.out.print( " Nama penerima = " + data[i][2] + "\n");
                System.out.print( " Kota pengirim = " + data[i][3] + "\n");
                System.out.print( " Kota penerima = " + data[i][4] + "\n");
                System.out.print(" \n");
            }
        }
    }
    public static int jumlah()
    {
        int jml;
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan jumlah barang = ");
        jml = input.nextInt();
        System.out.print(" \n\n");
        return jml;
    }
}






