package linxdcn.api.modules.v1.controllers.db;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import linxdcn.api.modules.v1.models.db.dao.geology.*;
import linxdcn.api.modules.v1.models.db.entity.geology.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by linxiaodong on 4/6/17.
 */
@RestController
@RequestMapping("geology")
@Api(value = "Geology", description = "The API about Geology", tags = "Geology")
public class GeologyController {
    @Autowired
    BoreholeRepository boreholeRepository;

    @Autowired
    StrataSectionRepository strataSectionRepository;

    @Autowired
    StrataRepository strataRepository;

    @Autowired
    ConfinedWaterRepository confinedWaterRepository;

    @Autowired
    PhreaticWaterRepository phreaticWaterRepository;

    @Autowired
    RiverWaterRepository riverWaterRepository;

    @Autowired
    SoilPropertyRepository soilPropertyRepository;

    @ApiOperation(notes = "Get Borehole by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "borehole/{id}", method = RequestMethod.GET)
    public Borehole getBoreholeById(@PathVariable("id") int id) {
        return boreholeRepository.findById(id);
    }

    @ApiOperation(notes = "Get Borehole by Name", httpMethod = "GET", value = "Get by Name")
    @RequestMapping(value = "borehole", method = RequestMethod.GET)
    public Borehole getBoreholeByName(@RequestParam("name") String name) {
        return boreholeRepository.findByName(name);
    }

    @ApiOperation(notes = "Get Strata Section by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "stratasection/{id}", method = RequestMethod.GET)
    public StrataSection getStrataSectionById(@PathVariable("id") int id) {
        return strataSectionRepository.findById(id);
    }

    @ApiOperation(notes = "Get Strata by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "strata/{id}", method = RequestMethod.GET)
    public Strata getStrataById(@PathVariable("id") int id) {
        return strataRepository.findById(id);
    }

    @ApiOperation(notes = "Get Confined Water by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "confinedwater/{id}", method = RequestMethod.GET)
    public ConfinedWater getConfinedWaterById(@PathVariable("id") int id) {
        return confinedWaterRepository.findById(id);
    }

    @ApiOperation(notes = "Get Phreatic Water by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "phreaticwater/{id}", method = RequestMethod.GET)
    public PhreaticWater getPhreaticWaterById(@PathVariable("id") int id) {
        return phreaticWaterRepository.findById(id);
    }

    @ApiOperation(notes = "Get River Water by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "riverwater/{id}", method = RequestMethod.GET)
    public RiverWater getRiverWaterById(@PathVariable("id") int id) {
        return riverWaterRepository.findById(id);
    }

    @ApiOperation(notes = "Get Soil Property by StratumSectionID and StratumID", httpMethod = "GET", value = "Get Soil Property")
    @RequestMapping(value = "soilproperty", method = RequestMethod.GET)
    public SoilProperty getByStratumSectionIDAndStratumID(
            @RequestParam("section") int stratumSectionID,
            @RequestParam("stratum") int stratumID) {
        return soilPropertyRepository.findByStratumSectionIDAndStratumID(stratumSectionID, stratumID);
    }
}
