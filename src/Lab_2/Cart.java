package Lab_2;

public class Cart {
    public static final int max_number_orders = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[max_number_orders];
    private int quantityOrdered = 0;


//    Thêm một DVD mới vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantityOrdered < max_number_orders) {
            itemOrdered[quantityOrdered] = disc;
            quantityOrdered++;
            System.out.println("Da them " + disc.getTitle() + " vao gio hang");
        }
        else {
            System.out.println("Gio hang da dat gioi han toi da");
        }
    }

//Xóa DVD ra khỏi giỏ hàng
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//        if(quantityOrdered == 0) {
//            System.out.println("Khong tim thay san pham nao trong gio hang");
//        }
//        else {
//
//            for (int i = 0; i < quantityOrdered; i++) {
//                if (itemOrdered[i].equals(disc)) {
//                    for (int j = quantityOrdered - 1; j > i; j--) {
//                        itemOrdered[j] = itemOrdered[j - 1];
//                        itemOrdered[j - 1] = null;
//                    }
//                    quantityOrdered--;
//                    System.out.println("Da xoa " + disc.getTitle() + "khoi gio hang");
//                    break;
//                }
//            }
//            System.out.println("Khong tim thay san pham phu hop trong gio hang");
//        }
//    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantityOrdered == 0) {
            System.out.println("Không tìm thấy sản phẩm nào trong giỏ hàng");
            return;
        }

        boolean found = false;
        for (int i = 0; i < quantityOrdered; i++) {
            if (itemOrdered[i] != null && itemOrdered[i].equals(disc)) {
                found = true;
                // Di chuyển các phần tử sang trái
                for (int j = i; j < quantityOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                // Đặt phần tử cuối là null
                itemOrdered[quantityOrdered - 1] = null;
                quantityOrdered--;
                System.out.println("Đã xóa " + disc.getTitle() + " khỏi giỏ hàng");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm phù hợp trong giỏ hàng");
        }
    }


    // Trả về tổng giá trị đơn hàng
    public float totalCost(){
        float total = 0;
        for (int i = 0; i < quantityOrdered; i++) {
            if (itemOrdered[i] != null) {
                total += itemOrdered[i].getCost();
            }
        }
        return total;
    }

// Trả về tổng các sản phẩm có trong đơn hàng
    public void showAllOrderInfo(){
        for(int i = 0; i < quantityOrdered; i++){
            if(quantityOrdered == 0){
                System.out.println("Khong ton tai san pham nao trong gio hang");
            }
            else {
                System.out.println("San pham thu " + (i+1) + ": " + itemOrdered[i].showAllInformation());
            }
        }
    }
}
