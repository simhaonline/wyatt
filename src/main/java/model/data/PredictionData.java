package model.data;

import java.util.ArrayList;
import java.util.List;

public class PredictionData {

	public Double sellConfidencePercentage;
	public Double sellPrice;
	public static Double buyBackAfterThisPercentage = 0.9965;
	public List<AverageData> averageData;

	public PredictionData() {
		averageData = new ArrayList<AverageData>();
	}

	public void calculatePredictionData() {

	}
}