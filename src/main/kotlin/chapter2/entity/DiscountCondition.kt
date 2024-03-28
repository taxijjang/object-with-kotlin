package org.osds.chapter2.entity

/**
 * 할인 조건
 */
interface DiscountCondition {
    // 할인 가능 여부 확인
    fun isSatisfiedBy(screening: Screening): Boolean
}