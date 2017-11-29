package example.springdata.rest.projections;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "onlyMoto", types = Moto.class)
public interface MotoExcerpt {

    Long getId();

    String getModelo();

    Integer getAno();

}
