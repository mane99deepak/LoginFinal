package com.example.deepak.loginfinal;

/**
 * Created by Deepak on 3/18/2016.
 */

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;


public class UserFunctions {

    private JSONParser jsonParser;

    //URL of the PHP API
    private static String loginURL = "http://10.0.2.2/learn2crack_login_api/";
    private static String registerURL = "http://10.0.2.2/learn2crack_login_api/";
    private static String forpassURL = "http://10.0.2.2/learn2crack_login_api/";
    private static String chgpassURL = "http://10.0.2.2/learn2crack_login_api/";


    private static String login_tag = "login";
    private static String register_tag = "register";
    private static String forpass_tag = "forpass";
    private static String chgpass_tag = "chgpass";


    // constructor
    public UserFunctions(){
        jsonParser = new JSONParser();
    }

    /**
     * Function to Login
     **/

    public JSONObject loginUser(String email, String password) {
        // Building Parameters
        HashMap<String, String> params = new HashMap<>();
        params.put("tag", login_tag);
        params.put("email", email);
        params.put("password", password);
        Log.d("request", "starting");
        JSONObject json = jsonParser.getJSONFromUrl(loginURL, "POST", params);
        if (json != null) {
            Log.d("JSON result", json.toString());
            return json;
        }
    return null;
    }


    /**
     * Function to change password
     **/

    public JSONObject chgPass(String newpas, String email){
        HashMap<String, String> params = new HashMap<>();
        params.put("tag", chgpass_tag);

        params.put("newpas", newpas);
        params.put("email", email);
        JSONObject json = jsonParser.getJSONFromUrl(chgpassURL,"POST",params);
        if (json != null) {
            Log.d("JSON result", json.toString());
            return json;
        }
        return null;
    }





    /**
     * Function to reset the password
     **/

    public JSONObject forPass(String forgotpassword){
        HashMap<String, String> params = new HashMap<>();
        params.put("tag", forpass_tag);
        params.put("forgotpassword", forgotpassword);
        JSONObject json = jsonParser.getJSONFromUrl(forpassURL,"POST",params);
        if (json != null) {
            Log.d("JSON result", json.toString());
            return json;
        }
        return null;
    }







    /**
     * Function to  Register
     **/
    public JSONObject registerUser(String fname, String lname, String email, String uname, String password) {
        // Building Parameters
        HashMap<String, String> params = new HashMap<>();
        params.put("tag", register_tag);
        params.put("fname", fname);
        params.put("lname", lname);
        params.put("email", email);
        params.put("uname", uname);
        params.put("password", password);
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, "POST", params);
        if (json != null) {
            Log.d("JSON result", json.toString());
            return json;
        }
        return null;
    }


    /**
     * Function to logout user
     * Resets the temporary data stored in SQLite Database
     * */
    public boolean logoutUser(Context context){
        DatabaseHandler db = new DatabaseHandler(context);
        db.resetTables();
        return true;
    }

}


