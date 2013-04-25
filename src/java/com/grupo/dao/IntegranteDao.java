/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.dao;

import com.grupo.model.Integrante;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface IntegranteDao {
    public void insertar(Integrante integrante);
    public void actucalizar(Integrante integrante);
    public void eliminar(Integrante integrante);
    public Integrante buscarporId(Integer id);
    public List<Integrante> buscartodos();
}
