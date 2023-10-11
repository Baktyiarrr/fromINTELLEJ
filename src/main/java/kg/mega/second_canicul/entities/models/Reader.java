package kg.mega.second_canicul.entities.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table(name = "tb_reader") @FieldDefaults(level = AccessLevel.PRIVATE)
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String lastName;
    String patronymic;
    String address;
    int telephone;
}
