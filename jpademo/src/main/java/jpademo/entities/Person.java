/**
 * 
 */
package jpademo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author admi
 *
 */
@Entity
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int personId;
	@Column(name="personname")
	private String personName;
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
}
