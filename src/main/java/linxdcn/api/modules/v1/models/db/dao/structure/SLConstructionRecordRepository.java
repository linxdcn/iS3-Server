package linxdcn.api.modules.v1.models.db.dao.structure;

import linxdcn.api.modules.v1.models.db.entity.structure.SLConstructionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface SLConstructionRecordRepository extends JpaRepository<SLConstructionRecord, Integer> {
    SLConstructionRecord findById(int id);
}
