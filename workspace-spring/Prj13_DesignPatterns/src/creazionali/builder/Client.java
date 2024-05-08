package creazionali.builder;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = createUser();
		
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto = directBuild(builder, u);
		
		System.out.println(dto);
	}

	private static UserDTO directBuild(UserDTOBuilder builder, User u) {
		
		return builder.withFirstName(u.getFirstName())
				.withLastName(u.getLastName())
				.withBirthday(u.getBirthday())
				.withAddress(u.getAddress())
				.build();
	}

	public static User createUser() {
		User u = new User();
		
		u.setFirstName("mauro");
		u.setLastName("bogliaccino");
		u.setBirthday(LocalDate.of(1969, 7, 28));
		
		Address a = new Address();
		a.setCity("torino");
		a.setHouseNumber("15");
		a.setStreet("carlo alberto");
		a.setState("Italia");
		a.setZipcode("10122");
		
		u.setAddress(a);
		return u;
	}
	
}
