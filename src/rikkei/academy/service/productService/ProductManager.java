package rikkei.academy.service.productService;

import rikkei.academy.config.Config;
import rikkei.academy.model.product.Product;
import rikkei.academy.view.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements IProduct{
public static ArrayList<Product> products = new ArrayList<>();

static {
    products.add(new Product(1,"hoa",1,19,"red"));
    products.add(new Product(2,"hong",1,13,"red"));
    products.add(new Product(3,"long",1,11,"red"));
}

    @Override
    public void createProduct() {
        System.out.println("Nhập id cho sản phẩm : ");
        int id = Config.scanner().nextInt();
        System.out.println("Nhập tên cho sản phẩm : ");
        String name = Config.scanner().nextLine();
        System.out.println("Nhập số lượng cho sản phẩm : ");
        long quantity = Config.scanner().nextLong();
        System.out.println("Nhập giá cho sản phẩm : ");
        double price = Config.scanner().nextDouble();
        System.out.println("Nhập màu cho sản phẩm : ");
        String color = Config.scanner().nextLine();
       Product product = new Product(id,name,quantity,price,color);
        products.add(product);
        System.out.println("Thêm sản phẩm thành công !");
    }
    public static int fineIndexById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void editProduct() {
        System.out.println("Nhập id của sản phẩm cần sửa :");
        int id = Config.scanner().nextInt();
        int index = fineIndexById(id);
        if(index!=-1){
            System.out.println("Nhập tên cho sản phẩm : ");
            String name = Config.scanner().nextLine();
            System.out.println("Nhập số lượng cho sản phẩm : ");
            long quantity = Config.scanner().nextLong();
            System.out.println("Nhập giá cho sản phẩm : ");
            double price = Config.scanner().nextDouble();
            System.out.println("Nhập màu cho sản phẩm : ");
            String color = Config.scanner().nextLine();
            Product product = new Product(id,name,quantity,price,color);
            products.set(index,product);
            System.out.println("Sửa sản phẩm thành công !");
        }else {
            System.err.println("Id sản phẩm không tồn tại !!!");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập id của sản phẩm cần xóa :");
      int id = Config.scanner().nextInt();
      int index = fineIndexById(id);
      if(index!=-1){
          products.remove(index);
          System.out.println("Xóa sản phẩm thành công !");
      }else {
          System.err.println("Id sản phẩm không tồn tại !!!");
      }
    }

    @Override
    public void displayProduct() {
     if(products.size()==0){
         System.err.println("Không có sản phẩm nào !!!");
     }else {
         System.out.println(products);
     }
    }

    @Override
    public void searchProduct() {
        List<Product> result = new ArrayList<>();
        System.out.println("Nhập tên sản phẩm cần tìm kiếm :");
       String searchName = Config.scanner().nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(searchName)){
                result.add(products.get(i));
            }
        }
     if(result.size()==0){
         System.err.println("Không tìm thấy sản phẩm nào có tên " + searchName +" !!!");
     }else {
         System.out.println("Sản phẩm đó là : " + result);
     }

    }

    @Override
    public void shortProduct() {
        System.out.println("Danh sách tăng dần");
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        System.out.println("Danh sách giảm dần");
       Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
      }
    }
}
