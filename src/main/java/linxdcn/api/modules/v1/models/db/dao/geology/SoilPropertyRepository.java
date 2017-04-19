package linxdcn.api.modules.v1.models.db.dao.geology;

import linxdcn.api.modules.v1.models.db.entity.geology.SoilProperty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface SoilPropertyRepository extends JpaRepository<SoilProperty, Integer> {
    SoilProperty findById(int id);
    SoilProperty findByStratumSectionIDAndStratumID(int stratumSectionID, int stratumID);
}
