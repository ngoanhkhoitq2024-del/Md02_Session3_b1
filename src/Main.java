import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== NHẬP THÔNG TIN HÓA ĐƠN =====");
        System.out.print("Tên khách hàng: ");
        String customerName = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng mua: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Thẻ thành viên (true/false): ");
        boolean isMember = scanner.nextBoolean();

        double total = price * quantity;
        double discount = isMember ? (total * 0.1) : 0;
        double moneyVAT = total * 0.08;
        double payment = (total - discount + moneyVAT);

        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.printf("Khách hàng: %s\n", customerName);
        System.out.printf("Sản phẩm: %s\n", productName);
        System.out.printf("Giá: %,.2f VNĐ\n", price);
        System.out.printf("Số lượng: %s\n", quantity);
        System.out.printf("Thành tiền: %,.2f VNĐ\n", total);
        System.out.printf("Giảm giá thành viên (10%%): %,.2f VNĐ\n", discount);
        System.out.printf("Tiền VAT (8%%): %,.2f VNĐ\n", moneyVAT);
        System.out.printf("Tổng tiền thanh toán: %,.2f VNĐ\n", payment);
        System.out.println("===================================");
    }
}