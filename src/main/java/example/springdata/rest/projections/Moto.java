package example.springdata.rest.projections;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Moto {

    @GeneratedValue
    @Id//
    private Long id;
    private String modelo;
    private Integer ano;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)//
    private Montadora montadora;

    public Moto() {
        this.modelo = null;
        this.ano = null;
        this.montadora = null;
    }

    public Moto(String modelo, Integer ano, Montadora montadora) {
        this.modelo = modelo;
        this.ano = ano;
        this.montadora = montadora;
    }

    public String toString() {
        return String.format("%s", modelo, "%s", ano, "%s", montadora);
    }

}
