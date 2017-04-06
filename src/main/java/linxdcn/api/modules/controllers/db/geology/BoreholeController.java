package linxdcn.api.modules.controllers.db.geology;

import linxdcn.api.modules.models.db.dao.geology.BoreholeRepository;
import linxdcn.api.modules.models.db.entity.geology.Borehole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linxiaodong on 4/6/17.
 */
@RestController
@RequestMapping("/db/borehole")
public class BoreholeController {
    @Autowired
    BoreholeRepository boreholeRepository;

    @RequestMapping("{id}")
    public Borehole id(@PathVariable("id") int id) {
        return boreholeRepository.findById(id);
    }
}
