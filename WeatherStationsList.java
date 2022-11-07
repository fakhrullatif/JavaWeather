public class WeatherStationsList {
	
	//data
	public int NUM = 2;
	WeatherStations stations[] = new WeatherStations[NUM];
	
	//operations
	
	public void input()
	{
		for (int i = 0; i < NUM; i++) {
			stations[i] = new WeatherStations();
            System.out.println("Location #" + (i + 1));
            stations[i].readWeatherStationData();
        }
	}
	
	public void dispWeatherStatistic() 
	{
        for(int i = 0; i < NUM; i++) {
            System.out.println("--Weather Statistic for Location #" + (i+1) + "--");
            stations[i].calcWeatherStatistic();
        }
    }
	
	public int calcMaxNumSensors() {
        int max = stations[0].numSensors;
        for (int i=1; i<NUM; i++) {
            if (max < stations[i].numSensors) {
                max = stations[i].numSensors;
            }
        }
        return max;
    }
    
    public int calcMinNumSensors() {
        int min = stations[0].numSensors;
        for (int i=1; i<NUM; i++) {
            if (min > stations[i].numSensors) {
                min = stations[i].numSensors;
            }
        }    
        return min;
    }
    
    public float calcAvgNumSensors() {
        float sum = 0;
            for (int i=0; i<NUM; i++) {
                sum += stations[i].numSensors;
            }    
        float avg = sum / NUM;    
        return avg;
    }
	
	public static void main(String args[])
	{
		WeatherStationsList wsl = new WeatherStationsList();
		wsl.input();
		wsl.dispWeatherStatistic();
		
		System.out.println("--Sensor Statistic for all Locations--");
		int maxSensor = wsl.calcMaxNumSensors();
		System.out.println("MaxSensor : " + maxSensor); 
		int minSensor = wsl.calcMinNumSensors();
		System.out.println("MinSensor : " + minSensor); 
		float avgSensor = wsl.calcAvgNumSensors();
		System.out.println("AvgSensor : " + avgSensor); 
	}
	
}
