package com.mig23catalog.repositories;


import com.mig23catalog.entities.transformerProtectCover.TransformerProtectCover;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TransformerProtectCoverRepository extends CrudRepository<TransformerProtectCover, Long>{

    @Query(value = "SELECT tpc FROM TransformerProtectCover AS tpc")
    Set<TransformerProtectCover> findAll();

    TransformerProtectCover findById(long id);
}
