package Lab_3;

public class Aims {
    public static void main(String[] args) {
        System.out.println("Chuong trinh bat dau");
        Cart cart = new Cart();

        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(disc1);

        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(disc2);

        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(disc3);

        cart.removeDigitalVideoDisc(disc1);
        cart.removeDigitalVideoDisc(disc1);


        System.out.println("Tong gia tri cua gio hang la: "+ cart.totalCost());
        cart.showAllOrderInfo();
    }

}
