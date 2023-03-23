package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.model.product.Product;
import rikkei.academy.service.productService.ProductManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = 0;
        do{
            System.out.println("*************MENU*************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("0. Thoát");
            choice = Config.scanner().nextInt();
            switch (choice){
                case 1:productManager.createProduct();
                    break;
                case 2:productManager.editProduct();
                    break;
                case 3:productManager.deleteProduct();
                    break;
                case 4:productManager.displayProduct();
                    break;
                case 5:productManager.searchProduct();
                    break;
                case 6:productManager.shortProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }while (choice!=0);
    }
}
