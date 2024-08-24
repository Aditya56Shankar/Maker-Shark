package com.makersharks.aditya.services;

//import com.makersharks.aditya.dao.Suplierdao;
import com.makersharks.aditya.entity.Suplier;
import com.makersharks.aditya.enums.Manufacturing;
import com.makersharks.aditya.enums.NatureOfBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Suplierserviceimpl implements Suplierservice{
    List<Suplier> list;

    //private Suplierdao sd;
    @Override
    public List<Suplier> getSuppliers() {
        return list;
    }



    @Override
    public Suplier getSupplier(String locations, NatureOfBusiness natureOfBusiness, Manufacturing manufacturing) {
        Suplier s=null;
        for (Suplier suplier : list) {
            if (suplier.getLocation().equals(locations)&&suplier.getNatureOfBusiness().equals(natureOfBusiness)&&suplier.getManufacturingProcesses().equals(manufacturing)) {
                s=suplier;
                break;
            }
        }
        return s; // Or handle the case where no suppliers are found
    }







    @Override
    public Suplier addsuplier(Suplier suplier) {
       list.add(suplier);
        return suplier;

    }




    public Suplierserviceimpl(){

        list=new ArrayList<>();
       // list.add(new Suplier(15,"jdshjh","sgftg","wrewtr","kfyhydr","kuiutr"));
    }
    public Suplier updateSupplier (Suplier suplier) {

        list.forEach(e -> {

            if (e.getSupplierId() == suplier.getSupplierId()) {
                e.setLocation(suplier.getLocation());
            e.setCompanyName(suplier.getCompanyName());
                    e.setWebsite(suplier.getWebsite());
                    e.setNatureOfBusiness(suplier.getNatureOfBusiness());
                    e.setManufacturingProcesses(suplier.getManufacturingProcesses());
            }


        });
        return suplier;

    }
    @Override
    public void deleteSupplier(long parseLong) {

       list=this.list.stream().filter(e->e.getSupplierId()!= parseLong).collect(Collectors.toList());

    }

}
