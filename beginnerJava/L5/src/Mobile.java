public class Mobile {
    private double size;
    private double price;
    private Card simCard;

    public Mobile(Card card) {
        simCard = card;
    }

    public void showMessage() {
        String message = simCard.readCard();
        System.out.println("�ֻ��ϵĶ��������ǣ�" + message);
    }
}