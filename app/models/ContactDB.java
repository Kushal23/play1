package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import views.formdata.ContactFormData;

/**
 * 
 * @author Mamillapalli
 * 
 */
public class ContactDB {

	private static Map<Long, Contact> contacts = new HashMap<>();

	public static Contact addContact(ContactFormData dataForm) {
		Contact contact = null;
		if (dataForm.id == 0) {
			long id = contacts.size() + 1;
			contact = new Contact(id, dataForm.firstName, dataForm.lastName,
					dataForm.telephone,dataForm.telephoneType);
		} else {
			contact = new Contact(dataForm.id, dataForm.firstName,
					dataForm.lastName, dataForm.telephone,dataForm.telephoneType);
		}

		contacts.put(contact.getId(), contact);
		return contact;

	}

	// public static Map<Long, Contact> getContacts() {
	// return contacts;
	// }

	public static List<Contact> getContacts() {
		return new ArrayList<>(contacts.values());
	}

	public static Contact getContact(long id) {
		return contacts.get(id) ;
	}

}
