/**
 * 
 */
package iuh.fit.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 19 Mar 2024 - 8:23:42 pm
 */

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
	private String customerID;
	private String companyName;

	private Contact contact = new Contact();

	private Address address = new Address();

	@ToString.Exclude
	private List<Order> listOrders;
}
