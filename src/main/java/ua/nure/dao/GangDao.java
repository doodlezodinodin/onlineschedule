package ua.nure.dao;

import org.springframework.data.repository.CrudRepository;
import ua.nure.entity.Gang;

public interface GangDao extends CrudRepository<Gang, Long> {
}
