package harshal.temkar.management_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harshal.temkar.management_service.model.Hotel;
import harshal.temkar.management_service.service.ManagementService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/rest-api/management/v1")
@RequiredArgsConstructor
@Log4j2
public class ManagementController {

	private final ManagementService managementService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@Valid @RequestBody Hotel hotel) {
    	log.info("ManagementController ==> createHotel ==> Start");
        Hotel createdHotel = managementService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@NotBlank @PathVariable String id) {
    	log.info("ManagementController ==> getHotelById ==> Start");
        Hotel hotel = managementService.getHotelById(id);
        if (hotel != null) {
            return ResponseEntity.ok(hotel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
