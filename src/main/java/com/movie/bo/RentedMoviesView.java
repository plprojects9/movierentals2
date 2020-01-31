package com.movie.bo;

public class RentedMoviesView {
		
	private int custid;
	private String fname;
	private String lname;
	private String rentedmoviename;
	
	public RentedMoviesView(int custid, String fname, String lname, String rentedmoviename) {
		super();
		this.custid = custid;
		this.fname = fname;
		this.lname = lname;
		this.rentedmoviename = rentedmoviename;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
		return "RentedMoviesView [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", movietitle="
				+ rentedmoviename + "]";
	}
		
}
