package com.kauanProjects.GenArch.dtos.collections.mvc;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Set;

@NoArgsConstructor
@Getter
public class OptionsMvcDto {

    @NotBlank(message = "Architecture cannot be blank")
    private String architecture;

    @Min(value = 0, message = "Controller count must be non-negative")
    private int controllerCount;

    @Min(value = 0, message = "Service count must be non-negative")
    private int serviceCount;

    @Min(value = 0, message = "DTO count must be non-negative")
    private int dtoCount;

    @Min(value = 0, message = "Repository count must be non-negative")
    private int repositoryCount;

    @Min(value = 0, message = "Domain count must be non-negative")
    private int domainCount;

    @Min(value = 0, message = "Config count must be non-negative")
    private int configCount;

    private Set<String> annotations;  // Can be null if the user doesn't want to add annotations

}
