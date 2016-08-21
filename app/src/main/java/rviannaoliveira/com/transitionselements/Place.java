package rviannaoliveira.com.transitionselements;

import android.content.Context;

/**
 * Created by rodrigo on 20/08/16.
 */
public class Place {

    public String id;
    public String name;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}