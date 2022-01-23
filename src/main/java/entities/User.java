package entities;

public class User {

	private int id;
	private String Nom;
	private String Prenom;
	private String Email;
	private String Password;
	private int etat;
	private int role;
	public static int cmp = 0;

	public User(String nom, String prenom, String email, String password, int etat, int role) {
		this.id = ++cmp;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Password = password;
		this.etat = etat;
		this.role = role;
	}
        public User( int id ,String nom, String prenom, String email, String password, int etat, int role) {
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Password = password;
		this.etat = etat;
		this.role = role;
	}
        public User(String nom, String prenom, String email, String password) {
		this.id = ++cmp;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Password = password;
		
	}
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Email=" + Email + ", Password=" + Password
				+ ", etat=" + etat + ", role=" + role + "]";
	}
	
	

}
