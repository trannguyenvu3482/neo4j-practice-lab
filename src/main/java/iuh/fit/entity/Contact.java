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
 * @created 19 Mar 2024 - 8:41:37 pm
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contact {
	private String contactName;
	private String contactTitle;
	private String city;
	private String fax;
	private String phone;
}