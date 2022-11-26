package pl.sda.hibernate.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@NoArgsConstructor

public class Student {

    //POJO - Plain Old Java Object
    // klasa, która posiada :
    // - prywatne pola,
    // - gettery, settery,
    // - pusty kontruktor
    // @NoArgsConstructor


@Id // PRIMARY KEY
@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
private Long id;                                                       // `id`                      INT PRIMARY KEY AUTO_INCREMENT,
    @Column(nullable = false)
    private String imie;                                               // `imie`                    VARCHAR(255),
    private LocalDate dataUrodzenia;                                   // `data_urodzenia`          DATE,
    private String kierunekNauczania;                                   // `kierunek_nauczania`     VARCHAR (255),
    private String indeks; //index jest słowem zabrionionym przez mysql // `indeks`                 VARCHAR(255),
}
