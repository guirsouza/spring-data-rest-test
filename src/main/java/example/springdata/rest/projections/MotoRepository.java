package example.springdata.rest.projections;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = MotoExcerpt.class)
public interface MotoRepository extends CrudRepository<Moto, Long> {

    List<Moto> findByModeloIgnoreCase(@Param("modelo") String modelo);
    
    List<Moto> findByMontadoraNome(@Param("nome") String nome);

}
