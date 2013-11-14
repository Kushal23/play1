package views.formdata;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.ValidationError;

public class ContactFormData {

	public String firstName = "";

	public String lastName = "";

	public String telephone = "";

	public List<ValidationError> validate() {

		List<ValidationError> errors = new ArrayList<>();

		if (firstName == null || firstName.length() == 0) {
			errors.add(new ValidationError("firstName",
					"first Name is required"));
		}

		if (lastName == null || lastName.length() == 0) {
			errors.add(new ValidationError("lastName", "last Name is required"));
		}

		if (telephone == null || telephone.length() == 0) {
			errors.add(new ValidationError("telephone", "telephone is required"));
		}

		if (telephone.length() < 12) {
			errors.add(new ValidationError("telephone",
					"telephone must be of format xxx-xxx-xxxx"));
		}

		return errors.isEmpty() ? null : errors;

	}

}
