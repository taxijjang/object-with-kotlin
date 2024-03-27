package org.osds.chapter1.entity

class TicketSeller(
    private var ticketOffice: TicketOffice,
) {

    fun sellTo(audience: Audience) {
        this.ticketOffice.sellTicketTo(audience)
    }
}
