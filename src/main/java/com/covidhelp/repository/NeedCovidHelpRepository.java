package com.covidhelp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.covidhelp.model.NeedCovidHelp;


@Repository
public interface NeedCovidHelpRepository extends MongoRepository<NeedCovidHelp, ObjectId>{

}
