package example.springdata.rest.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "completo", types = Moto.class)
public interface MotoCompletoExcerpt {

    Long getId();
    
    String getModelo();

    Integer getAno();

    @Value("#{target.montadora.toString()}")
    String getMontadora();

}
