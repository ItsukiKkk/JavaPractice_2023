public class testmobile {
    public static void main(String[] args) {
        Card ca = new Card();
        ca.store("���");
        Mobile mo = new Mobile(ca);
        mo.showMessage();
    }
}
