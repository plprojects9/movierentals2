package com.movie.bo;

public class AllMoviesView {
	
	private String fname;
	private String lname;
	private int movieid;
	private String rentedmoviename;
	
	public AllMoviesView(String fname, String lname, int movieid, String rentedmoviename) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.movieid = movieid;
		this.rentedmoviename = rentedmoviename;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setCustid(int movieid) {
		this.movieid = movieid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getRentedmoviename() {
		return rentedmoviename;
	}
	public void setRentedmoviename(String rentedmoviename) {
		this.rentedmoviename = rentedmoviename;
	}
	@Override
	public String toString() {
		return "AllMoviesView [fname=" + fname + ", lname=" + lname + ", movieid=" + movieid + ", rentedmoviename="
				+ rentedmoviename + "]";
	}
	
		
}
