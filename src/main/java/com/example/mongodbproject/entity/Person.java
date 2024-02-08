package com.example.mongodbproject.entity;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "persons")
public class Person {

    @Id
    private String id;

    @Indexed
    @NonNull
    private String name;

    @NonNull
    private int age;

    @DBRef
    private Adress adress;

}

