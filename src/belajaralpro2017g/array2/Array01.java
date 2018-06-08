package belajaralpro2017g.array2;

public class Array01 {
    //mendefenisikan array + isi data
    private String[] nama = new String[]{"Budi", "Candra", "Eka"};
    //mendefinisikan array +kapasitas
    private String[] buah = new String[10];
    //array 2 dimensi + isi data
    private int[][] matriks = new int[][]{
        {1, 2, 3, 4, 6},
        {6, 7, 1, 12, 7},
        {5, 67, 65, 10, 1}
    };
    //array 2 dimensi + kapasitas
    private String[][] bunga = new String[2][4];
    
    public static void main(String[] args) {
        Array01 arr = new Array01();
        //mengakses array secara langsung
        System.out.println("Nama ke-2: "+arr.nama[1]);
        System.out.println("Nilai matris baris ke-2, col 1: "+arr.matriks[1][0]);
        //menambahkan atau mengubah data array        
        arr.buah[0] = "Mangga";
       arr.buah[1] = "Durian";
       arr.buah[9] = "Durian";
       arr.nama[0] = "Andi";
    }
}
