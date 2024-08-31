package com.kauanProjects.GenArch.dtos.collections;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@Getter
public class ProjectsDto {

    private String id;

    @NotBlank(message = "Project name cannot be blank")
    @Size(max = 100, message = "Project name must be less than 100 characters")
    private String projectName;

    @NotBlank(message = "File name cannot be blank")
    @Size(max = 100, message = "File name must be less than 100 characters")
    private String fileName;

    @NotNull(message = "Generation date cannot be null")
    private Date generationDate;

}
