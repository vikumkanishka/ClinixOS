package edu.icet.repository.impl;

import edu.icet.model.dto.Nurse;
import edu.icet.repository.NurseRepository;

public class NurseRepositoryImpl implements NurseRepository {
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
