package com.makersharks.aditya.mycontrols;

import com.makersharks.aditya.entity.Suplier;
import com.makersharks.aditya.enums.Manufacturing;
import com.makersharks.aditya.enums.NatureOfBusiness;
import com.makersharks.aditya.services.Suplierservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controls {
    @Autowired
    private Suplierservice suplierService;
    @GetMapping("/supplier")
    public List<Suplier> getSuppliers(){
        return this.suplierService. getSuppliers();
    }
    //@GetMapping("/supplier/{location}/{natureofBusiness}/{manufacturing-processes}")
    @GetMapping("/supplier/{location}/{natureofBusiness}/{manufacturing}")
    public Suplier getSupplier(@PathVariable String location, NatureOfBusiness natureofBusiness, Manufacturing manufacturing){
        return this.suplierService.getSupplier(location,natureofBusiness,manufacturing);
    }
    @PostMapping("/supplier")
    public Suplier addsuplier(@RequestBody Suplier suplier){
        return this.suplierService.addsuplier(suplier);
    }
    @PutMapping("/supplier")
    public Suplier updateSupplier(@RequestBody Suplier suplier){
        return this.suplierService. updateSupplier(suplier);
    }
    public ResponseEntity<HttpStatus> deleteSupplier(@PathVariable String suplierid){
        try {
            this.suplierService.deleteSupplier(Long.parseLong(suplierid));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
