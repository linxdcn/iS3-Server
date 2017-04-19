package linxdcn.api.modules.v1.controllers.db;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import linxdcn.api.modules.v1.models.db.dao.structure.SLBaseTypeRepository;
import linxdcn.api.modules.v1.models.db.dao.structure.SLConstructionRecordRepository;
import linxdcn.api.modules.v1.models.db.dao.structure.SegmentLiningRepository;
import linxdcn.api.modules.v1.models.db.dao.structure.SegmentRepository;
import linxdcn.api.modules.v1.models.db.entity.structure.SLBaseType;
import linxdcn.api.modules.v1.models.db.entity.structure.SLConstructionRecord;
import linxdcn.api.modules.v1.models.db.entity.structure.Segment;
import linxdcn.api.modules.v1.models.db.entity.structure.SegmentLining;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linxiaodong on 4/19/17.
 */
@RestController
@RequestMapping("structure")
@Api(value = "Structure", description = "The API about Structure", tags = "Structure")
public class StructureController {
    @Autowired
    SegmentLiningRepository segmentLiningRepository;

    @Autowired
    SegmentRepository segmentRepository;

    @Autowired
    SLBaseTypeRepository slBaseTypeRepository;

    @Autowired
    SLConstructionRecordRepository slConstructionRecordRepository;

    @ApiOperation(notes = "Get Segment Lining by ID", httpMethod = "GET", value = "Get Segment Lining by ID")
    @RequestMapping(value = "segmentlining/{id}", method = RequestMethod.GET)
    public SegmentLining getSegmentLiningById(@PathVariable("id") int id) {
        return segmentLiningRepository.findById(id);
    }

    @ApiOperation(notes = "Get Segment by ID", httpMethod = "GET", value = "Get Segment by ID")
    @RequestMapping(value = "segment/{id}", method = RequestMethod.GET)
    public Segment getSegmentById(@PathVariable("id") int id) {
        return segmentRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Base Type by ID", httpMethod = "GET", value = "Get SL Base Type by ID")
    @RequestMapping(value = "slbasetype/{id}", method = RequestMethod.GET)
    public SLBaseType getSLBaseTypeById(@PathVariable("id") int id) {
        return slBaseTypeRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Construction Record by ID", httpMethod = "GET",
            value = "Get SL Construction Record by ID")
    @RequestMapping(value = "slconstructionrecord/{id}", method = RequestMethod.GET)
    public SLConstructionRecord getSLConstructionRecordById(@PathVariable("id") int id) {
        return slConstructionRecordRepository.findById(id);
    }
}
