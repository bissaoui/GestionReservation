package entities;

import java.util.Date;

public class Reservation {

	private int idReservation;
	private Date dateDebut;
	private Date dateFin;
	private double prix;
	private int idUser;
	private int idChambre;
	private static int cmp = 0;

	public Reservation(int idReservation, Date dateDebut, Date dateFin, double prix, int idUser, int idChambre) {
		this.idReservation = ++cmp;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.idUser = idUser;
		this.idChambre = idChambre;
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	public int getIdUser() {
		return idUser;
	}

}
