public class TestBook {
    public static void main(String[] args) {
        Buku[] bukubuku = new Buku[3];

        Buku buku0 = new Buku();
        bukubuku[0] = buku0;
        bukubuku[0].judul = "Introduction to Java Programming and Data Structures";
        bukubuku[0].penulis = "Daniel Liang";
        bukubuku[0].harga = 355000;

        Buku buku1 = new Buku();
        bukubuku[1] = buku1;
        bukubuku[1].judul = "Advanced Java Programming";
        bukubuku[1].penulis = "Uttam Roy";
        bukubuku[1].harga = 236250;

        Buku buku2 = new Buku();
        bukubuku[2] = buku2;
        bukubuku[2].judul = "Practical Java Programming";
        bukubuku[2].penulis = "Perry Xiao";
        bukubuku[2].harga = 95000;

        for (int i=0; i<3; i++){
            bukubuku[i].harga += (bukubuku[i].harga/10);
        }

        for (int i=0; i<3; i++){
            System.out.println("Judul\t: " + bukubuku[i].judul);
            System.out.println("Penulis\t: " + bukubuku[i].penulis);
            System.out.println("Harga\t: Rp." + bukubuku[i].harga);
        }
    }
}
