package models;

/**
 * 
 * @author Mamillapalli
 *
 */
public class Contact {
	
	private long id;

	private String firstName = "";

	private String lastName = "";

	private String telephone = "";
	
	private String telephoneType = "";

	 
	public Contact(long id, String firstName, String lastName,
			String telephone, String telephoneType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.telephoneType = telephoneType;
	}



	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param telephone
	 */
	
	public Contact(String firstName, String lastName, String telephone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
	}
	
	

	public Contact(long id, String firstName, String lastName, String telephone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getTelephoneType() {
		return telephoneType;
	}



	public void setTelephoneType(String telephoneType) {
		this.telephoneType = telephoneType;
	}
}
