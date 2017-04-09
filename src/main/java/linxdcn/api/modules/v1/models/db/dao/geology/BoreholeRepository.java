package linxdcn.api.modules.v1.models.db.dao.geology;

import linxdcn.api.modules.v1.models.db.entity.geology.Borehole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/6/17.
 */
public interface BoreholeRepository extends JpaRepository<Borehole, Integer> {
    Borehole findById(int id);
}
