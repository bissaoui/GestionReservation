
   
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDao;
import entities.Chambre;

public class ChambreServices implements IDao<Chambre> {

    @Override
    public boolean create(Chambre o) {
        try {
            String sql = "insert into Chambre values (null, ?, ?, ?,?)";
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ps.setInt(1, o.getNumero());
            ps.setString(2, o.getType());
            ps.setDouble(3, o.getTarif());
            ps.setString(4, o.getPhoto());

            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Chambre o) {
        String sql = "update chambre set numero  = ? , type =?,tarif=?,photo=? where idChambre  = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ps.setInt(1, o.getNumero());
            ps.setString(2, o.getType());
            ps.setDouble(3, o.getTarif());
            ps.setString(4, o.getPhoto());

            ps.setInt(5, o.getIdChambre());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean delete(Chambre o) {

        String sql = "delete from Chambre where idChambre  = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ps.setInt(1, o.getIdChambre());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Chambre findById(int id) {
        // TODO Auto-generated method stub
        Chambre s = null;
        String sql = "select * from Chambre where idChambre  = ?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Chambre(rs.getInt("idChambre"), rs.getInt("Numero"), rs.getString("type"),
                        rs.getDouble("tarif"), rs.getString("photo"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {
        // TODO Auto-generated method stub
        List<Chambre> chambres = new ArrayList<Chambre>();

        String sql = "select * from Chambre ";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chambres.add(new Chambre(rs.getInt("idChambre"), rs.getInt("Numero"), rs.getString("type"),
                        rs.getDouble("tarif"), rs.getString("photo")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return chambres;
    }
    public List<Chambre> findAllChambreNotUsed() {
        // TODO Auto-generated method stub
        List<Chambre> chambres = new ArrayList<Chambre>();

        String sql = "SELECT * FROM `chambre` c WHERE idChambre not in ( SELECT idChambre FROM `reservation` WHERE Date(DateFin) >= CURDATE())  ";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
            ;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chambres.add(new Chambre(rs.getInt("idChambre"), rs.getInt("Numero"), rs.getString("type"),
                        rs.getDouble("tarif"), rs.getString("photo")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return chambres;
    }

}
