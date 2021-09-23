package ticket.dtos

import com.fasterxml.jackson.annotation.JsonFormat
import io.micronaut.core.annotation.Introspected
import ticket.entities.Ticket
import ticket.enuns.StatusTicket
import java.time.LocalDateTime
import javax.validation.constraints.NotBlank
import javax.validation.constraints.PastOrPresent
import javax.validation.constraints.Size

@Introspected
data class TicketDTO(
    @field: NotBlank @field: Size(max = 60) val titulo: String,
    @JsonFormat(pattern = "dd/mm/yyyy")
    @PastOrPresent
    val dataCriacao: LocalDateTime,
    @field: NotBlank @field: Size(max = 4000)
    val descricao: String,
    val status: StatusTicket

){
    fun paraTicket() : Ticket{

        return Ticket(null, titulo, dataCriacao, descricao, status)
    }
}
