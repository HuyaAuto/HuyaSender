

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetResultByKeyWordRsp extends JceStruct implements Cloneable {
    static ArrayList<SSGameInfo> cache_vGameInfo;
    static ArrayList<SSPresenterInfo> cache_vPresenterInfo;
    static ArrayList<String> cache_vPresenterMatchWord;
    static ArrayList<SSPresenterInfo> cache_vPresenterRecommend;
    static ArrayList<LiveChannelInfo> cache_vRecommendInfo;
    static ArrayList<SSArticleInfo> cache_vSSArticleInfo;
    static ArrayList<LiveChannelInfo> cache_vSubChannelInfo;
    static ArrayList<String> cache_vSubChannelMatchWord;
    public boolean bGetSearchResult = false;
    public int iArticleTotalNum = 0;
    public int iLiveTotalNum = 0;
    public int iPresentTotalNum = 0;
    public String sCacheId = "";
    public ArrayList<SSGameInfo> vGameInfo = null;
    public ArrayList<SSPresenterInfo> vPresenterInfo = null;
    public ArrayList<String> vPresenterMatchWord = null;
    public ArrayList<SSPresenterInfo> vPresenterRecommend = null;
    public ArrayList<LiveChannelInfo> vRecommendInfo = null;
    public ArrayList<SSArticleInfo> vSSArticleInfo = null;
    public ArrayList<LiveChannelInfo> vSubChannelInfo = null;
    public ArrayList<String> vSubChannelMatchWord = null;

    public GetResultByKeyWordRsp() {
    }

    public GetResultByKeyWordRsp(boolean var1, ArrayList<SSGameInfo> var2, ArrayList<SSPresenterInfo> var3, ArrayList<LiveChannelInfo> var4, ArrayList<LiveChannelInfo> var5, ArrayList<String> var6, ArrayList<String> var7, int var8, int var9, String var10, ArrayList<SSPresenterInfo> var11, ArrayList<SSArticleInfo> var12, int var13) {
        this.bGetSearchResult = var1;
        this.vGameInfo = var2;
        this.vPresenterInfo = var3;
        this.vSubChannelInfo = var4;
        this.vRecommendInfo = var5;
        this.vPresenterMatchWord = var6;
        this.vSubChannelMatchWord = var7;
        this.iPresentTotalNum = var8;
        this.iLiveTotalNum = var9;
        this.sCacheId = var10;
        this.vPresenterRecommend = var11;
        this.vSSArticleInfo = var12;
        this.iArticleTotalNum = var13;
    }

    public String className() {
        return "HUYA.GetResultByKeyWordRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.bGetSearchResult, "bGetSearchResult");
        var3.display(this.vGameInfo, "vGameInfo");
        var3.display(this.vPresenterInfo, "vPresenterInfo");
        var3.display(this.vSubChannelInfo, "vSubChannelInfo");
        var3.display(this.vRecommendInfo, "vRecommendInfo");
        var3.display(this.vPresenterMatchWord, "vPresenterMatchWord");
        var3.display(this.vSubChannelMatchWord, "vSubChannelMatchWord");
        var3.display(this.iPresentTotalNum, "iPresentTotalNum");
        var3.display(this.iLiveTotalNum, "iLiveTotalNum");
        var3.display(this.sCacheId, "sCacheId");
        var3.display(this.vPresenterRecommend, "vPresenterRecommend");
        var3.display(this.vSSArticleInfo, "vSSArticleInfo");
        var3.display(this.iArticleTotalNum, "iArticleTotalNum");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetResultByKeyWordRsp var2 = (GetResultByKeyWordRsp)var1;
                if (JceUtil.equals(this.bGetSearchResult, var2.bGetSearchResult) && JceUtil.equals(this.vGameInfo, var2.vGameInfo) && JceUtil.equals(this.vPresenterInfo, var2.vPresenterInfo) && JceUtil.equals(this.vSubChannelInfo, var2.vSubChannelInfo) && JceUtil.equals(this.vRecommendInfo, var2.vRecommendInfo) && JceUtil.equals(this.vPresenterMatchWord, var2.vPresenterMatchWord) && JceUtil.equals(this.vSubChannelMatchWord, var2.vSubChannelMatchWord) && JceUtil.equals(this.iPresentTotalNum, var2.iPresentTotalNum) && JceUtil.equals(this.iLiveTotalNum, var2.iLiveTotalNum) && JceUtil.equals(this.sCacheId, var2.sCacheId) && JceUtil.equals(this.vPresenterRecommend, var2.vPresenterRecommend) && JceUtil.equals(this.vSSArticleInfo, var2.vSSArticleInfo) && JceUtil.equals(this.iArticleTotalNum, var2.iArticleTotalNum)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetResultByKeyWordRsp";
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception var2) {
            var2.printStackTrace();
            return 0;
        }
    }

    public void readFrom(JceInputStream var1) {
        this.bGetSearchResult = var1.read(this.bGetSearchResult, 0, false);
        if (cache_vGameInfo == null) {
            cache_vGameInfo = new ArrayList();
            SSGameInfo var2 = new SSGameInfo();
            cache_vGameInfo.add(var2);
        }

        this.vGameInfo = (ArrayList)var1.read(cache_vGameInfo, 1, false);
        SSPresenterInfo var3;
        if (cache_vPresenterInfo == null) {
            cache_vPresenterInfo = new ArrayList();
            var3 = new SSPresenterInfo();
            cache_vPresenterInfo.add(var3);
        }

        this.vPresenterInfo = (ArrayList)var1.read(cache_vPresenterInfo, 2, false);
        LiveChannelInfo var4;
        if (cache_vSubChannelInfo == null) {
            cache_vSubChannelInfo = new ArrayList();
            var4 = new LiveChannelInfo();
            cache_vSubChannelInfo.add(var4);
        }

        this.vSubChannelInfo = (ArrayList)var1.read(cache_vSubChannelInfo, 3, false);
        if (cache_vRecommendInfo == null) {
            cache_vRecommendInfo = new ArrayList();
            var4 = new LiveChannelInfo();
            cache_vRecommendInfo.add(var4);
        }

        this.vRecommendInfo = (ArrayList)var1.read(cache_vRecommendInfo, 4, false);
        if (cache_vPresenterMatchWord == null) {
            cache_vPresenterMatchWord = new ArrayList();
            cache_vPresenterMatchWord.add("");
        }

        this.vPresenterMatchWord = (ArrayList)var1.read(cache_vPresenterMatchWord, 5, false);
        if (cache_vSubChannelMatchWord == null) {
            cache_vSubChannelMatchWord = new ArrayList();
            cache_vSubChannelMatchWord.add("");
        }

        this.vSubChannelMatchWord = (ArrayList)var1.read(cache_vSubChannelMatchWord, 6, false);
        this.iPresentTotalNum = var1.read(this.iPresentTotalNum, 7, false);
        this.iLiveTotalNum = var1.read(this.iLiveTotalNum, 8, false);
        this.sCacheId = var1.readString(9, false);
        if (cache_vPresenterRecommend == null) {
            cache_vPresenterRecommend = new ArrayList();
            var3 = new SSPresenterInfo();
            cache_vPresenterRecommend.add(var3);
        }

        this.vPresenterRecommend = (ArrayList)var1.read(cache_vPresenterRecommend, 10, false);
        if (cache_vSSArticleInfo == null) {
            cache_vSSArticleInfo = new ArrayList();
            SSArticleInfo var5 = new SSArticleInfo();
            cache_vSSArticleInfo.add(var5);
        }

        this.vSSArticleInfo = (ArrayList)var1.read(cache_vSSArticleInfo, 11, false);
        this.iArticleTotalNum = var1.read(this.iArticleTotalNum, 12, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.bGetSearchResult, 0);
        if (this.vGameInfo != null) {
            var1.write(this.vGameInfo, 1);
        }

        if (this.vPresenterInfo != null) {
            var1.write(this.vPresenterInfo, 2);
        }

        if (this.vSubChannelInfo != null) {
            var1.write(this.vSubChannelInfo, 3);
        }

        if (this.vRecommendInfo != null) {
            var1.write(this.vRecommendInfo, 4);
        }

        if (this.vPresenterMatchWord != null) {
            var1.write(this.vPresenterMatchWord, 5);
        }

        if (this.vSubChannelMatchWord != null) {
            var1.write(this.vSubChannelMatchWord, 6);
        }

        var1.write(this.iPresentTotalNum, 7);
        var1.write(this.iLiveTotalNum, 8);
        if (this.sCacheId != null) {
            var1.write(this.sCacheId, 9);
        }

        if (this.vPresenterRecommend != null) {
            var1.write(this.vPresenterRecommend, 10);
        }

        if (this.vSSArticleInfo != null) {
            var1.write(this.vSSArticleInfo, 11);
        }

        var1.write(this.iArticleTotalNum, 12);
    }
}
