package dev.java10x.cadastroDeNinjas.DTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public record CreateNinjaDTO(

        @Size(max = 150, min = 1, message = "O nome deve ter no maximo 150 caracteres")
        @NotBlank
        String name,

        @Pattern(regexp = "GENIN|CHUUNIN|JOUNIN|ANBU|KAGE", message = "O rank do ninja deve ser 'GENIN', 'CHUUNIN', 'JOUNIN', 'ANBU' ou 'KAGE'")
        String rank,

        @Pattern(regexp = "KONOHAGAKURE|SUNAGAKURE|KIRIGAKURE|KUMOGAKURE|IWAGAKURE", message = "A vila do ninja deve ser 'KONOHAGAKURE', 'SUNAGAKURE', 'KIRIGAKURE', 'KUMOGAKURE' ou 'IWAGAKURE'")
        String vila

) {
}
