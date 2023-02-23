package com.dxc.service;

import java.util.List;

import com.dxc.model.Musicfav;



public interface MusicService {

	public Musicfav addFavourite(Musicfav music);
	public List<Musicfav> getFavourite();
	public Musicfav deleteFavourite(String musicId);
	/*public Music updateMusic(String email, MusicUser music);*/
}
