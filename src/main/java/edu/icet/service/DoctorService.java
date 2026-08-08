package edu.icet.service;

import edu.icet.model.dto.Doctor;

public interface DoctorService {
    void addDoctor(String name, String licenseNumber, String contactInfo, String department);
    void updateDoctor(String name, String licenseNumber, String contactInfo, String department);
    void deleteDoctor(String licenseNumber);
    Doctor getDoctorByLicenseNumber(String licenseNumber);
}
