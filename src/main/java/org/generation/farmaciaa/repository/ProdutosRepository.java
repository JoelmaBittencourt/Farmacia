package org.generation.farmaciaa.repository;

import java.util.List;

import org.generation.farmaciaa.model.ProdutosModel;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
	public List<ProdutosModel>findAllByProdutosContainingIgnoreCase(String produtos);
}



