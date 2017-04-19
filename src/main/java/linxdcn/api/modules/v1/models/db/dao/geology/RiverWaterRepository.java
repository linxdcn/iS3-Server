package linxdcn.api.modules.v1.models.db.dao.geology;

import linxdcn.api.modules.v1.models.db.entity.geology.RiverWater;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface RiverWaterRepository extends JpaRepository<RiverWater, Integer> {
    RiverWater findById(int id);
}
