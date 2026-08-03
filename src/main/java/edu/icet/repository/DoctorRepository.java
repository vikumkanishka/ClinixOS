package edu.icet.repository;

import edu.icet.model.dto.Doctor;

public interface DoctorRepository {
    void addDoctor(String name, String licenseNumber, String contactInfo, String department);
    void updateDoctor(String name, String licenseNumber, String contactInfo, String department);
    void deleteDoctor(String licenseNumber);
    Doctor getDoctorByLicenseNumber(String licenseNumber);
}