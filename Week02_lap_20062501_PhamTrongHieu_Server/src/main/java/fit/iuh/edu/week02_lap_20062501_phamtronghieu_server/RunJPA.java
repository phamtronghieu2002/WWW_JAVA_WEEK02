package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RunJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("20062501_PhamTrongHieu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try
        {

            em.getTransaction().commit();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
        finally
        {
            em.close();
        }
    }
}
