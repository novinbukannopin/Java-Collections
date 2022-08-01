import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {
        Tree save = new Tree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah inputan ");
        int jumlahinputan = sc.nextInt();
        Node awal = null;
        Node akar = null;
        for (int x = 0; x < jumlahinputan; x++) {
            System.out.println("Masukkan angka ");
            int inputangka = sc.nextInt();
            if (awal == null) {
                awal = new Node(inputangka);
                akar = awal;
                System.out.println("Membuat pohon dengan akar atau angka awal = " + akar.angka);
            } else {
                save.input(akar, inputangka);
            }
        }
    }

    public void input(Node node, int angka) {
        if (angka < node.angka) {
            if (node.kiri == null) {
                System.out.println(" memasukkan " + angka + " ke kiri dari " + node.angka);
                node.kiri = new Node(angka);
            } else {
                input(node.kiri, angka);
            }
        } else if (angka >= node.angka) {
            if (node.kanan == null) {
                System.out.println("  memasukkan " + angka + " ke kanan dari " + node.angka);
                node.kanan = new Node(angka);
            } else {
                input(node.kanan, angka);
            }
        }
    }
}
