public class Main {
    public static void main(String[] args) {
        Book death = new Book("Death Note, Vol. 1: Boredom", " Tsugumi Ohba");
        Book onePiece = new Book("One Piece, Volume 1: Romance Dawn", "Eiichiro Oda");
        Book naruto = new Book("Naruto, Vol. 1: Uzumaki Naruto", " Masashi Kishimoto");
        Book bleach = new Book("Bleach, Vol. 1 ", " Tite Kubo");
        System.out.println("Books Available in Library: " + death.getName() + "\n" + onePiece.getName() + "\n" + naruto.getName() + "\n" + bleach.getName() + "\n");
        Reader Dilya = new Reader("Dilya Lucifile", 0002, "IT", "12.06.03", "+4915159957622");
        Dilya.takeBook(3);
        Dilya.takeBook(death, naruto, bleach);
        System.out.println();
        Dilya.returnBook(2);
        Dilya.returnBook(naruto, bleach);
    }
}