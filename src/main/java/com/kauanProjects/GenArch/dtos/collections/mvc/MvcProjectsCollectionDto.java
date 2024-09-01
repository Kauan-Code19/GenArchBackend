package com.kauanProjects.GenArch.dtos.collections.mvc;

import com.kauanProjects.GenArch.dtos.collections.ProjectsDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MvcProjectsCollectionDto extends ProjectsDto {

    @Valid
    @NotNull(message = "Options cannot be null")
    private OptionsMvcDto options;

}
