package com.arang.medici.storage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arang.medici.storage.dataconnect.*;
import com.arang.medici.storage.domain.*;

public class ArtworkDao {
	private DataSource dataSource;
	public ArtworkDao() {
		NamingService ns = NamingService.getInstance();
		dataSource = (DataSource)ns.getAttribute("dataSource");
	}
	
	public void addArtwork(Artwork artwork) {
		String sql = "INSERT INTO Artworks (artworkNum, storage, storagePeriod, deliveryService)"
				+ " VALUES (?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, artwork.getArtworkNum());
				pstmt.setString(2, artwork.getStorage());
				pstmt.setString(3, artwork.getStoragePeiod());
				pstmt.setString(4, artwork.getDbService());
				pstmt.executeLargeUpdate();
			} finally {
				dataSource.close(pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Artwork findArtwork(String artworkNum) {
		String sql = "SELECT * FROM Artworks WHERE artworkNum = ?";
		Artwork artwork = new Artwork();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					pstmt.setString(1, artworkNum);
					artwork.setArtworkNum(rs.getString("artworkNum"));
					artwork.setStorage(rs.getString("storage"));
					artwork.setStoragePeiod("storagePeriod");
					artwork.setDbService("deliveryService");
				}
			}finally {
				dataSource.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return artwork;
	}
	
}
