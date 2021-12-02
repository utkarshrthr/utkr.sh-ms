package app.utk.main.response;

import java.time.LocalDateTime;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
public class LinkGenerationResponse {

    private String code;
    private String link;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LinkGenerationResponse(String code, String link) {
        this.code = code;
        this.link = link;
    }

    public LinkGenerationResponse(){
        //
    }
}
