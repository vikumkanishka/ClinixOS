package edu.icet.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pharmasist {
    private String name;
    private String licenseNumber;
    private String contactInfo;
    private String pharmacyName;
}
