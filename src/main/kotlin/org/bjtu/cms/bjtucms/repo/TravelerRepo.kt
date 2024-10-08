package org.bjtu.cms.bjtucms.repo

import org.bjtu.cms.bjtucms.dao.Traveler
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TravelerRepo : JpaRepository<Traveler, Long> {

    fun save(traveler: Traveler): Traveler

    fun getTravelerById(id: String): Traveler?

    fun findByBirthYearBetween(from: Int, to: Int): List<Traveler>

    fun findByTotalTravelMilesBetween(from: Int, to: Int): List<Traveler>

    fun findByTotalTravelTimeBetween(from: Int, to: Int): List<Traveler>
}
