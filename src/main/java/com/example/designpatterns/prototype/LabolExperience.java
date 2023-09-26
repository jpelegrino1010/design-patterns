package com.example.designpatterns.prototype;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LabolExperience {

    private String companyName;
    private LocalDate startDate;
    private LocalDate endDate;


}
