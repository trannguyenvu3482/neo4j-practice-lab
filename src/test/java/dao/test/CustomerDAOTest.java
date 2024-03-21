/**
 * 
 */
package dao.test;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import iuh.fit.dao.CustomerDAO;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 4:13:58 pm
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CustomerDAOTest {
	CustomerDAO customerDAO;

	@BeforeAll
	void setup() {
		customerDAO = new CustomerDAO();
	}

	@Test
	void testGetNumberCustomersByCity() {
		Map<String, Integer> resultMap = customerDAO.getNumberCustomersByCity();

		System.out.println(resultMap);
		Assertions.assertNotNull(resultMap);
	}
}
