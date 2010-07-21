package org.kunicki.sandbox.jsf;

import javax.faces.context.FacesContext;
import java.util.Date;

/**
 * @author Jacek Kunicki (jacek at kunicki dot org)
 */
public class TargetBean {
    
    private String p;
    private SessionBean sessionBean;
    private Date date;

    public String action() {
        String p = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("p");
        System.out.println("p: " + p);
        return "target";
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getP() {
        return p;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public Date getNow() {
        return new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
