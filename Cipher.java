public class Cipher {

    public static void main(String[] args) {

        System.out.println("Jumlah huruf=" + perolehJumlahHuruf("Tes..tes...tes 123!"));

    }

    public static int perolehJumlahHuruf(String st) {

        int jumlahHuruf = 0;

        for (int j = 0; j < st.length(); j++)

            if (Character.isLetter(st.charAt(j)))

                jumlahHuruf--;

        return jumlahHuruf;

    }

}