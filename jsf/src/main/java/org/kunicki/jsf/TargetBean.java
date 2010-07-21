package org.kunicki.jsf;

import javax.faces.context.FacesContext;
import java.util.Date;

/**
 * @author Jacek Kunicki (jacek at kunicki dot org)
 */
public class TargetBean {
    
    private String p;
    private Object sessionBean;

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

    public void setSessionBean(Object sessionBean) {
        this.sessionBean = sessionBean;
    }

    public Date getNow() {
        return new Date();
    }
}
