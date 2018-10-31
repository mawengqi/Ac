package acfirm.language

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.codec.BaseObject

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument
 public class ACLanguage extends BaseObject{
    public static final LANGUAGE_CHINESE = "zh"
    public static final LANGUAGE_THAI = "th"

    public static final ANALYZER_CHINESE = "ik"
    public static final ANALYZER_THAI = "thai"

    private String language
    private String analyzer

    String getLanguage() {
        return language
    }

    void setLanguage(String language) {
        this.language = language
    }

    String getAnalyzer() {
        return analyzer
    }

    void setAnalyzer(String analyzer) {
        this.analyzer = analyzer
    }
}
