package creazionali.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private Address address;
	
	private UserWebDTO dto;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address;
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(lastName, address.toString(), age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		// TODO Auto-generated method stub
		return dto;
	}

}
