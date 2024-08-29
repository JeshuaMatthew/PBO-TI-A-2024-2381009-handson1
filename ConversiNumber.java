public class ConversiNumber {
    public static void main(String[] args) {

        // widening conversion (otomatis)
        // memindahkan value dari tipe data kecil ke tipe data besar

        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        // narrowing conversion (manual)
        // memindahkan value dari tipe data besar ke tipe data kecil

        int tipeDataInt2 = 231;

        //note : bisa overflow

        byte tipeDataByte2 = (byte) tipeDataInt2;
        System.out.println(tipeDataByte2);
    }
}
