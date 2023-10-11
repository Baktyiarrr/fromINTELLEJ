package kg.mega.second_canicul.entities.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_issuance") @FieldDefaults(level = AccessLevel.PRIVATE)
public class Issuance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Reader readerTicket;
    @ManyToOne
    Book bookCode;
    Date dateIssuance;
    Date dateDelivery;

}
