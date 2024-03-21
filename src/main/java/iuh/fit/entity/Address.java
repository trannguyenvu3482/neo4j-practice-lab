/**
 * 
 */
package iuh.fit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Trần Nguyên Vũ
 * @version 1.0
 * @created 21 Mar 2024 - 3:33:47 pm
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
	private String address;
	private String country;
	private String postalCode;
	private String region;

}