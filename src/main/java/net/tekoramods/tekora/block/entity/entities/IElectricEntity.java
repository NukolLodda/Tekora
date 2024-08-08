package net.tekoramods.tekora.block.entity.entities;

public interface IElectricEntity {

    boolean hasElectricity();

    int maxEnergy();

    void changeEnergy(int pAmount);

}
