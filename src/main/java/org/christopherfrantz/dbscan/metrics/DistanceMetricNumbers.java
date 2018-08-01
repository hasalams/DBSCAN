package org.christopherfrantz.dbscan.metrics;

import org.christopherfrantz.dbscan.DistanceMetric;

/**
 * Distance metric implementation for numeric values.
 * 
 * @author <a href="mailto:cf@christopherfrantz.org>Christopher Frantz</a>
 *
 */
public class DistanceMetricNumbers implements DistanceMetric<Number>{

	@Override
	public double calculateDistance(Number val1, Number val2) {
		return Math.abs(val1.doubleValue() - val2.doubleValue());
	}

	@Override
	public double calculateCosineSimilarity(Map<CharSequence,Integer> map1, Map<CharSequence,Integer> map2){
		  CosineSimilarity similarity = new CosineSimilarity();
                  return similarity.cosineSimilarity(map1,map2);
	}

}
