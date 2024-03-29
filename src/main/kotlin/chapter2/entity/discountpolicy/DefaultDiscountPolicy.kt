package org.osds.chapter2.entity.discountpolicy

import org.osds.chapter2.entity.DiscountCondition
import org.osds.chapter2.entity.Money
import org.osds.chapter2.entity.Screening

/**
 * 할인 정책
 */
abstract class DefaultDiscountPolicy(
    protected var conditions: MutableList<DiscountCondition> = mutableListOf(),
) : DiscountPolicy {
    fun getDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}