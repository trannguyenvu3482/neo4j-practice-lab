/**
 * 
 */
package iuh.fit.dao;

import java.util.List;
import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

import iuh.fit.entity.Product;
import iuh.fit.util.AppUtils;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 3:45:26 pm
 */
public class ProductDAO {
	private Driver driver;

	public ProductDAO() {
		this.driver = AppUtils.getDriver();
	}

	/**
	 * 2. Tìm các sản phẩm được cung cấp bởi một nhà cung cấp nào đó khi biết tên
	 * nhà cung cấp
	 *
	 * @param supplierName the supplier name
	 * @return the list product by supplier name
	 */
	public List<Product> getListProductBySupplierName(String supplierName) {
		String query = "MATCH (s:Supplier)-[r:SUPPLIES]->(p:Product) WHERE s.companyName = $companyName return p";
		Map<String, Object> params = Map.of("companyName", supplierName);

		try (Session session = driver.session()) {
			return session.executeRead(tx -> {
				Result result = tx.run(query, params);
				return result.stream().map(Record -> Record.get("p").asNode())
						.map(node -> AppUtils.nodeToPOJO(node, Product.class)).toList();
			});
		}
	}

	/**
	 * 3. Tìm danh sách sản phẩm có giá cao nhất.
	 *
	 * @return the list
	 */
	public List<Product> findHighestPriceProducts() {
		String query = "MATCH (p:Product) WITH max(p.unitPrice) as maxPrice MATCH (p:Product) WHERE p.unitPrice = maxPrice return p";

		try (Session session = driver.session()) {
			return session.executeRead(tx -> {
				Result result = tx.run(query);
				return result.stream().map(Record -> Record.get("p").asNode())
						.map(node -> AppUtils.nodeToPOJO(node, Product.class)).toList();
			});
		}
	}

	public void close() {
		driver.close();
	}
}
