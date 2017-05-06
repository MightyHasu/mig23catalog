package com.mig23catalog.repositories;

import com.mig23catalog.entities.compactSubstations.CompactSubtation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface CompactSubstationRepository extends CrudRepository<CompactSubtation, Long>{

    Set<CompactSubtation> findAll();

    CompactSubtation findById(long id);
}
