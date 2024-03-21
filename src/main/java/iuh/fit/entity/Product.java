/**
 * 
 */
package iuh.fit.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 19 Mar 2024 - 8:23:32 pm
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productID;
	private String productName;
	private String quantityPerUnit;
	private double unitPrice;
	private String unitsInStock;
	private String unitsOnOrder;
	private String reorderLevel;
	private String discontinued;

	public Product(String productID, String productName, String quantityPerUnit, double unitPrice, String unitsInStock,
			String unitsOnOrder, String reorderLevel, String discontinued) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.unitsOnOrder = unitsOnOrder;
		this.reorderLevel = reorderLevel;
		this.discontinued = discontinued;
	}

	@ToString.Exclude
	private transient Supplier supplier;

	@ToString.Exclude
	private transient Category category;
}
