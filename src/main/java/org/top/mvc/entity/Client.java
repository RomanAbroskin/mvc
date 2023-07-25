package org.top.mvc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// модель клиента
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="client_t")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_f", nullable = false)
    private String name;

    @Column(name="email_f")
    private String email;

    @Override
    public String toString() {
        return id + " - " + name + " - " + email;
    }
}