package com.kauanProjects.GenArch.dtos.collections.mvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Set;

@NoArgsConstructor
@Getter
public class OptionsMvcDto {

    private String architecture;
    private int controllerCount;
    private int serviceCount;
    private int dtoCount;
    private int repositoryCount;
    private int domainCount;
    private int configCount;
    private Set<String> annotations;

}
