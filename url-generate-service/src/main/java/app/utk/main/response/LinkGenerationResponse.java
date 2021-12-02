package app.utk.main.response;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
public class LinkGenerationResponse {

    private String code;
    private String originalLink;
    private String shortLink;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public LinkGenerationResponse(String code, String link) {
        this.code = code;
        this.originalLink = link;
    }

    public LinkGenerationResponse(){
        //
    }
}
