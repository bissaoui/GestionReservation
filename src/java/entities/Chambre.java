package entities;

public class Chambre {
	private int idChambre;
	private int Numero;
	private String Type;
	private double tarif;
	private String photo;
	public static int cmp = 0;

	public Chambre( int numero, String type, double tarif, String photo) {
		this.idChambre = ++cmp;
		Numero = numero;
		Type = type;
		this.tarif = tarif;
		this.photo = photo;
	}
	public Chambre( int id , int numero, String type, double tarif, String photo) {
		this.idChambre = id;
		Numero = numero;
		Type = type;
		this.tarif = tarif;
		this.photo = photo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getIdChambre() {
		return idChambre;
	}

	@Override
	public String toString() {
		return "Chambre [idChambre=" + idChambre + ", Numero=" + Numero + ", Type=" + Type + ", tarif=" + tarif
				+ ", photo=" + photo + "]";
	}

}
