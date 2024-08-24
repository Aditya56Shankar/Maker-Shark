package com.makersharks.aditya.entity;

//import com.makersharks.aditya.enums.Manufacturing;
//import com.makersharks.aditya.enums.NatureOfBusiness;

import com.makersharks.aditya.enums.Manufacturing;
import com.makersharks.aditya.enums.NatureOfBusiness;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Suplier {
@Id
@Column(name="supplierId")
private long supplierId;
    @Column(name="companyName")
private String companyName;
    @Column(name="website")
private String website;
    @Column(name="location")
private String location;

@Enumerated(EnumType.STRING)
@Column(name="natureOfBusiness")
private NatureOfBusiness natureOfBusiness;

    //private String manufacturingProcesses;
    //private String natureOfBusiness;
    @Enumerated(EnumType.STRING)
    @Column(name="manufacturingProcesses")
private Manufacturing manufacturingProcesses;

public Suplier(long supplierId, String companyName, String website, String location, NatureOfBusiness natureOfBusiness,  Manufacturing manufacturingProcesses) {
    this.supplierId = supplierId;
    this.companyName = companyName;
    this.website = website;
    this.location = location;
    this.natureOfBusiness = natureOfBusiness; // Convert String to Enum
    this.manufacturingProcesses = manufacturingProcesses; // Convert String to Enum
}

public Suplier() {
    super();
}

public long getSupplierId() {
    return supplierId;
}

public String getCompanyName() {
    return companyName;
}

public String getWebsite() {
    return website;
}

public String getLocation() {
    return location;
}

public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
}

public void setCompanyName(String companyName) {
    this.companyName = companyName;
}

public void setWebsite(String website) {
    this.website = website;
}

public void setLocation(String location) {
    this.location = location;
}

public NatureOfBusiness getNatureOfBusiness() {
    return this.natureOfBusiness=natureOfBusiness;
}

public void setNatureOfBusiness( NatureOfBusiness natureOfBusiness) {
    this.natureOfBusiness = natureOfBusiness;
}

public Manufacturing getManufacturingProcesses() {
    return manufacturingProcesses;
}
public void setManufacturingProcesses(Manufacturing manufacturingProcesses) {
    this.manufacturingProcesses = manufacturingProcesses;
}/*
public String getManufacturingProcesses() {
    return manufacturingProcesses;
}

    public void setManufacturingProcesses(String manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }
*/
@Override
public String toString() {
    return "Supplier{" +
            "supplierId=" + supplierId +
            ", companyName='" + companyName + '\'' +
            ", website='" + website + '\'' +
            ", location='" + location + '\'' +
            ", natureOfBusiness=" + natureOfBusiness +
            ", manufacturingProcesses=" + manufacturingProcesses +
            '}';
}
}

