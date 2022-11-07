
public class WeatherList {
	
	//data
	public int NUMDATA = 100;
	
	//create array / object
	Weather readings[] = new Weather[NUMDATA]; 
	
	//operation
	public void readWeather()
	{
		float TempRange[] =  {20, 45};
		float HumiRange[] =  {0, 50};
		float PreciRange[] =  {0, 100};
		float WindRange[] =  {0, 20};
		
		for (int i=0; i<readings.length; i++) {
			readings[i] = new Weather(); 			
			//System.out.println("Weather #" + i);
			readings[i].generate(TempRange, WindRange, PreciRange, HumiRange);
			//readings[i].temperature = 0;  //attribute is evolvable
			//readings[i].display();
		} 
	}
	
	public float minTemp(){
		
		float min = readings[0].temperature;
		for (int i=1; i<NUMDATA; i++) {
            if (min > readings[i].temperature) {
                min = readings[i].temperature;
            }
        }
		
        return min;
	}
	
	public float minHumidity(){
		float min = readings[0].humidity;
		for (int i=1; i<NUMDATA; i++) {
            if (min > readings[i].humidity) {
                min = readings[i].humidity;
            }
        }
		
        return min;
	}
	
	public float minPrecipitation(){
		float min = readings[0].precipitation;
		for (int i=1; i<NUMDATA; i++) {
            if (min > readings[i].precipitation) {
                min = readings[i].precipitation;
            }
        }
		
        return min;
	}
	public float minWind(){
		float min = readings[0].wind;
		for (int i=1; i<NUMDATA; i++) {
            if (min > readings[i].wind) {
                min = readings[i].wind;
            }
        }
		
        return min;
	}
	
	public float maxTemp(){
		float max = readings[0].temperature;
		for (int i=1; i<NUMDATA; i++) {
            if (max < readings[i].temperature) {
                max = readings[i].temperature;
            }
        }
		
        return max;
	}
	
	public float maxHumidity(){
		float max = readings[0].humidity;
		for (int i=1; i<NUMDATA; i++) {
            if (max < readings[i].humidity) {
                max = readings[i].humidity;
            }
        }
		
        return max;
	}
	
	public float maxPrecipitation(){
		float max = readings[0].precipitation;
		for (int i=1; i<NUMDATA; i++) {
            if (max < readings[i].precipitation) {
                max = readings[i].precipitation;
            }
        }
		
        return max;
	}
	
	public float maxWind(){
		float max = readings[0].wind;
		for (int i=1; i<NUMDATA; i++) {
            if (max < readings[i].wind) {
                max = readings[i].wind;
            }
        }
		
        return max;
	}
	
	public float avgTemp(){
		float sum = 0;
		for (int i=1; i<NUMDATA; i++) {
            sum += readings[i].temperature;
        }
		float avg = sum / NUMDATA;
		
        return avg;
	}
	
	
	public float avgHumidity(){
		float sum = 0;
		for (int i=1; i<NUMDATA; i++) {
            sum += readings[i].humidity;
        }
		float avg = sum / NUMDATA;
		
        return avg;
	}
	
	public float avgPrecipitation(){
		float sum = 0;
		for (int i=1; i<NUMDATA; i++) {
            sum += readings[i].precipitation;
        }
		float avg = sum / NUMDATA;
		
        return avg;
	}
	
	public float avgWind(){
		float sum = 0;
		for (int i=1; i<NUMDATA; i++) {
            sum += readings[i].wind;
        }
		float avg = sum / NUMDATA;
		
        return avg;
	}
	
	public double stdDevTemp(float avg){
		float sum = 0;
		
		for (int i=1; i<NUMDATA; i++) {
			sum += Math.pow((readings[i].temperature - avg), 2);
        }
		
		double stdDev = Math.sqrt(sum / NUMDATA);
		
        return stdDev;
	}
	
	public double stdDevHumidity(float avg){
		float sum = 0;
		
		for (int i=1; i<NUMDATA; i++) {
			sum += Math.pow((readings[i].humidity - avg), 2);
        }
		
		double stdDev = Math.sqrt(sum / NUMDATA);
		
        return stdDev;
	}
	
	public double stdDevPrecipitation(float avg){
		float sum = 0;
		
		for (int i=1; i<NUMDATA; i++) {
			sum += Math.pow((readings[i].precipitation - avg), 2);
        }
		
		double stdDev = Math.sqrt(sum / NUMDATA);
		
        return stdDev;
	}
	
	public double stdDevWind(float avg){
		float sum = 0;
		
		for (int i=1; i<NUMDATA; i++) {
			sum += Math.pow((readings[i].wind - avg), 2);
        }
		
		double stdDev = Math.sqrt(sum / NUMDATA);
		
        return stdDev;
	}
	
	/*
	public void dispWeatherList(){
		float minTemperature = wl.minTemp();
		System.out.println("MIN TEMPERATURE : " + minTemperature);
        float minHumi = wl.minHumidity();
        float minPreci = wl.minPrecipitation();
        float minWindSpeed = wl.minWind();
        float maxTemperature = wl.maxTemp();
        System.out.println("MAX TEMPERATURE : " + maxTemperature);
        float maxHumi = wl.maxHumidity();
        float maxPreci = wl.maxPrecipitation();
        float maxWindSpeed = wl.maxWind();
        float avgTemperature = wl.avgTemp();
        System.out.println("AVG TEMPERATURE : " + avgTemperature);
        float avgHumi = wl.avgHumidity();
        float avgPreci = wl.avgPrecipitation();
        float avgWindSpeed = wl.avgWind();
        float stdDevTemperature = wl.stdDevTemp(avgTemperature);
        System.out.println("STDDEV TEMPERATURE : " + stdDevTemperature);
        float stdDevHumi = wl.stdDevHumidity(avgHumi);
        float stdDevPreci = wl.stdDevPrecipitation(avgPreci);
        float stdDevWindSpeed = wl.stdDevWind(avgWindSpeed);
	}
	*/
	
	public static void main(String args[]){
		
		WeatherList wl = new WeatherList();
		wl.readWeather();
		//wl.dispWeatherList();
		
		float minTemperature = wl.minTemp();
		System.out.println("MIN TEMPERATURE : " + minTemperature);
        float minHumi = wl.minHumidity();
        float minPreci = wl.minPrecipitation();
        float minWindSpeed = wl.minWind();
        float maxTemperature = wl.maxTemp();
        System.out.println("MAX TEMPERATURE : " + maxTemperature);
        float maxHumi = wl.maxHumidity();
        float maxPreci = wl.maxPrecipitation();
        float maxWindSpeed = wl.maxWind();
        float avgTemperature = wl.avgTemp();
        System.out.println("AVG TEMPERATURE : " + avgTemperature);
        float avgHumi = wl.avgHumidity();
        float avgPreci = wl.avgPrecipitation();
        float avgWindSpeed = wl.avgWind();
        double stdDevTemperature = wl.stdDevTemp(avgTemperature);
        System.out.println("STDDEV TEMPERATURE : " + stdDevTemperature);
        double stdDevHumi = wl.stdDevHumidity(avgHumi);
        double stdDevPreci = wl.stdDevPrecipitation(avgPreci);
        double stdDevWindSpeed = wl.stdDevWind(avgWindSpeed);
		
		
	}
	
}
