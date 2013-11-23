package views.formdata;

import java.util.ArrayList;
import java.util.List;

import models.Contact;
import play.data.validation.ValidationError;

public class ContactFormData {

	public String firstName = "";

	public String lastName = "";

	public String telephone = "";

	public String telephoneType = "";

	public long id;

	public ContactFormData() {
		super();

	}

	public ContactFormData(Contact contact) {

		super();
		this.id = contact.getId();
		this.firstName = contact.getFirstName();
		this.lastName = contact.getLastName();
		this.telephone = contact.getTelephone();
		this.telephoneType = contact.getTelephoneType();

	}

	public List<ValidationError> validate() {

		List<ValidationError> errors = new ArrayList<>();

		if (firstName == null || firstName.length() == 0) {
			errors.add(new ValidationError("firstName",
					"First Name is required"));
		}

		if (lastName == null || lastName.length() == 0) {
			errors.add(new ValidationError("lastName", "Last Name is required"));
		}

		if (telephone == null || telephone.length() == 0) {
			errors.add(new ValidationError("telephone", "Telephone is required"));
		}

		if (telephone.length() < 12) {
			errors.add(new ValidationError("telephone",
					"Telephone must be of format xxx-xxx-xxxx"));
		}

		System.out.println("telephoneType="+ telephoneType);
		if (!TelephoneTypes.isType(telephoneType)) {
			errors.add(new ValidationError("telephoneType",
					"Telephone type is invalid"));
		}

		return errors.isEmpty() ? null : errors;

	}

}
