package co.simplon.springboot.simplecrud3.model;

public class Etudiant {

	private int id_etudiant;
	private String firstName;
	private String name;
	private String address;
	private String email;
	private String phone;

	public Etudiant() {
		super();
	}

	public Etudiant(int id_etudiant, String firstName, String name, String address, String email, String phone) {
		super();
		this.id_etudiant = id_etudiant;
		this.firstName = firstName;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
