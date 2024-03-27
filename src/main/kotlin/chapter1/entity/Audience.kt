package org.osds.chapter1.entity

/**
 * 관람객
 */
class Audience(
    private var bag: Bag
) {
    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}