package com.mig23catalog.repositories;

import com.mig23catalog.entities.electricalPanels.ElectricalPanel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ElectricalPanelImplRespository extends CrudRepository<ElectricalPanel, Long>{

    Set<ElectricalPanel> findByType(String type);

    ElectricalPanel findById(long id);

    @Query(value = "SELECT ep.type FROM ElectricalPanel AS ep GROUP BY ep.type")
    List<Object> findByTypeGroupByType();
}
