package com.mir.ems.profile.openadr.recent;

import org.json.JSONException;
import org.json.JSONObject;

public class UpdatedReport {

	private String destEMA, requestID, responseDescription, service, type;
	private int responseCode;

	@Override
	public String toString() {
		JSONObject json = new JSONObject();

		try {

//			json.put("SrcEMA", getSrcEMA());
			json.put("venID", getDestEMA());
			json.put("requestID", getRequestID());
			json.put("responseCode", getResponseCode());
			json.put("responseDescription", getResponseDescription());
			json.put("service", getService());
//			json.put("time", getTime());
//			json.put("type", getType());
			
			return json.toString();

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return "wrong";
		}
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public String getSrcEMA() {
//		return srcEMA;
//	}
//
//	public void setSrcEMA(String srcEMA) {
//		this.srcEMA = srcEMA;
//	}

	public String getDestEMA() {
		return destEMA;
	}

	public void setDestEMA(String destEMA) {
		this.destEMA = destEMA;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
//	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

}
