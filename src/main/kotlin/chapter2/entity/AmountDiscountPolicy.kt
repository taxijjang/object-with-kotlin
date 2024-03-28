package org.osds.chapter2.entity

/**
 * 금액 할인 정책
 */
class AmountDiscountPolicy(
    private var discountAmount: Money,
) : DiscountPolicy() {
    constructor(
        discountAmount: Money,
        conditions: MutableList<DiscountCondition>,
    ) : this(discountAmount) {
        super.conditions = conditions
        this.discountAmount = discountAmount
    }

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}