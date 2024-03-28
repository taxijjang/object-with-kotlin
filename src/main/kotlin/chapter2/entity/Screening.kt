package org.osds.chapter2.entity

import java.time.LocalDateTime

/**
 * 상영
 */
class Screening(
    private val movie: Movie,
    private val sequence: Int,
    private val whenScreened: LocalDateTime,
) {
    val startTime: LocalDateTime = whenScreened

    fun isSequence(sequence: Int) = this.sequence == sequence

    fun getMovieFee(): Money {
        return movie.getFee()
    }

    fun reserve(customer: Customer, audienceCount: Int): Reservation {
        return Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }

    private fun calculateFee(audienceCount: Int): Money {
        return movie.calculateMovieFee(this).times(audienceCount.toLong())
    }
}