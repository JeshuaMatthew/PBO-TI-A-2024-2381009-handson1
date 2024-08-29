public class tipeDataArray {
    public static void main(String[] args) {
        // array adalah sekumpulan data yang memiliki tipe data yang sama

        //cara 1 :
        int[] kumpulanNumber; // deklarasi
        kumpulanNumber = new int[3]; // inisialisasi

        // cara 2 :

        int[] kumpulanNumber2 = new int[3];

        //cara 3:
        int[]  kumpulanNumber3 = new int[]{1,2,3,4,5};

        // cara memasukkan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = 200;
        kumpulanNumber[2] = 300;

        // cara mengakses
        System.out.println(kumpulanNumber[0]);

        // arrayname.length untuk mengecek size arraynya

        System.out.println(kumpulanNumber[1]);

        // object adalah parent dari semua tipe data
        // makanya array dari object bisa menyimpan beberapa tipe data
        Object[] KumpulanData = new Object[3];

        KumpulanData[0] = "Jeshua";
        KumpulanData[1] = 100;
        KumpulanData[2] = 'c';

        for(int i = 0; i < KumpulanData.length; i++){
            System.out.println(KumpulanData[i]);
        }



    }
}
