package linxdcn.api.modules.v1.models.db.dao.structure;

import linxdcn.api.modules.v1.models.db.entity.structure.SegmentLining;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface SegmentLiningRepository extends JpaRepository<SegmentLining, Integer>{
    SegmentLining findById(int id);
}
