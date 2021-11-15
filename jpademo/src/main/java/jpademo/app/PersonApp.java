/**
 * 
 */
package jpademo.app;

import jpademo.service.PersonService;
import jpademo.service.PersonServiceImpl;

/**
 * @author admi
 *
 */
public class PersonApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonService personService = new PersonServiceImpl();
		boolean isPersonAvailable;
		int personId = 15;
		isPersonAvailable = personService.isPersonAvailable(personId);
		System.out.println("Person with id ---"+personId+"--is available--"+isPersonAvailable);

	}

}
