package linxdcn.api.modules.v1.models.db.dao.monitoring;

import linxdcn.api.modules.v1.models.db.entity.monitoring.Leakage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface LeakageRepository extends JpaRepository<Leakage, Integer> {
    List<Leakage> findByLineNoAndStartRingNo(int lineNo, int startRingNo);
}
