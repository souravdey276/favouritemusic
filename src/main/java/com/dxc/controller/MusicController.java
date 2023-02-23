package com.dxc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dxc.model.Musicfav;
import com.dxc.service.MusicService;



	@RestController
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/api/music")
	
	public class MusicController {	
		@Autowired
		private MusicService musicService;
		
		
		@PostMapping("/addFavourite")
		public ResponseEntity<?> addFavourite(@RequestBody Musicfav music){
			System.out.println(music.getAlbumName());
			musicService.addFavourite(music);
			return new ResponseEntity<Musicfav>(music,HttpStatus.ACCEPTED);
		}
			
		/*public Music addMusic(@RequestBody Music music)
		{
			
			Music musicToAdd = musicService.addMusic(music);
			return musicToAdd;
		}*/
		
		
		@GetMapping("/getFavourite")
		public List<Musicfav> getFavourite()
		{
			return musicService.getFavourite();
		}
		
		
		
		/*@GetMapping("/getMusic/{email}")
		public ResponseEntity<?> getMusic(@PathVariable String email)
		{
			List<Music> allMusic =musicService.getMusic();
			List<Music> getMusic=new ArrayList<>();
			
			for(Music music : allMusic)
			{
				if(music.getEmail().equals(email))
				{
					getMusic.add(music);
				}
			}
			return new ResponseEntity<>(getMusic,HttpStatus.OK);
		}*/
			
		
		
		
		
		
		@DeleteMapping("/deleteFavourite/{musicId}")
		public Musicfav deleteFavourite(@PathVariable String musicId)
		{
			return musicService.deleteFavourite(musicId);
		}
	}


