package jmauriciorlima.github.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "contato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(length = 150)
    private String name;
    @Column
    private String email;
    @Column
    private String subject;
    @Column(columnDefinition = "text")
    private String message;

}
