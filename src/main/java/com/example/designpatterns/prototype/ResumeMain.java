package com.example.designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class ResumeMain implements Cloneable{

    protected PersonalInformation profile;
    protected List<LabolExperience> experiences;
    protected List<Reference> references;
    protected List<ThecnicalSkill> skills;

    public ResumeMain() {
        initialized();
    }

    @Override
    public ResumeMain clone() throws CloneNotSupportedException {
        initialized();
        ResumeMain resume=(ResumeMain) super.clone();


        return resume;
    }

    private void initialized() {
        experiences=new ArrayList<>();
        skills=new ArrayList<>();
        references=new ArrayList<>();
        profile=new PersonalInformation();

    }

    @Override
    public String toString() {
        return "ResumeMain{" +
                "profile=" + profile +
                ", experiences=" + experiences +
                ", references=" + references +
                ", skills=" + skills +
                '}';
    }
}
