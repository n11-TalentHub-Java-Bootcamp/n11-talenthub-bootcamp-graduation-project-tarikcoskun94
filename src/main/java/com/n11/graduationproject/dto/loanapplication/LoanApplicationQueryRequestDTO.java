package com.n11.graduationproject.dto.loanapplication;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.n11.graduationproject.enum_.LoanApplicationStatus;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class LoanApplicationQueryRequestDTO {

    @Size(min = 11, max = 11, message = "TC identification no must be exact 11 character.")
    @NotBlank(message = "TC identification no is mandatory.")
    @Pattern(regexp = "^\\d+$", message = "TC identification no must include only numbers.")
    private String TCIdentificationNo;

    @NotNull(message = "Birth date is mandatory.")//TODO: Tarihlerde nasıl NotBlank kontrolü yapılabilir? Best practice?
    @JsonFormat(pattern = "dd-MM-yyyy") //TODO: Burada hata mesajı yönetimi yapılabilir mi?
    private LocalDate birthDate;
}
