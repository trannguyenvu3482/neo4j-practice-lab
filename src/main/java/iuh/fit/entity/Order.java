/**
 * 
 */
package iuh.fit.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 19 Mar 2024 - 8:23:46 pm
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {
	private String orderID;
	private String customerID;
	private String employeeID;
	private String orderDate;
	private String requiredDate;
	private String shippedDate;
	private String shipVia;
	private String freight;
	private String shipName;
	private String shipAddress;
	private String shipCountry;
	private String shipRegion;
	private String shipPostalCode;
	private String shipCity;

	@ToString.Exclude
	private List<Product> listOrderDetails;

	public Order(String orderID, String customerID, String employeeID, String orderDate, String requiredDate,
			String shippedDate, String shipVia, String freight, String shipName, String shipAddress, String shipCountry,
			String shipRegion, String shipPostalCode, String shipCity) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.employeeID = employeeID;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.shipVia = shipVia;
		this.freight = freight;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCountry = shipCountry;
		this.shipRegion = shipRegion;
		this.shipPostalCode = shipPostalCode;
		this.shipCity = shipCity;
	}

}
