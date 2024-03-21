/**
 * 
 */
package iuh.fit.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 3:34:59 pm
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Supplier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String supplierID;
	private String companyName;
	private String homePage;

	private transient Contact contact = new Contact();
	private transient Address address = new Address();

	@ToString.Exclude
	private List<Product> listProducts;
}
