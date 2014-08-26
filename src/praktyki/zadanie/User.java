package praktyki.zadanie;

public class User {
	private String name;
	private String address;
	private long nip;
	private String website;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNip() {
		return nip;
	}

	public void setNip(long nip) {
		this.nip = nip;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nazwa: " + name + " adres: " + address + " NIP: " + nip
				+ " Adres www: " + website + " e-mail: " + email;
	}

}
