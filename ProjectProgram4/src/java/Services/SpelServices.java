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
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 11627
 */
public class SpelServices {
    // public static Session session = NewHibernateUtil.getSessionFactory().openSession();

    public static List<Spel> GetAllSpelletjes() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Spel");
        return q.list();
    }

    public static ArrayList<Spel> getAllSpelletjes() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Spel");
        ArrayList<Spel> result = (ArrayList<Spel>) query.list();
        return result;
    }

    public static ArrayList<Comment> getAllComments(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Comment comment where spel.id=" + Id);
        return (ArrayList<Comment>) query.list();
    }

    public static Long getAantalComments(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select Count(*) from Comment comment where spel.id=" + Id);
        Long count = (Long) query.uniqueResult();
        return count;
    }

    public static Spel saveSpel(Spel spel) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(spel);
        session.getTransaction().commit();
        session.close();
        return spel;
    }

    public static Comment saveComment(Comment comment) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(comment);
        session.getTransaction().commit();
        session.close();
        return comment;
    }

    public static void deleteSpel(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Spel spel where spel.id=" + Id);
        Spel spel = (Spel) query.uniqueResult();
        session.beginTransaction();
        session.delete(spel);
        session.getTransaction().commit();
    }

    public static Spel getSpel(int Id, boolean sessionClose) {
        if (sessionClose == true) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Spel spel where spel.id=" + Id);
            Spel result = (Spel) query.uniqueResult();
            session.close();
            return result;
        } else {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Spel spel where spel.id=" + Id);
            Spel result = (Spel) query.uniqueResult();
            return result;
        }
    }

    public static ArrayList<Category> getAllCategories() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Category");
        ArrayList<Category> result = (ArrayList<Category>) query.list();
        session.close();
        return result;
    }

    public static Category getCategory(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Category category where category.id=" + Id);
        Category result = (Category) query.uniqueResult();
        return result;
    }

    public static Comment getComment(int Id, boolean sessionClose) {
        if (sessionClose == true) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Comment Comment where comment.id=" + Id);
            Comment result = (Comment) query.uniqueResult();
            session.close();
            return result;
        } else {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Comment Comment where comment.id=" + Id);
            Comment result = (Comment) query.uniqueResult();
            return result;
        }

    }
    
      public static String getSpelComment(List<Comment> listComment) {
            String titelspel = "";
            for (Comment comment : listComment) {
              titelspel = comment.getSpel().getTitel();
            }
            return titelspel;
    }

    public static Category getCategoryName(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select s.category from Spel as s where s.id=" + Id);
        Category result = (Category) query.uniqueResult();
        return result;
    }
}
