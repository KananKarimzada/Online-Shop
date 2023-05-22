package onlineShop;

public interface ProductManagementService {
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
