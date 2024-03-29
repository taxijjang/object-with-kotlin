package org.osds.chapter2.entity.discountpolicy

import org.osds.chapter2.entity.DiscountCondition
import org.osds.chapter2.entity.Money
import org.osds.chapter2.entity.Screening

/**
 * 금액 할인 정책
 */
class AmountDiscountPolicy(
    private var discountAmount: Money,
) : DefaultDiscountPolicy(

) {
    constructor(
        discountAmount: Money,
        conditions: MutableList<DiscountCondition>,
    ) : this(discountAmount) {
        super.conditions = conditions
        this.discountAmount = discountAmount
    }

    override fun calculateDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().minus(discountAmount)
    }
}