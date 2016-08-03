package ly.generalassemb.retrofitgithub;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by darrankelinske on 8/2/16.
 */
public class RetrofitApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);

    }
}
