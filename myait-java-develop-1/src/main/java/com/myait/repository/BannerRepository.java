package com.myait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myait.model.Banner;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer> {

}
