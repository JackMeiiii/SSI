package mhf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mhf.dao.GameDAO;
import mhf.service.GameService;
public class GameServiceImpl implements GameService {

	private GameDAO gameDao;

	@Override
	public int getPrizeByLevel(int level) {
		System.out.println(level+"Service");
		return gameDao.selectPrizeByLevel(level);
	}

	public GameDAO getGameDao() {
		return gameDao;
	}
	@Autowired
	public void setGameDao(GameDAO gameDao) {
		this.gameDao = gameDao;
	}

}
