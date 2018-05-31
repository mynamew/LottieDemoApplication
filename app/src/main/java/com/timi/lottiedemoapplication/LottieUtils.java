package com.timi.lottiedemoapplication;

import android.support.annotation.RawRes;
import android.util.JsonReader;

import com.airbnb.lottie.LottieAnimationView;

import java.io.StringReader;

/**
 * $dsc  Lottie 加载json 的工具类
 * author: timi
 * create at: 2018-05-31 09:11
 */

public class LottieUtils {
    //是否循环播放   默认只播放一次
    private boolean isLoop = false;
    public LottieUtils() {

    }

    public LottieUtils(boolean isLoop) {
        this.isLoop = isLoop;
    }

    /**
     * 加载raw文件的json  本地文件
     *
     * @param animationView
     * @param rawId
     */
    public void loadJsonAnimation(LottieAnimationView animationView, @RawRes int rawId) {
        animationView.setAnimation(rawId);
        animationView.loop(isLoop);
        animationView.playAnimation();
    }

    /**
     * 加载网络请求返回的 json
     *
     * @param animationView
     * @param jsonStr
     */
    public void loadJsonAnimationFromString(LottieAnimationView animationView, String jsonStr) {
        JsonReader jsonReader = new JsonReader(new StringReader(jsonStr));
        animationView.setAnimation(jsonReader);
        animationView.loop(isLoop);
        animationView.playAnimation();
    }
}
