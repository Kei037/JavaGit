package com.arang.medici.storage.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arang.medici.storage.dao.ArtworkDao;
import com.arang.medici.storage.domain.Artwork;
import com.arang.medici.storage.domain.Wallet;

@WebServlet("/service/storage_service2")
public class StorageServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ArtworkService artworkService = ArtworkService.getInstance();
		artworkService = new ArtworkService(new ArtworkDao());
		
		String artworkNum = request.getParameter("artworkName");
		String storageAddr1 = request.getParameter("storageAddr1");
		String storageAddr2 = request.getParameter("storageAddr2");
		String startPeriod = request.getParameter("startPeriod");
		String endPeriod = request.getParameter("endPeriod");
		String deliveryService = request.getParameter("deliveryService");
		
		String walletId = request.getParameter("walletId");
		Double inputBalance = Double.parseDouble(request.getParameter("inputBalance"));
		
		RequestDispatcher dispatcher = null;
		
		Wallet wallet = new Wallet();
		wallet.setWalletId(walletId);
		wallet.setInputBalance(inputBalance);
		wallet = artworkService.payment(wallet);
		request.setAttribute("wallet", wallet);
		if (wallet.getFailMsg() != null) {
			dispatcher = request.getRequestDispatcher("/service/storage_fail.jsp");
			dispatcher.forward(request, response);
		}
		
		
		Artwork artwork = new Artwork();
		artwork.setArtworkNum(artworkNum);
		artwork.setStorage(storageAddr1 + storageAddr2);
		artwork.setStartPeriod(startPeriod);
		artwork.setEndPeriod(endPeriod);
		artwork.setDbService(deliveryService);
		
		
		artworkService.addArtwork(artwork);
		request.setAttribute("artwork", artwork);
		
		List<Artwork> artworkList = artworkService.findAllArtwork();
		request.setAttribute("artworkList", artworkList);
		
		dispatcher = request.getRequestDispatcher("/service/storage_service1.jsp");
		dispatcher.forward(request, response);
	}

}
