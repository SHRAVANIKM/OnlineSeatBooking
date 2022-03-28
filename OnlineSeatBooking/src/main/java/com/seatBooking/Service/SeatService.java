package com.seatBooking.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.seatBooking.Model.Seat;
import com.seatBooking.Repository.SeatRepo;

@Service
@Component
public class SeatService {

	@Autowired
	SeatRepo repo;

	public Optional<Seat> findBylocationId(int locationId) {

		return repo.findBylocationId(locationId);
	}

}