package org.osds.chapter2.entity

import java.time.DayOfWeek
import java.time.LocalTime

/**
 * 기간 조건
 */
class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime,
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.startTime.dayOfWeek == dayOfWeek
                && startTime.compareTo(screening.startTime.toLocalTime()) <= 0
                && endTime.compareTo(screening.startTime.toLocalTime()) >= 0
    }
}