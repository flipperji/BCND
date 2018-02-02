package com.flippey.bcnd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.flippey.bcnd.Orm.OrmLiteDbUtils;
import com.flippey.bcnd.bean.LoginBean;
import com.flippey.bcnd.bean.User;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class MainActivity extends Activity {

    @BindView(R.id.recyclerView)
    RecyclerView mRcv;
    private TextView mTv;
    private MainActivity mInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mInstance = MainActivity.this;
        initView();
        mTv = (TextView) findViewById(R.id.text);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNetData();
            }
        });
    }

    private void initView() {
        mRcv.setLayoutManager(new LinearLayoutManager(mInstance));

        User user = new User(1, "test", 0f, 0f, 1, 123, "ss");
        OrmLiteDbUtils.getInstance().addUser(user);
    }

    private void getNetData() {
        Request request = ItheimaHttp.newPostRequest("login");
        request.putParams("phoneNumber", "13166085526");
        request.putParams("password", "3dabdac4c979b79b3e46b957f2a0220c");
        request.putParams("areacode", "86");
        ItheimaHttp.send(request, new HttpResponseListener<LoginBean>() {

            @Override
            public void onResponse(LoginBean loginBean) {
                mTv.setText(loginBean.getData().getEthAddress());

            }


            @Override
            public void onFailure(Call<ResponseBody> call, Throwable e) {
                super.onFailure(call, e);

            }
        });

    }

}
