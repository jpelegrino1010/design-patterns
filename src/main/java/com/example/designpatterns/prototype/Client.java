package com.example.designpatterns.prototype;

import java.time.LocalDate;
import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume juanResume=new Resume();

        juanResume.setProfile(new PersonalInformation("Juan","Martinez","jmartinez@gmail.com"));
        List<ThecnicalSkill> skills=juanResume.getSkills();
        skills.add(new ThecnicalSkill("Java"));
        skills.add(new ThecnicalSkill("Spring Framework"));
        skills.add(new ThecnicalSkill("Maven"));

        juanResume.setSkills(skills);

        List<LabolExperience> experiences=juanResume.getExperiences();
        experiences.add(new LabolExperience("Company X", LocalDate.of(2005,11,1),
                LocalDate.of(2009,12,12)));

        experiences.add(new LabolExperience("Company Y", LocalDate.of(2009,5,1),
                LocalDate.of(2013,12,12)));

        juanResume.setExperiences(experiences);

        List<Reference> references=juanResume.getReferences();
        references.add(new Reference("Pedro","8092361478"));
        references.add(new Reference("Carlos","8094561236"));

        juanResume.setReferences(references);

        System.out.println(juanResume);

        Resume karinaResume=(Resume) juanResume.clone();
        System.out.println("Karina Resume "+ karinaResume);




    }
}
