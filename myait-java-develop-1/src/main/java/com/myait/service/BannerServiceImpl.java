package com.myait.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myait.model.Banner;
import com.myait.repository.BannerRepository;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerRepository bannerRepository;

	@Override
	public List<Banner> getAllBanner() {
		// TODO Auto-generated method stub
		return bannerRepository.findAll();
	}

}
