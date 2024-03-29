package org.osds.chapter2.entity.discountpolicy

import org.osds.chapter2.entity.DiscountCondition
import org.osds.chapter2.entity.Money
import org.osds.chapter2.entity.Screening

/**
 * 비율 할인 정책
 */
class PercentDiscountPolicy(
    private var percent: Double,
) : DefaultDiscountPolicy() {
    constructor(
        percent: Double,
        conditions: MutableList<DiscountCondition>,
    ) : this(percent) {
        super.conditions = conditions
        this.percent = percent
    }

    override fun calculateDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}