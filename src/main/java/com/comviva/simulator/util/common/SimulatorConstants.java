package com.comviva.simulator.util.common;

/**
 * Created by rishikesh.kumar on 04-06-2018.
 */
public class SimulatorConstants {

    public static final String DEDUPE_RESPONSE = "{\n" +
            "\n" +
            "   \"checkCustomerProfileRep\": {\n" +
            "\n" +
            "      \"msgHdr\": {\n" +
            "\n" +
            "         \"rslt\": \"OK\"\n" +
            "\n" +
            "      },\n" +
            "\n" +
            "      \"msgBdy\": {\n" +
            "\n" +
            "         \"sts\": \"YES\",\n" +
            "\n" +
            "         \"checkCustPrflPrflRes\": [\n" +
            "\n" +
            "            {\n" +
            "\n" +
            "               \"custId\": \"1000000054\",\n" +
            "\n" +
            "               \"frstNm\": \"Frst Nm\",\n" +
            "\n" +
            "               \"mdlNm\": \"Middle Nm\",\n" +
            "\n" +
            "               \"lstNm\": \"Lst Nm\",\n" +
            "\n" +
            "               \"matchStatus\": \"YES\"\n" +
            "\n" +
            "            },\n" +
            "\n" +
            "            {\n" +
            "\n" +
            "               \"custId\": \"45646798\",\n" +
            "\n" +
            "               \"frstNm\": \"FirstName\",\n" +
            "\n" +
            "               \"mdlNm\": \"MiddleName\",\n" +
            "\n" +
            "               \"lstNm\": \"LastName\",\n" +
            "\n" +
            "               \"matchStatus\": \"YES\"\n" +
            "\n" +
            "            },\n" +
            "\n" +
            "            {\n" +
            "\n" +
            "               \"custId\": \"987654321\",\n" +
            "\n" +
            "               \"frstNm\": \"Frst Nm\",\n" +
            "\n" +
            "               \"mdlNm\": \"Middle Nm\",\n" +
            "\n" +
            "               \"lstNm\": \"Lst Nm\",\n" +
            "\n" +
            "               \"matchStatus\": \"YES\"\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "         ]\n" +
            "\n" +
            "      }\n" +
            "\n" +
            "   }\n" +
            "\n" +
            "}\n" +
            "\n";

    public static final String REQUEST_OTP_RESPONSE = "{  \n" +
            "   \"generatePwdResponse\":{  \n" +
            "      \"msgHdr\":{  \n" +
            "         \"rslt\":\"SUCCESS\"\n" +
            "      },\n" +
            "      \"msgBdy\":{  \n" +
            "         \"status\":\"00\",\n" +
            "         \"refNum\":\"123456\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String VERIFY_OTP_RESPONSE = "{\n" +
            "   \"verifyPwdResponse\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\"\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"status\":\"00\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String GET_CUSTOMER_PROFILE = "{\n" +
            "   \"getCustomerProfileRep\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\"\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"getCustomerProfile\":[\n" +
            "            {\n" +
            "               \"ucic\":\"1000000179\",\n" +
            "               \"custTitle\":\"MISS\",\n" +
            "               \"custFirstName\":\"Frst Nm\",\n" +
            "               \"custMiddleName\":\"Middle Nm\",\n" +
            "               \"custLastName\":\"Lst Nm\",\n" +
            "               \"dob\":\"2015-12-08\",\n" +
            "               \"gender\":\"MALE\",\n" +
            "               \"ntnlty\":\"IN\"\n" +
            "            },\n" +
            "            {\n" +
            "               \"ucic\":\"1000000179\",\n" +
            "               \"acctNo\":\"77154858\",\n" +
            "               \"srcName\":\"BPMITest\"\n" +
            "            },\n" +
            "            {\n" +
            "               \"ucic\":\"1000000179\",\n" +
            "               \"acctNo\":\"4564986546\",\n" +
            "               \"srcName\":\"BPMITest\"\n" +
            "            }\n" +
            "         ]\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String AUTHENTICATION_WITH_CARD_PIN = "{\n" +
            "   \"validatePinResponse\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\",\n" +
            "         \"error\":{\n" +
            "            \"cd\":\"null\"\n" +
            "         }\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"sts\":\"00\",\n" +
            "         \"refNbr\":\"181243\",\n" +
            "         \"acntNb\":\"4111460041111234\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String GENERIC_FUND_TRANSFER = "{\n" +
            "   \"InitiateGenericFundTransferResponse\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\"\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"sts\":\"ACSC\",\n" +
            "         \"txnId\":\"119383\",\n" +
            "         \"chnlTxnId\":\"976650202\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String OXYGEN_RECHARGE = "{\n" +
            "  \"message\": \"Transaction Successful\"\n" +
            "  \"OxiTransID\" : \"00004295471010201513\" \n" +
            "}";

    public static final String GEN_OTP_WITH_ACCOUNT_NO = "{  \n" +
            "   \"generatePwdResponse\":{  \n" +
            "      \"msgHdr\":{  \n" +
            "         \"rslt\":\"SUCCESS\"\n" +
            "      },\n" +
            "      \"msgBdy\":{  \n" +
            "         \"status\":\"00\",\n" +
            "         \"refNum\":\"123456\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String VAL_OTP_WITH_ACC_NO = "{\n" +
            "   \"verifyPwdResponse\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\"\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"status\":\"00\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String IMPS_ENQUIRY = "{ \"EnquireGenericTxnStatusResp\":{ \"msgHdr\":{ \"rslt\":\"OK\" }, \"msgBdy\":{ \"StsCd\":\"S\", \"StsDesc\":\"Your IMPS Transaction is Declined.\" } } }";

    public static final String AUTHENTICATE_WITH_NET_BANKING = "{\n" +
            "  \"message\": \"User Password validated Successfully\",\n" +
            "  \"ucicid\": \"211111\"\n" +
            "}\n";

    public static final String NOTIFICATION = "{\n" +
            "\"appzillonBody\": {\n" +
            "\"notificationDetail\": {\n" +
            "\"appId\": \"com.idfc.wallet\",\n" +
            "\"notificationMsg\": \"message\",\n" +
            "\"deviceId\": \"356938035643809\"\n" +
            "}\n" +
            "},\n" +
            "\"appzillonHeader\": {\n" +
            "\"screenId\": \"serverScr\",\n" +
            "\"requestKey\": \"null\",\n" +
            "\"appId\": \"com.idfcbank.wallet\",\n" +
            "\"requestID\": \"124\",\n" +
            "\"interfaceId\": \"appzillonNotifyDevice\",\n" +
            "\"status\": \"success\",\n" +
            "\"sessionId\": \"null\",\n" +
            "\"userId\": \"null\",\n" +
            "\"longitude\": \"\",\n" +
            "\"latitude\": \"\",\n" +
            "\"deviceId\": \"APPZILLONSIMULATOR\"\n" +
            "},\n" +
            "\"appzillonErrors\": [{\n" +
            "\"errorMessage\": \"null\",\n" +
            "\"errorCode\": \"null\"\n" +
            "}]\n" +
            "}\n";

    public static final String NOTIFY_KYC_USER = "{\n" +
            "\"UpdateEwalletIDRep\":{\n" +
            "\"msgHdr\":{\n" +
            "\"rslt\":\"OK\"\n" +
            "},\n" +
            "\"msgBdy\":{\n" +
            "\"sts\":\"Update successful for UCIC 2045679\"\n" +
            "}\n" +
            "}\n" +
            "}";
    public static final String SHULKA_TAX_CALCULATION_RES = "{\n" +
            "  \"serviceCharges\": [\n" +
            "    {\n" +
            "      \"amount\": \"3\",\n" +
            "      \"receiver\": {\n" +
            "        \"productId\": null,\n" +
            "        \"partyId\": \"PT789\"\n" +
            "      },\n" +
            "      \"sender\": {\n" +
            "        \"productId\": \"12\",\n" +
            "        \"partyId\": \"PT123.124\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"commissionTaxes\": [],\n" +
            "  \"commissions\": [],\n" +
            "  \"transferAmount\": \"100\",\n" +
            "  \"serviceChargeTaxes\": [\n" +
            "  \t{\n" +
            "      \"amount\": \"2\",\n" +
            "      \"receiver\": {\n" +
            "        \"productId\": null,\n" +
            "        \"partyId\": \"PT789\"\n" +
            "      },\n" +
            "      \"sender\": {\n" +
            "        \"productId\": \"12\",\n" +
            "        \"partyId\": \"PT123.124\"\n" +
            "      }\n" +
            "    }\n" +
            "  ]\n" +
            "}\n";

    public static final String AADHAR_OTP = "{\n" +
            "  \"message\": \"send OTP successfully.\"\n" +
            "}";

    public static final String AADHAR_KYC = "{\n" +
            "  \"auth\": \"Y\",\n" +
            "  \"status\": 200,\n" +
            "  \"message\": \"Resident Authenticated\",\n" +
            "  \"kyc\": {\n" +
            "    \"uid\": \"999991338037\",\n" +
            "    \"dob\": \"24-10-1983\",\n" +
            "    \"gender\": \"F\",\n" +
            "    \"name\": \"Annapurna Ramachandra\",\n" +
            "    \"address\": {\n" +
            "      \"co\": \"W/O: Rohit Jayanth Kumar\",\n" +
            "      \"dist\": \"Bengaluru\",\n" +
            "      \"house\": \"No 42 Old No 7 Nisarga\",\n" +
            "      \"loc\": \"Kalyananagar Nagarbhavi\",\n" +
            "      \"pc\": \"560072\",\n" +
            "      \"state\": \"Karnataka\",\n" +
            "      \"street\": \"4th A Main\",\n" +
            "      \"vtc\": \"Bangalore North\",\n" +
            "      \"vtcCode\": \"00599960\",\n" +
            " \t\"subdist\":\"subdist\",\n" +
            "         \"po\":\"po\",\n" +
            "          \"lm\":\"lm\"\n" +
            "    },\n" +
            "    \"photo\": \"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\"\n" +
            "  }\n" +
            "}";

    public static final String AADHAR_SESSION_KEY = "{\n" +
            "  \"success\": true,\n" +
            "  \"message\": \"Token Generated\",\n" +
            "  \"token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6InNhbmtldGgucnNAbWFoaW5kcmFjb212aXZhLmNvbSIsImlzcyI6ImNvbXZpdmFfYmFja2VuZCIsImlhdCI6MTQ4MzQ1NjU4NywiZXhwIjoxNDgzNDYwMTg3fQ.rVTroUE0DXGm3VAUaAOd5kUQ1MlQ6eUzo4aFrt9uujU\"\n" +
            "}";

    public static final String CBS_ENQUIRY = "{\n" +
            "   \"cbsEnqResponse\":{\n" +
            "      \"msgHdr\":{\n" +
            "         \"rslt\":\"OK\"\n" +
            "      },\n" +
            "      \"msgBdy\":{\n" +
            "         \"statusDescription\":\"ORIG\",\n" +
            "         \"sts\":\"0\",\n" +
            "         \"clientRefId\":\"1234556\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String GET_MERCHANT_DETAILS = "Response : {\n" +
            "  \n" +
            "  \"serviceResponse\" : {\n" +
            "    \"COMMAND\" : {\n" +
            "      \"IMEI\" : \"8E2933F0-3D50-47B7-8F74-03A62C04D6E2\",\n" +
            "      \"UNIQUEID\" : \"CYWB022X\",\n" +
            "      \"MSISDN\" : \"39664990\",\n" +
            "      \"PLATFORM\" : \"iOS/Android,\n" +
            "\"LANGUAGE\":\"1\",\n" +
            "\"TXNSTATUS\":\"200\"\n" +
            "    }\n" +
            "  }\n" +
            "}\n";



}
