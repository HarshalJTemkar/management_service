package harshal.temkar.management_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import harshal.temkar.management_service.model.Hotel;

public interface ManagementDao extends JpaRepository<Hotel, String> {

}
