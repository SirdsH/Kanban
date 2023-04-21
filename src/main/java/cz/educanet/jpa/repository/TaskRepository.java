package cz.educanet.jpa.repository;

import cz.educanet.jpa.entities.TaskEntity;
import cz.educanet.jpa.service.EntityManagerFactoryProvider;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

@ApplicationScoped
public class TaskRepository {
    @Inject
    private EntityManagerFactoryProvider emf;
    public void createTask(TaskEntity task) {
        EntityManager em = emf.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(task);

        et.commit();
    }

    public List<TaskEntity> getAllTasks() {
        EntityManager em = emf.getEmf().createEntityManager();

        TypedQuery<TaskEntity> result = em.createQuery("select task from TaskEntity as task", TaskEntity.class);
        return result.getResultList();
    }

    public void switchTask() {

    }
}
