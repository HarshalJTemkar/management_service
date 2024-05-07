package harshal.temkar.management_service.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import harshal.temkar.management_service.dao.ManagementDao;
import harshal.temkar.management_service.model.Hotel;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor
@CacheConfig(cacheNames = { "management" })
public class ManagementService {

	private final ManagementDao managementDao;

	public Hotel createHotel(Hotel hotel) {
		log.info("ManagementService ==> createHotel ==> Start");
		return managementDao.save(hotel);
	}

	public Hotel getHotelById(String id) {
		log.info("ManagementService ==> createHotel ==> Start");
		return managementDao.findById(id).orElse(null);
	}
}
