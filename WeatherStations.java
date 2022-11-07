import java.util.Scanner;

public class WeatherStations {
	
	//data
	public String location;
	public String reportingbody;
	public int numSensors;
	WeatherList weatherData = new WeatherList();
	
	//operations
	
	public void readWeatherStationData()
	{
		Scanner locate = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter location : ");
		location = locate.nextLine();  // Read user input
		Scanner reportbody = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter reporting body : ");
		reportingbody = reportbody.nextLine();  // Read user input
		Scanner sensors = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter number of sensors used : ");
		numSensors = sensors.nextInt();  // Read user input
		
		weatherData.readWeather();
	}
	
	public void calcWeatherStatistic()
	{
		float minTemperature = weatherData.minTemp();
		System.out.println("MIN TEMPERATURE : " + minTemperature);
        float minHumi = weatherData.minHumidity();
        float minPreci = weatherData.minPrecipitation();
        float minWindSpeed = weatherData.minWind();
        float maxTemperature = weatherData.maxTemp();
		System.out.println("MAX TEMPERATURE : " + maxTemperature);
        float maxHumi = weatherData.maxHumidity();
           float maxPreci = weatherData.maxPrecipitation();
           float maxWindSpeed = weatherData.maxWind();
           float avgTemperature = weatherData.avgTemp();
		   System.out.println("AVG TEMPERATURE : " + avgTemperature);
           float avgHumi = weatherData.avgHumidity();
           float avgPreci = weatherData.avgPrecipitation();
           float avgWindSpeed = weatherData.avgWind();
           double stdDevTemperature = weatherData.stdDevTemp(avgTemperature);
           System.out.println("STDDEV TEMPERATURE : " + stdDevTemperature);
		   double stdDevHumi = weatherData.stdDevHumidity(avgHumi);
           double stdDevPreci = weatherData.stdDevPrecipitation(avgPreci);
           double stdDevWindSpeed = weatherData.stdDevWind(avgWindSpeed);
	}
	
	public static void main(String args[])
	{
		int NUM = 2;
		WeatherStations stations[] = new WeatherStations[NUM]; //object
		
		for (int i = 0; i < NUM; i++)
		{
			stations[i] = new WeatherStations();
			stations[i].readWeatherStationData();
			stations[i].calcWeatherStatistic();
		}
		
	}
	
}
