package com.kauanProjects.GenArch.domain.collections.mvc;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class OptionsMvc {

    private String architecture;
    private int controllerCount;
    private int serviceCount;
    private int dtoCount;
    private int repositoryCount;
    private int domainCount;
    private int configCount;
    private Set<String> annotations;

}
