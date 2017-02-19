package rooksoto.c4q.nyc.c4qhackathonapp.HhcData.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rooksoto.c4q.nyc.c4qhackathonapp.HhcData.model.HhcData;

/**
 * Created by rook on 2/19/17.
 */

public interface HhcApi {

    @GET("resource/ujy7-x749.json")
    Call<List<HhcData>> getDataSet();
}
