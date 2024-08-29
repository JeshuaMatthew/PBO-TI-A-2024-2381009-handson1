public class TipeDataNumber {
    public static void main(String[] args) {
        byte tipeDataByte = 127; // deklarasi dan inisialisasi
        short tipeDataShort = 32767;
        int tipeDataInt = 2147483647;

        // bisa juga di deklarasi menggunakan 10 saja
        // namun penggunaan L di ujung value tersebut digunakan untuk mempermudah pembacaan

        long tipeDataLong = 10L;

        // harus menggunakan f di ujung value tipe data float
        float tipeDataFloat = 3.4F;
        double tipeDataDouble = 3.4;

        int decimalInt = 20;
        int Hexinteger = 0xff; // untuk hexadecimal
        int binInteger = 0b0101; // untuk biner

        System.out.println(binInteger);

        // underscore tidak mengubah value dari variable tersebut
        // digunakan untuk mempermudah pembacaan

        int jumlahUang = 1_000_000;
    }

}
