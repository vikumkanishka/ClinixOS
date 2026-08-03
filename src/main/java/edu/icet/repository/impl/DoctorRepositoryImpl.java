package edu.icet.repository.impl;

import edu.icet.model.dto.Doctor;
import edu.icet.repository.DoctorRepository;

public class DoctorRepositoryImpl implements DoctorRepository {
    @Override
    public void addDoctor(String name, String licenseNumber, String contactInfo, String department) {

    }

    @Override
    public void updateDoctor(String name, String licenseNumber, String contactInfo, String department) {

    }

    @Override
    public void deleteDoctor(String licenseNumber) {

    }

    @Override
    public Doctor getDoctorByLicenseNumber(String licenseNumber) {
        return null;
    }
}
