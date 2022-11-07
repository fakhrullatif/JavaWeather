import java.util.Random; // we want to make use of an existing class - Random

public class Weather { // a class consists of data + operation
    // data
	/*
    private float temperature;
    private float wind;
    private float humidity;
    private float precipitation;
    */
	
	public float temperature;
    public float wind;
    public float humidity;
    public float precipitation;
	
    //method | operation : must be tightly coupled to the data
	
	//constructor 
	public Weather(){
		//System.out.println("Constructor is set");
	}
	
    public void generate(float TempRange[], float WindRange[], float PreciRange[], float HumiRange[]) {
		Random rand = new Random(); //rand object
		
		temperature = rand.nextFloat() * (TempRange[1] - TempRange[0]) + TempRange[0]; 
		wind = rand.nextFloat() * (WindRange[1] - WindRange[0]) + WindRange[0]; 
		precipitation = rand.nextFloat() * (PreciRange[1] - PreciRange[0]) + PreciRange[0]; 
		humidity = rand.nextFloat() * (HumiRange[1] - HumiRange[0]) + HumiRange[0]; 
	
    }
  
	public void display() {
		System.out.println("temperature: " + temperature);
		System.out.println("humidity: " + humidity);
		System.out.println("wind: " + wind);
		System.out.println("precipitation: " + precipitation);
	}
  
	 // getter for private attributes 
	public float getTemperature() { 
		return temperature; 
	} 
	
	public float getWind() { 
		return wind; 
	} 
	
	public float getHumidity() { 
		return humidity; 
	} 
	
	public float getPrecipitation() { 
		return precipitation; 
	} 
 
	// setter for private attributes 
	public void setTemperature(float temp) { 
		if (temp > 50) { 
			System.out.println("Error"); 
		return; 
		} 
		temperature = temp;  
	}
	
	public void setWind(float wind) { 
		if (wind > 50) { 
			System.out.println("Error"); 
		return; 
		} 
		//relate to the private class of wind
		this.wind = wind;  
	}
	
	public void setHumidity(float humi) { 
		if (humi > 100) { 
			System.out.println("Error"); 
		return; 
		} 
		
		humidity = humi;  
	}
	
	public void setPrecipitation(float preci) { 
		if (preci > 20) { 
			System.out.println("Error"); 
		return; 
		} 
		precipitation = preci;  
	}
	
	
	public static void main(String args[]) {
      // class  object/instance
		Weather weather = new Weather();

		float TempRange[] =  {20, 45};
		float HumiRange[] =  {0, 50};
		float PreciRange[] =  {0, 100};
		float WindRange[] =  {0, 20};
		weather.generate(TempRange, WindRange, PreciRange, HumiRange);
		System.out.println("Created a weather object: " + weather);
		weather.display();    
		weather.display();    
		
		// create an array of 60 weather
		// An array in Java is an object - it has its own attributes and methods
		// When we first create an array, it will be an array of null
		// its like buying a book shelf... u have the shelf, but not the books
		
		Weather readings[] = new Weather[60]; 
		
		for (int i=0; i<readings.length; i++) {
			readings[i] = new Weather();  
			System.out.println("Weather #" + i);
			readings[i].generate(TempRange, WindRange, PreciRange, HumiRange);
			//readings[i].temperature = 0;  //attribute is evolvable
			readings[i].display();
			readings[i].setTemperature(0);
		} 
	}
	
}
