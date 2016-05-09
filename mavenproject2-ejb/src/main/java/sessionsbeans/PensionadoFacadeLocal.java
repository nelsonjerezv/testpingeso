/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionsbeans;

import entities.Pensionado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nelson
 */
@Local
public interface PensionadoFacadeLocal {

    void create(Pensionado pensionado);

    void edit(Pensionado pensionado);

    void remove(Pensionado pensionado);

    Pensionado find(Object id);

    List<Pensionado> findAll();

    List<Pensionado> findRange(int[] range);

    int count();
    
}
