/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionsbeans;

import entities.Pensionado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nelson
 */
@Stateless
public class PensionadoFacade extends AbstractFacade<Pensionado> implements PensionadoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_mavenproject2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PensionadoFacade() {
        super(Pensionado.class);
    }
    
}
