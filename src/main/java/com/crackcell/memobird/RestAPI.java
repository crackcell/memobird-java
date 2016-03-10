package com.crackcell.memobird;

/**
 * Created by crackcell on 3/10/16.
 */
public class RestAPI {
    protected String appKey;

    public RestAPI(String appKey) {
        this.appKey = appKey;
    }

    public Result setUserBind(String userId, String devId) { return null; }

    public Result printPaper(String devId) { return null; }

    public Result getPrintStatus(String contentId) { return null; }
}
