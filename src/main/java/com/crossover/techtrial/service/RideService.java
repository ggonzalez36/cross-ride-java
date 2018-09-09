/**
 * 
 */
package com.crossover.techtrial.service;

import com.crossover.techtrial.model.Ride;

/**
 * RideService for rides.
 * @author crossover
 *
 */
public interface RideService {
  
  public Ride save(Ride ride);
  
  public Ride findById(Long rideId);

  List<Ride> getAll();
	/**
	 * 
	 * @param count
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<TopDriverDTO> findTopDrivers(long count, LocalDateTime startTime, LocalDateTime endTime);
  

}
