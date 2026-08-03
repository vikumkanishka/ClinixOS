package edu.icet.repository;

import edu.icet.model.dto.Nurse;

public class NurseRepository implements NurseRepositoryImpl{
    @Override
    public void addNurse(String name, String licenseNumber, String contactInfo, String department) {

    }

    @Override
    public void updateNurse(String name, String licenseNumber, String contactInfo, String department) {

    }

    @Override
    public void deleteNurse(String licenseNumber) {

    }

    @Override
    public Nurse getNurseByLicenseNumber(String licenseNumber) {
        return null;
    }
}
