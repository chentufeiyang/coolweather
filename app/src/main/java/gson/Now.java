package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lrb22 on 2017/11/19.
 */

public class Now {
    @SerializedName("tmp")
    public  String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
