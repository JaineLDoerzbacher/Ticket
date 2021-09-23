package ticket.controllers

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import ticket.dtos.TicketDTO
import ticket.enuns.StatusTicket
import ticket.repositories.TicketRepository
import javax.validation.Valid

@Validated
@Controller("/tickets")
class TicketController (val ticketRepository: TicketRepository){

    @Post
    fun cadastraTicket(@Body @Valid request: TicketDTO){

        var ticket = request.paraTicket()
        ticket.status = StatusTicket.ABERTO
        ticketRepository.save(ticket)


    }

}