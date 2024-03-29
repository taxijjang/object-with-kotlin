package org.osds.chapter2.entity

import org.osds.chapter2.entity.discountpolicy.DefaultDiscountPolicy
import java.time.Duration


/**
 * 영화
 */
class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    private val defaultDiscountPolicy: DefaultDiscountPolicy,
) {
    fun getFee(): Money {
        return fee
    }

    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(defaultDiscountPolicy.calculateDiscountAmount(screening))
    }
}