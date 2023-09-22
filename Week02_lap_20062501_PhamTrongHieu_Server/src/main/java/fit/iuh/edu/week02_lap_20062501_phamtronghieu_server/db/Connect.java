package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.db;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connect {

    private static Connect instance;
    private EntityManagerFactory emf;

    private Connect() {
        emf = Persistence.createEntityManagerFactory("20062501_PhamTrongHieu");
    }

    public static Connect getInsConnection() {
        if (instance == null)
            instance = new Connect();
        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
