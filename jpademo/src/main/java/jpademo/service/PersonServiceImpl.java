/**
 * 
 */
package jpademo.service;

import java.util.List;

import jpademo.dao.PersonDAO;
import jpademo.dao.PersonDAOImpl;
import jpademo.entities.Person;

/**
 * @author admi
 *
 */
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDao = new PersonDAOImpl();

	@Override
	public boolean isPersonAvailable(int personId) {

		boolean isPersonAvailbale = personDao.isPersonAvailable(personId);

		return isPersonAvailbale;
	}

	@Override
	public String addPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerson(int personId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub

	}

}
