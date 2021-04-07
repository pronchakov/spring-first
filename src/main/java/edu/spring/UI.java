package edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UI {

    @Autowired
    private Logic logic;

    @Autowired
    private Logic2 logic2;

    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    public Logic2 getLogic2() {
        return logic2;
    }

    public void setLogic2(Logic2 logic2) {
        this.logic2 = logic2;
    }

    @Override
    public String toString() {
        return "UI (" + hashCode() + ") {" +
                "logic=" + logic +
                ", logic2=" + logic2 +
                '}';
    }
}
