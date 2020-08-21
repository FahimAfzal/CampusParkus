public class Location {
    protected int id;
    protected String parkType;
    protected String parkName;
    protected String parkAddress;
    protected double lat;
    protected double lng;
    protected String studOCPrice;
    protected String staffOCPrice;
    protected String stfstudCreditPrice;
    protected String visitCreditPrice;
    protected String cashPrice;
    protected String EV;
    
    public Location(int id, String parkType, String parkName, String parkAddress,
    		double lat, double lng, String studOCPrice, String staffOCPrice, String stfstudCreditPrice,
    		String visitCreditPrice, String cashPrice, String EV)
    {
    	this.id = id;
    	this.parkType = parkType;
    	this.parkName = parkName;
    	this.parkAddress = parkAddress;
    	this.lat = lat;
    	this.lng = lng;
    	this.studOCPrice = studOCPrice;
    	this.staffOCPrice = staffOCPrice;
    	this.stfstudCreditPrice = stfstudCreditPrice;
    	this.visitCreditPrice = visitCreditPrice;
    	this.cashPrice = cashPrice;
    	this.EV = EV;
    }
    
    public int getID()
    {
    	return id;
    }
    
    public String getParkType()
    {
    	return parkType;
    }
    
    public String getParkName()
    {
    	return parkName;
    }
    
    public String getParkAddress()
    {
    	return parkAddress;
    }
    
    public double getLat()
    {
    	return lat;
    }
    
    public double getLng()
    {
    	return lng;
    }
    
    public String getStudOCPrice()
    {
    	return studOCPrice;
    }
    
    public String getStaffOCPrice()
    {
    	return staffOCPrice;
    }
    
    public String getStfstudCreditPrice()
    {
    	return stfstudCreditPrice;
    }
    
    public String getVisitCreditPrice()
    {
    	return visitCreditPrice;
    }
    
    public String getCashPrice()
    {
    	return cashPrice;
    }
    
    public String getEV()
    {
    	return EV;
    }
    
    public void setID(int id)
    {
    	this.id = id;
    }
    
    public void setParkType(String parkType)
    {
    	this.parkType = parkType;
    }
    
    public void setParkName(String parkName)
    {
    	this.parkName = parkName;
    }
    
    public void setParkAddress(String parkAddress)
    {
    	this.parkAddress = parkAddress;
    }
    
    public void setLat(double lat)
    {
    	this.lat = lat;
    }
    
    public void setLng(double lng)
    {
    	this.lng = lng;
    }
    
    public void setStudOCPrice(String studOCPrice)
    {
    	this.studOCPrice = studOCPrice;
    }
    
    public void setStaffOCPrice(String staffOCPrice)
    {
    	this.staffOCPrice = staffOCPrice;
    }
    
    public void setStfstudCreditPrice(String stfstudCreditPrice)
    {
    	this.stfstudCreditPrice = stfstudCreditPrice;
    }
    
    public void setVisitCreditPrice(String visitCreditPrice)
    {
    	this.visitCreditPrice = visitCreditPrice;
    }
    
    public void setCashPrice(String cashPrice)
    {
    	this.cashPrice = cashPrice;
    }
    
    public void setEV(String EV) {
    	this.EV = EV;
    }
}
