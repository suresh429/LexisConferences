package com.applications.lexisconferences.utils;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.ShareCompat;


import com.applications.lexisconferences.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.applications.lexisconferences.BuildConfig;

/**
 * ConstantValues contains some constant variables, used all over the App.
 **/


public class ConstantValues {

    public static boolean IS_USER_LOGGED_IN;
    public static final String TYPE_TEXT_PLAIN = "text/plain";
    public static final String SHARE = "Share";
    public static final String SINGLE_HYPHEN = "-";
    public static final String IMAGE_URL = "https://d2cax41o7ahm5l.cloudfront.net/";


    /*   Validating Fileds */
    // Validating email id
    public static boolean isValidEmail(String email1) {

        String EMAIL_PATTERN = "^([_A-Za-z0-9-+].{2,})+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email1);
        return !matcher.matches();

    }


    public static void shareDeepLink(Activity activity, String str) {
        if (activity != null) {
            Intent intent = ShareCompat.IntentBuilder.from(activity).setType(TYPE_TEXT_PLAIN).setText(str).setChooserTitle((CharSequence) SHARE).getIntent();
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            }
        }
    }

    // Validating pincode
    public static boolean isValidPincode(String pass1) {

        return pass1 == null || pass1.length() != 6;
    }

    // Validating password
    public static boolean isValidPassword1(String pass1) {

        return pass1 == null || pass1.length() <= 5;
    }


    // validating password with retype password

    public static boolean isValidPassword(String pass1) {

        String PASSWORD_PATTERN =
                "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(pass1);
        return !matcher.matches();
    }


    //Validating Address
    public static boolean validAddress(String pass1) {

        String pat = "^[a-zA-Z0-9]+([-/:\\s,][a-zA-Z0-9]+)*?$";
        return !pass1.matches(pat) || pass1.length() <= 2;

    }

    public static boolean validSchool(String pass1) {

        return !pass1.matches("^[a-zA-Z0-9]+(\\s[a-zA-Z0-9]+)*?$") || pass1.length() <= 2;

    }

    //Validtaing Names
    public static boolean validateFirstName(String firstName) {
        return !firstName.matches("^[a-zA-Z]+(\\s[a-zA-Z]+)*?$");

    }

    //Validating Mobile
    public static boolean isValidMoblie(String pass1) {

        return pass1 == null || pass1.length() != 10;

    }

    public static boolean isValidOTP(String pass1) {

        return pass1 == null || pass1.length() != 6;

    }

    private static boolean isStringValid(String str) {
        return str != null && !str.isEmpty() && str.trim().length() > 0;
    }

    public static String getFormattedDate(String str, String j) {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");


        Date newDate = null;

        try {
            newDate = spf.parse(j);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (isStringValid(str)) {
            spf = new SimpleDateFormat(str, Locale.ENGLISH);

        } else {
            spf = new SimpleDateFormat(MyAppPrefsManager.DD_MMM_YYYY_DATE_FORMAT, Locale.ENGLISH);

        }
        assert newDate != null;
        return spf.format(newDate);
    }


    public static String getAppVersion(Context context) {
        String app_ver = "";
        try {
            app_ver = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return app_ver;
    }


    /*public static void internetCheck(Activity context){
        IntentFilter intentFilter = new IntentFilter(NetworkStateChangeReceiver.NETWORK_AVAILABLE_ACTION);
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                boolean isNetworkAvailable = intent.getBooleanExtra(IS_NETWORK_AVAILABLE, false);
                String networkStatus = isNetworkAvailable ? "Available" : "Not Available";

                if (networkStatus.equals("Not Available"))
                {
                    Toast.makeText(context, "No Internet Found", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(context, " Internet Found", Toast.LENGTH_LONG).show();

                }
            }
        }, intentFilter);
    }*/


    public static void shareMyApp(Context context) {

        try {
            String shareMessage = "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, context.getResources().getString(R.string.app_name));
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            context.startActivity(Intent.createChooser(shareIntent, "Choose One"));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
