package ar.lamansys.messages.infrastructure.output.repository;

import ar.lamansys.messages.domain.AddedProductBo;
import ar.lamansys.messages.infrastructure.output.entity.AddedProduct;
import ar.lamansys.messages.infrastructure.output.entity.AddedProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Repository
public interface AddedProductRepository extends JpaRepository<AddedProduct, AddedProductId> {

    /*
    @Transactional(readOnly = true)
    @Query("SELECT NEW ar.lamansys.messages.domain.AddedProductBo(p.productId,p.cartId,p.quantity) " +
            "FROM AddedProduct p " +
            "WHERE p.cartId = :cartId ")
    Stream<AddedProductBo> findAllByCartId(@Param("cartId") String cartId);
    */
}
