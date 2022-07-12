package com.arang.medici.storage.domain;

import java.util.List;

public class Artwork {
	
	private String artworkNum;
	private String storage;
	private String storagePeiod;
	private String dbService;
	private List<Artwork> artWork;
	
	public Artwork() {
		
	}

	public String getArtworkNum() {
		return artworkNum;
	}

	public void setArtworkNum(String artworkNum) {
		this.artworkNum = artworkNum;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getStoragePeiod() {
		return storagePeiod;
	}

	public void setStoragePeiod(String storagePeiod) {
		this.storagePeiod = storagePeiod;
	}

	public String getDbService() {
		return dbService;
	}

	public void setDbService(String dbService) {
		this.dbService = dbService;
	}

	public List<Artwork> getArtWork() {
		return artWork;
	}

	public void setArtWork(List<Artwork> artWork) {
		this.artWork = artWork;
	}
	
	
	
}
