package org.osds.chapter2.entity

/**
 * 순번 조건
 */
class SequenceCondition(
    private val sequence: Int,
) : DiscountCondition {

    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(sequence)
    }
}