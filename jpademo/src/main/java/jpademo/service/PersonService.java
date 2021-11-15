/**
 * 
 */
package jpademo.service;

import java.util.List;

import jpademo.entities.Person;

/**
 * @author admi
 *
 */
public interface PersonService {
	public boolean isPersonAvailable(int personId);
	public String addPerson(Person person);
	public List<Person> findAllPerson();
	public void removePerson(int personId);
	public void updatePerson(Person person);

}
