package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private String name;
    private int age;
    private String contactInfo;
}
