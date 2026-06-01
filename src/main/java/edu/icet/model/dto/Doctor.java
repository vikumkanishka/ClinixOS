package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String name;
    private String specialization;
    private String contactInfo;
}
