package com.mir.ems.profile.emap.v2;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisteredReport {

	private String srcEMA, destEMA, responseDescription, requestID, service, type, time;
	private int responseCode;
	
	@Override
	public String toString() {

		JSONObject json = new JSONObject();

		try {

			json.put("SrcEMA", getSrcEMA());
			json.put("DestEMA", getDestEMA());
			json.put("responseCode", getResponseCode());
			json.put("responseDescription", getResponseDescription());
			json.put("requestID", getRequestID());
			json.put("service", getService());
//			json.put("type", getType());
			json.put("time", getTime());
			
			return json.toString();

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return "wrong";
		}

	}

	
	public String getSrcEMA() {
		return srcEMA;
	}
	public void setSrcEMA(String srcEMA) {
		this.srcEMA = srcEMA;
	}
	public String getDestEMA() {
		return destEMA;
	}
	public void setDestEMA(String destEMA) {
		this.destEMA = destEMA;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
	
}
