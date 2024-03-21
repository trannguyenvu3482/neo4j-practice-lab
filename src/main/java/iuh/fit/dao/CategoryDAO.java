/**
 * 
 */
package iuh.fit.dao;

import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;

import iuh.fit.entity.Category;
import iuh.fit.util.AppUtils;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 1:36:02 am
 */
public class CategoryDAO {
	private Driver driver;

	public CategoryDAO() {
		this.driver = AppUtils.getDriver();
	}

	/**
	 * Adds the category.
	 *
	 * @param category the category
	 */
	public void addCategory(Category category) {
		String query = "CREATE (c:Category {categoryID: $categoryID, categoryName: $categoryName, description: $description, picture: $picture})";
		Map<String, Object> params = Map.of("categoryID", category.getCategoryID(), "categoryName",
				category.getCategoryName(), "description", category.getDescription(), "picture", category.getPicture());

		try (Session session = driver.session()) {
			session.executeWrite(tx -> tx.run(query, params).consume());
		}
	}

	public void close() {
		driver.close();
	}
}
