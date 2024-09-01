package com.kauanProjects.GenArch.repositories.collections.mvc;

import com.kauanProjects.GenArch.domain.collections.mvc.MvcProjectsCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvcProjectsCollectionRepository extends MongoRepository<MvcProjectsCollection, String> {
}
