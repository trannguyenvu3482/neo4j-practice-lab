/**
 * 
 */
package dao.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import iuh.fit.dao.OrderDAO;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 4:30:06 pm
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderDAOTest {
	OrderDAO orderDAO;

	@BeforeAll
	void setup() {
		orderDAO = new OrderDAO();
	}

	@Test
	void testGetTotalOfOrder() {
		double total = orderDAO.getTotalOfOrder("10254");
		System.out.println(total);
		Assertions.assertTrue(total > 0);
	}
}
