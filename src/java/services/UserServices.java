package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connexion.Connexion;
import entities.User;
import java.util.ArrayList;
import java.util.List;

public class UserServices {

	public int Login(String email, String Passe) {
		int u = -1;

		String sql = "SELECT * FROM user WHERE Email=? and Password = ? and etat= 1 ;";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, Passe);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u= rs.getInt("idUser");
			}

		} catch (SQLException e) {
			System.out.println("Login " + e.getMessage());
		}

		return u;
	}
        public boolean updateAcc(int id) {
		String sql = "update User set etat  = 1 where idUser  = ?";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ps.setInt(1, id);
			
			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("update : erreur sql : " + e.getMessage());

		}
		return false;	
        }
        public boolean delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from user where idUser  = ?";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ps.setInt(1, id);
			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("delete : erreur sql : " + e.getMessage());

		}
		return false;
	}
         public boolean updateRef(int id) {
		String sql = "update User set etat  = 2 where idUser  = ?";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ps.setInt(1, id);
			
			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("update : erreur sql : " + e.getMessage());

		}
		return false;	}
        public User findById(int id) {
		// TODO Auto-generated method stub
		User s = null;
		String sql = "select * from user where idUser  = ?";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s= new User(rs.getInt("idUser"), rs.getString("Nom"), rs.getString("Prenom"),
						rs.getString("Email"), rs.getString("Password"),rs.getInt("etat"),rs.getInt("role"));
			}

		} catch (SQLException e) {
			System.out.println("findById " + e.getMessage());
		}
		return s;
	}
         public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> USERS = new ArrayList<User>();
		String sql = "select * from user where role=2 ";
		try {
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				USERS.add( new User(rs.getInt("idUser"), rs.getString("Nom"), rs.getString("Prenom"),
						rs.getString("Email"), rs.getString("Password"),rs.getInt("etat"),rs.getInt("role")));
			}

		} catch (SQLException e) {
			System.out.println("findById " + e.getMessage());
		}
		return USERS;
	}

        public boolean create(User o) {
		try {
			String sql = "insert into user values (null,?,?,?,?,0,2);";
			PreparedStatement ps = Connexion.getInstance().prepareStatement(sql);
                        
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setString(3, o.getEmail());
			ps.setString(4, o.getPassword());
                        
			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("create : erreur sql : " + e.getMessage());

		}
		return false;
	}
}
