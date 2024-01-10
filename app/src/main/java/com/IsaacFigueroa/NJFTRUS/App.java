package com.IsaacFigueroa.NJFTRUS;

import android.app.Application;
import android.os.Build;

import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            PayPalCheckout.setConfig(new CheckoutConfig(
                    this,
                    "Ad-0vjFKp_Q7Re4wldWhLSOUu9MS8dclenL4D3FsdQPTwwoygcbgQvmtEckIrcmGdvLXHBxOGnMdlkNA",
                    Environment.SANDBOX,
                    CurrencyCode.USD,
                    UserAction.PAY_NOW,
                    "com.IsaacFigueroa.NJFTRUS://paypalpay"
            ));
        }
    }
}