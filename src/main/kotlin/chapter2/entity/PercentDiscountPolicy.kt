package org.osds.chapter2.entity

/**
 * 비율 할인 정책
 */
class PercentDiscountPolicy(
    private var percent: Double,
) : DiscountPolicy() {
    constructor(
        percent: Double,
        conditions: MutableList<DiscountCondition>,
    ) : this(percent) {
        super.conditions = conditions
        this.percent = percent
    }

    override fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}