package dev.gadse.moneymate.account.reader.camt052file;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BkToCstmrAcctRpt")
@Getter
/**
 * Implemented with consultation of the official
 * https://www.ebics.de/securedl/sdl-eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2OTkzNTYyMjEsImV4cCI6MTY5OTQ0NjIyMSwidXNlciI6MCwiZ3JvdXBzIjpbMCwtMV0sImZpbGUiOiJmaWxlYWRtaW5cL3Vuc2VjdXJlZFwvYW5sYWdlM1wvYW5sYWdlM19zcGVjXC9BbmxhZ2VfM19EYXRlbmZvcm1hdGVfMy43LnBkZiIsInBhZ2UiOjEwM30.E9DCvfiC28uxt4Q8xP5bI7FOEro7irAJaGFMRZBDC0U/Anlage_3_Datenformate_3.7.pdf
 */
public class CAMT052File {

    @XmlElement(name = "GrpHdr")
    private GroupHeader groupHeader;

    @XmlElement(name = "Rpt")
    private Receipt receipt;

}
