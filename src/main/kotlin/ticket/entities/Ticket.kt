package ticket.entities

import com.fasterxml.jackson.annotation.JsonFormat
import ticket.enuns.StatusTicket
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.PastOrPresent
import javax.validation.constraints.Size

@Entity
data class Ticket(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @field: NotBlank @field: Size(max = 60) val titulo: String,
    @JsonFormat(pattern = "dd/mm/yyyy")
    @PastOrPresent
    val dataCriacao: LocalDateTime,
    @field: NotBlank @field: Size(max = 4000)
    val descricao: String,
    var status: StatusTicket
)
