package example.springdata.rest.projections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Montadora {

    @GeneratedValue
    @Id//
    private Long id;
    private String nome;

    public Montadora() {
        this.nome = null;
    }

    public Montadora(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return String.format("%s", nome);
    }

}
