package com.makersharks.aditya.services;

import com.makersharks.aditya.entity.Suplier;
import com.makersharks.aditya.enums.Manufacturing;
import com.makersharks.aditya.enums.NatureOfBusiness;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Suplierservice {
    public List<Suplier> getSuppliers();
    public Suplier getSupplier(String location, NatureOfBusiness natureofBusiness, Manufacturing manufacturing);
    public Suplier addsuplier(Suplier suplier);

    public Suplier updateSupplier(Suplier suplier);

    public void deleteSupplier(long l);
}
