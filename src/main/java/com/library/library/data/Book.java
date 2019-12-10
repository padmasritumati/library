package com.library.library.data;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name ="name")
    private String name;
    @Column(name ="status")
    private String status;
    @Column(name = "studname")
    private String studName;

}
