package com.comviva.simulator.controllers;


import com.comviva.simulator.util.common.SimulatorConstants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rishikesh.kumar on 01-06-2018.
 */

@RestController
@RequestMapping("/IdfcSimulator")
public class SimulatorControllers {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimulatorControllers.class);

    @Autowired
    private Environment env;

    @ResponseBody
    @RequestMapping(value = "/BankDedupe", method = RequestMethod.POST)
    public String bankDedupe() {
        String response = sendResponse(null,"/configfiles/dedupeResponse.txt");
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/GenerateOTP", method = RequestMethod.POST)
    public String generateOTP() {
        String response = sendResponse(null,"/configfiles/requestOtpResponse.txt");
        System.out.println("inside IdfcSimulator->generateOTP:|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/VerifyOTP", method = RequestMethod.POST)
    public String verifyOTP() {
        String response = sendResponse(null,"/configfiles/verifyOtpResponse.txt");
        System.out.println("inside IdfcSimulator->verifyOTP->REQUEST:|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/AuthenticateWithNetBanking", method = RequestMethod.POST)
    public String authenticateWithNetBanking() {

        String response = sendResponse(null,"/configfiles/authenticateWithNetBanking.txt");
        System.out.println("inside IdfcSimulator->AuthenticateWithNetBanking|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/GetCustomerProfile", method = RequestMethod.POST)
    public String getCustomerProfile() {

        String response = sendResponse(null,"/configfiles/getCustomerProfile.txt");
        System.out.println("inside IdfcSimulator->GetCustomerProfile|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/AuthenticateWithCardPin", method = RequestMethod.POST)
    public String authenticateWithCardPin() {

        String response = sendResponse(null,"/configfiles/authenticateWithCardPin.txt");
        System.out.println("inside IdfcSimulator->AuthenticateWithCardPin|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/InitiateGenericFundTransfer", method = RequestMethod.POST)
    public String initiateGenericFundTransfer() {

        String response = sendResponse(null,"/configfiles/genericFundTransfer.txt");
        System.out.println("inside IdfcSimulator->initiateGenericFundTransfer|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/OxigenRecharge", method = RequestMethod.POST)
    public String oxigenRecharge() {

        String response = sendResponse(null,"/configfiles/oxigenRecharge.txt");
        System.out.println("inside IdfcSimulator->oxigenRecharge|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/GenOTPWithAccNo", method = RequestMethod.POST)
    public String genOTPWithAccNo() {

        String response = sendResponse(null,"/configfiles/genOTPWithAccNoResponse.txt");
        System.out.println("inside IdfcSimulator->genOTPWithAccNo|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/ValOTPWithAccNo", method = RequestMethod.POST)
    public String valOTPWithAccNo() {

        String response = sendResponse(null,"/configfiles/valOTPWithAccNoResponse.txt");
        System.out.println("inside IdfcSimulator->valOTPWithAccNo|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/IMPSEnquiry", method = RequestMethod.POST)
    public String iMPSEnquiry() {

        String response = sendResponse(null,"/configfiles/IMPSEnquiry.txt");
        System.out.println("inside IdfcSimulator->iMPSEnquiry|RESPONSE:"+response);
        return response ;    }

    @ResponseBody
    @RequestMapping(value = "/AuthenticateNetBanking", method = RequestMethod.POST)
    public String authenticateNetBanking() {

        String response = sendResponse(null,"/configfiles/oxigenRecharge.txt");
        System.out.println("inside IdfcSimulator->oxigenRecharge|RESPONSE:"+response);
        return response ;    }

    @ResponseBody
    @RequestMapping(value = "/Notification", method = RequestMethod.POST)
    public String notification() {

        String response = sendResponse(null,"/configfiles/notification.txt");
        System.out.println("inside IdfcSimulator->notification|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/NotifyKycUser", method = RequestMethod.POST)
    public String notifyKycUser() {

        String response = sendResponse(null,"/configfiles/notifyKycUser.txt");
        System.out.println("inside IdfcSimulator->notifyKycUser|RESPONSE:"+response);
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/ShulkaTaxCalculation", method = RequestMethod.POST)
    public String shulkaTaxCalculation() {

        String response = sendResponse(null,"/configfiles/shulkaTaxCalculationres.txt");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/AadharOtp", method = RequestMethod.POST)
    public String aadharOtp() {

        String response = sendResponse(null,"/configfiles/AadharOTP.txt");
        System.out.println("AadharOTP-------------------------------");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/AadharKYC", method = RequestMethod.POST)
    public String aadharKYC() {

        String response = sendResponse(null,"/configfiles/AadharKYC.txt");
        System.out.println("AadharKYC-------------------------------");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/AadharSessionKey", method = RequestMethod.POST)
    public String aadharSessionKey() {

        String response = sendResponse(null,"/configfiles/AadharSessionKey.txt");
        System.out.println("AadharSessionKey-------------------------------");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/GetCbsEnq", method = RequestMethod.POST)
    public String getCbsEnq() {

        String response = sendResponse(null,"/configfiles/cbsEnquiryResponse.txt");
        System.out.println("get cbs Enq-------------------------------");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/GetMerchantDetails", method = RequestMethod.POST)
    public String getMerchantDetails() {

        String response = sendResponse(null,"/configfiles/getMerchantDetails.txt");
        System.out.println("get Merchant Details-------------------------------");
        return response ;
    }

    @ResponseBody
    @RequestMapping(value = "/RechargeSimulator", method = RequestMethod.POST)
    public String rechargeSimulator() {

        String response = sendResponse(null,"/configfiles/rechargeSimulator.txt");
        System.out.println("Recharge Simulator-------------------------------");
        return response ;
    }

    private String sendResponse(String request,String responseFilePath) {
        String line1;
        BufferedReader responseFileBr = null;
        File responseFile = null;
        StringBuilder response = null;
        Resource resource = null;
        String responseFilePath1 = null;
        try  {
            responseFilePath1 = env.getProperty("filepath")+responseFilePath;
           // resource = new ClassPathResource(responseFilePath1);
            resource = new PathResource(responseFilePath1) ;
            responseFile = resource.getFile();
            //responseFile = new File(responseFilePath);
            response = new StringBuilder();

            responseFileBr = new BufferedReader(new FileReader(responseFile));

            while ((line1 = responseFileBr.readLine()) != null) {
                response.append(line1.trim());
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                responseFileBr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return response.toString();
    }


}
