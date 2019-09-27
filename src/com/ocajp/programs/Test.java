package com.ocajp.programs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String LinkedinCampaign="rish";
		
//		JSONObject obj= new JSONObject("{\n" + 
//				"    \"campaign\": \"urn:li:sponsoredCampaign:"+LinkedinCampaign+"\",\n" + 
//				"    \"status\": \"ACTIVE\",\n" + 
//				"    \"type\": \""+LinkedinCampaign+"\",\n" + 
//				"    \"variables\": {\n" + 
//				"        \"clickUri\": \""+LinkedinCampaign+"\",\n" + 
//				"        \"data\": {\n" + 
//				"            \"com.linkedin.ads.TextAdCreativeVariables\": {\n" + 
//				"                \"text\": \""+LinkedinCampaign+"\",\n" + 
//				"                \"title\": \""+LinkedinCampaign+"\""+
//				"           }\n" + 
//				"        }\n" + 
//				"    }\n" + 
//				"}");
		System.out.print("{\n" + 
				"    \"campaign\": \"urn:li:sponsoredCampaign:"+LinkedinCampaign+"\",\n" + 
				"    \"status\": \"ACTIVE\",\n" + 
				"    \"type\": \""+LinkedinCampaign+"\",\n" + 
				"    \"variables\": {\n" + 
				"        \"clickUri\": \""+LinkedinCampaign+"\",\n" + 
				"        \"data\": {\n" + 
				"            \"com.linkedin.ads.TextAdCreativeVariables\": {\n" + 
				"                \"text\": \""+LinkedinCampaign+"\",\n" + 
				"                \"title\": \""+LinkedinCampaign+"\""+
				"           }\n" + 
				"        }\n" + 
				"    }\n" + 
				"}");
	}

}
