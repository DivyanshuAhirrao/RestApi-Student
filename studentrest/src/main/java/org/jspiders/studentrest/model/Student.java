package org.jspiders.studentrest.model;

import jdk.jfr.SettingDefinition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {
    private int id;
    private String name;
    private String stream;
    private double percentage;
    private String course;
}
