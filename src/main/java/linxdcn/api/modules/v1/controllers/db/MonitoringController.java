package linxdcn.api.modules.v1.controllers.db;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import linxdcn.api.modules.v1.models.db.dao.monitoring.LeakageRepository;
import linxdcn.api.modules.v1.models.db.dao.monitoring.SLConvergenceRepository;
import linxdcn.api.modules.v1.models.db.entity.geology.SoilProperty;
import linxdcn.api.modules.v1.models.db.entity.monitoring.Leakage;
import linxdcn.api.modules.v1.models.db.entity.monitoring.SLConvergence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linxiaodong on 4/19/17.
 */
@RestController
@RequestMapping("monitoring")
@Api(value = "Monitoring", description = "The API about Monitoring", tags = "Monitoring")
public class MonitoringController {
    @Autowired
    LeakageRepository leakageRepository;

    @Autowired
    SLConvergenceRepository slConvergenceRepository;

    @ApiOperation(notes = "Get Leakage by LineNo and RingNo",
            httpMethod = "GET", value = "Get Leakage")
    @RequestMapping(value = "leakage", method = RequestMethod.GET)
    public List<Leakage> getLeakageByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return leakageRepository.findByLineNoAndStartRingNo(lineNo, ringNo);
    }

    @ApiOperation(notes = "Get Convergence by LineNo and RingNo",
            httpMethod = "GET", value = "Get Convergence")
    @RequestMapping(value = "convergence", method = RequestMethod.GET)
    public List<SLConvergence> getConvergenceByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return slConvergenceRepository.findByLineNoAndRingNo(lineNo, ringNo);
    }
}
