/**
 * 
 */
package iuh.fit.dao;

import java.util.Map;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

import iuh.fit.util.AppUtils;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 4:07:30 pm
 */
public class CustomerDAO {
	private Driver driver;

	public CustomerDAO() {
		this.driver = AppUtils.getDriver();
	}

	/**
	 * 4. Thống kê số khách hàng theo từng thành phố (sắp xếp theo số khách hàng /
	 * theo city).
	 *
	 * @return the number customers by city
	 */
	public Map<String, Integer> getNumberCustomersByCity() {
		String query = "MATCH (c:Customer) RETURN c.city as city, COUNT(c.customerID) as countCustomer";

		try (Session session = driver.session()) {
			return session.executeRead(tx -> {
				Result result = tx.run(query);
				return result.stream()
						.collect(Collectors.toMap(p -> p.get("city").asString(), p -> p.get("countCustomer").asInt()));
			});
		}
	}

	public void close() {
		driver.close();
	}
}
