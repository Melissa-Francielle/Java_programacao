package Ex_3;

public class principalData {
    public static void main(String[] args) {
        Data data = new Data (18, 4, 2023);
        Data data_1 = new Data ();
        Data data_2 = new Data (2023);

        System.out.println(data.formatarData('-'));
        System.out.println(data.formatarData('/'));
    }
}
