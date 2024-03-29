package org.osds.chapter2.entity.discountpolicy

import org.osds.chapter2.entity.Money
import org.osds.chapter2.entity.Screening

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}