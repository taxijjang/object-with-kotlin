package org.osds.chapter2.entity

/**
 * 할인 정책
 */
abstract class DiscountPolicy(
    protected var conditions: MutableList<DiscountCondition> = mutableListOf(),
) {
    fun calculateDiscountAmount(screening: Screening): Money {
        for (each in conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    abstract protected fun getDiscountAmount(screening: Screening): Money
}