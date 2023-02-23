package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dxc.model.Musicfav;
import com.dxc.repository.MusicRepository;

@Service
public class MusicServiceImpl implements MusicService {
	@Autowired
	private MusicRepository repository;
	

	@Override
	public Musicfav addFavourite(Musicfav music) {
		 repository.save(music);
		return music;
	}

	@Override
	public List<Musicfav> getFavourite() {
		
		return repository.findAll();
	}
	
	/*@Override;
	public Music deleteMusic(String musicId) 
	{
		
		Optional<Music> isMusicPresent = repository.findById(musicId);
		if(isMusicPresent.isPresent()) 
		{
			 Music music=isMusicPresent.get();
		        repository.delete(music);
					return true;	
		}
		return false;

       
	}*/
	
	
	@Override
	public Musicfav deleteFavourite(String musicId) {
		Musicfav musicToDelete = repository.findById(musicId).get();
		if(musicToDelete!=null)
		{
			repository.delete(musicToDelete);
		}
		return musicToDelete;
	}
	
	

}
