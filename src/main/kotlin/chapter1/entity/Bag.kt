package org.osds.chapter1.entity

class Bag(
    private var amount: Long = 0,
    private var invitation: Invitation?,
    private var ticket: Ticket?
) {
    constructor(
        amount: Long
    ) : this(amount, null, null)

    constructor(
        invitation: Invitation?, amount: Long
    ) : this(amount, invitation, null)

    fun hold(ticket: Ticket): Long {
        if (hasInvitation()) {
            setTicket(ticket)
            return 0L
        } else {
            setTicket(ticket)
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    private fun hasInvitation(): Boolean {
        return invitation != null
    }

    private fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long) {
        this.amount - amount
    }

    fun plusAmount(amount: Long) {
        this.amount + amount
    }
}