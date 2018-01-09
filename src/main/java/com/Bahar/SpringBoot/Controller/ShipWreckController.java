package com.Bahar.SpringBoot.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Bahar.SpringBoot.Model.Shipwreck;
import java.util.List;


import com.Bahar.SpringBoot.Model.Shipwreck;
import com.Bahar.SpringBoot.Controller.ShipwreckStub;
import com.Bahar.SpringBoot.Repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return shipwreckRepository.findAll();
    }


    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return shipwreckRepository.saveAndFlush(shipwreck);
    }



    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        Shipwreck existing = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck, existing);
        return shipwreckRepository.saveAndFlush(existing);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
        Shipwreck existing = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(id);
        return existing;
    }

    }


