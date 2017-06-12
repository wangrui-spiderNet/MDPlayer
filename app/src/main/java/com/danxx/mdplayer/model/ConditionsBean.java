package com.danxx.mdplayer.model;

import com.google.gson.Gson;

/**
 * Created by wangrui on 2017/6/12.
 */

class ConditionsBean {
    /**
     * courseTypeId : 0
     */

    private String courseTypeId;

    public static ConditionsBean objectFromData(String str) {

        return new Gson().fromJson(str, ConditionsBean.class);
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }
}
