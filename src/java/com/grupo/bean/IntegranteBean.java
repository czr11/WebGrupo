/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.bean;

import com.grupo.dao.IntegranteDao;
import com.grupo.dao.impl.IntegranteDaoImpl;
import com.grupo.model.Integrante;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author cesar
 */
@ManagedBean(name = "integranteBean")
@SessionScoped
public class IntegranteBean {

    /**
     * Creates a new instance of IntegranteBean
     */
    private Integrante integrante;
    private List<Integrante> integrantes;

    public IntegranteBean() {
        integrante = new Integrante();
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public List<Integrante> getIntegrantes() {
        IntegranteDao integranteDao = new IntegranteDaoImpl();
        integrantes = integranteDao.buscartodos();
        return integrantes;
    }

    public void prepararInsertar(ActionEvent actionEvent) {
        integrante = new Integrante();
    }

    public void insertar() {
        IntegranteDao integranteDao = new IntegranteDaoImpl();
        integranteDao.insertar(integrante);
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Nuevo Integrante guardado Exitosamente!."));
        integrante = new Integrante();
    }

    public void prepararActualizar(Integer id) {
        IntegranteDao integranteDao = new IntegranteDaoImpl();
        integrante = integranteDao.buscarporId(id);
    }

    public void actualizar() {
        IntegranteDao integranteDao = new IntegranteDaoImpl();
        integranteDao.actucalizar(integrante);
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Integrante Actualizado Exitosamente!."));
        integrante = new Integrante();
    }

    public void eliminar() {
        IntegranteDao integranteDao = new IntegranteDaoImpl();
        integranteDao.eliminar(integrante);
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Integrante Eliminado Exitosamente!."));
        integrante = new Integrante();
    }

    public void cancelar(ActionEvent actionEvent) {
        integrante = new Integrante();
    }
}
