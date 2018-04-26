package com.xmlParser.myParser;

public class TourDestination {
	private String title;
	private String tel;	
	private String mapx;
	private String mapy;
	private int create_time;
	private int content_type_id;
	private int content_id;
	private String cat1;
	private String cat2;
	private String cat3;
	private int areaCode;
	private String addr1;
	private String addr2;
	
	public TourDestination() {
		
	}
	
	public TourDestination(String title, String tel, String mapx, String mapy, int create_time, int content_type_id, int content_id, String cat1, String cat2, String cat3, int areaCode, String addr1, String addr2) {
		this.title = title;
		this.tel = tel;
		this.mapx = mapx;
		this.mapy = mapy;
		this.create_time = create_time;
		this.content_type_id = content_type_id;
		this.content_id = content_id;
		this.cat1 = cat1;
		this.cat2 = cat2;
		this.cat3 = cat3;
		this.areaCode = areaCode;
		this.addr1 = addr1;
		this.addr2 = addr2;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMapx() {
		return mapx;
	}

	public void setMapx(String mapx) {
		this.mapx = mapx;
	}

	public String getMapy() {
		return mapy;
	}

	public void setMapy(String mapy) {
		this.mapy = mapy;
	}

	public int getCreate_time() {
		return create_time;
	}

	public void setCreate_time(int create_time) {
		this.create_time = create_time;
	}

	public int getContent_type_id() {
		return content_type_id;
	}

	public void setContent_type_id(int content_type_id) {
		this.content_type_id = content_type_id;
	}

	public int getContent_id() {
		return content_id;
	}

	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}

	public String getCat1() {
		return cat1;
	}

	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public String getCat2() {
		return cat2;
	}

	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}

	public String getCat3() {
		return cat3;
	}

	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
}
