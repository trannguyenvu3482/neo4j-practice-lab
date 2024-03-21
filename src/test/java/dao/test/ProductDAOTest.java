/**
 * 
 */
package dao.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import iuh.fit.dao.ProductDAO;
import iuh.fit.entity.Product;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 3:46:53 pm
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ProductDAOTest {
	ProductDAO productDAO;

	@BeforeAll
	void setup() {
		productDAO = new ProductDAO();
	}

	@Test
	void testGetListProductBySupplierName() {
		List<Product> listProducts = productDAO.getListProductBySupplierName("G'day");

		Assertions.assertNotNull(listProducts);
		Assertions.assertTrue(listProducts.size() > 0);
	}

	@Test
	void testFindHighestPriceProducts() {
		List<Product> listProducts = productDAO.findHighestPriceProducts();

		Assertions.assertNotNull(listProducts);
		Assertions.assertTrue(listProducts.size() > 0);
	}
}
