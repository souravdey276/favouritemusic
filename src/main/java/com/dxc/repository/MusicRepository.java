package com.dxc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Musicfav;

@Repository
public interface MusicRepository extends MongoRepository<Musicfav, String> {

}
