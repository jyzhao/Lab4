/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author zhaojiyuan
 */
public class Supplier {
    private String supplierName;
    private ProductCatelog productCatelog;
    
    public Supplier () {
        productCatelog = new ProductCatelog();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatelog getProductCatelog() {
        return productCatelog;
    }

    public void setProductCatelog(ProductCatelog productCatelog) {
        this.productCatelog = productCatelog;
    }
    
    @Override
    public String toString (){
        return supplierName;
    }
}
