public class ProductMgmt {
    public static void main(String[] args)throws java.io.IOException {
        Product [] product = new Product[6]; // 상품들의 정보가 저장될 공간
        java.util.Scanner sc = new java.util.Scanner(new java.io.File("src/product.dat"));

        for (int i = 0; i < 6; i++) {
            product[i] = new Product(); // 상품생성
            String line = sc.nextLine();// "NOTEBOOK"	"36000"	"5000"	"4700"	"2000"

            String [] array = line.split("\\s+");
            product[i].productName = array[0].trim(); // 이름
            product[i].quantity = Integer.parseInt(array[1].trim()); // 수량
            product[i].sellingPrice = Integer.parseInt(array[2].trim()); // 판매단가
            product[i].purchasePrice = Integer.parseInt(array[3].trim()); // 매입단가
            product[i].shippingPrice = Integer.parseInt(array[4].trim()); // 운송료
        }
        int j = 0;
        while (j < 6) {
            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d%n",
                    product[j].productName, product[j].quantity,
                    product[j].sellingPrice, product[j].purchasePrice,
                    product[j].shippingPrice);
            j++;
        }
    }


}
