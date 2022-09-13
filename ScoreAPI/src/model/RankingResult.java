package model;

import java.io.Serializable;
import java.util.List;

public class RankingResult implements Serializable{
	private int lastId;
	private int rank;
	private List<Score> list;
	private boolean isRankingIn;
	public RankingResult() {}
	public int getLastId() {
		return lastId;

}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public List<Score> getList() {
		return list;
	}
	public void setList(List<Score> list) {
		this.list = list;
	}
	public boolean isRankingIn() {
		return isRankingIn;
	}
	public void setRankingIn(boolean isRankingIn) {
		this.isRankingIn = isRankingIn;
	}
	public void setLastId(int lastId) {
		this.lastId = lastId;
	}

}
