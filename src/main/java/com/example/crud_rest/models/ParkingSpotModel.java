package com.example.crud_rest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "PARKING_SPOT")
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "PARKING_SPOT_NUMBER", nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(name = "LICENSE_PLATE_CAR", nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(name = "BRAND_CAR", nullable = false, length = 70)
    private String brandCar;

    @Column(name = "MODEL_CAR", nullable = false, length = 70)
    private String modelCar;

    @Column(name = "COLOR_CAR", nullable = false, length = 70)
    private String colorCar;

    @Column(name = "REGISTRATION_DATE", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "RESPONSIBLE_NAME", nullable = false, length = 130)
    private String responsibleName;

    @Column(name = "APARTMENT", nullable = false, length = 30)
    private String apartment;

    @Column(name = "BLOCK", nullable = false, length = 30)
    private String block;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
