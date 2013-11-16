package models;

import java.util.ArrayList;
import java.util.List;

import views.formdata.ContactFormData;

/**
 * 
 * @author Mamillapalli
 * 
 */
public class ContactDB {

	private static List<Contact> contacts = new ArrayList<>();

	public static Contact addContact(ContactFormData dataForm) {
		Contact contact = new Contact(dataForm.firstName, dataForm.lastName,
				dataForm.telephone);
		contacts.add(contact);
		return contact;

	}

	public static List<Contact> getContacts() {
		return contacts;
	}

}
