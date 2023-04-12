package com.pichincha.sqlrepository;

import com.pichincha.data.ClienteData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteCrudRepository extends CrudRepository<ClienteData,Integer> {

}
