/**
 * 
 */
package iuh.fit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 19 Mar 2024 - 8:34:21 pm
 */

@Getter
@Setter
@AllArgsConstructor
public class OrderDetail {
	private Product product;
	private int quantity;
	private double unitPrice;
	private double discount;
}
