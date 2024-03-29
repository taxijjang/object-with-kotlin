package org.osds.chapter2.entity.discountpolicy

import org.osds.chapter2.entity.Money
import org.osds.chapter2.entity.Screening

class NoneDiscountPolicy : DefaultDiscountPolicy() {
    override fun calculateDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}