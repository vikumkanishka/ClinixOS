package edu.icet.service;

import edu.icet.model.dto.Nurse;

public interface NurseService {
    void addNurse(String name, String department);
    void updateNurse(String name, String department);
    void deleteNurse(String licenseNumber);
    Nurse getNurseByLicenseNumber(String licenseNumber);
}
