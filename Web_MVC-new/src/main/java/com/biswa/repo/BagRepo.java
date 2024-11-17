package com.biswa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswa.entity.Bag;

public interface BagRepo extends JpaRepository<Bag, Integer> {

}
