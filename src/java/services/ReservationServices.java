/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import connexion.Connexion;
import dao.IDao;
import entities.Reservation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author BISSAOUI YASSINE
 */
import java.util.List;

/**
 *
 * @author BISSAOUI YASSINE
 */
public class ReservationServices implements IDao<Reservation> {

    @Override
    public boolean create(Reservation o) {
        try {

            String sql = "insert into Reservation values (null, ?, ?, ?,?,?)";

            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(o.getDateDebut().getTime()));

            ps.setDate(2, new java.sql.Date(o.getDateFin().getTime()));

            ps.setDouble(3, o.getPrix());

            ps.setInt(4, o.getIdUser());

            ps.setInt(5, o.getIdChambre());

            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Reservation o) {
        String sql = "update Reservation set DateDebut  = ? , DateFin =?,Prix=? where IdReservation = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(o.getDateDebut().getTime()));

            ps.setDate(2, new java.sql.Date(o.getDateFin().getTime()));

            ps.setDouble(3, o.getPrix());

            ps.setInt(4, o.getIdReservation());

            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean delete(Reservation o) {
        // TODO Auto-generated method stub
        String sql = "delete from Reservation where IdReservation  = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            
            ps.setInt(1, o.getIdReservation());
            
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Reservation findById(int id) {
    // TODO Auto-generated method stub
        Reservation s = null;
        String sql = "select * from Reservation where IdReservation  = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Reservation(rs.getInt("IdReservation"), rs.getDate("dateDebut"), rs.getDate("DateFin"),
                        rs.getDouble("prix"), rs.getInt("idUser"), rs.getInt("idChambre"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;    }

    @Override
    public List<Reservation> findAll() {
    //To change body of generated methods, choose Tools | Templates.
         // TODO Auto-generated method stub
        List<Reservation> chambres = new ArrayList<Reservation>();

        String sql = "select * from Reservation ";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chambres.add(new Reservation(rs.getInt("IdReservation"), rs.getDate("dateDebut"), rs.getDate("DateFin"),
                        rs.getDouble("prix"), rs.getInt("idUser"), rs.getInt("idChambre")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return chambres;
    }


}
