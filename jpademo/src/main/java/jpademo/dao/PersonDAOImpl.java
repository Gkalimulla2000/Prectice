/**
 * 
 */
package jpademo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import jpademo.entities.Person;
import jpademo.utility.EntityManagerUtility;

/**
 * @author admi
 *
 */
public class PersonDAOImpl implements PersonDAO {

	@Override
	public boolean isPersonAvailable(int personId) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Person person = entityManager.find(Person.class, personId);

		if(person == null) {
			return false;
		}
		return true;
		
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
