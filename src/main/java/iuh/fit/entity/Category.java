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
 * @created 19 Mar 2024 - 8:22:10 pm
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
	private String categoryID;
	private String categoryName;
	private String description;
	private String picture;
}
