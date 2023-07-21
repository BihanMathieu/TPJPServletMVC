package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import modele.Departement;

public class DepartementDAOImpl implements DepartementDAO {

    @PersistenceContext(unitName = "pu")
    private EntityManagerFactory entityManagerFactory;

    public DepartementDAOImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("pu");
    }
    
    @Override
    public Departement findDepartementByNum(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Departement departement = entityManager.find(Departement.class, id);
        entityManager.close();
        return departement;
    }

    @Override
    public List<Departement> findAllDepartements() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Departement> departements = entityManager.createQuery("SELECT d FROM Departement d", Departement.class)
                .getResultList();
        entityManager.close();
        return departements;
    }

    @Override
    public void saveDepartement(Departement departement) {
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(departement);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void updateDepartement(Departement departement) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(departement);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteDepartement(Departement departement) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Departement mergedDepartement = entityManager.merge(departement);
        entityManager.remove(mergedDepartement);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void destroy() {
        entityManagerFactory.close();
    }
}
