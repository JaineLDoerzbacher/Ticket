package ticket.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import ticket.entities.Ticket

@Repository
interface TicketRepository : JpaRepository<Ticket, Long>{
}