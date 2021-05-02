package com.covidhelp.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.covidhelp.model.ForCovidHelp;

@Repository
public interface ForCovidHelpRepository extends MongoRepository<ForCovidHelp, ObjectId>{

}



//public interface IUser extends MongoRepository<User, Integer> {
//	
//	@Query("{ 'email' : ?0 }")
//}


