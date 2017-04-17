package linxdcn.api.modules.v1.models.db.dao.geology;

import linxdcn.api.modules.v1.models.db.entity.geology.ConfinedWater;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/17/17.
 */
public interface ConfinedWaterRepository extends JpaRepository<ConfinedWater, Integer> {
    ConfinedWater findById(int id);
}
