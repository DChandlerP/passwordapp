package org.prince.java.passwordapp.repo;


import org.prince.java.passwordapp.model.PasswordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by davidprince on 7/25/17.
 */
@Transactional
@Repository
public interface PasswordDAO extends CrudRepository<PasswordEntity, Integer> {

    PasswordEntity findByPassword(String password);
}
