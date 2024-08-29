public class TipeDataString {
    public static void main(String[] args) {

        // perbedaan primitve non primitive
        // di non primitive bisa di assign value null
        // di primitive tidak bisa

        String FirstName = "Jeshua";
        String LastName = "Matthew";
        int angaka = 10;

        // teknik concat
        // cara 1 :
        // String FullName = FirstName + " " + LastName;

        // cara 2 :
        // menggunakan method bawaan string
        // setiap variable non primitive memiliki method bawaan

        String FullName = FirstName.concat(" ").concat(LastName);

        System.out.println(FullName);
    }
}
