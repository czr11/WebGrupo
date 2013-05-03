/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.dao.impl;

import com.grupo.dao.IntegranteDao;
import com.grupo.util.HibernateUtil;
import com.grupo.model.Integrante;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author cesar
 */
public class IntegranteDaoImpl implements IntegranteDao {

    @Override
    public void insertar(Integrante integrante) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(integrante);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al insertar" + e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void actucalizar(Integrante integrante) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(integrante);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar" + e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void eliminar(Integrante integrante) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(integrante);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar" + e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public Integrante buscarporId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Integrante) session.load(Integrante.class, id);
    }

    @Override
    public List<Integrante> buscartodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Integrante").list();
    }
}
