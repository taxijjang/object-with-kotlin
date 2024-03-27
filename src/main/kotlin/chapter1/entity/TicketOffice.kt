package org.osds.chapter1.entity

class TicketOffice(
    private var amount: Long,
    tickets: List<Ticket>
) {
    var tickets: MutableList<Ticket> = tickets.toMutableList()

    fun sellTicketTo(audience: Audience) {
        plusAmount(audience.buy(getTicket()))
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }
}