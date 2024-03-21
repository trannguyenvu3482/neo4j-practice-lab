/**
 * 
 */
package iuh.fit.dao;

import org.neo4j.driver.Driver;

import iuh.fit.util.AppUtils;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 3:36:23 pm
 */
public class SupplierDAO {
	private Driver driver;

	public SupplierDAO() {
		this.driver = AppUtils.getDriver();
	}

	public void close() {
		driver.close();
	}
}
