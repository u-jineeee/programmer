package me.programmer.level2.p92341;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
}
class Solution {
	public int[] solution(int[] fees, String[] records) {
		List<Integer> answer =new ArrayList<>();
		Map<String, Car> map = new TreeMap<>();
		for(String record : records) {
			String[] arr = record.split(" ");
			String carNumber = arr[1];
			Car newCar = map.getOrDefault(carNumber, new Car(carNumber));
			if(arr[2].equals("IN"))
				newCar.addEntryTime(arr[0]);
			else
				newCar.addExitTime(arr[0]);
			map.put(carNumber, newCar);
		}

		for(Map.Entry<String, Car> entryMap : map.entrySet()) {
			entryMap.getValue().calculateTotalParkingTime();
			entryMap.getValue().calculateParkingFee(fees);
			int fee = entryMap.getValue().getParkingFee();
			answer.add(fee);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
class Car {
	String carNumber;
	List<Integer> entryMinutes;
	List<Integer> exitMinutes;

	int totalParkingTime;
	int parkingFee;

	public Car(String carNumber) {
		this.carNumber = carNumber;
		this.entryMinutes = new ArrayList<>();
		this.exitMinutes = new ArrayList<>();
		this.totalParkingTime = 0;
		this.parkingFee = 0;
	}

	public void addEntryTime(String time) {
		entryMinutes.add(timeToMinutes(time));
	}

	public void addExitTime(String time) {
		exitMinutes.add(timeToMinutes(time));
	}

	public int timeToMinutes(String time) {
		String[] arr = time.split(":");
		int hour = Integer.parseInt(arr[0]);
		int minutes = Integer.parseInt(arr[1]);
		return hour * 60 + minutes;
	}

	public void calculateTotalParkingTime() {
		int total = 0;
		int entryIdx = 0;
		int exitIdx = 0;
		while(entryIdx < entryMinutes.size()) {
			int entry = entryMinutes.get(entryIdx);
			int exit;

			if(exitIdx < exitMinutes.size()) {
				exit = exitMinutes.get(exitIdx);
				exitIdx++;
			} else {
				exit = timeToMinutes("23:59");
			}
			entryIdx++;
			total += (exit - entry);
		}
		this.totalParkingTime = total;
	}

	public void calculateParkingFee(int[] fees) {
		int baseTime = fees[0];
		int baseFee = fees[1];
		int unitTime = fees[2];
		int unitFee = fees[3];

		if (this.totalParkingTime <= baseTime) {
			this.parkingFee = baseFee; // 기본 시간 이하면 기본 요금
		} else {
			// 초과 시간 계산
			int exceedingTime = this.totalParkingTime - baseTime;
			int numUnits = (int)Math.ceil((double)exceedingTime / unitTime);

			this.parkingFee = baseFee + (numUnits * unitFee);
		}
	}

	public String getCarNumber() {
		return carNumber;
	}

	public int getTotalParkingTime() {
		return totalParkingTime;
	}

	public int getParkingFee() {
		return parkingFee;
	}
}