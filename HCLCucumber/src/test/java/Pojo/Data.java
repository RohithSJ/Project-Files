package Pojo;

	import java.util.List;

	public class Data {
	    private int year;
	    private List<DeviceType> devicetype;

	    // Getters and Setters
	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public List<DeviceType> getDevicetype() {
	        return devicetype;
	    }

	    public void setDevicetype(List<DeviceType> devicetype) {
	        this.devicetype = devicetype;
	    }

	    @Override
	    public String toString() {
	        return "Data{" +
	                "year=" + year +
	                ", devicetype=" + devicetype +
	                '}';
	    }
}

	
	
	

