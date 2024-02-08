package com.example.mongodbproject.entity;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "adresses")
public class Adress {
    @Id
    private String id;

    @NonNull
    private String city;

    @NonNull
    private String street;
}
