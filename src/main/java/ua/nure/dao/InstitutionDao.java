package ua.nure.dao;

import org.springframework.data.repository.CrudRepository;
import ua.nure.entity.Institution;

public interface InstitutionDao extends CrudRepository<Institution, Long> {

}
