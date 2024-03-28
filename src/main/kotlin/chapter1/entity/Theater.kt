package org.osds.chapter1.entity

class Theater(
    private var ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}