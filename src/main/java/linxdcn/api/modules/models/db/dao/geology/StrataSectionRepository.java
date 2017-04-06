package linxdcn.api.modules.models.db.dao.geology;

import linxdcn.api.modules.models.db.entity.geology.StrataSection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/6/17.
 */
public interface StrataSectionRepository extends JpaRepository<StrataSection, Integer> {
}