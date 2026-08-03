package edu.icet.repository;

import edu.icet.model.dto.Nurse;

public interface NurseRepository {
    void addNurse(String name, String licenseNumber, String contactInfo, String department);
    void updateNurse(String name, String licenseNumber, String contactInfo, String department);
    void deleteNurse(String licenseNumber);
    Nurse getNurseByLicenseNumber(String licenseNumber);
}
