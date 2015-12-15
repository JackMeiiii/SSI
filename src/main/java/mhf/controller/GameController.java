package mhf.controller;

import javax.servlet.http.HttpServletRequest;

import mhf.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

	private GameService gameService;

	public GameService getGameService() {
		return gameService;
	}

	@Autowired
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}
	
	@RequestMapping("{level}/ShowPrize")
	public String getPrizeByLevel(@PathVariable int level,HttpServletRequest request){
		System.out.println(level+"Controller");
		int prize=gameService.getPrizeByLevel(level);
		request.setAttribute("prize",prize);
		return "ShowPrize";
		
	}
}
