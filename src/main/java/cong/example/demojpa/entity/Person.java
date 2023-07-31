package cong.example.demojpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name = "Person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @Column(unique = true) // (Optional) If you want to enforce uniqueness at the database level
    private String email;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonIgnore
    private School school;

}