/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionsbeans;

import entities.NewEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nelson
 */
@Local
public interface NewEntityFacadeLocal {

    void create(NewEntity newEntity);

    void edit(NewEntity newEntity);

    void remove(NewEntity newEntity);

    NewEntity find(Object id);

    List<NewEntity> findAll();

    List<NewEntity> findRange(int[] range);

    int count();
    
}
