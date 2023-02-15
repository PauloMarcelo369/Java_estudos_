package entities;

public class OrderItem {

    private Integer quantity;
    private product Product;
    
    public OrderItem(Integer quantity, product product) {
        this.quantity = quantity;
        Product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public product getProduct() {
        return Product;
    }
    public void setProduct(product product) {
        Product = product;
    }

    public Double subTotal(){
        return quantity * Product.getPrice();
    }

    public String toString() {
		return Product.getItem() 
				+ ", $" 
				+ String.format("%.2f", Product.getPrice()) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

}
