/**
 * 
 */
package iuh.fit.dao;

import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

import iuh.fit.util.AppUtils;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 4:19:13 pm
 */
public class OrderDAO {
	private Driver driver;

	public OrderDAO() {
		this.driver = AppUtils.getDriver();
	}

	public double getTotalOfOrder(String orderID) {
		String query = "MATCH (o:Order)-[r:ORDERS]->(p:Product) where o.orderID= $orderID RETURN sum(toFloat(r.unitPrice)*r.quantity) as total";
		Map<String, Object> params = Map.of("orderID", orderID);

		try (Session session = driver.session()) {
			return session.executeRead(tx -> {
				Result result = tx.run(query, params);
				return result.single().get("total").asDouble();
			});
		}
	}
}
