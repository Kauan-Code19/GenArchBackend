package com.kauanProjects.GenArch.dtos.collections.mvc;

import com.kauanProjects.GenArch.dtos.collections.ProjectsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MvcProjectsCollectionDto extends ProjectsDto {

    private OptionsMvcDto options;

}
