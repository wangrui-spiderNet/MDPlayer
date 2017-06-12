package com.danxx.mdplayer.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by wangrui on 2017/6/12.
 */

public class RowsBean {
    /**
     * collect : false
     * courseDocList : []
     * courseName : 《小蓝和小黄》
     * courseTimes : 2
     * courseTypeId : 26
     * courseTypeName : 科学课程
     * cover : http://zl-teacher.oss-cn-hangzhou.aliyuncs.com/1491554950426=D013.jpg
     * createDate : 1491554674449
     * createDateAsDate : 1491554674449
     * creatorName : 18300000000
     * duration : 1476
     * finish : false
     * grade : 小班
     * id : 720
     * keywords :
     * lastLearnTime : 0
     * lastModDate : 1497222154462
     * lastModDateAsDate : 1497222154462
     * lecture : 陈美华
     * lectureId : 284
     * plans : []
     * repeat : false
     * sourceHd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/ec1d6becfb88415cabefc2e22ac2b34a/act-ss-m3u8-hd/D013.m3u8
     * sourceLd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/ec1d6becfb88415cabefc2e22ac2b34a/act-ss-m3u8-ld/D013.m3u8
     * sourceSd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/ec1d6becfb88415cabefc2e22ac2b34a/act-ss-m3u8-sd/D013.m3u8
     * totalLearnTime : 0
     * videoSourceId : 743
     * viewCounts : 201
     * viewers : 36
     */

    private boolean collect;
    private String courseName;
    private int courseTimes;
    private int courseTypeId;
    private String courseTypeName;
    private String cover;
    private long createDate;
    private long createDateAsDate;
    private String creatorName;
    private int duration;
    private boolean finish;
    private String grade;
    private int id;
    private String keywords;
    private int lastLearnTime;
    private long lastModDate;
    private long lastModDateAsDate;
    private String lecture;
    private int lectureId;
    private boolean repeat;
    private String sourceHd;
    private String sourceLd;
    private String sourceSd;
    private int totalLearnTime;
    private int videoSourceId;
    private int viewCounts;
    private int viewers;
    private List<?> courseDocList;
    private List<?> plans;

    public static RowsBean objectFromData(String str) {

        return new Gson().fromJson(str, RowsBean.class);
    }

    public boolean isCollect() {
        return collect;
    }

    public void setCollect(boolean collect) {
        this.collect = collect;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTimes() {
        return courseTimes;
    }

    public void setCourseTimes(int courseTimes) {
        this.courseTimes = courseTimes;
    }

    public int getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(int courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getCreateDateAsDate() {
        return createDateAsDate;
    }

    public void setCreateDateAsDate(long createDateAsDate) {
        this.createDateAsDate = createDateAsDate;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getLastLearnTime() {
        return lastLearnTime;
    }

    public void setLastLearnTime(int lastLearnTime) {
        this.lastLearnTime = lastLearnTime;
    }

    public long getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(long lastModDate) {
        this.lastModDate = lastModDate;
    }

    public long getLastModDateAsDate() {
        return lastModDateAsDate;
    }

    public void setLastModDateAsDate(long lastModDateAsDate) {
        this.lastModDateAsDate = lastModDateAsDate;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public String getSourceHd() {
        return sourceHd;
    }

    public void setSourceHd(String sourceHd) {
        this.sourceHd = sourceHd;
    }

    public String getSourceLd() {
        return sourceLd;
    }

    public void setSourceLd(String sourceLd) {
        this.sourceLd = sourceLd;
    }

    public String getSourceSd() {
        return sourceSd;
    }

    public void setSourceSd(String sourceSd) {
        this.sourceSd = sourceSd;
    }

    public int getTotalLearnTime() {
        return totalLearnTime;
    }

    public void setTotalLearnTime(int totalLearnTime) {
        this.totalLearnTime = totalLearnTime;
    }

    public int getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(int videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    public int getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public List<?> getCourseDocList() {
        return courseDocList;
    }

    public void setCourseDocList(List<?> courseDocList) {
        this.courseDocList = courseDocList;
    }

    public List<?> getPlans() {
        return plans;
    }

    public void setPlans(List<?> plans) {
        this.plans = plans;
    }
}
