/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Category;
import DAL.Comment;
import DAL.NewHibernateUtil;
import DAL.Spel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author FxA
 */
public class AdminSpelServices {

    public static List<Spel> spelletjes = new ArrayList<>();
    public static List<Comment> comments = new ArrayList<>();

    
    public static List<Comment> getAllComments(int Id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM comment where spelId=" + Id;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Comment comment = new Comment();
                comment.setComment(rs.getString("comment"));
                comment.setDatum(rs.getDate("datum"));
                comment.setId(rs.getInt("id"));
                comment.setUsername(rs.getString("username"));
                comment.setReactieVerwijderen(rs.getInt("reactieVerwijderen"));
                comments.add(comment);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return comments;
    }

    public static List<Comment> getOngepasteReacties() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM comment where reactieVerwijderen >2";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Comment comment = new Comment();
                comment.setComment(rs.getString("comment"));
                comment.setDatum(rs.getDate("datum"));
                comment.setId(rs.getInt("id"));
                comment.setUsername(rs.getString("username"));
                comment.setReactieVerwijderen(rs.getInt("reactieVerwijderen"));
                comments.add(comment);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return comments;
    }

    public static void deleteComment(int commentId) {

        String deleteQuery = "DELETE from comment WHERE id =" + commentId;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            PreparedStatement prepareStmt = conn.prepareStatement(deleteQuery);
            // execute update SQL statement
            prepareStmt.executeUpdate();
            conn.close();
            prepareStmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void saveSpel(Spel spel) {

        String query = "update spel set titel= ?, omschrijvingSpel= ?, benodigdheden=?, aantalPersonenVanaf=?, aantalPersonenTot =? where id= ?";
        PreparedStatement pstmt = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, spel.getTitel());
            pstmt.setString(2, spel.getOmschrijvingSpel());
            pstmt.setString(3, spel.getBenodigdheden());
            pstmt.setInt(4, spel.getAantalPersonenVanaf());
            pstmt.setInt(5, spel.getAantalPersonenTot());
            pstmt.setInt(6, spel.getId());
            pstmt.executeUpdate();

            conn.close();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void negeerOngepasteReactie(int commentId) {
        String query = "update comment set reactieVerwijderen= ? where id= ?";
        PreparedStatement pstmt = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, 0);
            pstmt.setInt(2, commentId);
            pstmt.executeUpdate();
            conn.close();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static List<Spel> getAllSpelletjes() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM spel";
            ResultSet rs = stmt.executeQuery(sql);
            spelletjes.clear();
            while (rs.next()) {
                Spel spel = new Spel();
                spel.setAantalPersonenTot(rs.getInt("aantalPersonenTot"));
                spel.setAantalPersonenVanaf(rs.getInt("aantalPersonenVanaf"));
                spel.setBenodigdheden(rs.getString("benodigdheden"));
 //               spel.setCategory(AdminSpelServices.getCategory(rs.getInt("id")));
                spel.setCounter(rs.getInt("counter"));
                spel.setId(rs.getInt("id"));
                spel.setOmschrijvingSpel(rs.getString("omschrijvingSpel"));
                spel.setTitel(rs.getString("titel"));
                spelletjes.add(spel);
            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return spelletjes;
    }

    public static void deleteSpel(String spelId) {

        String deleteQuery = "DELETE from Spel WHERE id =" + spelId;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/speldb", "root", "usbw");
            PreparedStatement prepareStmt = conn.prepareStatement(deleteQuery);
            // execute update SQL statement
            prepareStmt.executeUpdate();
            conn.close();
            prepareStmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Category getCategory(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Category category where category.id=" + Id);
        Category result = (Category) query.uniqueResult();
        session.close();
        return result;
    }

    public static String getSpelTitel(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        //   SELECT E.firstName FROM Employee E
        Query query = session.createQuery("select s.titel from Spel as s where s.id=" + Id);
        String result = (String) query.uniqueResult();
        session.close();
        return result;
    }
}
