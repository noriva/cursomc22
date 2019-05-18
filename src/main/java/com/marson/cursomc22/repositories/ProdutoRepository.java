package com.marson.cursomc22.repositories;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marson.cursomc22.domain.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
