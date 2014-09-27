/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class ProductCatelog {

    private ArrayList<Product> productList;

    public ProductCatelog() {
        productList = new ArrayList<Product>();

    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Product addProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public Product searchProductByID(int id) {
        for (Product product : productList) {
            if (product.getModelID() == id) {
                return product;
            }
        }
        return null;

    }
}
