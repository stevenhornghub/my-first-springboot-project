package com.bib.basiclibraryspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Steven Horng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private Long id;
    private String name;
    private String description;
    private String genre;
    private String author;
}
