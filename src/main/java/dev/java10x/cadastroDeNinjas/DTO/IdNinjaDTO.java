package dev.java10x.cadastroDeNinjas.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

// Aumentar o Max se passar de 50 ninjas cadastardos!

public record IdNinjaDTO(

        @Max(value = 50, message = "O ID não pode ser maior que 20")
        @Min(value = 1, message = "O ID deve ser maior ou igual a 1")
        Long id
) {
}
