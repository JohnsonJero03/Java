package com.john.editor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data

public class code {

    @Id
    @GeneratedValue
    private int id;
    private String raw_code;
}
