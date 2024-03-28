package org.osds.chapter2.entity

/**
 * 예약
 */
class Reservation(
    private var customer: Customer,
    private var screening: Screening,
    private var fee: Money,
    private var audienceCount: Int,
)