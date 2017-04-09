package linxdcn.api.modules.v1.controllers.db.geology;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import linxdcn.api.modules.v1.models.db.dao.geology.BoreholeRepository;
import linxdcn.api.modules.v1.models.db.entity.geology.Borehole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linxiaodong on 4/6/17.
 */
@RestController
@RequestMapping("/db/borehole")
@Api(value = "Borehole", description = "Borehole")
public class BoreholeController {
    @Autowired
    BoreholeRepository boreholeRepository;

    @ApiOperation(notes = "Get borehole by ID", httpMethod = "GET", value = "Get by ID")
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Borehole id(@PathVariable("id") int id) {
        return boreholeRepository.findById(id);
    }
}
