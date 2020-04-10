package com.admin.kanji.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Getter
@ToString
public class Kanji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String character;
    private String oniomy;
    private String kunyomi;
    private String meaning;
    private String category;
}
