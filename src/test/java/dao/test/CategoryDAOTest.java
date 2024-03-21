/**
 * 
 */
package dao.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import iuh.fit.dao.CategoryDAO;
import iuh.fit.entity.Category;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 1:39:30 am
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CategoryDAOTest {
	private CategoryDAO categoryDAO;

	@BeforeAll
	void setup() {
		categoryDAO = new CategoryDAO();
	}

	@Test
	void testGetAllCategories() {
		Category category = new Category("9", "Ultilities", "It just ultilities", "0xc00000");
		categoryDAO.addCategory(category);
		Assertions.assertNotNull(category);
		Assertions.assertEquals("9", category.getCategoryID());
		Assertions.assertEquals("Ultilities", category.getCategoryName());
	}
}
