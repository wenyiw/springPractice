package DI.DependsOn;

import java.io.IOException;

public class DependentBean {
    private ResourcesBean resourceBean;

    public void write(String ss) throws IOException {
        System.out.println("DependentBean: write to resources");
        resourceBean.getFos().write(ss.getBytes());
    }

    //init method
    public void init() throws IOException {
        System.out.println("DependentBean: init");
        resourceBean.getFos().write("DependentBean: init".getBytes());
    }

    //destroy method
    public void destroy() throws IOException {
        System.out.println("DependentBean: destroy");
        //write to the file
        resourceBean.getFos().write("DependentBean: destroy".getBytes());
    }

    public void setResourceBean(ResourcesBean resourceBean) {
        this.resourceBean = resourceBean;
    }
}
